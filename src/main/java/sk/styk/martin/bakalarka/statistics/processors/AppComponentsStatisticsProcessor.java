package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.AppComponentsStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.data.RecordPair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 19.01.2016.
 */
public class AppComponentsStatisticsProcessor extends TopValueProcessorBase {

    private static final Logger logger = LoggerFactory.getLogger(AppComponentsStatisticsProcessor.class);
    private List<File> jsons;
    private AppComponentsStatistics appComponentsStatistics;

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

        requestMaxValues(Type.ACTIVITY);
        requestMaxValues(Type.BROADCAST_RECEIVER);
        requestMaxValues(Type.CONTENT_PROVIDER);
        requestMaxValues(Type.SERVICE);

        RecordPair activityRecordPair = null;
        RecordPair receiverRecordPair = null;
        RecordPair providerRecordPair = null;
        RecordPair serviceRecordPair = null;

        int manifestFound = 0;
        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            logger.trace("Processing " + f.getName());

            ApkData data = JsonUtils.fromJson(f,ApkData.class);
            AndroidManifestData manifestData = null;

            if (data != null && data.getAndroidManifest() != null) {

                manifestData = data.getAndroidManifest();
                manifestFound++;

                Double activityValue = getValue(Type.ACTIVITY, manifestData);
                if (activityValue != null) {
                    activityList.add(activityValue);
                    if (activityValue != 0) {
                        activityListNonZero.add(activityValue);
                    }
                    activityRecordPair = processMaxExtreme(Type.ACTIVITY, activityValue.longValue(), data.getFileName());
                }

                Double serviceValue = getValue(Type.SERVICE, manifestData);
                if (serviceValue != null) {
                    serviceList.add(serviceValue);
                    if (serviceValue != 0) {
                        serviceListNonZero.add(serviceValue);
                    }
                    serviceRecordPair = processMaxExtreme(Type.SERVICE, serviceValue.longValue(), data.getFileName());
                }

                Double providerValue = getValue(Type.CONTENT_PROVIDER, manifestData);
                if (providerValue != null) {
                    providerList.add(providerValue);
                    if (providerValue != 0) {
                        providerListNonZero.add(providerValue);
                    }
                    providerRecordPair = processMaxExtreme(Type.CONTENT_PROVIDER, providerValue.longValue(), data.getFileName());
                }

                Double receiverValue = getValue(Type.BROADCAST_RECEIVER, manifestData);
                if (receiverValue != null) {
                    receiverList.add(receiverValue);
                    if (receiverValue != 0) {
                        receiverListNonZero.add(receiverValue);
                    }
                    receiverRecordPair = processMaxExtreme(Type.BROADCAST_RECEIVER, receiverValue.longValue(), data.getFileName());
                }
            }
        }

        appComponentsStatistics.setAnalyzedApks(manifestFound);
        setValues(Type.ACTIVITY, ConversionHelper.toDoubleArray(activityList), new PercentagePair(activityList.size(), manifestFound), activityRecordPair);
        setValues(Type.SERVICE, ConversionHelper.toDoubleArray(serviceList), new PercentagePair(serviceList.size(), manifestFound), serviceRecordPair);
        setValues(Type.CONTENT_PROVIDER, ConversionHelper.toDoubleArray(providerList), new PercentagePair(providerList.size(), manifestFound), providerRecordPair);
        setValues(Type.BROADCAST_RECEIVER, ConversionHelper.toDoubleArray(receiverList), new PercentagePair(receiverList.size(), manifestFound), receiverRecordPair);

        setValues(Type.ACTIVITY_NONZERO, ConversionHelper.toDoubleArray(activityListNonZero), new PercentagePair(activityListNonZero.size(), manifestFound), activityRecordPair);
        setValues(Type.SERVICE_NONZERO, ConversionHelper.toDoubleArray(serviceListNonZero), new PercentagePair(serviceListNonZero.size(), manifestFound), serviceRecordPair);
        setValues(Type.CONTENT_PROVIDER_NONZERO, ConversionHelper.toDoubleArray(providerListNonZero), new PercentagePair(providerListNonZero.size(), manifestFound), providerRecordPair);
        setValues(Type.BROADCAST_RECEIVER_NONZERO, ConversionHelper.toDoubleArray(receiverListNonZero), new PercentagePair(receiverListNonZero.size(), manifestFound), receiverRecordPair);

        return appComponentsStatistics;

    }

    private void setValues(Type type, double[] array, PercentagePair size, RecordPair maxValue) {
        if (appComponentsStatistics == null) {
            throw new NullPointerException("appComponentsStatistics");
        }

        logger.info("Started processing " + type.toString());

        //computing only maximum
        MathStatistics mathStatistics = new MathStatistics(size, array, null, maxValue);

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
}
