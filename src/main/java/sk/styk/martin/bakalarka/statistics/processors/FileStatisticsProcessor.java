package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.HashData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.FileStatistics;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class FileStatisticsProcessor {
    private List<File> jsons;
    private FileStatistics fileStatistics;
    private static final Logger logger = LoggerFactory.getLogger(FileStatisticsProcessor.class);

    private enum Type {
        LAYOUT,
        DRAWABLE,
        OTHER,
        ALL
    }

    public FileStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static FileStatisticsProcessor ofFiles(List<File> jsons) {
        return new FileStatisticsProcessor(jsons);
    }

    public FileStatistics process() {

        fileStatistics = new FileStatistics();

        List<Double> layoutDirectorySizeList = new ArrayList<Double>();
        List<Double> drawableDirectorySizeList = new ArrayList<Double>();
        List<Double> otherDirectorySizeList = new ArrayList<Double>();
        List<Double> apkTotalFilesList = new ArrayList<Double>();

        int hashDataFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            HashData hashData = null;


            if (data != null && data.getFileDigest() != null) {

                hashData = data.getFileDigest();

                int drawable = hashData.getDrawableHash() == null ? 0 : hashData.getDrawableHash().size();
                int layout = hashData.getLayoutHash() == null ? 0 : hashData.getLayoutHash().size();
                int other = hashData.getOtherHash() == null ? 0 : hashData.getOtherHash().size() + 2; //arsc + dex not included by default
                int total = drawable + layout + other;

                if (drawable != 0 || layout != 0 || other != 0) {
                    hashDataFound++;
                    if (drawable != 0) {
                        drawableDirectorySizeList.add(new Double(drawable));
                    }
                    if (layout != 0) {
                        layoutDirectorySizeList.add(new Double(layout));
                    }
                    if (other != 0) {
                        otherDirectorySizeList.add(new Double(other));
                    }
                    apkTotalFilesList.add(new Double(total));
                }
            }
        }
        fileStatistics.setAnalyzedApks(hashDataFound);

        setValues(Type.LAYOUT, layoutDirectorySizeList, layoutDirectorySizeList.size());
        setValues(Type.DRAWABLE, drawableDirectorySizeList, drawableDirectorySizeList.size());
        setValues(Type.OTHER, otherDirectorySizeList, otherDirectorySizeList.size());
        setValues(Type.ALL, apkTotalFilesList, hashDataFound);
        return fileStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound) {

        if (fileStatistics == null) {
            throw new NullPointerException("fileStatistics null");
        }

        logger.info("Started processing files " + type.toString());

        PercentagePair percentagePair = new PercentagePair(list.size(), PercentageHelper.getPercentage(list.size(), resourceDataFound));

        double[] array = ConversionHelper.toDoubleArray(list);

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        double[] modus = StatUtils.mode(array);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);


        switch (type) {
            case LAYOUT:
                fileStatistics.setFilesInLayoutFolderArithmeticMean(new BigDecimal(mean));
                fileStatistics.setFilesInLayoutFolderModus(ConversionHelper.toIntegerList(modus));
                fileStatistics.setFilesInLayoutFolderMedian(median.intValue());
                fileStatistics.setFilesInLayoutFolderMax(maximum.intValue());
                fileStatistics.setFilesInLayoutFolderMin(minimum.intValue());
                fileStatistics.setFilesInLayoutFolderVariance(new BigDecimal(variance));
                fileStatistics.setFilesInLayoutFolderDeviation(new BigDecimal(deviation));
                break;
            case DRAWABLE:
                fileStatistics.setFilesInDrawableFolderArithmeticMean(new BigDecimal(mean));
                fileStatistics.setFilesInDrawableFolderModus(ConversionHelper.toIntegerList(modus));
                fileStatistics.setFilesInDrawableFolderMedian(median.intValue());
                fileStatistics.setFilesInDrawableFolderMax(maximum.intValue());
                fileStatistics.setFilesInDrawableFolderMin(minimum.intValue());
                fileStatistics.setFilesInDrawableFolderVariance(new BigDecimal(variance));
                fileStatistics.setFilesInDrawableFolderDeviation(new BigDecimal(deviation));
                break;
            case OTHER:
                fileStatistics.setOtherFilesArithmeticMean(new BigDecimal(mean));
                fileStatistics.setOtherFilesModus(ConversionHelper.toIntegerList(modus));
                fileStatistics.setOtherFilesMedian(median.intValue());
                fileStatistics.setOtherFilesMax(maximum.intValue());
                fileStatistics.setOtherFilesMin(minimum.intValue());
                fileStatistics.setOtherFilesVariance(new BigDecimal(variance));
                fileStatistics.setOtherFilesDeviation(new BigDecimal(deviation));
                break;
            case ALL:
                fileStatistics.setAllFilesArithmeticMean(new BigDecimal(mean));
                fileStatistics.setAllFilesModus(ConversionHelper.toIntegerList(modus));
                fileStatistics.setAllFilesMedian(median.intValue());
                fileStatistics.setAllFilesMax(maximum.intValue());
                fileStatistics.setAllFilesMin(minimum.intValue());
                fileStatistics.setAllFilesVariance(new BigDecimal(variance));
                fileStatistics.setAllFilesDeviation(new BigDecimal(deviation));
                break;
        }

        logger.info("Finished processing files " + type.toString());
    }
}
