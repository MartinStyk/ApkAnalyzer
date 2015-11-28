package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;
import sk.styk.martin.bakalarka.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ApkProcessor.class);

    private List<File> apks;

    public ApkProcessor(List<File> apks) {
        if (apks == null || apks.isEmpty()) {
            throw new IllegalArgumentException("apks not valid");
        }
        this.apks = apks;
    }

    public static ApkProcessor ofFiles(List<File> apks) {
        return new ApkProcessor(apks);
    }

    public List<ApkData> processFiles() {
        List<ApkData> statistics = new ArrayList<ApkData>();
        for (File f : apks) {
            statistics.add(processFile(f));
        }
        return statistics;
    }

    public void processFiles(File outputDirectory) {
        for (File f : apks) {
            ApkData data = processFile(f);
            JsonUtils.toJson(data, outputDirectory);
        }
    }

    public ApkData processFile(File apk) {
        logger.info("Started processing of file " + apk.getName());

        ApkData data = new ApkData();

        // 1. unzip and get data from unziped directory

        ApkUnziper
                .getInstance(apk)
                .unzip();

        FileInfoProcessor
                .getInstance(data, apk)
                .processFileInfo();

        CertificateProcessor
                .getInstance(data)
                .processCertificates();

        HashProcessor
                .getInstance(data)
                .getHashes();

        // 2. decompile and get data from decompile directory
        ApkDecompiler
                .getInstance(apk)
                .decompile();

        AndroidManifestProcessor
                .getInstance(data)
                .processAndroidManifest();

        logger.info("Finished processing of file " + apk.getName());

        return data;
    }

}


