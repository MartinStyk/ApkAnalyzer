package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.files.ApkFile;

import java.io.File;


/**
 * Created by Martin Styk on 27.11.2015.
 */
public class FileInfoProcessor {

    private static final Logger logger = LoggerFactory.getLogger(FileInfoProcessor.class);
    private Marker apkNameMarker;

    private ApkData data;
    private ApkFile apkFile;

    public FileInfoProcessor(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = data;
        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public FileInfoProcessor(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = new ApkData();
        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public static FileInfoProcessor getInstance(ApkData data, ApkFile apkFile) {
        return new FileInfoProcessor(data, apkFile);
    }

    public static FileInfoProcessor getInstance(ApkFile apkFile) {
        return new FileInfoProcessor(apkFile);
    }

    public ApkData processFileInfo() {

        logger.trace(apkNameMarker + "Started processing of file info");

        getFileName();
        getSourceOfFile();
        getFileSize();
        getDexSize();
        getArscSize();

        logger.trace(apkNameMarker + "Finished processing of file info");

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

