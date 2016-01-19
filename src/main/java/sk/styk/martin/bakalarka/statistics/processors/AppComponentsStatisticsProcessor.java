package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.AppComponentsStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 19.01.2016.
 */
public class AppComponentsStatisticsProcessor {

    private List<File> jsons;
    private AppComponentsStatistics appComponentsStatistics;
    private static final Logger logger = LoggerFactory.getLogger(AppComponentsStatisticsProcessor.class);

    private enum Type {
        ACTIVITY,
        SERVICE,
        BROADCAST_RECEIVER,
        CONTENT_PROVIDER
    }

    public AppComponentsStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static AppComponentsStatisticsProcessor ofFiles(List<File> jsons) {
        return new AppComponentsStatisticsProcessor(jsons);
    }

    public AppComponentsStatistics process() {

        appComponentsStatistics = new AppComponentsStatistics();

        List<Double> activityList = new ArrayList<Double>();
        List<Double> serviceList = new ArrayList<Double>();
        List<Double> receiverList = new ArrayList<Double>();
        List<Double> providerList = new ArrayList<Double>();

        List<Double> activityListNonZero = new ArrayList<Double>();
        List<Double> serviceListNonZero = new ArrayList<Double>();
        List<Double> receiverListNonZero = new ArrayList<Double>();
        List<Double> providerListNonZero = new ArrayList<Double>();

        int manifestFound = 0;
        for (int i = 0; i < jsons.size(); i++) {
            if (i % 100 == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            logger.trace("Processing " + f.getName() );

            ApkData data = JsonUtils.fromJson(f);
            AndroidManifestData manifestData = null;

            if (data != null && data.getAndroidManifest() != null) {

                manifestData = data.getAndroidManifest();
                manifestFound++;

                Double activityValue = getValue(Type.ACTIVITY, manifestData);
                if (activityValue != null) {
                    activityList.add(activityValue);
                    if(activityValue!=0){
                        activityListNonZero.add(activityValue);
                    }
                }

                Double serviceValue = getValue(Type.SERVICE, manifestData);
                if (serviceValue != null) {
                    serviceList.add(serviceValue);
                    if(serviceValue!=0){
                        serviceListNonZero.add(serviceValue);
                    }
                }

                Double providerValue = getValue(Type.CONTENT_PROVIDER, manifestData);
                if (providerValue != null) {
                    providerList.add(providerValue);
                    if(providerValue!=0){
                        providerListNonZero.add(providerValue);
                    }
                }

                Double receiverValue = getValue(Type.BROADCAST_RECEIVER, manifestData);
                if (receiverValue != null) {
                    receiverList.add(receiverValue);
                    if(receiverValue!=0){
                        receiverListNonZero.add(receiverValue);
                    }
                }
            }
        }

        appComponentsStatistics.setAnalyzedApks(manifestFound);
        setValues(Type.ACTIVITY, ConversionHelper.toDoubleArray(activityList),activityList.size());
        setValues(Type.SERVICE, ConversionHelper.toDoubleArray(serviceList),serviceList.size());
        setValues(Type.CONTENT_PROVIDER, ConversionHelper.toDoubleArray(providerList),providerList.size());
        setValues(Type.BROADCAST_RECEIVER, ConversionHelper.toDoubleArray(receiverList),receiverList.size());

        setValuesNonZero(Type.ACTIVITY, ConversionHelper.toDoubleArray(activityListNonZero), activityListNonZero.size());
        setValuesNonZero(Type.SERVICE, ConversionHelper.toDoubleArray(serviceListNonZero), serviceListNonZero.size());
        setValuesNonZero(Type.CONTENT_PROVIDER, ConversionHelper.toDoubleArray(providerListNonZero), providerListNonZero.size());
        setValuesNonZero(Type.BROADCAST_RECEIVER, ConversionHelper.toDoubleArray(receiverListNonZero), receiverListNonZero.size());

        return appComponentsStatistics;

    }


    private void setValues(Type type, double[] array, Integer size) {
        if (appComponentsStatistics == null) {
            throw new NullPointerException("appComponentsStatistics");
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
            case ACTIVITY:
                appComponentsStatistics.setNumberOfActivitiesObtained(size);
                appComponentsStatistics.setNumberOfActivitiesArithmeticMean(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfActivitiesMedian(median.intValue());
                appComponentsStatistics.setNumberOfActivitiesModus(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfActivitiesMin(minimum.intValue());
                appComponentsStatistics.setNumberOfActivitiesMax(maximum.intValue());
                appComponentsStatistics.setNumberOfActivitiesVariance(variance.intValue());
                appComponentsStatistics.setNumberOfActivitiesDeviation(deviation.intValue());
                break;
            case SERVICE:
                appComponentsStatistics.setNumberOfServicesObtained(size);
                appComponentsStatistics.setNumberOfServicesArithmeticMean(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfServicesMedian(median.intValue());
                appComponentsStatistics.setNumberOfServicesModus(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfServicesMin(minimum.intValue());
                appComponentsStatistics.setNumberOfServicesMax(maximum.intValue());
                appComponentsStatistics.setNumberOfServicesVariance(variance.intValue());
                appComponentsStatistics.setNumberOfServicesDeviation(deviation.intValue());
                break;
            case BROADCAST_RECEIVER:
                appComponentsStatistics.setNumberOfBroadcastReceiversObtained(size);
                appComponentsStatistics.setNumberOfBroadcastReceiversArithmeticMean(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfBroadcastReceiversMedian(median.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversModus(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfBroadcastReceiversMin(minimum.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversMax(maximum.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversVariance(variance.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversDeviation(deviation.intValue());
                break;
            case CONTENT_PROVIDER:
                appComponentsStatistics.setNumberOfContentProvidersObtained(size);
                appComponentsStatistics.setNumberOfContentProvidersArithmeticMean(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfContentProvidersMedian(median.intValue());
                appComponentsStatistics.setNumberOfContentProvidersModus(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfContentProvidersMin(minimum.intValue());
                appComponentsStatistics.setNumberOfContentProvidersMax(maximum.intValue());
                appComponentsStatistics.setNumberOfContentProvidersVariance(variance.intValue());
                appComponentsStatistics.setNumberOfContentProvidersDeviation(deviation.intValue());
                break;
        }
        logger.info("Finished processing " + type.toString());
    }

    private void setValuesNonZero(Type type, double[] array, Integer size) {
        if (appComponentsStatistics == null) {
            throw new NullPointerException("appComponentsStatistics");
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
            case ACTIVITY:
                appComponentsStatistics.setNumberOfActivitiesObtainedNonZero(size);
                appComponentsStatistics.setNumberOfActivitiesArithmeticMeanNonZero(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfActivitiesMedianNonZero(median.intValue());
                appComponentsStatistics.setNumberOfActivitiesModusNonZero(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfActivitiesMinNonZero(minimum.intValue());
                appComponentsStatistics.setNumberOfActivitiesMaxNonZero(maximum.intValue());
                appComponentsStatistics.setNumberOfActivitiesVarianceNonZero(variance.intValue());
                appComponentsStatistics.setNumberOfActivitiesDeviationNonZero(deviation.intValue());
                break;
            case SERVICE:
                appComponentsStatistics.setNumberOfServicesObtainedNonZero(size);
                appComponentsStatistics.setNumberOfServicesArithmeticMeanNonZero(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfServicesMedianNonZero(median.intValue());
                appComponentsStatistics.setNumberOfServicesModusNonZero(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfServicesMinNonZero(minimum.intValue());
                appComponentsStatistics.setNumberOfServicesMaxNonZero(maximum.intValue());
                appComponentsStatistics.setNumberOfServicesVarianceNonZero(variance.intValue());
                appComponentsStatistics.setNumberOfServicesDeviationNonZero(deviation.intValue());
                break;
            case BROADCAST_RECEIVER:
                appComponentsStatistics.setNumberOfBroadcastReceiversObtainedNonZero(size);
                appComponentsStatistics.setNumberOfBroadcastReceiversArithmeticMeanNonZero(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfBroadcastReceiversMedianNonZero(median.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversModusNonZero(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfBroadcastReceiversMinNonZero(minimum.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversMaxNonZero(maximum.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversVarianceNonZero(variance.intValue());
                appComponentsStatistics.setNumberOfBroadcastReceiversDeviationNonZero(deviation.intValue());
                break;
            case CONTENT_PROVIDER:
                appComponentsStatistics.setNumberOfContentProvidersObtainedNonZero(size);
                appComponentsStatistics.setNumberOfContentProvidersArithmeticMeanNonZero(new BigDecimal(mean));
                appComponentsStatistics.setNumberOfContentProvidersMedianNonZero(median.intValue());
                appComponentsStatistics.setNumberOfContentProvidersModusNonZero(ConversionHelper.toIntegerList(modus));
                appComponentsStatistics.setNumberOfContentProvidersMinNonZero(minimum.intValue());
                appComponentsStatistics.setNumberOfContentProvidersMaxNonZero(maximum.intValue());
                appComponentsStatistics.setNumberOfContentProvidersVarianceNonZero(variance.intValue());
                appComponentsStatistics.setNumberOfContentProvidersDeviationNonZero(deviation.intValue());
                break;
        }
        logger.info("Finished processing " + type.toString());
    }

    private Double getValue(Type type, AndroidManifestData data) {

        Integer value = null;

        switch (type) {
            case ACTIVITY:
                value = data.getNumberOfActivities();
                break;
            case SERVICE:
                value = data.getNumberOfServices();
                break;
            case BROADCAST_RECEIVER:
                value = data.getNumberOfBroadcastReceivers();
                break;
            case CONTENT_PROVIDER:
                value = data.getNumberOfContentProviders();
                break;
        }
        return value == null ? null : value.doubleValue();
    }
}
