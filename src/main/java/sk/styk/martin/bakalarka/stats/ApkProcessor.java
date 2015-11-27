package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ApkProcessor.class);

    private List<File> apks;
    private List<ApkData> statistics = new ArrayList<ApkData>();

    public static ApkProcessor ofFiles(List<File> apks) {
        return new ApkProcessor(apks);
    }

    public ApkProcessor(List<File> apks) {
        if (apks == null || apks.isEmpty()) {
            throw new IllegalArgumentException("apks not valid");
        }
        this.apks = apks;
    }

    public List<ApkData> processFiles() {
        for (File f : apks) {
            processFile(f);
        }
        return statistics;
    }

    public void processFile(File apk) {
        logger.info("Started processing of file " + apk.getName());

        ApkData data = new ApkData();

        // 1. unzip and get data from unziped directory

        ApkUnziper
                .getInstance(apk)
                .unzip();

        FileInfoProcessor
                .getInstance(data,apk)
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


        statistics.add(data);

        logger.info("Finished processing of file " + apk.getName() + " with result " + data);
    }

}


