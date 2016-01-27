package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;
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
        CONTENT_PROVIDER,
        ACTIVITY_NONZERO,
        SERVICE_NONZERO,
        BROADCAST_RECEIVER_NONZERO,
        CONTENT_PROVIDER_NONZERO,
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
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
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
        setValues(Type.ACTIVITY, ConversionHelper.toDoubleArray(activityList),new PercentagePair(activityList.size(),manifestFound));
        setValues(Type.SERVICE, ConversionHelper.toDoubleArray(serviceList),new PercentagePair(serviceList.size(),manifestFound));
        setValues(Type.CONTENT_PROVIDER, ConversionHelper.toDoubleArray(providerList),new PercentagePair(providerList.size(),manifestFound));
        setValues(Type.BROADCAST_RECEIVER, ConversionHelper.toDoubleArray(receiverList),new PercentagePair(receiverList.size(),manifestFound));

        setValues(Type.ACTIVITY_NONZERO, ConversionHelper.toDoubleArray(activityListNonZero), new PercentagePair(activityListNonZero.size(),manifestFound));
        setValues(Type.SERVICE_NONZERO, ConversionHelper.toDoubleArray(serviceListNonZero), new PercentagePair(serviceListNonZero.size(),manifestFound));
        setValues(Type.CONTENT_PROVIDER_NONZERO, ConversionHelper.toDoubleArray(providerListNonZero), new PercentagePair(providerListNonZero.size(),manifestFound));
        setValues(Type.BROADCAST_RECEIVER_NONZERO, ConversionHelper.toDoubleArray(receiverListNonZero), new PercentagePair(receiverListNonZero.size(),manifestFound));

        return appComponentsStatistics;

    }


    private void setValues(Type type, double[] array, PercentagePair size) {
        if (appComponentsStatistics == null) {
            throw new NullPointerException("appComponentsStatistics");
        }

        logger.info("Started processing " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(size,array);

        switch (type) {
            case ACTIVITY:
                appComponentsStatistics.setActivities(mathStatistics);
                break;
            case SERVICE:
                appComponentsStatistics.setServices(mathStatistics);
                break;
            case BROADCAST_RECEIVER:
                appComponentsStatistics.setBroadcastReceivers(mathStatistics);
                break;
            case CONTENT_PROVIDER:
                appComponentsStatistics.setContentProviders(mathStatistics);
                break;
            case ACTIVITY_NONZERO:
                appComponentsStatistics.setActivitiesNonZero(mathStatistics);
                break;
            case SERVICE_NONZERO:
                appComponentsStatistics.setServicesNonZero(mathStatistics);
                break;
            case BROADCAST_RECEIVER_NONZERO:
                appComponentsStatistics.setBroadcastReceiversNonZero(mathStatistics);
                break;
            case CONTENT_PROVIDER_NONZERO:
                appComponentsStatistics.setContentProvidersNonZero(mathStatistics);
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
