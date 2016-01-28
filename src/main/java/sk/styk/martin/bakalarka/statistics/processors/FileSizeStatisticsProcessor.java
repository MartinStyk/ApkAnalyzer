package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.FileSizeStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class FileSizeStatisticsProcessor {

    private static final Logger logger = LoggerFactory.getLogger(FileSizeStatisticsProcessor.class);
    private List<File> jsons;
    private FileSizeStatistics fileSizeStatistics;

    public FileSizeStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static FileSizeStatisticsProcessor ofFiles(List<File> jsons) {
        return new FileSizeStatisticsProcessor(jsons);
    }

    public FileSizeStatistics process() {

        fileSizeStatistics = new FileSizeStatistics();

        List<Double> fileSizeList = new ArrayList<Double>();
        List<Double> arscSizeList = new ArrayList<Double>();
        List<Double> dexSizeList = new ArrayList<Double>();

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            if (data != null) {

                // FILE SIZE
                Double fileSizeValue = getValue(Type.FILE_SIZE, data);
                if (fileSizeValue != null) {
                    fileSizeList.add(fileSizeValue);
                }
                Double arscSizeValue = getValue(Type.ARSC_SIZE, data);
                if (arscSizeValue != null) {
                    arscSizeList.add(arscSizeValue);
                }
                Double dexSizeValue = getValue(Type.DEX_SIZE, data);
                if (dexSizeValue != null) {
                    dexSizeList.add(dexSizeValue);
                }
            }
        }

        setValues(Type.FILE_SIZE, ConversionHelper.toDoubleArray(fileSizeList), fileSizeList.size());
        setValues(Type.ARSC_SIZE, ConversionHelper.toDoubleArray(arscSizeList), arscSizeList.size());
        setValues(Type.DEX_SIZE, ConversionHelper.toDoubleArray(dexSizeList), dexSizeList.size());

        return fileSizeStatistics;

    }

    private void setValues(Type type, double[] array, Integer size) {
        if (fileSizeStatistics == null) {
            throw new NullPointerException("fileSizeStatistics");
        }

        logger.info("Started processing " + type.toString());

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(size, jsons.size()), mean, median, null, maximum, minimum, variance, deviation);


        switch (type) {
            case ARSC_SIZE:
                fileSizeStatistics.setArscSize(mathStatistics);
                break;
            case DEX_SIZE:
                fileSizeStatistics.setDexSize(mathStatistics);
                break;
            case FILE_SIZE:
                fileSizeStatistics.setFileSize(mathStatistics);
                break;
        }
        logger.info("Finished processing " + type.toString());
    }

    private Double getValue(Type type, ApkData data) {

        Long value = null;

        switch (type) {
            case ARSC_SIZE:
                value = data.getArscSize();
                break;
            case DEX_SIZE:
                value = data.getDexSize();
                break;
            case FILE_SIZE:
                value = data.getFileSize();
                break;
        }
        return value == null || value == 0 ? null : value.doubleValue();
    }

    private enum Type {
        FILE_SIZE,
        DEX_SIZE,
        ARSC_SIZE
    }

}

