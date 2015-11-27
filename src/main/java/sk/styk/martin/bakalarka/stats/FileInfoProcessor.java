package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;

import java.io.File;


/**
 * Created by Martin Styk on 27.11.2015.
 */
public class FileInfoProcessor {

    private static final Logger logger = LoggerFactory.getLogger(FileInfoProcessor.class);
    private static FileInfoProcessor instance = null;
    private ApkData data;
    private File apkFile;

    private FileInfoProcessor() {
        // Exists only to defeat instantiation.
    }

    public static FileInfoProcessor getInstance(ApkData data, File apkFile) {
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

    public static FileInfoProcessor getInstance(File apkFile) {
        if (instance == null) {
            instance = new FileInfoProcessor();
        }
        instance.data = new ApkData();
        instance.apkFile = apkFile;
        return instance;
    }

    public ApkData processFileInfo(){
        getFileName();
        getFileSize();
        getDexSize();
        getArscSize();

        return data;
    }

    private void getFileName() {
        data.setFileName(apkFile.getName());
    }

    private void getFileSize() {
        data.setFileSize(apkFile.length());
    }

    private void getDexSize() {
        File dexFile = new File(ApkUnziper.TEMP_FOLDER_UNZIP + File.separator + "classes.dex");
        data.setDexSize(dexFile.length());
    }

    private void getArscSize() {
        File file = new File(ApkUnziper.TEMP_FOLDER_UNZIP + File.separator + "resources.arsc");
        data.setArscSize(file.length());
    }

}

