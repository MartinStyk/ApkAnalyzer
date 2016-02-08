package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.analyze.processors.ApkProcessor;
import sk.styk.martin.bakalarka.compare.data.ComparisonResult;
import sk.styk.martin.bakalarka.compare.processors.ApkBatchCompare;
import sk.styk.martin.bakalarka.statistics.data.OverallStatistics;
import sk.styk.martin.bakalarka.statistics.processors.StatisticsProcessor;
import sk.styk.martin.bakalarka.utils.files.ApkFile;
import sk.styk.martin.bakalarka.utils.files.FileFinder;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    private static String APK_TEST = "D:\\Projects\\ApkToolTest";
    private static String APK_APPSAPK = "D:\\APK\\APK_appsApk";
    private static String APK_ANDROIDAPKSFREE = "D:\\APK\\APK_androidApksFree";
    private static String APK_TORRENT = "D:\\APK\\APK_torrent";
    private static String APK_ULOZTO = "D:\\APK\\APK_ulozto";
    private static String APK_PLAY = "D:\\APK\\APK_playdrone";
    private static String APK_ZIPPY = "D:\\APK\\APK_zippyshare";
    private static String APK_ZIPPY2 = "D:\\APK\\APK_zippyshare2";

    public static void main(String[] args) throws Exception {

        final long startTime = System.currentTimeMillis();

        //analyze();
        //compareTwo();
        //compareAll();
        //computeStats();
        //collectData();
        organizeToFolders();
        final long endTime = System.currentTimeMillis();

        Date date = new Date(endTime - startTime);
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
        String dateFormatted = formatter.format(date);

        System.out.print("RUN TIME : " + dateFormatted);

    }

    public static void analyze() {

        //possible input from user
        final String ANALYZED_APK = APK_TEST;
        final String OUTPUT_DIR = "D:\\APK\\metadata";

        //code that handle 'analyze use case'
        final File analyzedFile = new File(ANALYZED_APK);
        List<ApkFile> apks;
        ApkProcessor analyzer;

        if (analyzedFile.isDirectory()) {
            FileFinder ff = new FileFinder(new File(ANALYZED_APK));
            apks = ff.getApkFilesInDirectories();
            analyzer = new ApkProcessor(apks);
        } else {
            ApkFile apk = new ApkFile(analyzedFile);
            analyzer = new ApkProcessor(apk);
        }

        File outputDirectory = new File(OUTPUT_DIR);
        analyzer.processFiles(outputDirectory);
    }

    public static void compareTwo() {

        //possible input from user
        final String ANALYZED_APK_1 = "D:\\TEST\\1.json";
        final String ANALYZED_APK_2 = "D:\\TEST\\2.json";
        final String OUTPUT_DIR = "D:\\output";

        //code that handle 'compare two use case'
        List<File> jsons = Arrays.asList(new File(ANALYZED_APK_1), new File(ANALYZED_APK_2));
        ApkBatchCompare apkBatchCompare = new ApkBatchCompare(jsons);
        apkBatchCompare.processFiles(new File(OUTPUT_DIR));

    }

    public static void compareAll() {

        //possible input from user
        final String INPUT_DIR = "D:\\TEST";
        final String OUTPUT_DIR = "D:\\output";

        //code that handle 'compare two use case'

        FileFinder ff = new FileFinder(new File(INPUT_DIR));
        List<File> jsons = ff.getJsonFilesInDirectories();

        ApkBatchCompare apkBatchCompare = new ApkBatchCompare(jsons);
        apkBatchCompare.processFiles(new File(OUTPUT_DIR));

    }

    public static void computeStats() {
        //possible input from user
        final String INPUT_DIR = "D:\\APK\\metadata";
        final String OUTPUT_FILE = "D:\\output\\stats.json";

        //code that handle 'computeStats use case'

        FileFinder ff = new FileFinder(new File(INPUT_DIR));
        List<File> jsons = ff.getJsonFilesInDirectories();

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(jsons);
        statisticsProcessor.setOutputFile(new File(OUTPUT_FILE));
        OverallStatistics overallStatistics = statisticsProcessor.processFiles();
    }

