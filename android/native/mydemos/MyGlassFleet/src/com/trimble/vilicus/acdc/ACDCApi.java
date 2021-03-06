package com.trimble.vilicus.acdc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;

import com.trimble.mobile.android.util.Utils;
import com.trimble.myglassfleet.R;
import com.trimble.vilicus.acdc.asset.AssetAPI;
import com.trimble.vilicus.acdc.req.LoginRequest;
import com.trimble.vilicus.acdc.res.LoginResponse;
import com.trimble.vilicus.dao.DaoMaster;
import com.trimble.vilicus.db.VilicusContentProvider;
import com.trimble.vilicus.entity.User;

import org.json.JSONException;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;

import com.trimble.vilicus.acdc.res.ACDCResponse;

public final class ACDCApi {

	public static final String TAG = "ACDC";

	private static final String LOGIN_URL = "%s://%s/ClientApplication/v1/UserSessions";

	private static final String REFRESH_URL = "%s://%s/ClientApplication/v1/UserSessions/?orgID=%s";
	
	private static final String ORGANIZATION_URL = "%s://%s/ClientApplication/v1/UserSessions/?orgID=%s";

	private static ACDCApi acdcAPI = null;

	private Context context = null;

	private final static String TICKET = "ticket";

	private final static String LAST_KEY_GET_TIME = "lasttime";

	private static final String COMMUICATION_SERVER_MODE = "communcation_server";

	public static final int DEV_MODE = 1;

	public static final int TEST_MODE = 2;

	public static final int REL_MODE = 3;

	public static final int PROD_MODE = 4;
	
	public static final int DEMO_MODE = 5;

	private static final String DEV_DOMAIN_NAME = "dev-clientsvcs.myconnectedfarm.com";

	private static final String TEST_DOMAIN_NAME = "tst-clientsvcs.myconnectedfarm.com";

	//private static final String REL_DOMAIN_NAME = "rel-integrations.myconnectedfarm.com";
	private static final String REL_DOMAIN_NAME = "rel-clientsvcs.myconnectedfarm.com";
	//private static final String REL_DOMAIN_NAME = "10.122.141.12";
	
	private static final String PROD_DOMAIN_NAME = "clientsvcs.myconnectedfarm.com";
	
	public static final String DEMO_DOMAIN_NAME = "demo-local.com";
	
	private static final String APP_MODE = "devmode";
	
	
	public static final String SERVER_DATE_FORMAT="yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String SERVER_DATE_FORMAT_MILI="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	
	public static final String HTTP="http";
	
	public static final String HTTPS="https";

	// Development Environment
	// private static String DOMAIN_NAME = null;

	// Development Environment
	// private static String SERVERS_NAME = null;;

	// private long currentTime = -1;

	public String deviceId = null;

	public static final String PACKAGENAME = "com.trimble.vilicus";

	private final static String D_TICKET = null;

	public String productName = null;

	private long currentTime;

	private static final String POST = "post";
	public static final String GET = "get";
	
	public static final int KEY_EXPIRE_ERROR_CODE=400;
	
	private static final String APP_FIRST_LAUNCH="app_first_launch";
	
	  public static final String C_RESULT_CODE					="resultCode";
	  
	  public static final String RESULT_CODE					="ResultCode";
	  
	  public static final String KEY_EXPIRE		="The incoming token has expired. Get a new access token from the Authorization Server.";

	
	private transient AssetAPI assetAPI=null;
	
	

	public static synchronized ACDCApi getInstance(Context context) {
		if (acdcAPI == null) {
			acdcAPI = new ACDCApi(context);
			Log.i(TAG, " ACDC-Instance Created");
		}
		return acdcAPI;
	}

	private ACDCApi(Context context) {

		if (acdcAPI != null) {
			throw new IllegalArgumentException("use getInstance method");
		}
		this.context = context;
		assetAPI=new AssetAPI(context);
		currentTime = System.currentTimeMillis();
		checkProductionMode(context);
               
      
	}
	private void checkProductionMode(final Context context){
	   if(context == null){
              return;
	   }
	   final SharedPreferences preferences = PreferenceManager
	            .getDefaultSharedPreferences(context);
	      final boolean isAPPFirstLaunch = preferences.getBoolean(APP_FIRST_LAUNCH,
	            true);
	      if (isAPPFirstLaunch) {
	         // get the key from the manifest
	         final PackageManager pm = context.getPackageManager();
	         try {
	            final ApplicationInfo info = pm.getApplicationInfo(
	                  context.getPackageName(), PackageManager.GET_META_DATA);
	            if (info.metaData != null) {
	               final boolean isDevMode = info.metaData.getBoolean(APP_MODE);
	               
	            
	                  Log.i(TAG, "Production mode in manifest");
	               
	            } else {
	               Log.e(TAG, "dev mode meta data does in the manifest.xml");
	            }

	         } catch (final NameNotFoundException e) {
	            Log.e(TAG, e.getMessage(), e);
	         }
	         final Editor editor =preferences.edit();
	         editor.putBoolean(APP_FIRST_LAUNCH, false);
	         editor.commit();
	      }
	      
	}

