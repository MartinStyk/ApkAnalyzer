package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;
import sk.styk.martin.bakalarka.analyze.processors.ApkProcessor;

import java.io.File;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    private static String APK_TEST = "D:\\Projects\\ApkToolTest";
    private static String APK_TORRENT = "D:\\APK\\APK_torrent";
    private static String APK_PLAY = "D:\\APK\\APK_playdrone";
    private static String APK_ZIPPY = "D:\\APK\\APK_zippyshare";
    private static String APK_ZIPPY2 = "D:\\APK\\APK_zippyshare2";

    public static void main(String[] args) throws Exception {

        analyze();

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


    // Not implemented yet
//    public static void compareTwo() {
//
//        //possible input from user
//        final String ANALYZED_APK_1;
//        final String ANALYZED_APK_2;
//        final String OUTPUT_DIR;
//
//        //code that handle 'compare two use case'
//        final ApkFile analyzedApk1 = new File(ANALYZED_APK_1);
//        final ApkFile analyzedApk2 = new File(ANALYZED_APK_2);
//        ApkProcessor analyzer = new ApkProcessor(analyzedApk1);
//        ApkData apk1Data = apk1Analyer.processFile(analyzedApk1);
//
//        ApkProcessor apk2Analyer = new ApkProcessor(analyzedApk2);
//        ApkData apk2Data = apk1Analyer.processFile(analyzedApk1);
//
//        ApkCompare comparator = new ApkCompare(apk1Data,apk2Data);
//        ComparisonResult result = comparator.compare();
//        if(result !=null){
//            JsonUtils.toJson(result,OUTPUT_DIR);
//        }
//
//    }

}

