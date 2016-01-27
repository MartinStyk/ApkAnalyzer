package sk.styk.martin.bakalarka.analyze.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.utils.files.ApkFile;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;

/**
 * Created by Martin Styk on 30.12.2015.
 */
public class ApkProcessingTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ApkProcessingTask.class);
    private ApkFile apk;
    private File outputDirectory;

    public ApkProcessingTask(ApkFile apk, File outputDirectory) {
        if (apk == null) {
            throw new IllegalArgumentException("apk file is null");
        }
        if (outputDirectory == null) {
            throw new IllegalArgumentException("output directory is null");
        }
        this.apk = apk;
        this.outputDirectory = outputDirectory;

    }


    public void run() {
        ApkData data = processFile(apk);
        JsonUtils.toJson(data, outputDirectory);
    }

    private ApkData processFile(ApkFile apk) {
        logger.info(apk.getMarker() + "Started processing of file " + apk.getName());

        ApkData data = new ApkData();

        // 1. get data from unziped directory

        FileInfoProcessor
                .getInstance(data, apk)
                .processFileInfo();

        CertificateProcessor
                .getInstance(data, apk)
                .processCertificates();

        HashProcessor
                .getInstance(data, apk)
                .getHashes();

        // 2. get data from decompile directory

        AndroidManifestProcessor
                .getInstance(data, apk)
                .processAndroidManifest();

        // 3. uses data from decompile and unzip directory
        ResourceProcessor
                .getInstance(data, apk)
                .processResources();


        apk.cleanApkWorkingDirectory();

        logger.info(apk.getMarker() + "Finished processing of file " + apk.getName());

        return data;
    }
}
