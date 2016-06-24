
package com.mapopolis.viewer.draw;

class BoldFont

{

    static char[] boldFontLettersh = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            3072, 3072, 3072, 3072, 65472, 3072, 3072, 3072, 3072, 0, 0, 3584,
            3584, 3584, 3584, 65504, 32704, 16256, 7936, 3584, 1024, 0, 0, 0,
            0, 0, 65504, 0, 0, 0, 0, 0, 12288, 28672, 65408, 65472, 28896,
            12384, 96, 96, 96, 96, 0, 0, 0, 0, 0, 0, 0, 0, 0, 56064, 0, 0,
            28672, 55296, 55296, 28672, 30720, 52608, 50944, 52608, 30912, 0,
            0, 49152, 49152, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7168, 12288, 24576,
            49152, 49152, 49152, 24576, 12288, 7168, 0, 0, 57344, 12288, 6144,
            3072, 3072, 3072, 6144, 12288, 57344, 0, 0, 0, 32704, 32704, 24768,
            24768, 24768, 24768, 24768, 32704, 32704, 0, 0, 0, 6144, 6144,
            6144, 65280, 6144, 6144, 6144, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24576,
            49152, 0, 0, 0, 0, 0, 0, 65024, 65024, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 49152, 49152, 0, 0, 0, 3584, 3584, 3584, 3584, 65504,
            32704, 16256, 7936, 3584, 1024, 31744, 50688, 50688, 50688, 50688,
            50688, 50688, 50688, 31744, 0, 0, 57344, 24576, 24576, 24576,
            24576, 24576, 24576, 24576, 24576, 0, 0, 31744, 34304, 1536, 3072,
            6144, 12288, 24576, 49152, 65024, 0, 0, 32256, 49920, 768, 1536,
            15872, 1536, 768, 49920, 32256, 0, 0, 3840, 6912, 13056, 25344,
            49920, 65472, 768, 768, 768, 0, 0, 64512, 49152, 49152, 64512,
            1536, 1536, 1536, 50688, 64512, 0, 0, 15360, 24576, 49152, 64512,
            50688, 50688, 50688, 50688, 31744, 0, 0, 65280, 768, 1536, 3072,
            6144, 12288, 24576, 49152, 49152, 0, 0, 32256, 49920, 49920, 49920,
            32256, 49920, 49920, 49920, 32256, 0, 0, 31744, 50688, 50688,
            50688, 50688, 32256, 1536, 3072, 30720, 0, 0, 0, 0, 65504, 32704,
            16256, 7936, 3584, 1024, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 32768, 0, 65504, 65504, 0, 65504, 65504, 0, 65504, 65504, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 16256, 32704, 57568, 49248,
            49248, 57568, 32704, 16256, 384, 192, 96, 14336, 27648, 50688,
            50688, 65024, 50688, 50688, 50688, 50688, 0, 0, 64512, 52736,
            50688, 50688, 64512, 50688, 50688, 52736, 64512, 0, 0, 31744,
            50688, 50688, 49152, 49152, 49152, 50688, 50688, 31744, 0, 0,
            63488, 52224, 50688, 50688, 50688, 50688, 50688, 52224, 63488, 0,
            0, 65024, 49152, 49152, 49152, 64512, 49152, 49152, 49152, 65024,
            0, 0, 65024, 49152, 49152, 49152, 64512, 49152, 49152, 49152,
            49152, 0, 0, 31744, 50688, 50688, 49152, 49152, 52736, 50688,
            50688, 31744, 0, 0, 50688, 50688, 50688, 50688, 65024, 50688,
            50688, 50688, 50688, 0, 0, 61440, 24576, 24576, 24576, 24576,
            24576, 24576, 24576, 61440, 0, 0, 7680, 3072, 3072, 3072, 3072,
            3072, 52224, 52224, 30720, 0, 0, 49920, 50688, 52224, 55296, 61440,
            55296, 52224, 50688, 49920, 0, 0, 49152, 49152, 49152, 49152,
            49152, 49152, 49152, 49152, 65024, 0, 0, 49248, 57568, 61920,
            56160, 52832, 50272, 49248, 49248, 49248, 0, 0, 49344, 57536,
            61632, 55488, 52416, 50880, 50112, 49600, 49344, 0, 0, 31744,
            50688, 50688, 50688, 50688, 50688, 50688, 50688, 31744, 0, 0,
            64512, 50688, 50688, 50688, 64512, 49152, 49152, 49152, 49152, 0,
            0, 30720, 50688, 50688, 50688, 50688, 50688, 56832, 52992, 31616,
            0, 0, 64512, 50688, 50688, 50688, 64512, 52224, 50688, 49920,
            49920, 0, 0, 31744, 50688, 49152, 49152, 31744, 1536, 1536, 50688,
            31744, 0, 0, 65280, 6144, 6144, 6144, 6144, 6144, 6144, 6144, 6144,
            0, 0, 49920, 49920, 49920, 49920, 49920, 49920, 49920, 49920,
            32256, 0, 0, 49536, 49536, 49536, 49536, 49536, 49536, 25344,
            13824, 7168, 0, 0, 49248, 49248, 49248, 50272, 52832, 56160, 56160,
            29120, 24768, 0, 0, 49536, 49536, 25344, 13824, 7168, 13824, 25344,
            49536, 49536, 0, 0, 49344, 49344, 24960, 13056, 7680, 3072, 3072,
            3072, 3072, 0, 0, 65280, 768, 1536, 3072, 6144, 12288, 24576,
            49152, 65280, 0, 0, 1024, 3072, 7168, 15360, 31744, 64512, 31744,
            15360, 7168, 3072, 1024, 1024, 3584, 7936, 16256, 32704, 65504,
            3584, 3584, 3584, 3584, 0, 32768, 49152, 57344, 61440, 63488,
            64512, 63488, 61440, 57344, 49152, 32768, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            49152, 49152, 49152, 64512, 50688, 50688, 50688, 50688, 64512, 0,
            0, 0, 0, 0, 31744, 50688, 49152, 49152, 50688, 31744, 0, 0, 1536,
            1536, 1536, 32256, 50688, 50688, 50688, 50688, 32256, 0, 0, 0, 0,
            0, 31744, 50688, 65024, 49152, 50688, 31744, 0, 0, 30720, 52224,
            49152, 49152, 61440, 49152, 49152, 49152, 49152, 0, 0, 0, 0, 0,
            31744, 50688, 50688, 50688, 50688, 32256, 3072, 63488, 49152,
            49152, 49152, 49152, 64512, 50688, 50688, 50688, 50688, 0, 0, 0,
            49152, 0, 49152, 49152, 49152, 49152, 49152, 49152, 0, 0, 0, 3072,
            0, 3072, 3072, 3072, 3072, 3072, 27648, 27648, 14336, 49152, 49152,
            49152, 50688, 52224, 55296, 61440, 52224, 50688, 0, 0, 49152,
            49152, 49152, 49152, 49152, 49152, 49152, 49152, 49152, 0, 0, 0, 0,
            0, 29568, 52416, 52416, 52416, 52416, 52416, 0, 0, 0, 0, 0, 48128,
            50688, 50688, 50688, 50688, 50688, 0, 0, 0, 0, 0, 31744, 50688,
            50688, 50688, 50688, 31744, 0, 0, 0, 0, 0, 31744, 50688, 50688,
            50688, 50688, 64512, 49152, 49152, 0, 0, 0, 31744, 50688, 50688,
            50688, 50688, 32256, 1536, 1536, 0, 0, 0, 31744, 50688, 49152,
            49152, 49152, 49152, 0, 0, 0, 0, 0, 31744, 49152, 31744, 1536,
            50688, 31744, 0, 0, 0, 12288, 12288, 64512, 12288, 12288, 12288,
            12288, 12288, 0, 0, 0, 0, 0, 49920, 49920, 49920, 49920, 49920,
            32256, 0, 0, 0, 0, 0, 49536, 49536, 49536, 25344, 13824, 7168, 0,
            0, 0, 0, 0, 50272, 52832, 56160, 56160, 29120, 24768, 0, 0, 0, 0,
            0, 50688, 27648, 14336, 14336, 27648, 50688, 0, 0, 0, 0, 0, 50688,
            50688, 50688, 50688, 50688, 32256, 1536, 31744, 0, 0, 0, 65024,
            3072, 6144, 12288, 24576, 65024, 0, 0, 24576, 12288, 0, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 3072, 6144, 0, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 7168, 13824, 0, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 6912, 13824, 0, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 13824, 13824, 0, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 7168, 13824, 7168, 6144,
            15360, 26112, 65280, 49920, 49920, 0, 0, 14336, 28640, 50688,
            50688, 65472, 50688, 50688, 50688, 51168, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 32768, 24576, 12288, 0, 65024, 49152, 64512, 49152,
            49152, 65024, 0, 0, 6144, 12288, 0, 65024, 49152, 64512, 49152,
            49152, 65024, 0, 0, 14336, 27648, 0, 65024, 49152, 64512, 49152,
            49152, 65024, 0, 0, 27648, 27648, 0, 65024, 49152, 64512, 49152,
            49152, 65024, 0, 0, 24576, 12288, 0, 64512, 12288, 12288, 12288,
            12288, 64512, 0, 0, 6144, 12288, 0, 64512, 12288, 12288, 12288,
            12288, 64512, 0, 0, 14336, 27648, 0, 64512, 12288, 12288, 12288,
            12288, 64512, 0, 0, 27648, 27648, 0, 64512, 12288, 12288, 12288,
            12288, 64512, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 13824,
            27648, 0, 49920, 58112, 54016, 51968, 50944, 49920, 0, 0, 24576,
            12288, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 3072,
            6144, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 7168,
            13824, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 13824,
            27648, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 13824,
            13824, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 0, 192,
            384, 16128, 26496, 28032, 31104, 29056, 32512, 49152, 0, 0, 192,
            384, 16128, 26496, 28032, 31104, 29056, 32512, 49152, 0, 12288,
            6144, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0, 3072,
            6144, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0, 7168,
            13824, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0, 13824,
            13824, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768,
            31744, 49920, 49920, 50688, 56320, 50688, 49920, 49920, 56320, 0,
            0, 24576, 12288, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            3072, 6144, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            14336, 27648, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            13824, 27648, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            27648, 27648, 0, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            7168, 13824, 7168, 31744, 1536, 32256, 50688, 50688, 32256, 0, 0,
            0, 0, 0, 31680, 3168, 32736, 52224, 52320, 31680, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 32768, 24576, 12288, 0, 31744, 50688, 65024,
            49152, 50688, 31744, 0, 0, 6144, 12288, 0, 31744, 50688, 65024,
            49152, 50688, 31744, 0, 0, 14336, 27648, 0, 31744, 50688, 65024,
            49152, 50688, 31744, 0, 0, 27648, 27648, 0, 31744, 50688, 65024,
            49152, 50688, 31744, 0, 0, 24576, 12288, 0, 12288, 12288, 12288,
            12288, 12288, 12288, 0, 0, 6144, 12288, 0, 12288, 12288, 12288,
            12288, 12288, 12288, 0, 0, 14336, 27648, 0, 12288, 12288, 12288,
            12288, 12288, 12288, 0, 0, 27648, 27648, 0, 12288, 12288, 12288,
            12288, 12288, 12288, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768,
            13824, 27648, 0, 48128, 50688, 50688, 50688, 50688, 50688, 0, 0,
            24576, 12288, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0,
            3072, 6144, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0,
            14336, 27648, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0,
            13824, 27648, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0,
            27648, 27648, 0, 32256, 49920, 49920, 49920, 49920, 32256, 0, 0, 0,
            192, 384, 16128, 26496, 28032, 31104, 29056, 32512, 49152, 0, 0,
            192, 384, 16128, 26496, 28032, 31104, 29056, 32512, 49152, 0,
            12288, 6144, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0,
            3072, 6144, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0,
            14336, 27648, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0,
            27648, 27648, 0, 49920, 49920, 49920, 49920, 49920, 32256, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            32768, 31744, 49920, 49920, 50688, 56320, 50688, 49920, 49920,
            56320, 0, 0, 0 };

    // down

    static char[] boldFontLettersd = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1024,
            1024, 1024, 1024, 32704, 32704, 1024, 1024, 1024, 1024, 0, 1024,
            3072, 7168, 15360, 32704, 65472, 32704, 15360, 7168, 3072, 1024,
            1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024,
            384, 960, 2016, 2016, 384, 384, 384, 384, 896, 32512, 32256, 8192,
            8192, 0, 8192, 8192, 0, 8192, 8192, 0, 0, 0, 7360, 16352, 8992,
            9184, 14016, 7168, 2048, 7168, 13312, 8192, 0, 96, 96, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 1792, 3968, 6336, 12384, 8224, 8224, 0, 0, 0, 0, 0,
            8224, 8224, 12384, 6336, 3968, 1792, 0, 0, 0, 0, 0, 0, 32704,
            32704, 24768, 24768, 24768, 24768, 24768, 32704, 32704, 0, 1024,
            1024, 1024, 16256, 16256, 1024, 1024, 1024, 0, 0, 0, 8192, 12288,
            4096, 0, 0, 0, 0, 0, 0, 0, 0, 1536, 1536, 1536, 1536, 1536, 1536,
            1536, 0, 0, 0, 0, 12288, 12288, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1024,
            3072, 7168, 15360, 32704, 65472, 32704, 15360, 7168, 3072, 1024,
            8128, 16352, 8224, 8224, 8224, 16352, 8128, 0, 0, 0, 0, 32, 16352,
            16352, 0, 0, 0, 0, 0, 0, 0, 0, 12352, 14368, 11296, 9760, 8992,
            8672, 8384, 0, 0, 0, 0, 4160, 12384, 8736, 8736, 8736, 10016,
            16352, 6336, 0, 0, 0, 1536, 1792, 1408, 1216, 1120, 1056, 16352,
            16352, 1024, 1024, 0, 12768, 12768, 8480, 8480, 8480, 16160, 7680,
            0, 0, 0, 0, 8064, 16320, 8544, 8480, 8480, 16160, 7680, 0, 0, 0, 0,
            12320, 14368, 3104, 1568, 800, 416, 224, 96, 0, 0, 0, 7616, 16352,
            8736, 8736, 8736, 8736, 16352, 7616, 0, 0, 0, 960, 10208, 9248,
            9248, 13344, 8160, 4032, 0, 0, 0, 0, 128, 384, 896, 1920, 3968,
            8064, 3968, 1920, 896, 384, 128, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 14016, 14016, 14016, 14016, 14016, 14016, 14016, 14016,
            14016, 14016, 14016, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1920,
            4032, 7392, 6240, 6240, 6240, 6240, 14432, 31968, 53184, 34688,
            16256, 16320, 608, 544, 608, 16320, 16256, 0, 0, 0, 0, 16352,
            16352, 8736, 8736, 12896, 16352, 7616, 0, 0, 0, 0, 8128, 16352,
            8224, 8224, 8224, 14560, 6336, 0, 0, 0, 0, 16352, 16352, 8224,
            8224, 12384, 8128, 3968, 0, 0, 0, 0, 16352, 16352, 8736, 8736,
            8736, 8736, 8224, 0, 0, 0, 0, 16352, 16352, 544, 544, 544, 544, 32,
            0, 0, 0, 0, 8128, 16352, 8224, 8224, 9248, 15584, 7360, 0, 0, 0, 0,
            16352, 16352, 512, 512, 512, 16352, 16352, 0, 0, 0, 0, 8224, 16352,
            16352, 8224, 0, 0, 0, 0, 0, 0, 0, 6144, 14336, 8192, 8224, 16352,
            8160, 32, 0, 0, 0, 0, 16352, 16352, 512, 1792, 3456, 6336, 12384,
            8224, 0, 0, 0, 16352, 16352, 8192, 8192, 8192, 8192, 8192, 0, 0, 0,
            0, 16352, 16352, 192, 384, 768, 1536, 768, 384, 192, 16352, 16352,
            16352, 16352, 192, 384, 768, 1536, 3072, 6144, 16352, 16352, 0,
            8128, 16352, 8224, 8224, 8224, 16352, 8128, 0, 0, 0, 0, 16352,
            16352, 544, 544, 544, 992, 448, 0, 0, 0, 0, 8128, 16352, 8224,
            10272, 14368, 8128, 16320, 12288, 8192, 0, 0, 16352, 16352, 544,
            544, 1568, 4064, 14784, 12288, 0, 0, 0, 4544, 13280, 8736, 8736,
            8736, 15968, 7232, 0, 0, 0, 0, 32, 32, 32, 16352, 16352, 32, 32,
            32, 0, 0, 0, 8160, 16352, 8192, 8192, 8192, 8192, 16352, 8160, 0,
            0, 0, 2016, 4064, 6144, 12288, 8192, 12288, 6144, 4064, 2016, 0, 0,
            4064, 16352, 12288, 7168, 3584, 768, 3584, 7168, 12288, 16352,
            4064, 12384, 14560, 3456, 1792, 512, 1792, 3456, 14560, 12384, 0,
            0, 96, 224, 384, 768, 15872, 15872, 768, 384, 224, 96, 0, 12320,
            14368, 11296, 9760, 8992, 8608, 8416, 8288, 0, 0, 0, 1024, 3584,
            7936, 16256, 32704, 65504, 0, 0, 0, 0, 0, 1024, 1536, 1792, 1920,
            32704, 32736, 32704, 1920, 1792, 1536, 1024, 65504, 32704, 16256,
            7936, 3584, 1024, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            6144, 15616, 9472, 9472, 9472, 16128, 15872, 0, 0, 0, 0, 16352,
            16352, 8448, 8448, 8448, 16128, 7680, 0, 0, 0, 0, 7680, 16128,
            8448, 8448, 8448, 13056, 4608, 0, 0, 0, 0, 7680, 16128, 8448, 8448,
            8448, 16352, 16352, 0, 0, 0, 0, 7680, 16128, 9472, 9472, 9472,
            14080, 5632, 0, 0, 0, 0, 16320, 16352, 544, 544, 96, 64, 0, 0, 0,
            0, 0, 40448, 48896, 41216, 41216, 57600, 32512, 15872, 0, 0, 0, 0,
            16352, 16352, 512, 512, 512, 15872, 15360, 0, 0, 0, 0, 16192,
            16192, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24576, 57344, 32768, 65344,
            32576, 0, 0, 0, 0, 0, 16352, 16352, 2048, 3072, 5632, 13056, 8448,
            0, 0, 0, 0, 16352, 16352, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15872, 16128,
            256, 256, 15872, 15872, 256, 256, 16128, 15872, 0, 16128, 15872,
            256, 256, 256, 16128, 15872, 0, 0, 0, 0, 7680, 16128, 8448, 8448,
            8448, 16128, 7680, 0, 0, 0, 0, 65024, 65280, 8448, 8448, 8448,
            16128, 7680, 0, 0, 0, 0, 7680, 16128, 8448, 8448, 8448, 65280,
            65024, 0, 0, 0, 0, 15872, 16128, 256, 256, 256, 768, 512, 0, 0, 0,
            0, 4608, 14080, 9472, 9472, 9472, 15616, 6144, 0, 0, 0, 0, 256,
            256, 16320, 16320, 256, 256, 0, 0, 0, 0, 0, 7936, 16128, 8192,
            8192, 8192, 8192, 16128, 7936, 0, 0, 0, 1792, 3840, 6144, 12288,
            8192, 12288, 6144, 3840, 1792, 0, 0, 3840, 16128, 12288, 7168,
            3584, 768, 3584, 7168, 12288, 16128, 3840, 8448, 13056, 7680, 3072,
            7680, 13056, 8448, 0, 0, 0, 0, 7936, 48896, 40960, 40960, 40960,
            65280, 32512, 0, 0, 0, 0, 8448, 12544, 14592, 11520, 9984, 8960,
            8448, 0, 0, 0, 0, 14336, 15392, 3680, 2880, 2816, 3584, 15360,
            14336, 0, 0, 0, 14336, 15360, 3584, 2880, 2912, 3616, 15360, 14336,
            0, 0, 0, 14336, 15360, 3648, 2912, 2848, 3680, 15424, 14336, 0, 0,
            0, 14336, 15360, 3648, 2912, 2848, 3648, 15456, 14368, 0, 0, 0,
            14336, 15360, 3680, 2912, 2816, 3680, 15456, 14336, 0, 0, 0, 14336,
            15360, 3648, 3040, 2976, 3808, 15424, 14336, 0, 0, 0, 16256, 16320,
            608, 544, 608, 16320, 16320, 8768, 8768, 8768, 8256, 32768, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 16128, 16160, 9568, 9536, 9472, 9472, 8448,
            0, 0, 0, 0, 16128, 16128, 9536, 9568, 9504, 9472, 8448, 0, 0, 0, 0,
            16128, 16192, 9568, 9504, 9568, 9536, 8448, 0, 0, 0, 0, 16128,
            16224, 9568, 9472, 9568, 9568, 8448, 0, 0, 0, 0, 8448, 8480, 16224,
            16192, 8448, 8448, 0, 0, 0, 0, 0, 8448, 8448, 16192, 16224, 8480,
            8448, 0, 0, 0, 0, 0, 8448, 8512, 16224, 16160, 8544, 8512, 0, 0, 0,
            0, 0, 8448, 8544, 16224, 16128, 8544, 8544, 0, 0, 0, 0, 0, 32768,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16128, 16192, 608, 1056, 2112, 4192,
            16160, 16128, 0, 0, 0, 7680, 16160, 8544, 8512, 8448, 8448, 16128,
            7680, 0, 0, 0, 7680, 16128, 8448, 8512, 8544, 8480, 16128, 7680, 0,
            0, 0, 7680, 16128, 8512, 8544, 8480, 8544, 16192, 7680, 0, 0, 0,
            7680, 16192, 8544, 8480, 8512, 8544, 16160, 7680, 0, 0, 0, 7680,
            16128, 8544, 8544, 8448, 8544, 16224, 7680, 0, 0, 0, 16384, 32256,
            16128, 14592, 11520, 9984, 8960, 16256, 7872, 64, 0, 16384, 32256,
            16128, 14592, 11520, 9984, 8960, 16256, 7872, 64, 0, 7936, 16128,
            8224, 8288, 8256, 8192, 16128, 7936, 0, 0, 0, 7936, 16128, 8192,
            8256, 8288, 8224, 16128, 7936, 0, 0, 0, 7936, 16128, 8256, 8288,
            8224, 8288, 16192, 7936, 0, 0, 0, 7936, 16128, 8288, 8288, 8192,
            8288, 16224, 7936, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16320, 16352, 32, 8736, 8736,
            10016, 7616, 6336, 0, 0, 0, 6144, 15648, 9568, 9536, 9472, 16128,
            15872, 0, 0, 0, 0, 6144, 15616, 9472, 9536, 9568, 16160, 15872, 0,
            0, 0, 0, 6144, 15680, 9568, 9504, 9568, 16192, 15872, 0, 0, 0, 0,
            6144, 15680, 9568, 9504, 9536, 16224, 15904, 0, 0, 0, 0, 6144,
            15712, 9568, 9472, 9568, 16224, 15872, 0, 0, 0, 0, 6144, 15616,
            9536, 9696, 9632, 16352, 15936, 0, 0, 0, 0, 6144, 15616, 9472,
            9472, 16128, 7680, 9472, 9472, 9472, 14080, 5632, 32768, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 7680, 16160, 9568, 9536, 9472, 14080, 5632, 0,
            0, 0, 0, 7680, 16128, 9536, 9568, 9504, 14080, 5632, 0, 0, 0, 0,
            7680, 16192, 9568, 9504, 9568, 14144, 5632, 0, 0, 0, 0, 7680,
            16224, 9568, 9472, 9568, 14176, 5632, 0, 0, 0, 0, 0, 32, 16224,
            16192, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16192, 16224, 32, 0, 0, 0, 0, 0,
            0, 0, 64, 16224, 16160, 96, 64, 0, 0, 0, 0, 0, 0, 96, 16224, 16128,
            96, 96, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16128,
            15936, 352, 288, 320, 16224, 15904, 0, 0, 0, 0, 7680, 16160, 8544,
            8512, 8448, 8448, 16128, 7680, 0, 0, 0, 7680, 16128, 8448, 8512,
            8544, 8480, 16128, 7680, 0, 0, 0, 7680, 16192, 8544, 8480, 8544,
            8512, 16128, 7680, 0, 0, 0, 7680, 16192, 8544, 8480, 8512, 8544,
            16160, 7680, 0, 0, 0, 7680, 16224, 8544, 8448, 8544, 8544, 16128,
            7680, 0, 0, 0, 16384, 32256, 16128, 14592, 11520, 9984, 8960,
            16256, 7872, 64, 0, 16384, 32256, 16128, 14592, 11520, 9984, 8960,
            16256, 7872, 64, 0, 7936, 16128, 8224, 8288, 8256, 8192, 16128,
            7936, 0, 0, 0, 7936, 16128, 8192, 8256, 8288, 8224, 16128, 7936, 0,
            0, 0, 7936, 16192, 8288, 8224, 8288, 8256, 16128, 7936, 0, 0, 0,
            7936, 16224, 8288, 8192, 8288, 8288, 16128, 7936, 0, 0, 0, 32768,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            16320, 16352, 32, 8736, 8736, 10016, 7616, 6336, 0, 0, 0, 0 };

    // up

    static char[] boldFontLettersu = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            1024, 1024, 1024, 1024, 32704, 32704, 1024, 1024, 1024, 1024, 1024,
            1536, 1792, 1920, 32704, 32736, 32704, 1920, 1792, 1536, 1024,
            1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024, 1024,
            4032, 8128, 14336, 12288, 12288, 12288, 12288, 64512, 64512, 30720,
            12288, 0, 0, 0, 128, 128, 0, 128, 128, 0, 128, 128, 0, 128, 1408,
            1792, 512, 1792, 28032, 63616, 39040, 65408, 26368, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 49152, 49152, 0, 0, 0, 0, 0, 32896, 32896, 49536,
            25344, 15872, 7168, 0, 0, 0, 0, 0, 7168, 15872, 25344, 49536,
            32896, 32896, 0, 32704, 32704, 24768, 24768, 24768, 24768, 24768,
            32704, 32704, 0, 0, 0, 0, 1024, 1024, 1024, 16256, 16256, 1024,
            1024, 1024, 0, 0, 0, 0, 0, 0, 0, 0, 256, 384, 128, 0, 0, 0, 0,
            3072, 3072, 3072, 3072, 3072, 3072, 3072, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 384, 384, 1024, 1536, 1792, 1920, 32704, 32736, 32704, 1920,
            1792, 1536, 1024, 0, 0, 0, 0, 32512, 65408, 32896, 32896, 32896,
            65408, 32512, 0, 0, 0, 0, 0, 0, 0, 0, 65408, 65408, 32768, 0, 0, 0,
            0, 24704, 61568, 39040, 35968, 34432, 33664, 16768, 0, 0, 0, 25344,
            65408, 40064, 34944, 34944, 34944, 49536, 16640, 0, 1024, 1024,
            65408, 65408, 33792, 50176, 25600, 13312, 7168, 3072, 0, 0, 0, 0,
            3840, 40832, 36992, 36992, 36992, 61824, 61824, 0, 0, 0, 0, 3840,
            40832, 36992, 36992, 53376, 32640, 16128, 0, 0, 0, 49152, 57344,
            45056, 38912, 35840, 34304, 33664, 33152, 0, 0, 0, 30464, 65408,
            34944, 34944, 34944, 34944, 65408, 30464, 0, 0, 0, 0, 32256, 65280,
            34176, 33920, 33920, 64640, 30720, 8192, 12288, 14336, 15360,
            15872, 16128, 15872, 15360, 14336, 12288, 8192, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 32, 28032, 28032, 28032, 28032, 28032, 28032, 28032,
            28032, 28032, 28032, 28032, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32,
            15392, 32352, 59328, 50048, 49920, 49920, 49920, 49920, 59136,
            32256, 15360, 0, 0, 0, 0, 16256, 32640, 51200, 34816, 51200, 32640,
            16256, 0, 0, 0, 0, 30464, 65408, 51584, 34944, 34944, 65408, 65408,
            0, 0, 0, 0, 25344, 58240, 32896, 32896, 32896, 65408, 32512, 0, 0,
            0, 0, 15872, 32512, 49536, 32896, 32896, 65408, 65408, 0, 0, 0, 0,
            32896, 34944, 34944, 34944, 34944, 65408, 65408, 0, 0, 0, 0, 32768,
            34816, 34816, 34816, 34816, 65408, 65408, 0, 0, 0, 0, 26368, 59264,
            33920, 32896, 32896, 65408, 32512, 0, 0, 0, 0, 65408, 65408, 2048,
            2048, 2048, 65408, 65408, 0, 0, 0, 0, 0, 0, 0, 32896, 65408, 65408,
            32896, 0, 0, 0, 0, 32768, 65280, 65408, 32896, 128, 896, 768, 0, 0,
            0, 32896, 49536, 25344, 13824, 7168, 2048, 65408, 65408, 0, 0, 0,
            0, 128, 128, 128, 128, 128, 65408, 65408, 65408, 65408, 24576,
            12288, 6144, 3072, 6144, 12288, 24576, 65408, 65408, 0, 65408,
            65408, 768, 1536, 3072, 6144, 12288, 24576, 65408, 65408, 0, 0, 0,
            0, 32512, 65408, 32896, 32896, 32896, 65408, 32512, 0, 0, 0, 0,
            28672, 63488, 34816, 34816, 34816, 65408, 65408, 0, 0, 128, 384,
            32640, 32512, 33664, 33408, 32896, 65408, 32512, 0, 0, 0, 384,
            29568, 65024, 35840, 34816, 34816, 65408, 65408, 0, 0, 0, 0, 18176,
            53120, 34944, 34944, 34944, 63872, 28928, 0, 0, 0, 32768, 32768,
            32768, 65408, 65408, 32768, 32768, 32768, 0, 0, 0, 65280, 65408,
            128, 128, 128, 128, 65408, 65280, 0, 0, 64512, 65024, 768, 384,
            128, 384, 768, 65024, 64512, 65024, 65408, 384, 1792, 3584, 6144,
            3584, 1792, 384, 65408, 65024, 0, 0, 49536, 58240, 13824, 7168,
            2048, 7168, 13824, 58240, 49536, 0, 49152, 57344, 12288, 6144,
            3968, 3968, 6144, 12288, 57344, 49152, 0, 0, 0, 49280, 57472,
            45184, 39040, 35968, 34432, 33664, 33152, 0, 0, 0, 0, 0, 65504,
            32704, 16256, 7936, 3584, 1024, 1024, 3072, 7168, 15360, 32704,
            65472, 32704, 15360, 7168, 3072, 1024, 0, 0, 0, 0, 0, 1024, 3584,
            7936, 16256, 32704, 65504, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 3968, 8064, 5248, 5248, 5248, 6016, 768, 0, 0, 0, 0, 3840,
            8064, 4224, 4224, 4224, 65408, 65408, 0, 0, 0, 0, 2304, 6528, 4224,
            4224, 4224, 8064, 3840, 0, 0, 0, 0, 65408, 65408, 4224, 4224, 4224,
            8064, 3840, 0, 0, 0, 0, 3328, 7552, 5248, 5248, 5248, 8064, 3840,
            0, 0, 0, 0, 0, 16384, 49152, 34816, 34816, 65408, 32640, 0, 0, 0,
            0, 3968, 8128, 4320, 4256, 4256, 8096, 3872, 0, 0, 0, 0, 1920,
            3968, 2048, 2048, 2048, 65408, 65408, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            24448, 24448, 0, 0, 0, 0, 0, 24512, 24544, 32, 224, 192, 0, 0, 0,
            0, 0, 4224, 6528, 3328, 1536, 512, 65408, 65408, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 65408, 65408, 0, 3968, 8064, 4096, 4096, 3968, 3968, 4096,
            4096, 8064, 3968, 0, 0, 0, 0, 3968, 8064, 4096, 4096, 4096, 3968,
            8064, 0, 0, 0, 0, 3840, 8064, 4224, 4224, 4224, 8064, 3840, 0, 0,
            0, 0, 3840, 8064, 4224, 4224, 4224, 8160, 4064, 0, 0, 0, 0, 4064,
            8160, 4224, 4224, 4224, 8064, 3840, 0, 0, 0, 0, 2048, 6144, 4096,
            4096, 4096, 8064, 3968, 0, 0, 0, 0, 768, 6016, 5248, 5248, 5248,
            7552, 2304, 0, 0, 0, 0, 0, 4096, 4096, 32640, 32640, 4096, 4096, 0,
            0, 0, 7936, 8064, 128, 128, 128, 128, 8064, 7936, 0, 0, 7168, 7680,
            768, 384, 128, 384, 768, 7680, 7168, 7680, 8064, 384, 1792, 3584,
            6144, 3584, 1792, 384, 8064, 7680, 0, 0, 0, 0, 4224, 6528, 3840,
            1536, 3840, 6528, 4224, 0, 0, 0, 0, 8128, 8160, 160, 160, 160,
            8096, 7936, 0, 0, 0, 0, 4224, 6272, 7296, 5760, 4992, 4480, 4224,
            0, 0, 0, 896, 1920, 3584, 6656, 23040, 52736, 34688, 896, 0, 0, 0,
            896, 1920, 36352, 55808, 23040, 3584, 1920, 896, 0, 0, 0, 896,
            18304, 52736, 39424, 55808, 19968, 1920, 896, 0, 0, 0, 33664,
            51072, 19968, 39424, 55808, 19968, 1920, 896, 0, 0, 0, 896, 51072,
            52736, 6656, 55808, 52736, 1920, 896, 0, 0, 0, 896, 18304, 60928,
            47616, 64000, 19968, 1920, 896, 16512, 18560, 18560, 18560, 32640,
            32640, 51200, 34816, 51200, 32640, 16256, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 32, 0, 0, 0, 0, 4224, 5248, 5248, 21632, 54400, 40832, 8064,
            0, 0, 0, 0, 4224, 5248, 38016, 54400, 21632, 8064, 8064, 0, 0, 0,
            0, 4224, 21632, 54400, 38016, 54400, 24448, 8064, 0, 0, 0, 0, 4224,
            54400, 54400, 5248, 54400, 57216, 8064, 0, 0, 0, 0, 0, 4224, 4224,
            24448, 57216, 36992, 4224, 0, 0, 0, 0, 0, 4224, 36992, 57216,
            24448, 4224, 4224, 0, 0, 0, 0, 0, 20608, 53376, 40832, 57216,
            20608, 4224, 0, 0, 0, 0, 0, 53376, 53376, 8064, 57216, 53376, 4224,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 8064, 40832, 49408,
            16896, 33792, 51200, 24448, 8064, 0, 0, 0, 3840, 8064, 4224, 4224,
            20608, 53376, 40832, 3840, 0, 0, 0, 3840, 8064, 36992, 53376,
            20608, 4224, 8064, 3840, 0, 0, 0, 3840, 24448, 53376, 36992, 53376,
            20608, 8064, 3840, 0, 0, 0, 3840, 40832, 53376, 20608, 36992,
            53376, 24448, 3840, 0, 0, 0, 3840, 57216, 53376, 4224, 53376,
            53376, 8064, 3840, 0, 16384, 28416, 16256, 6272, 7296, 5760, 4992,
            8064, 4032, 64, 0, 16384, 28416, 16256, 6272, 7296, 5760, 4992,
            8064, 4032, 64, 0, 0, 0, 7936, 8064, 128, 16512, 49280, 32896,
            8064, 7936, 0, 0, 0, 7936, 8064, 32896, 49280, 16512, 128, 8064,
            7936, 0, 0, 0, 7936, 24448, 49280, 32896, 49280, 16512, 8064, 7936,
            0, 0, 0, 7936, 57216, 49280, 128, 49280, 49280, 8064, 7936, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0,
            0, 25344, 30464, 40064, 34944, 34944, 32768, 65408, 32640, 0, 0, 0,
            0, 3968, 8064, 5248, 21632, 54400, 38784, 768, 0, 0, 0, 0, 3968,
            40832, 54400, 21632, 5248, 6016, 768, 0, 0, 0, 0, 3968, 24448,
            54400, 38016, 54400, 22400, 768, 0, 0, 0, 0, 36736, 57216, 21632,
            38016, 54400, 22400, 768, 0, 0, 0, 0, 3968, 57216, 54400, 5248,
            54400, 55168, 768, 0, 0, 0, 0, 20352, 65408, 46208, 62592, 21632,
            6016, 768, 3328, 7552, 5248, 5248, 5248, 3840, 8064, 5248, 5248,
            6016, 768, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 3328,
            7552, 5248, 21632, 54400, 40832, 3840, 0, 0, 0, 0, 3328, 7552,
            38016, 54400, 21632, 8064, 3840, 0, 0, 0, 0, 3328, 23936, 54400,
            38016, 54400, 24448, 3840, 0, 0, 0, 0, 3328, 56704, 54400, 5248,
            54400, 57216, 3840, 0, 0, 0, 0, 0, 0, 0, 24448, 57216, 32768, 0, 0,
            0, 0, 0, 0, 0, 32768, 57216, 24448, 0, 0, 0, 0, 0, 0, 0, 16384,
            49152, 40832, 57216, 16384, 0, 0, 0, 0, 0, 0, 49152, 49152, 8064,
            57216, 49152, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0,
            36736, 57216, 20480, 36864, 53248, 20352, 8064, 0, 0, 0, 3840,
            8064, 4224, 4224, 20608, 53376, 40832, 3840, 0, 0, 0, 3840, 8064,
            36992, 53376, 20608, 4224, 8064, 3840, 0, 0, 0, 3840, 8064, 20608,
            53376, 36992, 53376, 24448, 3840, 0, 0, 0, 3840, 40832, 53376,
            20608, 36992, 53376, 24448, 3840, 0, 0, 0, 3840, 8064, 53376,
            53376, 4224, 53376, 57216, 3840, 0, 16384, 28416, 16256, 6272,
            7296, 5760, 4992, 8064, 4032, 64, 0, 16384, 28416, 16256, 6272,
            7296, 5760, 4992, 8064, 4032, 64, 0, 0, 0, 7936, 8064, 128, 16512,
            49280, 32896, 8064, 7936, 0, 0, 0, 7936, 8064, 32896, 49280, 16512,
            128, 8064, 7936, 0, 0, 0, 7936, 8064, 16512, 49280, 32896, 49280,
            24448, 7936, 0, 0, 0, 7936, 8064, 49280, 49280, 128, 49280, 57216,
            7936, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 32, 0, 0, 0, 25344, 30464, 40064, 34944, 34944, 32768, 65408,
            32640, 0 };

    // widths

    static char[] boldFontWidths = { 3, 10, 11, 11, 11, 8, 10, 2, 6, 6, 10, 8,
            3, 7, 2, 11, 7, 3, 7, 8, 10, 7, 7, 8, 8, 7, 11, 1, 1, 1, 11, 1, 11,
            7, 7, 7, 7, 7, 7, 7, 7, 4, 7, 8, 7, 11, 10, 7, 7, 9, 8, 7, 8, 8, 9,
            11, 9, 10, 8, 6, 11, 6, 0, 0, 0, 7, 7, 7, 7, 7, 6, 7, 7, 2, 6, 7,
            2, 10, 7, 7, 7, 7, 7, 7, 6, 8, 9, 11, 7, 7, 7, 8, 8, 8, 8, 8, 8,
            11, 1, 7, 7, 7, 7, 6, 6, 6, 6, 1, 8, 8, 8, 8, 8, 8, 10, 10, 8, 8,
            8, 8, 1, 1, 8, 7, 7, 7, 7, 7, 7, 11, 1, 7, 7, 7, 7, 4, 5, 6, 6, 1,
            7, 8, 8, 8, 8, 8, 10, 10, 8, 8, 8, 8, 1, 1, 8, 0 };

}