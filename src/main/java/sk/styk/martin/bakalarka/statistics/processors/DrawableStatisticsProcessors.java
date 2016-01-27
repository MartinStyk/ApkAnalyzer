package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.DrawableStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class DrawableStatisticsProcessors {
    private List<File> jsons;
    private DrawableStatistics drawableStatistics;
    private ResourceData resourceData;
    private static final Logger logger = LoggerFactory.getLogger(DrawableStatisticsProcessors.class);

    private enum Type {
        PNG,
        PNG_NONZERO,
        JPG,
        JPG_NONZERO,
        GIF,
        GIF_NONZERO,
        XML,
        XML_NONZERO,
        DIFFERENT_DRAWABLES,
        DIFFERENT_DRAWABLES_NONZERO,
        LDPI,
        LDPI_NONZERO,
        MDPI,
        MDPI_NONZERO,
        HDPI,
        HDPI_NONZERO,
        XHDPI,
        XHDPI_NONZERO,
        XXHDPI,
        XXHDPI_NONZERO,
        XXXHDPI,
        XXXHDPI_NONZERO,
        UNSPECIFIED_DPI,
        UNSPECIFIED_DPI_NONZERO
    }

    public DrawableStatisticsProcessors(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static DrawableStatisticsProcessors ofFiles(List<File> jsons) {
        return new DrawableStatisticsProcessors(jsons);
    }

    public DrawableStatistics process() {

        drawableStatistics = new DrawableStatistics();

        List<Double> pngList = new ArrayList<Double>();
        List<Double> pngListNonZero = new ArrayList<Double>();
        List<Double> jpgList = new ArrayList<Double>();
        List<Double> jpgListNonZero = new ArrayList<Double>();
        List<Double> gifList = new ArrayList<Double>();
        List<Double> gifListNonZero = new ArrayList<Double>();
        List<Double> xmlList = new ArrayList<Double>();
        List<Double> xmlListNonZero = new ArrayList<Double>();
        List<Double> differentDrawablesList = new ArrayList<Double>();
        List<Double> differentDrawablesListNonZero = new ArrayList<Double>();
        List<Double> ldpiList = new ArrayList<Double>();
        List<Double> ldpiListNonZero = new ArrayList<Double>();
        List<Double> mdpiList = new ArrayList<Double>();
        List<Double> mdpiListNonZero = new ArrayList<Double>();
        List<Double> hdpiList = new ArrayList<Double>();
        List<Double> hpdiListNonZero = new ArrayList<Double>();
        List<Double> xhdpiList = new ArrayList<Double>();
        List<Double> xhpdiListNonZero = new ArrayList<Double>();
        List<Double> xxhdpiList = new ArrayList<Double>();
        List<Double> xxhpdiListNonZero = new ArrayList<Double>();
        List<Double> xxxhdpiList = new ArrayList<Double>();
        List<Double> xxxhpdiListNonZero = new ArrayList<Double>();
        List<Double> unspecifiedDpiList = new ArrayList<Double>();
        List<Double> unspecifiedDpiListNonZero = new ArrayList<Double>();

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

                obtainValue(resourceData.getPngDrawables(), pngList, pngListNonZero);
                obtainValue(resourceData.getJpgDrawables(), jpgList, jpgListNonZero);
                obtainValue(resourceData.getGifDrawables(), gifList, gifListNonZero);
                obtainValue(resourceData.getXmlDrawables(), xmlList, xmlListNonZero);
                obtainValue(resourceData.getDifferentDrawables(), differentDrawablesList, differentDrawablesListNonZero);
                obtainValue(resourceData.getLdpiDrawables(), ldpiList, ldpiListNonZero);
                obtainValue(resourceData.getMdpiDrawables(), mdpiList, mdpiListNonZero);
                obtainValue(resourceData.getHdpiDrawables(), hdpiList, hpdiListNonZero);
                obtainValue(resourceData.getXhdpiDrawables(), xhdpiList, xhpdiListNonZero);
                obtainValue(resourceData.getXxhdpiDrawables(), xxhdpiList, xxhpdiListNonZero);
                obtainValue(resourceData.getXxxhdpiDrawables(), xxxhdpiList, xxxhpdiListNonZero);
                obtainValue(resourceData.getUnspecifiedDpiDrawables(), unspecifiedDpiList, unspecifiedDpiListNonZero);
            }
        }

        drawableStatistics.setAnalyzedApks(resourceDataFound);

        setValues(Type.PNG, pngList, resourceDataFound);
        setValues(Type.PNG_NONZERO, pngListNonZero, resourceDataFound);

        setValues(Type.JPG, jpgList, resourceDataFound);
        setValues(Type.JPG_NONZERO, jpgListNonZero, resourceDataFound);

        setValues(Type.GIF, gifList, resourceDataFound);
        setValues(Type.GIF_NONZERO, gifListNonZero, resourceDataFound);

        setValues(Type.XML, xmlList, resourceDataFound);
        setValues(Type.XML_NONZERO, xmlListNonZero, resourceDataFound);

        setValues(Type.DIFFERENT_DRAWABLES, differentDrawablesList, resourceDataFound);
        setValues(Type.DIFFERENT_DRAWABLES_NONZERO, differentDrawablesListNonZero, resourceDataFound);

        setValues(Type.LDPI, ldpiList, resourceDataFound);
        setValues(Type.LDPI_NONZERO, ldpiListNonZero, resourceDataFound);

        setValues(Type.MDPI, mdpiList, resourceDataFound);
        setValues(Type.MDPI_NONZERO, mdpiListNonZero, resourceDataFound);

        setValues(Type.HDPI, hdpiList, resourceDataFound);
        setValues(Type.HDPI_NONZERO, hpdiListNonZero, resourceDataFound);

        setValues(Type.XHDPI, xhdpiList, resourceDataFound);
        setValues(Type.XHDPI_NONZERO, xhpdiListNonZero, resourceDataFound);

        setValues(Type.XXHDPI, xxhdpiList, resourceDataFound);
        setValues(Type.XXHDPI_NONZERO, xxhpdiListNonZero, resourceDataFound);

        setValues(Type.XXXHDPI, xxxhdpiList, resourceDataFound);
        setValues(Type.XXXHDPI_NONZERO, xxxhpdiListNonZero, resourceDataFound);

        setValues(Type.UNSPECIFIED_DPI, unspecifiedDpiList, resourceDataFound);
        setValues(Type.UNSPECIFIED_DPI_NONZERO, unspecifiedDpiListNonZero, resourceDataFound);

        return drawableStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound) {

        if (drawableStatistics == null) {
            throw new NullPointerException("drawableStatistics null");
        }

        logger.info("Started processing drawables " + type.toString());

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
            case PNG:
                drawableStatistics.setApksWithPngDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setPngDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setPngDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setPngDrawablesMedian(median.intValue());
                drawableStatistics.setPngDrawablesMax(maximum.intValue());
                drawableStatistics.setPngDrawablesMin(minimum.intValue());
                drawableStatistics.setPngDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setPngDrawablesDeviation(new BigDecimal(deviation));
                break;
            case PNG_NONZERO:
                drawableStatistics.setApksWithPngDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setPngDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setPngDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setPngDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setPngDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setPngDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setPngDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setPngDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case JPG:
                drawableStatistics.setApksWithJpgDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setJpgDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setJpgDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setJpgDrawablesMedian(median.intValue());
                drawableStatistics.setJpgDrawablesMax(maximum.intValue());
                drawableStatistics.setJpgDrawablesMin(minimum.intValue());
                drawableStatistics.setJpgDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setJpgDrawablesDeviation(new BigDecimal(deviation));
                break;
            case JPG_NONZERO:
                drawableStatistics.setApksWithJpgDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setJpgDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setJpgDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setJpgDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setJpgDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setJpgDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setJpgDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setJpgDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case GIF:
                drawableStatistics.setApksWithGifDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setGifDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setGifDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setGifDrawablesMedian(median.intValue());
                drawableStatistics.setGifDrawablesMax(maximum.intValue());
                drawableStatistics.setGifDrawablesMin(minimum.intValue());
                drawableStatistics.setGifDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setGifDrawablesDeviation(new BigDecimal(deviation));
                break;
            case GIF_NONZERO:
                drawableStatistics.setApksWithGifDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setGifDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setGifDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setGifDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setGifDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setGifDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setGifDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setGifDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case XML:
                drawableStatistics.setApksWithXmlDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setXmlDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setXmlDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXmlDrawablesMedian(median.intValue());
                drawableStatistics.setXmlDrawablesMax(maximum.intValue());
                drawableStatistics.setXmlDrawablesMin(minimum.intValue());
                drawableStatistics.setXmlDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setXmlDrawablesDeviation(new BigDecimal(deviation));
                break;
            case XML_NONZERO:
                drawableStatistics.setApksWithXmlDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setXmlDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setXmlDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXmlDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setXmlDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setXmlDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setXmlDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setXmlDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case DIFFERENT_DRAWABLES:
                drawableStatistics.setApksWithDifferentDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setDifferentDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setDifferentDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setDifferentDrawablesMedian(median.intValue());
                drawableStatistics.setDifferentDrawablesMax(maximum.intValue());
                drawableStatistics.setDifferentDrawablesMin(minimum.intValue());
                drawableStatistics.setDifferentDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setDifferentDrawablesDeviation(new BigDecimal(deviation));
                break;
            case DIFFERENT_DRAWABLES_NONZERO:
                drawableStatistics.setApksWithDifferentDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setDifferentDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setDifferentDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setDifferentDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setDifferentDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setDifferentDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setDifferentDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setDifferentDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case LDPI:
                drawableStatistics.setApksWithLdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setLdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setLdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setLdpiDrawablesMedian(median.intValue());
                drawableStatistics.setLdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setLdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setLdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setLdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case LDPI_NONZERO:
                drawableStatistics.setApksWithLdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setLdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setLdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setLdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setLdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setLdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setLdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setLdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case MDPI:
                drawableStatistics.setApksWithMdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setMdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setMdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setMdpiDrawablesMedian(median.intValue());
                drawableStatistics.setMdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setMdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setMdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setMdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case MDPI_NONZERO:
                drawableStatistics.setApksWithMdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setMdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setMdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setMdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setMdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setMdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setMdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setMdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case HDPI:
                drawableStatistics.setApksWithHdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setHdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setHdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setHdpiDrawablesMedian(median.intValue());
                drawableStatistics.setHdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setHdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setHdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setHdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case HDPI_NONZERO:
                drawableStatistics.setApksWithHdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setHdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setHdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setHdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setHdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setHdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setHdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setHdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case XHDPI:
                drawableStatistics.setApksWithXhdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setXhdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setXhdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXhdpiDrawablesMedian(median.intValue());
                drawableStatistics.setXhdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setXhdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setXhdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setXhdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case XHDPI_NONZERO:
                drawableStatistics.setApksWithXhdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setXhdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setXhdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXhdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setXhdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setXhdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setXhdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setXhdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case XXHDPI:
                drawableStatistics.setApksWithXxhdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setXxhdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setXxhdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXxhdpiDrawablesMedian(median.intValue());
                drawableStatistics.setXxhdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setXxhdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setXxhdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setXxhdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case XXHDPI_NONZERO:
                drawableStatistics.setApksWithXxhdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setXxhdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setXxhdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXxhdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setXxhdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setXxhdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setXxhdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setXxhdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case XXXHDPI:
                drawableStatistics.setApksWithXxxhdpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setXxxhdpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setXxxhdpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXxxhdpiDrawablesMedian(median.intValue());
                drawableStatistics.setXxxhdpiDrawablesMax(maximum.intValue());
                drawableStatistics.setXxxhdpiDrawablesMin(minimum.intValue());
                drawableStatistics.setXxxhdpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setXxxhdpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case XXXHDPI_NONZERO:
                drawableStatistics.setApksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setXxxhdpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setXxxhdpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setXxxhdpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setXxxhdpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setXxxhdpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setXxxhdpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setXxxhdpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
            case UNSPECIFIED_DPI:
                drawableStatistics.setApksWithUnspecifiedDpiDrawablesObtainedSuccessfully(percentagePair);
                drawableStatistics.setUnspecifiedDpiDrawablesArithmeticMean(new BigDecimal(mean));
                drawableStatistics.setUnspecifiedDpiDrawablesModus(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setUnspecifiedDpiDrawablesMedian(median.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesMax(maximum.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesMin(minimum.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesVariance(new BigDecimal(variance));
                drawableStatistics.setUnspecifiedDpiDrawablesDeviation(new BigDecimal(deviation));
                break;
            case UNSPECIFIED_DPI_NONZERO:
                drawableStatistics.setApksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero(percentagePair);
                drawableStatistics.setUnspecifiedDpiDrawablesArithmeticMeanNonZero(new BigDecimal(mean));
                drawableStatistics.setUnspecifiedDpiDrawablesModusNonZero(ConversionHelper.toIntegerList(modus));
                drawableStatistics.setUnspecifiedDpiDrawablesMedianNonZero(median.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesMaxNonZero(maximum.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesMinNonZero(minimum.intValue());
                drawableStatistics.setUnspecifiedDpiDrawablesVarianceNonZero(new BigDecimal(variance));
                drawableStatistics.setUnspecifiedDpiDrawablesDeviationNonZero(new BigDecimal(deviation));
                break;
        }

        logger.info("Finished processing drawables " + type.toString());
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