	public interface NetWorkListener {

		public void requestSucesss(boolean isSucess, String stErrorMsg);

	}

	public synchronized LoginResponse login() throws UnknownHostException,
			IOException {
		LoginResponse loginResponse =null;
		boolean status = true;
		final int RESPONSE_CODE = 201;
		JsonClient client = new JsonClient(context);
		String stRegistrarionURL = String.format(LOGIN_URL,getProtoCal(), getDomainName());
		final boolean isJSONString=false;

		Log.i(TAG, "Login URL:" + stRegistrarionURL);
		LoginRequest loginRequest = getLoginInfo();
		if (loginRequest == null) {
			Log.i(TAG, "Login request null");
			return loginResponse;
		}
		ACDCResponse acdcResponse =null;
		
		
		   final ACDCRequest acdcRequest = new ACDCRequest(stRegistrarionURL,
                                loginRequest.getRequestData(isJSONString), ACDCRequest.POST, ACDCRequest.CONTENT_TYPE_URL_ENCODE,null);
		   acdcResponse = client.connectHttp(acdcRequest);
		
		try {

			String stData = client.convertByteArrayToString(acdcResponse.resData);
			if (stData != null) {
			   Log.i(TAG, "Login Response code:"+acdcResponse.iResponseCode);
			   Log.i(TAG, "Login Response:"+stData);
				 loginResponse = new LoginResponse();
				
				if (RESPONSE_CODE != acdcResponse.iResponseCode) {
					status = false;
					Log.i(TAG, "Login Exception-ErrorCode"+acdcResponse.iResponseCode);
					
					loginResponse.isAuthenticationFailed(stData);
					Log.i(TAG, "Login Error Msg:"+loginResponse.stMeaning);
					 status = false;
				} else {
					
					loginResponse.readResponse(stData);
				   if(loginResponse.ticket == null ){
				      status = false;
				      return loginResponse;
				   }
				    loginResponse.setUserName(loginRequest.username);
				    loginResponse.setPassword(loginRequest.password);
				    String stResponseOrgnization=loginResponse.stOrganizationID ;
				    storeTicket(loginResponse.ticket);
				    final User  user= VilicusContentProvider.
	                                          getInstance(context).insertUserName(loginResponse.stUserName, 
	                                                loginResponse.stOrganizationName, loginResponse.stOrganizationID);
				    final String stDBOrgID=user.getOrgId();	  
				    loginResponse.setOrganizationID(stDBOrgID);
	                                  
				    storeLoginInfo(user.getName(), loginResponse.stPassword, 
				          stDBOrgID);
					if (stResponseOrgnization != null) {
						boolean isSucess = organizationUpdate(stDBOrgID);
						if (isSucess) {
							updateData();
						} else {
							
							Log.e(TAG, "change organization failed");
						}
					} else {
					        updateData();
						Log.e(TAG, " organization  not found for this server");
						
					}
				   
				}
				String stResp = loginResponse.toString();

				Log.i(TAG, "Login-Responsecode:" + acdcResponse.iResponseCode
						+ ";Response:" + stResp);
			}
		} finally {

		}

		return loginResponse;
	}
	
	private void updateData() throws UnknownHostException, IOException{
		getAssets();
		
	}
	
