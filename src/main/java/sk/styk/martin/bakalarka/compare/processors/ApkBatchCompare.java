package sk.styk.martin.bakalarka.compare.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Martin Styk on 07.01.2016.
 */
public class ApkBatchCompare {
    private static final Logger logger = LoggerFactory.getLogger(ApkBatchCompare.class);

    private List<File> jsons;

    public ApkBatchCompare(List<File> jsons) {
        if (jsons == null || jsons.isEmpty()) {
            throw new IllegalArgumentException("jsons not valid");
        }
        for (File f : jsons) {
            if (!f.getName().endsWith("json")) {
                throw new IllegalArgumentException("file " + f.getName() + "is not a json");
            }
        }
        this.jsons = jsons;
    }

    public void processFiles(File outputDirectory) {

        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(1);

        int jsonsSize = jsons.size();

        for (int i = 0; i < jsonsSize - 1; i++) {

            ApkData apkDataA = JsonUtils.fromJson(jsons.get(i));

            for (int j = i + 1; j < jsonsSize; j++) {
                ApkData apkDataB = JsonUtils.fromJson(jsons.get(j));
                try {
                    pool.submit(new ApkDataCompareTask(apkDataA, apkDataB, outputDirectory));
                } catch (Exception e) {
                    logger.error("One of json were not loaded " + jsons.get(i).getName() + jsons.get(j).getName());
                }
            }

        }

        pool.shutdown();
        try {
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            logger.warn(e.toString());
        }
    }

}
