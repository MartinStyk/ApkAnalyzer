package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.LocalizationsStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class LocalizationsStatisticsProcessor {
    private List<File> jsons;
    private LocalizationsStatistics localizationsStatistics;
    private static final Logger logger = LoggerFactory.getLogger(LocalizationsStatisticsProcessor.class);

    private enum Type {
        STRING_XML_RESOURCES,
        STRING_XML_RESOURCES_NON_DEFAULT,
        LOCALE,
        LOCALE_NON_ZERO
    }

    public LocalizationsStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static LocalizationsStatisticsProcessor ofFiles(List<File> jsons) {
        return new LocalizationsStatisticsProcessor(jsons);
    }

    public LocalizationsStatistics process() {

        localizationsStatistics = new LocalizationsStatistics();

        int manifestFound = 0;

        Map<String, PercentagePair> localizationsMap = new HashMap<String, PercentagePair>();

        List<Double> numLocaleList = new ArrayList<Double>();
        List<Double> numLocaleListListNonZeros = new ArrayList<Double>();

        List<Double> numStringResourcesList = new ArrayList<Double>();
        List<Double> numStringResourcesListNonDefault = new ArrayList<Double>();

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            ResourceData resourceData = null;

            if (data != null && data.getResourceData() != null) {

                manifestFound++;
                resourceData = data.getResourceData();

                //string.xml
                Integer numStringResources = resourceData.getNumberOfStringResource();
                if (numStringResources != null) {
                    numStringResourcesList.add(numStringResources.doubleValue());
                    if (numStringResources > 1) {
                        numStringResourcesListNonDefault.add(numStringResources.doubleValue());
                    }
                }

                //localizations
                List<String> localizations = resourceData.getLocale();
                if (localizations != null) {

                    Set<String> alreadyAddedForApk = new HashSet<String>();

                    for (String locale : localizations) {

                        String localeNormalized = getNormalizedLocale(locale);

                        //check to avoid adding duplicates
                        //locale list from analyze can contain en-US, en-GB
                        //here we normlaize locale to just en, we dont want to add it twice
                        //because of percentage computation
                        if (alreadyAddedForApk.add(localeNormalized)) {

                            if (localizationsMap.containsKey(localeNormalized)) {
                                PercentagePair percentagePair = localizationsMap.get(localeNormalized);
                                Integer oldValue = percentagePair.getCount().intValue();
                                percentagePair.setCount(++oldValue);
                            } else {
                                localizationsMap.put(localeNormalized, new PercentagePair(1, null));
                            }
                        }
                    }

                    Integer localizationsSize = localizations.size();
                    numLocaleList.add(localizationsSize.doubleValue());
                    if (localizationsSize != 0) {
                        numLocaleListListNonZeros.add(localizationsSize.doubleValue());
                    }
                }
            }
        }

        localizationsStatistics.setAnalyzedApks(manifestFound);
        setValues(Type.STRING_XML_RESOURCES, ConversionHelper.toDoubleArray(numStringResourcesList), numStringResourcesList.size(), manifestFound);
        setValues(Type.STRING_XML_RESOURCES_NON_DEFAULT, ConversionHelper.toDoubleArray(numStringResourcesListNonDefault), numStringResourcesListNonDefault.size(), manifestFound);
        setValues(Type.LOCALE, ConversionHelper.toDoubleArray(numLocaleList), numLocaleList.size(), manifestFound);
        setValues(Type.LOCALE_NON_ZERO, ConversionHelper.toDoubleArray(numLocaleListListNonZeros), numLocaleListListNonZeros.size(), manifestFound);

        localizationsStatistics.setTopLocalizations(getLocaleChart(numLocaleList.size(), localizationsMap));

        return localizationsStatistics;
    }

    /**
     * get only basic country code
     *
     * @param old
     * @return
     */
    private String getNormalizedLocale(String old) {
        if (old.length() <= 2) {
            return old;
        }
        if (old.charAt(2) == '-') {
            return old.substring(0, 2);
        }
        return old;
    }

    private Map<String, PercentagePair> getLocaleChart(int localizationObtained, Map<String, PercentagePair> localizationsMap) {
        if (localizationsMap == null) {
            throw new IllegalArgumentException("localizationsMap");
        }
        logger.info("Started processing chart for Locale");

        for (Map.Entry<String, PercentagePair> entry : localizationsMap.entrySet()) {
            PercentagePair pair = entry.getValue();
            Integer count = pair.getCount().intValue();
            pair.setPercentage(PercentageHelper.getPercentage(count.doubleValue(), localizationObtained));
        }

        Map<String, PercentagePair> sorted = SortingHelper.sortByValue(localizationsMap);

        logger.info("Finished processing chart for Locale");

        return sorted;
    }


    private void setValues(Type type, double[] array, Integer size, Integer total) {
        if (localizationsStatistics == null) {
            throw new NullPointerException("localizationsStatistics");
        }

        logger.info("Started processing " + type.toString());

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        double[] modus = StatUtils.mode(array);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);

        switch (type) {
            case STRING_XML_RESOURCES:
                localizationsStatistics.setApksWithDefaultStringXmlObtained(new PercentagePair(size, PercentageHelper.getPercentage(size, total)));
                localizationsStatistics.setDefaultStringXmlArithmeticMean(new BigDecimal(mean));
                localizationsStatistics.setDefaultStringXmlMedian(median.intValue());
                localizationsStatistics.setDefaultStringXmlModus(ConversionHelper.toIntegerList(modus));
                localizationsStatistics.setDefaultStringXmlMin(minimum.intValue());
                localizationsStatistics.setDefaultStringXmlMax(maximum.intValue());
                localizationsStatistics.setDefaultStringXmlVariance(new BigDecimal(variance));
                localizationsStatistics.setDefaultStringXmlDeviation(new BigDecimal(deviation));
                break;
            case STRING_XML_RESOURCES_NON_DEFAULT:
                localizationsStatistics.setApksWithDefaultStringXmlObtainedNonDefault(new PercentagePair(size, PercentageHelper.getPercentage(size, total)));
                localizationsStatistics.setDefaultStringXmlArithmeticMeanNonDefault(new BigDecimal(mean));
                localizationsStatistics.setDefaultStringXmlMedianNonDefault(median.intValue());
                localizationsStatistics.setDefaultStringXmlModusNonDefault(ConversionHelper.toIntegerList(modus));
                localizationsStatistics.setDefaultStringXmlMinNonDefault(minimum.intValue());
                localizationsStatistics.setDefaultStringXmlMaxNonDefault(maximum.intValue());
                localizationsStatistics.setDefaultStringXmlVarianceNonDefault(new BigDecimal(variance));
                localizationsStatistics.setDefaultStringXmlDeviationNonDefault(new BigDecimal(deviation));
                break;
            case LOCALE:
                localizationsStatistics.setApksWithLocalizationsObtained(new PercentagePair(size, PercentageHelper.getPercentage(size, total)));
                localizationsStatistics.setLocalizationsArithmeticMean(new BigDecimal(mean));
                localizationsStatistics.setLocalizationsMedian(median.intValue());
                localizationsStatistics.setLocalizationsModus(ConversionHelper.toIntegerList(modus));
                localizationsStatistics.setLocalizationsMin(minimum.intValue());
                localizationsStatistics.setLocalizationsMax(maximum.intValue());
                localizationsStatistics.setLocalizationsVariance(new BigDecimal(variance));
                localizationsStatistics.setLocalizationsDeviation(new BigDecimal(deviation));
                break;
            case LOCALE_NON_ZERO:
                localizationsStatistics.setNumberOfApksWithLocalizationsObtainedNonZero(new PercentagePair(size, PercentageHelper.getPercentage(size, total)));
                localizationsStatistics.setLocalizationsArithmeticMeanNonZero(new BigDecimal(mean));
                localizationsStatistics.setLocalizationsMedianNonZero(median.intValue());
                localizationsStatistics.setLocalizationsModusNonZero(ConversionHelper.toIntegerList(modus));
                localizationsStatistics.setLocalizationsMinNonZero(minimum.intValue());
                localizationsStatistics.setLocalizationsMaxNonZero(maximum.intValue());
                localizationsStatistics.setLocalizationsVarianceNonZero(new BigDecimal(variance));
                localizationsStatistics.setLocalizationsDeviationNonZero(new BigDecimal(deviation));
                break;
        }
        logger.info("Finished processing " + type.toString());
    }

}