//    public static void a() throws IOException {
//        final String INPUT_DIR = "D:\\APK\\metadata";
//        final String OUTPUT_FILE = "D:\\output\\stats.txt";
//        String everything =null;
//        //code that handle 'computeStats use case'
//
//        FileFinder ff = new FileFinder(new File(INPUT_DIR));
//        List<File> jsons = ff.getJsonFilesInDirectories();
//
//        for(File f : jsons){
//            boolean replace = false;
//            BufferedReader br = null;
//            try {
//                br = new BufferedReader(new FileReader(f));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            try {
//                StringBuilder sb = new StringBuilder();
//                String line = br.readLine();
//
//                while (line != null) {
//                    if(line.contains("\"androidManifest\": {},")){
//                        System.out.print("REPLACE FOUND +" + f.getName());
//                        replace=true;
//                    }else {
//                        sb.append(line);
//                        sb.append(System.lineSeparator());
//                    }
//                    line = br.readLine();
//                }
//                everything = sb.toString();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                br.close();
//            }
//
//            if(replace){
//                PrintWriter writer = new PrintWriter(f.getAbsoluteFile(), "UTF-8");
//                writer.print(everything);
//                writer.close();
//
//                ApkData data = JsonUtils.fromJson(f);
//                if(data==null){
//                    throw new RuntimeException("bad conversion");
//                }
//            }
//
//
//        }
//    }
//
//    public static void collectData() {
//        //possible input from user
////        final String ANALYZED_APK = "D:\\APK\\";
////        final String OUTPUT_DIR = "D:\\APK\\metadata";
//
//        final String ANALYZED_APK = "D:\\APK\\";
//        final String OUTPUT_DIR = "D:\\APK\\metadata\\";
//
//
//        FileFinder ff = new FileFinder(new File(ANALYZED_APK));
//        List<ApkFile> apks = ff.getApkFilesInDirectories();
//
//        FileFinder ffjson = new FileFinder(new File(OUTPUT_DIR));
//        List<File> jsons = ffjson.getJsonFilesInDirectories();
//
//        for (ApkFile apk : apks) {
//            File correctJson = loadFromJson(apk, jsons);
//            ApkData apkData = JsonUtils.fromJson(correctJson);
//            boolean change = false;
//            if (apkData != null) {
//                if (apkData.getResourceData() != null && apkData.getResourceData().getTvdpiDrawables() != null) {
//                    ResourceProcessor.getInstance(apkData, apk).processResources();
//                    change = true;
//                }
//                if (apkData.getAndroidManifest() != null && apkData.getAndroidManifest().getPermissionsProtectionLevel() != null) {
//                    AndroidManifestProcessor.getInstance(apkData, apk).processAndroidManifest();
//                    change = true;
//                }
//                if (change) {
//                    JsonUtils.toJsonFile(apkData, correctJson);
//
//                    try {
//                        apk.getApkWorkingDirectoryManager().deleteApkWorkingDirectory();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
//
//    public static File loadFromJson(ApkFile apk, List<File> jsons) {
//        String apkName = apk.getName();
//        String jsonName = apkName.substring(0, apkName.length() - 3) + "json";
//
//        File correctJson = null;
//        for (File j : jsons) {
//            if (j.getName().equals(jsonName)) {
//                correctJson = j;
//                break;
//            }
//        }
//        return correctJson;
//    }

    private static void organizeToFolders() {
        final String ORIGIN_DIR = "home/mstyk/bakalarka/compareOutput";
        final String NEW_DIR = "home/mstyk/bakalarka/compareOutput1";

//        final String ORIGIN_DIR = "D:\\output\\test";
//        final String NEW_DIR = "D:\\output\\test1";

        FileFinder ff = new FileFinder(new File(ORIGIN_DIR));
        List<File> jsons = ff.getJsonFilesInDirectories();

        for (File current : jsons) {
            ComparisonResult r = JsonUtils.fromJson(current, ComparisonResult.class);
            SimilarityType basicEvaluateResult = null;
            if (r != null && r.getMetadataCompareResult() != null) {
                Boolean certificateEvaluate = r.getMetadataCompareResult().getCertificateSame();
                Boolean versionEvaluate = r.getMetadataCompareResult().getVersionCode() == null ? null : r.getMetadataCompareResult().getVersionCode().getSame();

                if (certificateEvaluate == null && versionEvaluate == null) {
                    basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_UNDETERMINED_VERSION;
                } else if (certificateEvaluate == null && Boolean.TRUE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_SAME_VERSION;
                } else if (certificateEvaluate == null && Boolean.FALSE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_DIFFERENT_VERSION;
                } else if (Boolean.TRUE.equals(certificateEvaluate) && versionEvaluate == null) {
                    basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_UNDETERMINED_VERSION;
                } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_SAME_VERSION;
                } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_DIFFERENT_VERSION;
                } else if (Boolean.FALSE.equals(certificateEvaluate) && versionEvaluate == null) {
                    basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_UNDETERMINED_VERSION;
                } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_SAME_VERSION;
                } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
                    basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_DIFFERENT_VERSION;
                }

                //move to folder
                current.renameTo(new File("/home/mstyk/bakalarka/compareOutput1/" + basicEvaluateResult.toString() + "/" + current.getName()));
//                current.renameTo(new File( NEW_DIR + "\\" + basicEvaluateResult.toString() + "\\" + current.getName()));
            }
        }

    }

    private enum SimilarityType {
        NOT_SIMILAR,
        SIMILAR_SAME_CERTIFICATE_SAME_VERSION,
        SIMILAR_SAME_CERTIFICATE_DIFFERENT_VERSION,
        SIMILAR_SAME_CERTIFICATE_UNDETERMINED_VERSION,
        SIMILAR_DIFFERENT_CERTIFICATE_SAME_VERSION,
        SIMILAR_DIFFERENT_CERTIFICATE_DIFFERENT_VERSION,
        SIMILAR_DIFFERENT_CERTIFICATE_UNDETERMINED_VERSION,
        SIMILAR_UNDETERMINED_CERTIFICATE_SAME_VERSION,
        SIMILAR_UNDETERMINED_CERTIFICATE_DIFFERENT_VERSION,
        SIMILAR_UNDETERMINED_CERTIFICATE_UNDETERMINED_VERSION
    }
}

