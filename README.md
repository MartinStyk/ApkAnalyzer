# ApkAnalyzer
Java app / library used to obtain detailed informations about Andoid APK files.

## How to use it
#### Prepare for first use
ApkAnalyzer uses Apktool for decompilation of Apk. You need to add Apktool to your maven repository.<br/>
1. Download apktool_2.0.0rc4 from https://bitbucket.org/iBotPeaches/apktool/downloads<br/>
2. Run following maven command : mvn install:install-file -Dfile=<path-to-apktool_2.0.0rc4-file> -DgroupId=ApkTool -DartifactId=ApkTool -Dversion=2.0.0.rc4 -Dpackaging=jar<br/>

#### Get Metadata 

Currently ApkAnalyzer can`t be used as a standalone app. However, you can modify main method or use it as a library to get data about your apk. 

Example of method that gets list of ApkData objects from every apk file found in directory APKS (i.e = APKS = "C:\\APKS")

```java
 public static void main(String[] args) throws Exception {

        FileFinder ff = new FileFinder(new File(APKS));
        List<ApkFile> apks = ff.getApkFilesInDirectories();

        List<ApkData> = ApkProcessor
                .ofFiles(apks)
                .processFiles();
}
  ```
  
Example of method that saves metadata about every apk file found in directory APKS (i.e = APKS = "C:\\APKS") in separate json file in METADATA_DIR directory

```java
 public static void main(String[] args) throws Exception {

        FileFinder ff = new FileFinder(new File(APKS));
        List<ApkFile> apks = ff.getApkFilesInDirectories();

        List<ApkData> = ApkProcessor
                .ofFiles(apks)
                .processFiles(new File(METADATA_DIR));
}
  ```
  
### Example of output *.json
  
  ```json
  {
  "fileName": "com.facebook.katana-42.0.0.27.114-APK4Fun.com.apk",
  "sourceOfFile": "test - works)",
  "fileSize": 35488821,
  "dexSize": 510148,
  "arscSize": 8129808,
  "androidManifest": {
    "packageName": "com.facebook.katana",
    "numberOfActivities": 257,
    "numberOfServices": 84,
    "numberOfContentProviders": 25,
    "numberOfBroadcastReceivers": 60,
    "usesPermissions": [
      "android.permission.ACCESS_COARSE_LOCATION",
      "android.permission.WAKE_LOCK",
      "android.permission.VIBRATE",
      "android.permission.READ_CONTACTS",
      "android.permission.WRITE_CONTACTS",
      "android.permission.GET_ACCOUNTS",
      "android.permission.MANAGE_ACCOUNTS",
      ...
    ],
    "usesLibrary": [
      "com.google.android.maps",
      "com.amazon.device.messaging"
    ],
    "usesFeature": [
      "android.hardware.camera",
      "android.hardware.telephony",
      "android.hardware.microphone",
      "android.hardware.location",
      "android.hardware.location.network",
      "android.hardware.location.gps"
    ]
  },
  "certificateDatas": [
    {
      "fileName": "CERT.RSA",
      "signAlgorithm": "MD5withRSA",
      "signAlgorithmOID": "1.2.840.113549.1.1.4",
      "startDate": "Aug 31, 2009 11:52:16 PM",
      "endDate": "Sep 25, 2050 11:52:16 PM",
      "certBase64Md5": "bc45583156a00f55537903de8e84e9d2",
      "certMd5": "3fad024f2dcbe3ee693c96f350f8e376",
      "version": 1,
      "issuerName": "CN=Facebook Corporation,OU=Facebook,O=Facebook Mobile,L=Palo Alto,ST=CA,C=US"
    }
  ],
  "resourceData": {
    "locale": [
      "af",
      "am",
      "ar",
      "bg",
      "bn",
      "bn-rBD",
      "ca",
      "cs",
      "da",
      "de",
      "el",
      "en-rAU",
      "en-rGB",
      "en-rIN",
      "es",
      ...
    ],
    "numberOfStringResource": 7866,
    "pngDrawables": 3470,
    "jpgDrawables": 4,
    "gifDrawables": 1,
    "xmlDrawables": 1528,
    "differentDrawables": 4935,
    "ldpiDrawables": 1,
    "mdpiDrawables": 62,
    "hdpiDrawables": 3309,
    "xhdpiDrawables": 46,
    "xxhdpiDrawables": 0,
    "xxxhdpiDrawables": 0,
    "unspecifiedDpiDrawables": 1585,
    "rawResources": 85
  },
  "fileDigest": [
    "S6vxCIQ2bS3ze7pSOF+6eozEldc=",
    "u6PXfLUM/wS8OHGm4JKie+yzwNk=",
    "JZz9ovk+VP9FMdxx4ye8CsRBy/8=",
    "XStCfZ5vtOP9TPfrrRKwo6bQOGs=",
    "qm12ZRIghea52HzmPvd3cBPgDzA=",
    "GtgtOKw7JxZNKbtM+a7a/hzZSXs=",
    "vwW5VlhUgPaMM5jip8cIwzH8erQ=",
    "X72U90yuwqrbgd1ROBPM9MUL8Ak=",
    "BgqL2Is8reLgMdnpNEjsj4MBBBE=",
    "gKG/XMO17Y4hHDIEZmahLn0oAW4=",
    ....
  ]
}
  ```
