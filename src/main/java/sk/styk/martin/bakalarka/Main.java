package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
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
    private static String METADATA_DIR = "D:\\APK\\metadata";

    private static String APK_DIR = "D:\\APK";

    public static void main(String[] args) throws Exception {

        FileFinder ff = new FileFinder(new File(APK_DIR));
        List<ApkFile> apks = ff.getApkFilesInDirectories();
        List<Exception> exceptions = new ArrayList<Exception>();

        for(ApkFile apk : apks){
            apk.decompile();
            Exception e = apk.getDecompilationException();
            if(e != null){
                exceptions.add(e);
            }
        }
        writeToFile(exceptions);

    }

    private static void writeToFile(List<Exception> exceptions) throws Exception{
        PrintWriter writer = new PrintWriter("decompilationErrors.txt", "UTF-8");

        for (Exception s : exceptions) {
            System.out.println("*["+s.getClass()+ "]*" + " -> " +s.getMessage() + "<-");
            writer.println(s);
        }
        writer.close();
    }
}