             public synchronized boolean organizationUpdate(final String stOrgID) throws UnknownHostException,
                             IOException {
                     
                     boolean status = true;
                     final int RESPONSE_CODE = 201;
                     JsonClient client = new JsonClient(context);
                     String stRefershURL = String.format(ORGANIZATION_URL, getProtoCal(),getDomainName(),stOrgID);
                     Log.i(TAG, "Organization URL:" + stRefershURL);
                     final ACDCRequest acdcRequest = new ACDCRequest(stRefershURL,null,
                           ACDCRequest.POST, ACDCRequest.CONTENT_TYPE_URL_ENCODE,getTicket());
                     final ACDCResponse acdcResponse = client.connectHttp(acdcRequest);
                     try {
                     
                             String stData = client.convertByteArrayToString(acdcResponse.resData);
                             if (stData != null) {
                                Log.i(TAG, "Organization Response code:"+acdcResponse.iResponseCode);
                                Log.i(TAG, "Organization Response:"+stData);
                                     LoginResponse loginResponse = new LoginResponse();
                                     
                                     if (RESPONSE_CODE != acdcResponse.iResponseCode) {
                     
                                             status = false;
                                             Log.i(TAG, "Organization Exception-ErrorCode"+acdcResponse.iResponseCode);
                                    if(acdcResponse.iResponseCode == ACDCApi.KEY_EXPIRE_ERROR_CODE
                                                       && loginResponse.isKeyExpire(stData)){
                                        LoginResponse response =login();
                                        if(response != null){
                                               boolean isLoginSucess=response.isSuccess;
                                               if(isLoginSucess){
                                                     organizationUpdate(stOrgID);
                                               }
                                        }
                                       }
                     
                                     } else {
                                             loginResponse.readOrgChangeTicket(stData);
                                             storeTicket(loginResponse.ticket);
                                             storeOrganizationID(stOrgID);
                                             
                                     }
                                     String stResp = loginResponse.toString();
                     
                                     Log.i(TAG, "Organization URL-Responsecode:" + acdcResponse.iResponseCode
                                                     + ";Response:" + stResp);
                             }
                     } finally {
                     
                     }
                     
                     return status;
                     }

	public synchronized boolean refersh(final String stOrgID) throws UnknownHostException,
			IOException {
	        
	      if(stOrgID == null){
	         Log.i(TAG, "Refersh URL orgID is null");
	         return false;
	      }
	       
		boolean status = true;
		final int RESPONSE_CODE = 201;
		JsonClient client = new JsonClient(context);
		String stRefershURL = String.format(REFRESH_URL, getProtoCal(),getDomainName(),stOrgID);

		Log.i(TAG, "Refersh URL:" + stRefershURL);
		final ACDCRequest acdcRequest = new ACDCRequest(stRefershURL, null,
		      ACDCRequest.POST, ACDCRequest.CONTENT_TYPE_URL_ENCODE,getTicket());
		final ACDCResponse acdcResponse = client.connectHttp(acdcRequest);
		try {

			String stData = client.convertByteArrayToString(acdcResponse.resData);
			if (stData != null) {
			   Log.i(TAG, "Refersh Response code:"+acdcResponse.iResponseCode);
                           Log.i(TAG, "Refersh Response:"+stData);
				LoginResponse loginResponse = new LoginResponse();
				
				if (RESPONSE_CODE != acdcResponse.iResponseCode) {

					status = false;
					Log.i(TAG, "Refersh Exception-ErrorCode"+acdcResponse.iResponseCode);
		               if(acdcResponse.iResponseCode == ACDCApi.KEY_EXPIRE_ERROR_CODE
			              		  && loginResponse.isKeyExpire(stData)){
		            	   LoginResponse response =login();
		            	if(response != null){
			              	  boolean isLoginSucess=response.isSuccess;
			              	  if(isLoginSucess){
			              		refersh(stOrgID);
			              	  }
			           }
		               }

				} else {
					loginResponse.readOrgChangeTicket(stData);
					storeOrganizationID(stOrgID);  
					storeTicket(loginResponse.ticket);
					
				}
				String stResp = loginResponse.toString();

				Log.i(TAG, "Refersh URL-Responsecode:" + acdcResponse.iResponseCode
						+ ";Response:" + stResp);
			}
		} finally {

		}

		return status;
	}

	public synchronized boolean getAssets() throws UnknownHostException,
			IOException {
	   
		return assetAPI.getAssets(this);
	}


	private void storeTicket(String stTicket) {
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		Editor editor = preferences.edit();
		editor.putString(TICKET, stTicket);
		java.util.Date date = new java.util.Date();
		long lCurrentTime = date.getTime();
		editor.putLong(LAST_KEY_GET_TIME, lCurrentTime);
		Log.i(TAG, "Storing Ticket :" + stTicket + " with time:" + date);
		editor.commit();
	}

	public String getTicket() {
		String stTicket = null;
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		stTicket = preferences.getString(TICKET, D_TICKET);
		//Log.i(TAG, "getTicket- ticket = " + stTicket);
		return stTicket;
	}

	public void checkRegistrationKeyExpire(NetWorkListener listener) {

		if (isKeyExpire()) {
			doRegistration(listener);
		} else {
			if (listener != null) {
				listener.requestSucesss(true, null);
			}
		}

	}

