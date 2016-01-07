package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class MetadataPairCompare {
    private ApkData apkDataA;
    private ApkData apkDataB;
    private MetadataCompareResult result;

    public MetadataPairCompare(ApkData apkDataA, ApkData apkDataB) {
        if (apkDataA == null) {
            throw new IllegalArgumentException("apkDataA");
        }
        if (apkDataB == null) {
            throw new IllegalArgumentException("apkDataB");
        }

        this.apkDataA = apkDataA;
        this.apkDataB = apkDataB;
    }

    public MetadataCompareResult basicCompare() {

        result = new MetadataCompareResult();


        return result;
    }

    public MetadataCompareResult fullCompare() {
        result = new MetadataCompareResult();

        compareFileSize();
        compareDexSize();
        compareArscSize();

        if (apkDataB.getAndroidManifest() != null && apkDataA.getAndroidManifest() != null) {
            comparePackageName();
            compareVersionCode();
            compareInstallLocation();
            compareUsedMinSdks();
            compareUsedMaxSdks();
            compareUsedTargetSdks();
            compareSupportsScreensResizeable();
            compareSupportsScreensAnyDensity();
            compareSupportsScreensXLarge();
            compareSupportsScreensLarge();
            compareSupportsScreensNormal();
            compareSupportsScreensSmall();
            compareActivities();
            compareServices();
            compareProviders();
            compareReceivers();
            compareLibraries();
            compareFeatures();
            comparePermission();
        }

        if(apkDataA.getCertificateDatas().size() > 0 && apkDataB.getCertificateDatas().size() > 0 ){
            compareCertificateSignAlgorithm();
            compareCertificateStartDate();
            compareCertificateEndDate();
            compareCertificatePublicKey();
            compareCertificate();
            compareCertificateVersion();
            compareCertificateIssuer();
            compareCertificateSubject();
        }


        return result;
    }

    private void compareFileSize() {
        if (apkDataA.getFileSize() == null || apkDataB.getFileSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getFileSize() - apkDataA.getFileSize();
        result.setFileSizeDifference(diffSize);
        result.setFileSizeDifferencePercentage(getPercentage(apkDataA.getFileSize(), diffSize));
    }

    private void compareDexSize() {
        if (apkDataA.getDexSize() == null || apkDataB.getDexSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getDexSize() - apkDataA.getDexSize();
        result.setDexSizeDifference(diffSize);
        result.setDexSizeDifferencePercentage(getPercentage(apkDataA.getDexSize(), diffSize));
    }

    private void compareArscSize() {
        if (apkDataA.getArscSize() == null || apkDataB.getArscSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getArscSize() - apkDataA.getArscSize();
        result.setArscSizeDifference(diffSize);
        result.setArscSizeDifferencePercentage(getPercentage(apkDataA.getArscSize() + apkDataA.getArscSize(), diffSize));
    }

    private void comparePackageName() {
        String nameA = apkDataA.getAndroidManifest().getPackageName();
        String nameB = apkDataB.getAndroidManifest().getPackageName();

        if (nameA == null || nameB == null)
            return;
        ;

        boolean isSame = nameA.equals(nameB);
        result.setPackageNameSame(isSame);
        if (!isSame) {
            result.setPackageNameDifference(getDifferenceString(nameA, nameB));
        }
    }

    private void compareVersionCode() {
        String valueA = apkDataA.getAndroidManifest().getVersionCode();
        String valueB = apkDataB.getAndroidManifest().getVersionCode();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setVersionCodeSame(isSame);
        if (!isSame) {
            result.setVersionCodeDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareInstallLocation() {
        String valueA = apkDataA.getAndroidManifest().getInstallLocation();
        String valueB = apkDataB.getAndroidManifest().getInstallLocation();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setInstallLocationSame(isSame);
        if (!isSame) {
            result.setInstallLocationDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareUsedMinSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesMinSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesMinSdkVersion();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setUsesMinSdkVersionSame(isSame);
        if (!isSame) {
            result.setUsesMinSdkVersionDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareUsedTargetSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesTargetSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesTargetSdkVersion();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setUsesTargetSdkVersionSame(isSame);
        if (!isSame) {
            result.setUsesTargetSdkVersionDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareUsedMaxSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesMaxSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesMaxSdkVersion();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setUsesMaxSdkVersionSame(isSame);
        if (!isSame) {
            result.setUsesMaxSdkVersionDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensResizeable() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensResizeable();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensResizeable();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensResizeableSame(isSame);
        if (!isSame) {
            result.setSupportsScreensResizeableDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensSmall() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensSmall();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensSmall();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensSmallSame(isSame);
        if (!isSame) {
            result.setSupportsScreensSmallDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensNormal() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensNormal();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensNormal();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensNormalSame(isSame);
        if (!isSame) {
            result.setSupportsScreensNormalDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensLarge() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensLarge();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensLarge();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensLargeSame(isSame);
        if (!isSame) {
            result.setSupportsScreensLargeDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensXLarge() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensXlarge();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensXlarge();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensXLargeSame(isSame);
        if (!isSame) {
            result.setSupportsScreensXLargeDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareSupportsScreensAnyDensity() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensAnyDensity();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensAnyDensity();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setSupportsScreensAnyDansitySame(isSame);
        if (!isSame) {
            result.setSupportsScreensAnyDensityDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareActivities() {
        Integer valueA = apkDataA.getAndroidManifest().getNumberOfActivities();
        Integer valueB = apkDataB.getAndroidManifest().getNumberOfActivities();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfActivitiesDifference(difference);
        //result.setNumberOfActivitiesDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesOfActivitiesA = new ArrayList<String>(apkDataA.getAndroidManifest().getNamesOfActivities());
        List<String> namesOfActivitiesB = new ArrayList<String>(apkDataB.getAndroidManifest().getNamesOfActivities());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesOfActivitiesA, namesOfActivitiesB, additionalInA, additionalInB);
        result.setAdditionalActivitiesInA(additionalInA);
        result.setAdditionalActivitiesInB(additionalInB);
    }

    private void compareServices() {
        Integer valueA = apkDataA.getAndroidManifest().getNumberOfServices();
        Integer valueB = apkDataB.getAndroidManifest().getNumberOfServices();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfServicesDifference(difference);
        //result.setNumberOfServicesDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesOfServicesA = new ArrayList<String>(apkDataA.getAndroidManifest().getNamesOfServices());
        List<String> namesOfServicesB = new ArrayList<String>(apkDataB.getAndroidManifest().getNamesOfServices());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesOfServicesA, namesOfServicesB, additionalInA, additionalInB);
        result.setAdditionalServicesInA(additionalInA);
        result.setAdditionalServicesInB(additionalInB);
    }

    private void compareProviders() {
        Integer valueA = apkDataA.getAndroidManifest().getNumberOfContentProviders();
        Integer valueB = apkDataB.getAndroidManifest().getNumberOfContentProviders();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfContentProvidersDifference(difference);
        //  result.setNumberOfContentProvidersDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getNamesOfContentProviders());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getNamesOfContentProviders());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalContentProvidersInA(additionalInA);
        result.setAdditionalContentProvidersInB(additionalInB);
    }

    private void compareReceivers() {
        Integer valueA = apkDataA.getAndroidManifest().getNumberOfBroadcastReceivers();
        Integer valueB = apkDataB.getAndroidManifest().getNumberOfBroadcastReceivers();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfBroadcastReceiversDifference(difference);
        //  result.setNumberOfBroadcastReceiversDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getNamesOfBroadcastReceivers());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getNamesOfBroadcastReceivers());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalBroadcastReceiversInA(additionalInA);
        result.setAdditionalBroadcastReceiversInA(additionalInB);
    }

    private void comparePermission() {
        Integer valueA = apkDataA.getAndroidManifest().getUsesPermissions().size();
        Integer valueB = apkDataB.getAndroidManifest().getUsesPermissions().size();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfPermissionsDifference(difference);
       // result.setNumberOfPermissionsDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getUsesPermissions());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getUsesPermissions());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalPermissionsInA(additionalInA);
        result.setAdditionalPermissionsInB(additionalInB);
    }

    private void compareLibraries() {
        Integer valueA = apkDataA.getAndroidManifest().getUsesLibrary().size();
        Integer valueB = apkDataB.getAndroidManifest().getUsesLibrary().size();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfLibrariesDifference(difference);
        // result.setNumberOfLibrariesDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getUsesLibrary());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getUsesLibrary());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalLibrariesInA(additionalInA);
        result.setAdditionalLibrariesInB(additionalInB);
    }

    private void compareFeatures() {
        Integer valueA = apkDataA.getAndroidManifest().getUsesFeature().size();
        Integer valueB = apkDataB.getAndroidManifest().getUsesFeature().size();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfFeaturesDifference(difference);
        // result.setNumberOfFeaturesDifferencePercentage(getPercentage());

        if(difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getUsesFeature());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getUsesFeature());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalFeaturesInA(additionalInA);
        result.setAdditionalFeaturesInB(additionalInB);
    }

    private void compareCertificateSignAlgorithm(){
        String valueA = apkDataA.getCertificateDatas().get(0).getSignAlgorithm();
        String valueB = apkDataB.getCertificateDatas().get(0).getSignAlgorithm();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateSignAlgorithmSame(isSame);
        if (!isSame) {
            result.setCertificateSignAlgorithmDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareCertificateStartDate(){
        Date valueA = apkDataA.getCertificateDatas().get(0).getStartDate();
        Date valueB = apkDataB.getCertificateDatas().get(0).getStartDate();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateStartDateSame(isSame);
        if (!isSame) {
            result.setCertificateStartDateDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareCertificateEndDate(){
        Date valueA = apkDataA.getCertificateDatas().get(0).getEndDate();
        Date valueB = apkDataB.getCertificateDatas().get(0).getEndDate();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateEndDateSame(isSame);
        if (!isSame) {
            result.setCertificateEndDateDifference(getDifferenceString(valueA, valueB));
        }
    }
    private void compareCertificatePublicKey(){
        String valueA = apkDataA.getCertificateDatas().get(0).getPublicKeyMd5();
        String valueB = apkDataB.getCertificateDatas().get(0).getPublicKeyMd5();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificatePublicKeySame(isSame);
    }

    private void compareCertificate(){
        String valueA = apkDataA.getCertificateDatas().get(0).getCertMd5();
        String valueB = apkDataB.getCertificateDatas().get(0).getCertMd5();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateSame(isSame);
    }

    private void compareCertificateVersion(){
        Integer valueA = apkDataA.getCertificateDatas().get(0).getVersion();
        Integer valueB = apkDataB.getCertificateDatas().get(0).getVersion();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateVersionSame(isSame);
        if (!isSame) {
            result.setCertificateVersionDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareCertificateIssuer(){
        String valueA = apkDataA.getCertificateDatas().get(0).getIssuerName();
        String valueB = apkDataB.getCertificateDatas().get(0).getIssuerName();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateIssuerNameSame(isSame);
        if (!isSame) {
            result.setCertificateIssuerNameDifference(getDifferenceString(valueA, valueB));
        }
    }

    private void compareCertificateSubject(){
        String valueA = apkDataA.getCertificateDatas().get(0).getSubjectName();
        String valueB = apkDataB.getCertificateDatas().get(0).getSubjectName();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateSubjectNameSame(isSame);
        if (!isSame) {
            result.setCertificateSubjectNameDifference(getDifferenceString(valueA, valueB));
        }
    }

    private <X> void compareLists(List<X> inputA, List<X> inputB, List<X> additionalA, List<X> additionalB) {

        if(inputA== null || inputB == null){
            return;
        }

        additionalA.addAll(inputA);
        additionalB.addAll(inputB);

        for (X value : inputA) {
            if (inputB.contains(value)) {
                additionalA.remove(value);
                additionalB.remove(value);
            }
        }
    }

    private Integer getPercentage(long full, long part) {
        Long l = Math.round(part * 100.0 / full);
        return l.intValue();
    }

    private String getDifferenceString(Object valueA, Object valueB) {
        return "Apk A : " + valueA.toString() + " ; Apk B : " + valueB.toString();
    }

}
