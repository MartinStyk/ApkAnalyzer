package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.files.ApkFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

    public ApkProcessor(ApkFile apk) {
        if (apks == null || !apk.exists()) {
            throw new IllegalArgumentException("apks not valid");
        }
        this.apks = new ArrayList<ApkFile>();
        this.apks.add(apk);
    }

    public static ApkProcessor ofFiles(List<ApkFile> apks) {
        return new ApkProcessor(apks);
    }

    public static ApkProcessor ofFile(ApkFile apk) {
        return new ApkProcessor(apk);
    }

    public List<ApkData> processFiles() {
        List<ApkData> statistics = new ArrayList<ApkData>();
        for (ApkFile f : apks) {
            statistics.add(processFile(f));
        }
        return statistics;
    }

    public void processFiles(File outputDirectory) {

        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(numberOfProcessors);

        for (ApkFile f : apks) {
            pool.submit(new ApkProcessingTask(f, outputDirectory));
        }
        pool.shutdown();
        try {
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            logger.warn(e.toString());
        }
    }

    public ApkData processFile(ApkFile apk) {
        logger.info(apk.getMarker() + "Started processing of file " + apk.getName());

        ApkData data = new ApkData();

        FileInfoProcessor
                .getInstance(data, apk)
                .processFileInfo();

        CertificateProcessor
                .getInstance(data, apk)
                .processCertificates();

        HashProcessor
                .getInstance(data, apk)
                .getHashes();

        AndroidManifestProcessor
                .getInstance(data, apk)
                .processAndroidManifest();

        ResourceProcessor
                .getInstance(data, apk)
                .processResources();
        
        apk.cleanApkWorkingDirectory();

        logger.info(apk.getMarker() + "Finished processing of file " + apk.getName());

        return data;
    }

}


