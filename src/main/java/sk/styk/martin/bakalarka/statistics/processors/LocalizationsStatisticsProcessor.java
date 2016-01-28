package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.statistics.data.LocalizationsStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.*;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class LocalizationsStatisticsProcessor extends TopListProcessorBase {
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
        Map<String, PercentagePair> localizationsMapNormalized = new HashMap<String, PercentagePair>();


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

                            if (localizationsMapNormalized.containsKey(localeNormalized)) {
                                PercentagePair percentagePair = localizationsMapNormalized.get(localeNormalized);
                                Integer oldValue = percentagePair.getCount().intValue();
                                percentagePair.setCount(++oldValue);
                            } else {
                                localizationsMapNormalized.put(localeNormalized, new PercentagePair(1, null));
                            }
                        }

                        if (localizationsMap.containsKey(locale)) {
                            PercentagePair percentagePair = localizationsMap.get(locale);
                            Integer oldValue = percentagePair.getCount().intValue();
                            percentagePair.setCount(++oldValue);
                        } else {
                            localizationsMap.put(locale, new PercentagePair(1, null));
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
        setValues(Type.STRING_XML_RESOURCES, numStringResourcesList, manifestFound);
        setValues(Type.STRING_XML_RESOURCES_NON_DEFAULT, numStringResourcesListNonDefault, manifestFound);
        setValues(Type.LOCALE, numLocaleList, manifestFound);
        setValues(Type.LOCALE_NON_ZERO, numLocaleListListNonZeros, manifestFound);

        localizationsStatistics.setTopLocalizations(getTopValuesMap(localizationsMap, numLocaleList.size(), "localizations"));
        localizationsStatistics.setTopLocalizationsNormalized(getTopValuesMap(localizationsMapNormalized, numLocaleList.size(), "localizationsNormalized"));
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

    private void setValues(Type type, List<Double> list, Integer total) {
        if (localizationsStatistics == null) {
            throw new NullPointerException("localizationsStatistics");
        }

        logger.info("Started processing " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(list.size(), total), list);

        switch (type) {
            case STRING_XML_RESOURCES:
                localizationsStatistics.setDefaultStringXmlEntries(mathStatistics);
                break;
            case STRING_XML_RESOURCES_NON_DEFAULT:
                localizationsStatistics.setDefaultStringXmlEntriesNonDefault(mathStatistics);
                break;
            case LOCALE:
                localizationsStatistics.setLocalizationNumber(mathStatistics);
                break;
            case LOCALE_NON_ZERO:
                localizationsStatistics.setLocalizationNumberNonZero(mathStatistics);
                break;
        }
        logger.info("Finished processing " + type.toString());
    }

    protected Logger getLogger() {
        return logger;
    }
}
