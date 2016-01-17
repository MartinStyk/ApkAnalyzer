package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.FileSizeStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class FileSizeStatisticsProcessor {

    private List<File> jsons;
    private FileSizeStatistics fileSizeStatistics;

    private enum Type {
        FILE_SIZE,
        DEX_SIZE,
        ARSC_SIZE
    }

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
        process(Type.FILE_SIZE);
        process(Type.ARSC_SIZE);
        process(Type.DEX_SIZE);

        return fileSizeStatistics;

    }

    private void process(Type type) {
        List<Double> list = new ArrayList<Double>();

        for (File f : jsons) {
            ApkData data = JsonUtils.fromJson(f);
            if (data != null) {
                Double value = getValue(type, data);
                if (value != null) {
                    list.add(value);
                }
            }
        }

        double[] array = ConversionHelper.toDoubleArray(list);

        double mean = StatUtils.mean(array);
        double median = StatUtils.percentile(array, 50);

        setValues(type,mean,median,list.size());

    }

    private void setValues(Type type, Double mean, Double median, int size){
        if(fileSizeStatistics == null){
            throw new NullPointerException("fileSizeStatistics");
        }

        switch (type) {
            case ARSC_SIZE:
                fileSizeStatistics.setArscSizeTotalApks(size);
                fileSizeStatistics.setArscSizeArithmeticMean(mean);
                fileSizeStatistics.setArscSizeMedian(median.longValue());
                break;
            case DEX_SIZE:
                fileSizeStatistics.setDexSizeTotalApks(size);
                fileSizeStatistics.setDexSizeArithmeticMean(mean);
                fileSizeStatistics.setDexSizeMedian(median.longValue());
                break;
            case FILE_SIZE:
                fileSizeStatistics.setFileSizeTotalApks(size);
                fileSizeStatistics.setFileSizeArithmeticMean(mean);
                fileSizeStatistics.setFileSizeMedian(median.longValue());
                break;
        }
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
        return value == null ? null : value.doubleValue();
    }

}

