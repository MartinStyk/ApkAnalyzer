# ApkAnalyzer
Java app / library used to obtain detailed informations about Andoid APK files.
* [How to use it](#How_to_use_it)
  * [Prepare for first use](#Prepare_for_first_use)
  * [Get Metadata](#Get_Metadata)
* [Collected data](#Collected_data)
  * [Attributes & description](#ad)
   * [Basic apk metadata](#basic)
   * [Android manifest metadata](#manifest)
   * [Certificate metadata](#certificate)
   * [Resources metadata](#resource)
   * [File hashes](#hash)
  * [Example of output *.json](#json)

<a name="How_to_use_it"/>
## How to use it
<a name="Prepare_for_first_use"/>
#### Prepare for first use
ApkAnalyzer uses Apktool for decompilation of Apk. You need to add Apktool to your maven repository.<br/>
1. Download apktool_2.0.0rc4 from https://bitbucket.org/iBotPeaches/apktool/downloads<br/>
2. Run following maven command : mvn install:install-file -Dfile=<path-to-apktool_2.0.0rc4-file> -DgroupId=ApkTool -DartifactId=ApkTool -Dversion=2.0.0.rc4 -Dpackaging=jar<br/>
3. 
<a name="Get_Metadata"/>
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
<a name="Collected_data"/>
##Collected data

<a name="ad"/>
###Attributes & description

<a name="basic"/>
####Basic apk metadata
Name          | Type     | Description
------------- | -------- | ------------------------------ 
fileName      | String   | Name of analyzed apk file  
sourceOfFile  | String   | Location from where the file was downloaded
fileSize      | Long     | Size of whole apk file (in bytes)
dexSize       | Long     | Size of compiled sources in classes.dex file (in bytes)
arscSize      | Long     | Size of compiled resources in classes.dex file (in bytes)

<a name="manifest"/>
####Android manifest metadata
Name          | Type     | Description
------------- | -------- | ------------------------------ 
packageName      | String   | [See Android documentation](http://developer.android.com/guide/topics/manifest/manifest-element.html#package)
versionCode  | String   | [See Android documentation](http://developer.android.com/guide/topics/manifest/manifest-element.html#vcode) 
installLocation      | String     | [See Android documentation](http://developer.android.com/guide/topics/manifest/manifest-element.html#install)
numberOfActivities       | Integer     | Total number of activities in application
numberOfServices      | Integer     | Total number of services in application
numberOfContentProviders      | Integer   | Total number of content providers in application  
numberOfBroadcastReceivers  | Integer   | Total number of broadcast receivers in application
usesPermissions      | List<String>     | List of permissions used by application [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-permission-element.html)
usesLibrary       | List<String>     | List of libraries used by application [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-library-element.html)
usesFeature      | List<String>     | List of features used by application [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-feature-element.html)
usesMinSdkVersion      | String   | Minimum Sdk version required by app List of features used by application [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html)
usesTargetSdkVersion  | String   | Target Sdk version required by app [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html)
usesMaxSdkVersion      | String     | Maximal Sdk version requered by app [See Android documentation](http://developer.android.com/guide/topics/manifest/uses-sdk-element.html)
supportsScreensResizeable       | Boolean     |  [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)
supportsScreensSmall      | Boolean     | [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)
supportsScreensNormal      | Boolean   | [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)
supportsScreensLarge  | Boolean   | [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)
supportsScreensXlarge      | Boolean     | [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)
supportsScreensAnyDensity       | Boolean     | [See Android documentation](http://developer.android.com/guide/topics/manifest/supports-screens-element.html)

<a name="certificate"/>
####Certificate metadata
Name          | Type     | Description
------------- | -------- | ------------------------------ 
fileName      | String   | Name of certificate file (i.e CERT.RSA in MEATA-INF directory)  
signAlgorithm  | String   | Signature algorithm name from the certificate
signAlgorithmOID      | String     | Signature algorithm OID string from the certificate
startDate       | Date     | notBefore date from the validity period of the certificate
endDate      | Date     | notAfter date from the validity period of the certificate
publicKeyMd5  | String   | MD5 hash of public key
certBase64Md5      | String | Base64 MD5 hash of certificate
certMd5       | String | MD5 hash of certificate
version      | Integer | Version value from the certificate
issuerName   | String | Representation of the X.500 distinguished name using the format defined in RFC 2253

<a name="resource"/>
####Resources metadata
Name          | Type     | Description
------------- | -------- | ------------------------------ 
locale      | List<String>   | Localizations of string.xml file
numberOfStringResource  | Integer   | Number of entries in default string.xml file
pngDrawables      | Integer     | Number of drawables in png format
jpgDrawables       | Integer     | Number of drawables in jpg/jpeg format
gifDrawables      | Integer     | Number of drawables in gif format
xmlDrawables  | Integer   | Number of drawables in xml format
ldpiDrawables      | Integer | Number of drawables located in ldpi folder
mdpiDrawables       | Integer | Number of drawables located in mdpi folder
hdpiDrawables      | Integer | Number of drawables located in hdpi folder
xhdpiDrawables   | Integer | Number of drawables located in xhdpi folder
xxhdpiDrawables      | Integer | Number of drawables located in xxhdpi folder
xxxhdpiDrawables       | Integer | Number of drawables located in xxxhdpi folder
unspecifiedDpiDrawables      | Integer | Number of drawables located in default drawable folder
rawResources   | Integer | Number of resources in raw/ folder

<a name="hash"/>
####File hashes
Name          | Type     | Description
------------- | -------- | ------------------------------ 
dexHash      | String | Hash of classes.dex from META-INF/MANIFEST.MF
arscHash      | String | Hash of resources.arsc from META-INF/MANIFEST.MF
hashesFromManifest      | List<String>  | Hashes of all files in apk from META-INF/MANIFEST.MF

<a name="json"/>
### Example of output *.json
  
  ```json
  {
  "fileName": "com.facebook.katana-42.0.0.27.114.apk",
  "sourceOfFile": "Playdrone",
  "fileSize": 35488821,
  "dexSize": 510148,
  "arscSize": 8129808,
  "androidManifest": {
    "packageName": "com.facebook.katana",
    "versionCode": "753ab4",
    "installLocation": "auto",
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
      "publicKeyMd5": "57e4647d1da90ef6eef980770673862c",
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
  "fileDigest": {
    "dexHash": "bMyeEVy9g8VYPd8S09xBeDu1ouE=",
    "arscHash": "br+poZYwb/JUSmFAKYhW0zd8QVc=",
    "hashesFromManifest": [
      "S6vxCIQ2bS3ze7pSOF+6eozEldc=",
      "uNOeQAFoOFkQbYgJfkJyePznmy0=",
      "KchKiLDAPwjG37nNRMBHyzobzY0=",
      "yraCp5c9QDTFzwKIX/8UCuTIeEo=",
      "727pL5pYYaMczcG0OKDMaYT1F9Q=",
      "AmdW7QPZdY4SfNJVK8NHoGZEepU=",
      "QTk8L3Uae9TSvjgCGVuOJHaecp0=",
      "jvPAktczgQwCWbOP7CRdMr1dmSY=",
      "u5TY6PQerEhaOucVzSCrKc5lor8=",
      "frIdJxKEIYvANiZ5gWrd7ijk1qM=",
      "MuSnK3Cf2lk/cT6NzwWZLRD1O58=",
      "3Qsa4NCFZyy9zsstBa88EvNlvSQ=",
      ...
    ]
  }
}
  ```