	public boolean isKeyExpire() {

		boolean isKeyExpire = false;
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		String stTicket = getTicket();
		if (stTicket == null) {
			return true;
		}
		long lastKeyTime = preferences.getLong(LAST_KEY_GET_TIME, -1);
		if (currentTime > lastKeyTime) {
			long diff = currentTime - lastKeyTime;

			final long timeInMillis = diff;

			final int days = (int) (timeInMillis / (24L * 60 * 60 * 1000));

			int remdr = (int) (timeInMillis % (24L * 60 * 60 * 1000));

			final int hours = remdr / (60 * 60 * 1000);

			remdr %= 60 * 60 * 1000;

			final int minutes = remdr / (60 * 1000);

			remdr %= 60 * 1000;

			final int seconds = remdr / 1000;

			final int ms = remdr % 1000;
			if (days >= 1 && seconds >= 1) {
				isKeyExpire = true;
			}
		}
		Log.i(TAG, "KeyExpiration Status:" + isKeyExpire);
		return isKeyExpire;
	}

	public void doRegistration(NetWorkListener listener) {
		this.mNetWorkListener = listener;
		final boolean isNetworkAvaliable = Utils.isInternetConnection(context);
		if (isNetworkAvaliable || isDemoServer()) {
			Thread thread = new Thread(mRunnable, "Registration thread");
			thread.start();
		} else {
			if (mNetWorkListener != null) {
				mNetWorkListener.requestSucesss(false,
						"No network connection");
			}
		}
		// mRegistrationHandler.post(mRunnable);
	}
	
	
	public void doRefersh() {
         
           final boolean isNetworkAvaliable = Utils.isInternetConnection(context);
           if (isNetworkAvaliable && getTicket() != null && isKeyExpire()) {
                   Thread thread = new Thread(new Runnable() {
                     
                     @Override
                     public void run() {
                      try {
                    	  Log.i(TAG, "Refersh thread started");
                    	  final String stOrgID=getOrganizationID();
                        refersh(stOrgID);
                     } catch (UnknownHostException e) {
                        Log.e(TAG, e.getMessage(),e);
                        
                     } catch (IOException e) {
                       
                        Log.e(TAG, e.getMessage(),e);
                     }
                        
                     }
                  }, "Refersh thread");
                   thread.start();
           } 
   }
	private NetWorkListener mNetWorkListener = null;
	
	public void unRegisterNetworkListener(){
	   mNetWorkListener=null;
	}
	private void sendMessage(final boolean isSucess,final String stMsg){
	   if (mNetWorkListener != null) {
              mNetWorkListener.requestSucesss(isSucess,stMsg);
      }
	}
	private Runnable mRunnable = new Runnable() {

		@Override
		public void run() {

			try {
			   boolean isSucess=false;
				if (!Utils.isInternetConnection(context) && !isDemoServer()) {
				   String stErrorMsg="No network connection";
				   
	                           sendMessage(false, stErrorMsg);
					return;
				}
				 LoginResponse response =login();
				 if(response != null){
				    isSucess=response.isSuccess;
				 }
				
				 if(isSucess){
				 
				 }else{
				    storeLoginInfo(null,null,null);
				 }
				
				
				   String stMsg=null;
				   if(! isSucess && response.isAuthenticationFailed){
					   stMsg="Authentication failer";
				   }else if(! isSucess && !response.isAuthenticationFailed){
					   stMsg="Login server error";
				   }
					   
				   sendMessage(isSucess,stMsg);
					
				
			} catch (UnknownHostException e) {
			   Log.e(TAG, e.getMessage(),e);
			   String stErrorMsg=" \nHost not reachable Error code:"+ e.getMessage();
			   
			   sendMessage(false,stErrorMsg);

			} catch (IOException e) {
			   Log.e(TAG, e.getMessage(),e);
			   String stErrorMsg="No network connection \nError code:"+ e.getMessage();
			   sendMessage(false,stErrorMsg);

			}
		}
	};

	public void close() {
		acdcAPI = null;
	}

	public void serverMode(int iServerMode) {

		if (iServerMode < DEV_MODE || iServerMode > DEMO_MODE) {
			return;
		}
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		final Editor editor = preferences.edit();
		
			editor.putInt(COMMUICATION_SERVER_MODE, iServerMode);	
		
		
		editor.commit();
	}

	public int getServerMode() {
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		int iServerMode = preferences.getInt(COMMUICATION_SERVER_MODE,
				REL_MODE);
		return iServerMode;
	}

