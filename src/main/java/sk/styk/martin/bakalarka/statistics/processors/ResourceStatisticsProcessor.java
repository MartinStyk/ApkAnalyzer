package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.data.ResourceStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class ResourceStatisticsProcessor {
    private List<File> jsons;
    private ResourceStatistics resourceStatistics;
    private ResourceData resourceData;
    private static final Logger logger = LoggerFactory.getLogger(ResourceStatisticsProcessor.class);

    private enum Type {
        LAYOUT,
        LAYOUT_NONZERO,
        LAYOUT_DIFFERENT,
        LAYOUT_DIFFERENT_NONZERO,
        MENU,
        MENU_NONZERO,
        RAW,
        RAW_NONZERO
    }

    public ResourceStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static ResourceStatisticsProcessor ofFiles(List<File> jsons) {
        return new ResourceStatisticsProcessor(jsons);
    }

    public ResourceStatistics process() {

        resourceStatistics = new ResourceStatistics();

        List<Double> layoutList = new ArrayList<Double>();
        List<Double> layoutListNonZero = new ArrayList<Double>();
        List<Double> diffLayoutList = new ArrayList<Double>();
        List<Double> diffLayoutListNonZero = new ArrayList<Double>();
        List<Double> menuList = new ArrayList<Double>();
        List<Double> menuListNonZero = new ArrayList<Double>();
        List<Double> rawList = new ArrayList<Double>();
        List<Double> rawListNonZero = new ArrayList<Double>();

        int resourceDataFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);

            if (data != null && data.getResourceData() != null) {

                resourceDataFound++;
                resourceData = data.getResourceData();

                obtainValue(resourceData.getLayouts(), layoutList, layoutListNonZero);
                obtainValue(resourceData.getDifferentLayouts(), diffLayoutList, diffLayoutListNonZero);
                obtainValue(resourceData.getMenu(), menuList, menuListNonZero);
                obtainValue(resourceData.getRawResources(), rawList, rawListNonZero);
            }
        }

        resourceStatistics.setAnalyzedApks(resourceDataFound);

        setValues(Type.LAYOUT, layoutList, resourceDataFound);
        setValues(Type.LAYOUT_NONZERO, layoutListNonZero, resourceDataFound);

        setValues(Type.LAYOUT_DIFFERENT, diffLayoutList, resourceDataFound);
        setValues(Type.LAYOUT_DIFFERENT_NONZERO, diffLayoutListNonZero, resourceDataFound);

        setValues(Type.MENU, menuList, resourceDataFound);
        setValues(Type.MENU_NONZERO, menuListNonZero, resourceDataFound);

        setValues(Type.RAW, rawList, resourceDataFound);
        setValues(Type.RAW_NONZERO, rawListNonZero, resourceDataFound);

        return resourceStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound) {

        if (resourceStatistics == null) {
            throw new NullPointerException("resourceStatistics null");
        }

        logger.info("Started processing resources " + type.toString());

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
                resourceStatistics.setApksWithLayoutsObtainedSuccessfully(percentagePair);
                resourceStatistics.setLayoutsArithmeticMean(new BigDecimal(mean));
                resourceStatistics.setLayoutsModus(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setLayoutsMedian(median.intValue());
                resourceStatistics.setLayoutsMax(maximum.intValue());
                resourceStatistics.setLayoutsMin(minimum.intValue());
                resourceStatistics.setLayoutsVariance(new BigDecimal(variance));
                resourceStatistics.setLayoutsDeviation(new BigDecimal(deviation));
                break;
            case LAYOUT_NONZERO:
                resourceStatistics.setApksWithLayoutsObtainedSuccessfullyNonZero(percentagePair);
                resourceStatistics.setLayoutsArithmeticMeanNonZero(new BigDecimal(mean));
                resourceStatistics.setLayoutsModusNonZero(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setLayoutsMedianNonZero(median.intValue());
                resourceStatistics.setLayoutsMaxNonZero(maximum.intValue());
                resourceStatistics.setLayoutsMinNonZero(minimum.intValue());
                resourceStatistics.setLayoutsVarianceNonZero(new BigDecimal(variance));
                resourceStatistics.setLayoutsDeviationNonZero(new BigDecimal(deviation));
                break;
            case LAYOUT_DIFFERENT:
                resourceStatistics.setApksWithDifferentLayoutsObtainedSuccessfully(percentagePair);
                resourceStatistics.setDifferentLayoutsArithmeticMean(new BigDecimal(mean));
                resourceStatistics.setDifferentLayoutsModus(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setDifferentLayoutsMedian(median.intValue());
                resourceStatistics.setDifferentLayoutsMax(maximum.intValue());
                resourceStatistics.setDifferentLayoutsMin(minimum.intValue());
                resourceStatistics.setDifferentLayoutsVariance(new BigDecimal(variance));
                resourceStatistics.setDifferentLayoutsDeviation(new BigDecimal(deviation));
                break;
            case LAYOUT_DIFFERENT_NONZERO:
                resourceStatistics.setApksWithDifferentLayoutsObtainedSuccessfullyNonZero(percentagePair);
                resourceStatistics.setDifferentLayoutsArithmeticMeanNonZero(new BigDecimal(mean));
                resourceStatistics.setDifferentLayoutsModusNonZero(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setDifferentLayoutsMedianNonZero(median.intValue());
                resourceStatistics.setDifferentLayoutsMaxNonZero(maximum.intValue());
                resourceStatistics.setDifferentLayoutsMinNonZero(minimum.intValue());
                resourceStatistics.setDifferentLayoutsVarianceNonZero(new BigDecimal(variance));
                resourceStatistics.setDifferentLayoutsDeviationNonZero(new BigDecimal(deviation));
                break;
            case MENU:
                resourceStatistics.setApksWithMenusObtainedSuccessfully(percentagePair);
                resourceStatistics.setMenusArithmeticMean(new BigDecimal(mean));
                resourceStatistics.setMenusModus(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setMenusMedian(median.intValue());
                resourceStatistics.setMenusMax(maximum.intValue());
                resourceStatistics.setMenusMin(minimum.intValue());
                resourceStatistics.setMenusVariance(new BigDecimal(variance));
                resourceStatistics.setMenusDeviation(new BigDecimal(deviation));
                break;
            case MENU_NONZERO:
                resourceStatistics.setApksWithMenusObtainedSuccessfullyNonZero(percentagePair);
                resourceStatistics.setMenusArithmeticMeanNonZero(new BigDecimal(mean));
                resourceStatistics.setMenusModusNonZero(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setMenusMedianNonZero(median.intValue());
                resourceStatistics.setMenusMaxNonZero(maximum.intValue());
                resourceStatistics.setMenusMinNonZero(minimum.intValue());
                resourceStatistics.setMenusVarianceNonZero(new BigDecimal(variance));
                resourceStatistics.setMenusDeviationNonZero(new BigDecimal(deviation));
                break;
            case RAW:
                resourceStatistics.setApksWithRawResourcesObtainedSuccessfully(percentagePair);
                resourceStatistics.setRawResourcesArithmeticMean(new BigDecimal(mean));
                resourceStatistics.setRawResourcesModus(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setRawResourcesMedian(median.intValue());
                resourceStatistics.setRawResourcesMax(maximum.intValue());
                resourceStatistics.setRawResourcesMin(minimum.intValue());
                resourceStatistics.setRawResourcesVariance(new BigDecimal(variance));
                resourceStatistics.setRawResourcesDeviation(new BigDecimal(deviation));
                break;
            case RAW_NONZERO:
                resourceStatistics.setApksWithRawResourcesObtainedSuccessfullyNonZero(percentagePair);
                resourceStatistics.setRawResourcesArithmeticMeanNonZero(new BigDecimal(mean));
                resourceStatistics.setRawResourcesModusNonZero(ConversionHelper.toIntegerList(modus));
                resourceStatistics.setRawResourcesMedianNonZero(median.intValue());
                resourceStatistics.setRawResourcesMaxNonZero(maximum.intValue());
                resourceStatistics.setRawResourcesMinNonZero(minimum.intValue());
                resourceStatistics.setRawResourcesVarianceNonZero(new BigDecimal(variance));
                resourceStatistics.setRawResourcesDeviationNonZero(new BigDecimal(deviation));
                break;
        }

        logger.info("Finished processing resources " + type.toString());
    }

    private void obtainValue(Integer value, List<Double> list, List<Double> listNonZero) {
        if (value != null) {
            list.add(new Double(value));
            if (value != 0) {
                listNonZero.add(new Double(value));
            }
        }
    }
}
