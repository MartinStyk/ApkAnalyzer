package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.files.TempFileManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ApkProcessor.class);

    private List<ApkFile> apks;

    public ApkProcessor(List<ApkFile> apks) {
        if (apks == null || apks.isEmpty()) {
            throw new IllegalArgumentException("apks not valid");
        }
        this.apks = apks;
    }

    public static ApkProcessor ofFiles(List<ApkFile> apks) {
        return new ApkProcessor(apks);
    }

    public List<ApkData> processFiles() {
        List<ApkData> statistics = new ArrayList<ApkData>();
        for (ApkFile f : apks) {
            statistics.add(processFile(f));
        }
        return statistics;
    }

    public void processFiles(File outputDirectory) {
        for (ApkFile f : apks) {
            ApkData data = processFile(f);
            JsonUtils.toJson(data, outputDirectory);
        }
    }

    public ApkData processFile(ApkFile apk) {
        logger.info("Started processing of file " + apk.getName());

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
                .getInstance(data,apk)
                .processAndroidManifest();

        ResourceProcessor
                .getInstance(data,apk)
                .processResources();


        apk.cleanApkWorkingDirectory();

        logger.info("Finished processing of file " + apk.getName());

        return data;
    }

}


