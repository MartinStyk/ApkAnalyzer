package sk.styk.martin.bakalarka.stats;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ApkProcessor.class);

    private List<File> apks;
    private List<ApkStatistics> statistics = new ArrayList<ApkStatistics>();

    public static ApkProcessor ofFiles(List<File> apks) {
        return new ApkProcessor(apks);
    }

    public ApkProcessor(List<File> apks) {
        if (apks == null || apks.isEmpty()) {
            throw new IllegalArgumentException("apks not valid");
        }
        this.apks = apks;
    }

    public List<ApkStatistics> processFiles() {
        for (File f : apks) {
            processFile(f);
        }
        return statistics;
    }

    public void processFile(File apk) {
        logger.info("Started processing of file " + apk.getName());

        ApkStatistics data = new ApkStatistics();
        getFileName(apk, data);
        getFileSize(apk, data);

        ApkUnziper
                .getInstance(apk)
                .unzip();

        getDexSize(data);
        getArscSize(data);

        ApkDecompiler
                .getInstance(apk)
                .decompile();

        AndroidManifestProcessor
                .getInstance(data)
                .processAndroidManifest();


        statistics.add(data);

        logger.info("Finished processing of file " + apk.getName() + " with result " + data);
    }

    private void getFileName(File apk, ApkStatistics data) {
        data.setFileName(apk.getName());
    }

    private void getFileSize(File apk, ApkStatistics data) {
        data.setFileSize(apk.length());
    }

    private void getDexSize(ApkStatistics data) {
        File dexFile = new File(ApkUnziper.TEMP_FOLDER_UNZIP + File.separator + "classes.dex");
        data.setDexSize(dexFile.length());
    }

    private void getArscSize(ApkStatistics data) {
        File file = new File(ApkUnziper.TEMP_FOLDER_UNZIP + File.separator + "resources.arsc");
        data.setArscSize(file.length());
    }


}


