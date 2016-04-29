package sk.styk.martin.bakalarka.analyze.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.utils.files.ApkFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Base class for processing analyze of APKs.
 * Analysis consists of all analyzed aspects
 *
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

    /**
     * Analyze all APKs provided to constructor during creation of instance
     * In memory analyze, results are not saved in output file, but returned as return value
     *
     * @return list of metadata about APK
     */
    public List<ApkData> processFiles() {
        List<ApkData> statistics = new ArrayList<ApkData>();
        for (ApkFile f : apks) {
            statistics.add(processFile(f));
        }
        return statistics;
    }

    /**
     * Analyze all APKs provided to constructor during creation of instance
     * Output of analyze is saved into ouput files in directory specified by parameter.
     *
     * Executes concurrent analyze, 1 analyzed APK per processor core
     *
     * @see ApkProcessingTask for thread implementing this funcitonality
     * @param outputDirectory directory to store output files
     */
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

    /**
     * Analyze single APK file
     *
     * @param apk file to be analyzed
     * @return data about APK
     */
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


