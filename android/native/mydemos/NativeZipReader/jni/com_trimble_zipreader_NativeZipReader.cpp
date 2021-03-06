/* DO NOT EDIT THIS FILE - it is machine generated */
#include <com_trimble_zipreader_NativeZipReader.h>
/* Header for class com_trimble_zipreader_NativeZipReader */

/*
 * Class:     com_trimble_zipreader_NativeZipReader
 * Method:    loadFileFromZipFile
 * Signature: (Ljava/lang/String;Ljava/lang/String;)[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_trimble_zipreader_NativeZipReader_loadFileFromZipFile(
		JNIEnv *env, jclass clazz, jstring stZipFileName, jstring stFilePath)

		{

	char filename[128];
	char filepath[128];
	int len = (env)->GetStringLength(stZipFileName);
	(env)->GetStringUTFRegion(stZipFileName, 0, len, filename);
	LOGI("Zip file name:%s", filename);



	char * sendBuffer=NULL;
	char buf[BUFSIZ];
	FILE *fd=fopen ("/mnt/sdcard/file.txt", "r");
	struct stat fileAttr;
	int iFileSize=0;
	int iReadSize=0;
	int iHeaderSize = sizeof(int)+sizeof(int);
	int iCheckSum=0;
	int iWritePosition=0;

	if (stat ("/mnt/sdcard/file.txt", &fileAttr) != 0) {
	    fprintf (stderr, "could not access file '%s'\n", "/mnt/sdcard/file.txt");
	    return NULL;
	  }

	iFileSize=fileAttr.st_size;

	LOGI("iFileSize :%d", iFileSize);
		while(iFileSize > 0){
			iWritePosition=0;
			iCheckSum=0;

			iReadSize = fread (buf, sizeof (char), BUFSIZ, fd);
			LOGI("iReadSize :%d", iReadSize);
			if(iReadSize > 0)
			{

			int chunkSize=iReadSize+iHeaderSize;
			LOGI("chunkSize :%d", chunkSize);

			sendBuffer= (char *)malloc(chunkSize);
			short word=0;
			for(int i=0;i < iReadSize/2;i+=2){
				word=(  buf[i]&0XFF | ((buf[i+1]&0XFF) << 8)  );

				iCheckSum = iCheckSum ^ word;
			}
			LOGI("iCheckSum :%d", iCheckSum);

			*(int *)(sendBuffer + iWritePosition) = htonl(chunkSize);
			iWritePosition +=sizeof(int);

			*(int *)(sendBuffer + iWritePosition) = htonl(iCheckSum);
			iWritePosition +=sizeof(int);

			for(int i=0;i<iReadSize;i++)
			{
				*(char *)(sendBuffer+iWritePosition)=buf[i];
				iWritePosition += sizeof(char);
			}
			//send your sendBuffer to here...
			 //send(sendBuffer);

			}
			iFileSize=iFileSize-iReadSize;
			LOGI("iFileSize :%d", iFileSize);
		}

		char *recBuf=sendBuffer;
		int iReadPostion=0;
		int iChunkSize=0;
		 iCheckSum=0;
		int iCCheckSum=0;
		int iMsgLen=0;
	    iHeaderSize=	sizeof(int)+	sizeof(int);

		iChunkSize = ntohl(*(int *)(recBuf + iReadPostion ));
		iReadPostion += sizeof(int);

		LOGI("iChunkSize :%d", iChunkSize);

		iCheckSum = ntohl(*(int *)(recBuf + iReadPostion ));
		iReadPostion += sizeof(int);

		iMsgLen = iChunkSize-iHeaderSize;
		LOGI("iMsgLen :%d", iMsgLen);
		char *msgBuf=(char *)malloc(iMsgLen);

		for(int i =0;i< iMsgLen;i++){
			*(char *)(msgBuf+i)=recBuf[iReadPostion+ i];
		}

		iCCheckSum=0;
		for(int i=0;i < iMsgLen/2;i+=2)
		{
			iCCheckSum = iCCheckSum ^ (  msgBuf[i] | (msgBuf[i+1] << 8)  );

		}
		if(iCheckSum != iCCheckSum){
			LOGI("send again");
		}else{
			LOGI("iCheckSum :%d", iCCheckSum);
		}


	len = (env)->GetStringLength(stFilePath);
	(env)->GetStringUTFRegion(stFilePath, 0, len, filepath);
	LOGI("FilePath:%s", filepath);

	jbyteArray result = (env)->NewByteArray(len);



	jbyte *data = (jbyte *) malloc(len * sizeof(jbyte));

	//do stuff to raw bytes
	memcpy(data, filepath, len * sizeof(jbyte));

	(env)->SetByteArrayRegion(result, 0, len, data);

	return result;
}

JavaVM *cached_jvm;
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {

	JNIEnv *env;
	cached_jvm = vm; /* cache the JavaVM pointer */
	//__android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "Jni onload");
	if ((vm)->GetEnv( (void **)&env, JNI_VERSION_1_6)) {
		return JNI_ERR; /* JNI version not supported */
	}
	// Checks if environment is null
	if (env == NULL) {
		return JNI_ERR; /* JNI version not supported */
	}

	return JNI_VERSION_1_6;
}

