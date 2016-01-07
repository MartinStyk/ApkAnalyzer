package sk.styk.martin.bakalarka;

    import sk.styk.martin.bakalarka.analyze.processors.ApkProcessor;
import sk.styk.martin.bakalarka.compare.processors.ApkBatchCompare;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;

import java.io.File;
import java.util.Arrays;
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

        //analyze();
        compareTwo();
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

}