	public String getDomainName() {
		final int iServerMode = getServerMode();
		String stServerName = null;
		switch (iServerMode) {
		case DEV_MODE:
			stServerName = DEV_DOMAIN_NAME;
			break;
		case TEST_MODE:
			stServerName = TEST_DOMAIN_NAME;
			break;
		case REL_MODE:
			stServerName = REL_DOMAIN_NAME;
			break;
		case PROD_MODE:
			stServerName = PROD_DOMAIN_NAME;
			break;
		case DEMO_MODE:
			stServerName = DEMO_DOMAIN_NAME;
			break;
		default:
			break;
		}
		return stServerName;
	}
	
	public boolean isDemoServer(){
		final int iServerMode = getServerMode();
		return iServerMode == DEMO_MODE;
	}
			
	
	
	private static final String USER_NAME = "user_name";

	private static final String PASS_WORD = "pass_word";
	
	private static final String ORGANIZATION_ID = "organization";

	public void storeLoginInfo(final String stUserName,final  String stPassword,
	      final  String stOrganizationID) {
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		final Editor editor = preferences.edit();
		editor.putString(USER_NAME, stUserName);
		editor.putString(PASS_WORD, stPassword);
		editor.putString(ORGANIZATION_ID, stOrganizationID);
		//Log.i(TAG, "storeLoginInfo-Username=" + stUserName + " password= " + stPassword+ " OrganizationID="+stOrganizationID);
		// Sending side
		byte[] data;
		String base64=null;
		try {
			data = stPassword.getBytes("UTF-8");
			 base64 = Base64.encodeToString(data, Base64.DEFAULT);
			// Receiving side
//			 data = Base64.decode(base64, Base64.DEFAULT);
//			 String text = new String(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		Log.i(TAG, "storeLoginInfo-Username=" + stUserName +", OrganizationID="+stOrganizationID);
		editor.commit();
	}
	public String getUserName() {
        
           final SharedPreferences preferences = PreferenceManager
                           .getDefaultSharedPreferences(context);
           final String username = preferences.getString(USER_NAME, null);
           Log.i(TAG, "getUserName-Username=" + username);
           return username;
	}
	
	public void storeOrganizationID(
              final  String stOrganizationID) {
                final SharedPreferences preferences = PreferenceManager
                                .getDefaultSharedPreferences(context);
                final Editor editor = preferences.edit();
             
                editor.putString(ORGANIZATION_ID, stOrganizationID);
                Log.i(TAG, "storeOrgnizationInfo-=" + stOrganizationID);
                editor.commit();
        }
	public String getOrganizationID() {
	        
           final SharedPreferences preferences = PreferenceManager
                           .getDefaultSharedPreferences(context);
           final String stOrganizationID = preferences.getString(ORGANIZATION_ID, null);
           Log.i(TAG, "getOrganization-Organization=" + stOrganizationID);
           return stOrganizationID;
        }
	private LoginRequest getLoginInfo() {
		LoginRequest loginRequest = null;
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		final String username = preferences.getString(USER_NAME, null);
		final String password = preferences.getString(PASS_WORD, null);
		final String organizationID = preferences.getString(ORGANIZATION_ID, null);
		final String applicationName = "LegacyFeatures";
		if (username != null && password != null) {
			loginRequest = new LoginRequest(username, password, applicationName,organizationID);
		}
		return loginRequest;
	}

	public void logOut() {
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		final Editor editor = preferences.edit();
		editor.putString(USER_NAME, null);
		editor.putString(PASS_WORD, null);
		editor.putString(ORGANIZATION_ID, null);
		storeTicket(null);
		editor.commit();
		Log.i(TAG, "Logged out");
	}

	public boolean islogOut() {
		boolean isLogout = true;
		final SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(context);
		final String username = preferences.getString(USER_NAME, null);
		final String password = preferences.getString(PASS_WORD, null);

		if (username != null && password != null && getTicket() != null) {
			isLogout = false;
		}

		return isLogout;
	}
	
	public User getCurrentUser(){
	   User user = null;
	   final SharedPreferences preferences = PreferenceManager
                 .getDefaultSharedPreferences(context);
	   final String username = preferences.getString(USER_NAME, null);
           final String organization = preferences.getString(ORGANIZATION_ID, null);
           VilicusContentProvider contentProvider = VilicusContentProvider.getInstance(context);
           user =contentProvider.getUserInfo(username, organization);
           return user; 
	}
	
      public Context getContext() {
         return context;
      }
      public String getProtoCal(){
         String stProtoCal=HTTP;
         if(getServerMode() == REL_MODE || getServerMode() == PROD_MODE){
            stProtoCal=HTTPS;
         }
         return stProtoCal;
         
      }
      
     
}
