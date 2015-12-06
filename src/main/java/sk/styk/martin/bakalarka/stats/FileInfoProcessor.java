package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.files.ApkFile;

import java.io.File;


/**
 * Created by Martin Styk on 27.11.2015.
 */
public class FileInfoProcessor {

    private static final Logger logger = LoggerFactory.getLogger(FileInfoProcessor.class);
    private static FileInfoProcessor instance = null;
    private ApkData data;
    private ApkFile apkFile;

    private FileInfoProcessor() {
        // Exists only to defeat instantiation.
    }

    public static FileInfoProcessor getInstance(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new FileInfoProcessor();
        }
        instance.data = data;
        instance.apkFile = apkFile;
        return instance;
    }

    public static FileInfoProcessor getInstance(ApkFile apkFile) {
        if (instance == null) {
            instance = new FileInfoProcessor();
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }
        instance.data = new ApkData();
        instance.apkFile = apkFile;
        return instance;
    }

    public ApkData processFileInfo() {

        logger.trace("Started processing of file info");

        getFileName();
        getSourceOfFile();
        getFileSize();
        getDexSize();
        getArscSize();

        logger.trace("Finished processing of file info");

        return data;
    }

    private void getFileName() {
        data.setFileName(apkFile.getName());
    }

    private void getSourceOfFile() {

        String parentFolderName;

        try {
            parentFolderName = apkFile.getParentFile().getName();
        } catch (Exception e) {
            //ok nevermind
            return;
        }

        if (parentFolderName.contains("playdrone")) {
            data.setSourceOfFile("Playdrone(originally from Google PlayStore)");
            return;
        }
        if (parentFolderName.contains("androidApksFree")) {
            data.setSourceOfFile("www.androidapksfree.com");
            return;
        }
        if (parentFolderName.contains("ApkMania")) {
            data.setSourceOfFile("www.androidapkmaniafull.com");
            return;
        }
        if (parentFolderName.contains("torrent")) {
            data.setSourceOfFile("torrent");
            return;
        }
        if (parentFolderName.contains("ulozto")) {
            data.setSourceOfFile("www.uloz.to");
            return;
        }
        if (parentFolderName.contains("zippy")) {
            data.setSourceOfFile("www.zippyshare.com");
            return;
        }
        if (parentFolderName.contains("Test") || parentFolderName.contains("test")) {
            data.setSourceOfFile("test - works)");
            return;
        }


    }

    private void getFileSize() {
        data.setFileSize(apkFile.length());
    }

    private void getDexSize() {
        File dexFile = new File(apkFile.getUnzipDirectoryWithUnzipedData(), "classes.dex");
        data.setDexSize(dexFile.length());
    }

    private void getArscSize() {
        File file = new File(apkFile.getUnzipDirectoryWithUnzipedData(), "resources.arsc");
        data.setArscSize(file.length());
    }

}

