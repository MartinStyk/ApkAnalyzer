package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.compare.data.AttributeComparisonResult;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
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
    private boolean isBasicCompared = false;

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

    protected static BigDecimal getPercentage(long valueA, long valueB) {
        Long difference = valueB - valueA;

        Long bigger = valueA > valueB ? valueA : valueB;

        if (valueA == valueB) {
            return new BigDecimal(0);
        }
        if (bigger == 0) {
            return null;
        }

        Double result = Math.abs(100 * difference.doubleValue() / bigger.doubleValue());
        return new BigDecimal(result);
    }

    public MetadataCompareResult basicCompare() {

        result = new MetadataCompareResult();

        compareFileSize();

        if (apkDataB.getAndroidManifest() != null && apkDataA.getAndroidManifest() != null) {
            compareActivities();
            compareServices();
            compareProviders();
            compareReceivers();
            compareVersionCode();
        }

        if (apkDataA.getResourceData() != null && apkDataB.getResourceData() != null) {
            compareNumberOfDifferentDrawables();
            compareNumberOfDifferentLayoutResources();
        }
        if (apkDataA.getCertificateDatas().size() > 0 && apkDataB.getCertificateDatas().size() > 0) {
            compareCertificate();
        }

        isBasicCompared = true;
        return result;
    }

    public MetadataCompareResult fullCompare() {
        if (!isBasicCompared)
            result = basicCompare();

        compareDexSize();
        compareArscSize();

        if (apkDataB.getAndroidManifest() != null && apkDataA.getAndroidManifest() != null) {
            comparePackageName();
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
            compareLibraries();
            compareFeatures();
            comparePermission();
            compareDefinedPermissions();
        }

        if (apkDataA.getCertificateDatas().size() > 0 && apkDataB.getCertificateDatas().size() > 0) {
            compareCertificateSignAlgorithm();
            compareCertificateStartDate();
            compareCertificateEndDate();
            compareCertificatePublicKey();
            compareCertificateVersion();
            compareCertificateIssuer();
            compareCertificateSubject();
        }

        if (apkDataA.getResourceData() != null && apkDataB.getResourceData() != null) {
            compareLocales();
            compareNumberOfStringResources();
            compareNumberOfXmlDrawables();
            compareNumberOfJpgDrawables();
            compareNumberOfPngDrawables();
            compareNumberOfGifDrawables();
            compareNumberOfNinePatchDrawables();
            compareNumberOfLdpiDrawables();
            compareNumberOfMdpiDrawables();
            compareNumberOfHdpiDrawables();
            compareNumberOfXhdpiDrawables();
            compareNumberOfXxhdpiDrawables();
            compareNumberOfXxxhdpiDrawables();
            compareNumberOfTvdpiDrawables();
            compareNumberOfNodpiDrawables();
            compareNumberOfUnspecifiedDpiDrawables();
            compareNumberOfLayoutResources();
            compareNumberOfMenuResources();
            compareNumberOfRawResources();
        }

        return result;
    }

    private void compareFileSize() {
        if (apkDataA.getFileSize() == null || apkDataB.getFileSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getFileSize() - apkDataA.getFileSize();
        result.setFileSizeDifference(new PercentagePair(diffSize, getPercentage(apkDataA.getFileSize(), apkDataB.getFileSize())));
    }

    private void compareDexSize() {
        if (apkDataA.getDexSize() == null || apkDataB.getDexSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getDexSize() - apkDataA.getDexSize();
        result.setDexSizeDifference(new PercentagePair(diffSize, getPercentage(apkDataA.getDexSize(), apkDataB.getDexSize())));
    }

    private void compareArscSize() {
        if (apkDataA.getArscSize() == null || apkDataB.getArscSize() == null) {
            return;
        }
        Long diffSize = apkDataB.getArscSize() - apkDataA.getArscSize();
        result.setArscSizeDifference(new PercentagePair(diffSize, getPercentage(apkDataA.getArscSize(), apkDataB.getArscSize())));
    }

    private void comparePackageName() {
        String nameA = apkDataA.getAndroidManifest().getPackageName();
        String nameB = apkDataB.getAndroidManifest().getPackageName();

        if (nameA == null || nameB == null)
            return;

        result.setPackageName(new AttributeComparisonResult(nameA, nameB));
    }

    private void compareVersionCode() {
        String valueA = apkDataA.getAndroidManifest().getVersionCode();
        String valueB = apkDataB.getAndroidManifest().getVersionCode();

        if (valueA == null || valueB == null)
            return;

        result.setVersionCode(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareInstallLocation() {
        String valueA = apkDataA.getAndroidManifest().getInstallLocation();
        String valueB = apkDataB.getAndroidManifest().getInstallLocation();

        if (valueA == null || valueB == null)
            return;

        result.setInstallLocation(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareUsedMinSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesMinSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesMinSdkVersion();

        if (valueA == null || valueB == null)
            return;

        result.setUsesMinSdkVersion(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareUsedTargetSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesTargetSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesTargetSdkVersion();

        if (valueA == null || valueB == null)
            return;

        result.setUsesTargetSdkVersion(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareUsedMaxSdks() {
        String valueA = apkDataA.getAndroidManifest().getUsesMaxSdkVersion();
        String valueB = apkDataB.getAndroidManifest().getUsesMaxSdkVersion();

        if (valueA == null || valueB == null)
            return;

        result.setUsesMaxSdkVersion(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensResizeable() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensResizeable();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensResizeable();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensResizeable(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensSmall() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensSmall();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensSmall();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensSmall(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensNormal() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensNormal();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensNormal();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensNormal(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensLarge() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensLarge();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensLarge();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensLarge(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensXLarge() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensXlarge();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensXlarge();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensXlarge(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareSupportsScreensAnyDensity() {
        Boolean valueA = apkDataA.getAndroidManifest().getSupportsScreensAnyDensity();
        Boolean valueB = apkDataB.getAndroidManifest().getSupportsScreensAnyDensity();

        if (valueA == null || valueB == null)
            return;

        result.setSupportsScreensAnyDensity(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareActivities() {
        Integer valueA = apkDataA.getAndroidManifest().getNumberOfActivities();
        Integer valueB = apkDataB.getAndroidManifest().getNumberOfActivities();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfActivitiesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfServicesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfContentProvidersDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfBroadcastReceiversDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfPermissionsDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfLibrariesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

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
        result.setNumberOfFeaturesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getUsesFeature());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getUsesFeature());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalFeaturesInA(additionalInA);
        result.setAdditionalFeaturesInB(additionalInB);
    }

    private void compareDefinedPermissions() {
        Integer valueA = apkDataA.getAndroidManifest().getPermissions().size();
        Integer valueB = apkDataB.getAndroidManifest().getPermissions().size();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB - valueA;
        result.setNumberOfDefinedPermissionsDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));

        if (difference == 0) return;

        List<String> namesInA = new ArrayList<String>(apkDataA.getAndroidManifest().getPermissions());
        List<String> namesInB = new ArrayList<String>(apkDataB.getAndroidManifest().getPermissions());
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalDefinedPermissionsInA(additionalInA);
        result.setAdditionalDefinedPermissionsInB(additionalInB);
    }

    private void compareCertificateSignAlgorithm() {
        String valueA = apkDataA.getCertificateDatas().get(0).getSignAlgorithm();
        String valueB = apkDataB.getCertificateDatas().get(0).getSignAlgorithm();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateSignAlgorithmSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareCertificateStartDate() {
        Date valueA = apkDataA.getCertificateDatas().get(0).getStartDate();
        Date valueB = apkDataB.getCertificateDatas().get(0).getStartDate();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateStartDateSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareCertificateEndDate() {
        Date valueA = apkDataA.getCertificateDatas().get(0).getEndDate();
        Date valueB = apkDataB.getCertificateDatas().get(0).getEndDate();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateEndDateSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareCertificatePublicKey() {
        String valueA = apkDataA.getCertificateDatas().get(0).getPublicKeyMd5();
        String valueB = apkDataB.getCertificateDatas().get(0).getPublicKeyMd5();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificatePublicKeySame(isSame);
    }

    private void compareCertificate() {
        String valueA = apkDataA.getCertificateDatas().get(0).getCertMd5();
        String valueB = apkDataB.getCertificateDatas().get(0).getCertMd5();

        if (valueA == null || valueB == null)
            return;

        boolean isSame = valueA.equals(valueB);
        result.setCertificateSame(isSame);
    }

    private void compareCertificateVersion() {
        Integer valueA = apkDataA.getCertificateDatas().get(0).getVersion();
        Integer valueB = apkDataB.getCertificateDatas().get(0).getVersion();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateVersionSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareCertificateIssuer() {
        String valueA = apkDataA.getCertificateDatas().get(0).getIssuerName();
        String valueB = apkDataB.getCertificateDatas().get(0).getIssuerName();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateIssuerNameSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareCertificateSubject() {
        String valueA = apkDataA.getCertificateDatas().get(0).getSubjectName();
        String valueB = apkDataB.getCertificateDatas().get(0).getSubjectName();

        if (valueA == null || valueB == null)
            return;

        result.setCertificateSubjectNameSame(new AttributeComparisonResult(valueA, valueB));
    }

    private void compareLocales() {
        List<String> valueA = apkDataA.getResourceData().getLocale();
        List<String> valueB = apkDataB.getResourceData().getLocale();

        if (valueA == null || valueB == null)
            return;

        Integer difference = valueB.size() - valueA.size();
        result.setNumberOfLocalesDifference(new PercentagePair(difference, getPercentage(valueA.size(), valueB.size())));

        if (difference == 0) return;

        List<String> namesInA = new ArrayList<String>(valueA);
        List<String> namesInB = new ArrayList<String>(valueB);
        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        compareLists(namesInA, namesInB, additionalInA, additionalInB);
        result.setAdditionalLocalesInA(additionalInA);
        result.setAdditionalLocalesInB(additionalInB);
    }

    private void compareNumberOfStringResources() {
        Integer valueA = apkDataA.getResourceData().getNumberOfStringResource();
        Integer valueB = apkDataB.getResourceData().getNumberOfStringResource();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfStringResourceDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfPngDrawables() {
        Integer valueA = apkDataA.getResourceData().getPngDrawables();
        Integer valueB = apkDataB.getResourceData().getPngDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfPngDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfJpgDrawables() {
        Integer valueA = apkDataA.getResourceData().getJpgDrawables();
        Integer valueB = apkDataB.getResourceData().getJpgDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfJpgDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfGifDrawables() {
        Integer valueA = apkDataA.getResourceData().getGifDrawables();
        Integer valueB = apkDataB.getResourceData().getGifDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfGifDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }
    private void compareNumberOfNinePatchDrawables() {
        Integer valueA = apkDataA.getResourceData().getNinePatchDrawables();
        Integer valueB = apkDataB.getResourceData().getNinePatchDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfNinePatchDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfXmlDrawables() {
        Integer valueA = apkDataA.getResourceData().getXmlDrawables();
        Integer valueB = apkDataB.getResourceData().getXmlDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfXmlDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfLdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getLdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getLdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfLdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfMdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getMdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getMdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfMdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfHdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getHdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getHdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfHdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfXhdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getXhdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getXhdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfXhdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfXxhdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getXxhdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getXxhdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfXxhdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfXxxhdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getXxxhdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getXxxhdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfXxxhdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfUnspecifiedDpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getUnspecifiedDpiDrawables();
        Integer valueB = apkDataB.getResourceData().getUnspecifiedDpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfUnspecifiedDpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfNodpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getNodpiDrawables();
        Integer valueB = apkDataB.getResourceData().getNodpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfNodpihdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfTvdpiDrawables() {
        Integer valueA = apkDataA.getResourceData().getTvdpiDrawables();
        Integer valueB = apkDataB.getResourceData().getTvdpiDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfTvdpiDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfRawResources() {
        Integer valueA = apkDataA.getResourceData().getRawResources();
        Integer valueB = apkDataB.getResourceData().getRawResources();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfRawResourcesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfMenuResources() {
        Integer valueA = apkDataA.getResourceData().getMenu();
        Integer valueB = apkDataB.getResourceData().getMenu();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfMenusDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfLayoutResources() {
        Integer valueA = apkDataA.getResourceData().getLayouts();
        Integer valueB = apkDataB.getResourceData().getLayouts();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfLayoutsDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfDifferentLayoutResources() {
        Integer valueA = apkDataA.getResourceData().getDifferentLayouts();
        Integer valueB = apkDataB.getResourceData().getDifferentLayouts();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfDifferentLayoutsDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private void compareNumberOfDifferentDrawables() {
        Integer valueA = apkDataA.getResourceData().getDifferentDrawables();
        Integer valueB = apkDataB.getResourceData().getDifferentDrawables();

        if (valueA == null || valueB == null)
            return;

        int difference = valueB - valueA;
        result.setNumberOfDifferentDrawablesDifference(new PercentagePair(difference, getPercentage(valueA, valueB)));
    }

    private <X> void compareLists(List<X> inputA, List<X> inputB, List<X> additionalA, List<X> additionalB) {

        if (inputA == null || inputB == null) {
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

    private String getDifferenceString(Object valueA, Object valueB) {
        return "Apk A : " + valueA.toString() + " ; Apk B : " + valueB.toString();
    }

}
