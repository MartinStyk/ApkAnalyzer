package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.stats.ApkProcessor;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.files.FileFinder;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    private static String APK_TEST = "D:\\Projects\\ApkToolTest";
    private static String APK_TORRENT = "D:\\APK\\APK_torrent";
    private static String APK_PLAY = "D:\\APK\\APK_playdrone";
    private static String METADATA_DIR = "D:\\APK\\metadata";

    public static void main(String[] args) throws Exception {

        FileFinder ff = new FileFinder(new File(APK_TEST));
        List<File> apks = ff.getApkFilesInDirectories();

        ApkProcessor processor = ApkProcessor.ofFiles(apks);
        processor.processFiles(new File(METADATA_DIR));

        List<ApkData> stats = processor.processFiles();
//
//        PrintWriter writer = new PrintWriter("statistics.txt", "UTF-8");
//
//        for (ApkData s : stats) {
//            System.out.println( s.getFileName() + s.getCertificateDatas().size() + s.getCertificateDatas());
//            writer.println(s);
//        }
//        writer.close();
    }
}

