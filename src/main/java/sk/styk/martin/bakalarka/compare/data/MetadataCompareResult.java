package sk.styk.martin.bakalarka.compare.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.List;

/**
 * Everything relates to first APK
 * if difference is +5, then A+5=B
 * <p/>
 * difference percentage means difference is x% of larger
 * <p/>
 * Created by Martin Styk on 06.01.2016.
 */
public class MetadataCompareResult {

    //file size
    private PercentagePair fileSizeDifference;

    private PercentagePair dexSizeDifference;

    private PercentagePair arscSizeDifference;


    //manifest

    private Boolean isPackageNameSame;
    private String packageNameDifference;

    private Boolean isVersionCodeSame;
    private String versionCodeDifference;

    private Boolean isInstallLocationSame;
    private String installLocationDifference;

    private Boolean isUsesMinSdkVersionSame;
    private String usesMinSdkVersionDifference;

    private Boolean isUsesTargetSdkVersionSame;
    private String usesTargetSdkVersionDifference;

    private Boolean isUsesMaxSdkVersionSame;
    private String usesMaxSdkVersionDifference;

    private Boolean isSupportsScreensResizeableSame;
    private String supportsScreensResizeableDifference;

    private Boolean isSupportsScreensSmallSame;
    private String supportsScreensSmallDifference;

    private Boolean isSupportsScreensNormalSame;
    private String supportsScreensNormalDifference;

    private Boolean isSupportsScreensLargeSame;
    private String supportsScreensLargeDifference;

    private Boolean isSupportsScreensXLargeSame;
    private String supportsScreensXLargeDifference;

    private Boolean isSupportsScreensAnyDansitySame;
    private String supportsScreensAnyDensityDifference;

    private PercentagePair numberOfActivitiesDifference;
    private List<String> additionalActivitiesInA;
    private List<String> additionalActivitiesInB;

    private PercentagePair numberOfServicesDifference;
    private List<String> additionalServicesInA;
    private List<String> additionalServicesInB;

    private PercentagePair numberOfContentProvidersDifference;
    private List<String> additionalContentProvidersInA;
    private List<String> additionalContentProvidersInB;

    private PercentagePair numberOfBroadcastReceiversDifference;
    private List<String> additionalBroadcastReceiversInA;
    private List<String> additionalBroadcastReceiversInB;

    private PercentagePair numberOfPermissionsDifference;
    private List<String> additionalPermissionsInA;
    private List<String> additionalPermissionsInB;

    private PercentagePair numberOfLibrariesDifference;
    private List<String> additionalLibrariesInA;
    private List<String> additionalLibrariesInB;

    private PercentagePair numberOfFeaturesDifference;
    private List<String> additionalFeaturesInA;
    private List<String> additionalFeaturesInB;


    //certificate
    private Boolean isCertificateSignAlgorithmSame;
    private String certificateSignAlgorithmDifference;

    private Boolean isCertificateStartDateSame;
    private String certificateStartDateDifference;

    private Boolean isCertificateEndDateSame;
    private String certificateEndDateDifference;

    private Boolean isCertificatePublicKeySame;

    private Boolean isCertificateSame;

    private Boolean isCertificateVersionSame;
    private String certificateVersionDifference;

    private Boolean isCertificateIssuerNameSame;
    private String certificateIssuerNameDifference;

    private Boolean isCertificateSubjectNameSame;
    private String certificateSubjectNameDifference;


    //resources

    private PercentagePair numberOfLocalesDifference;
    private List<String> additionalLocalesInA;
    private List<String> additionalLocalesInB;

    private PercentagePair numberOfStringResourceDifference;

    private PercentagePair numberOfDifferentDrawablesDifference;

    private PercentagePair numberOfPngDrawablesDifference;

    private PercentagePair numberOfJpgDrawablesDifference;

    private PercentagePair numberOfGifDrawablesDifference;

    private PercentagePair numberOfXmlDrawablesDifference;

    private PercentagePair numberOfLdpiDrawablesDifference;

    private PercentagePair numberOfMdpiDrawablesDifference;

    private PercentagePair numberOfHdpiDrawablesDifference;

    private PercentagePair numberOfXhdpiDrawablesDifference;

    private PercentagePair numberOfXxhdpiDrawablesDifference;

    private PercentagePair numberOfXxxhdpiDrawablesDifference;

    private PercentagePair numberOfUnspecifiedDpiDrawablesDifference;

    private PercentagePair numberOfRawResourcesDifference;

    private PercentagePair numberOfMenusDifference;

    private PercentagePair numberOfLayoutsDifference;

    private PercentagePair numberOfDifferentLayoutsDifference;

    public PercentagePair getFileSizeDifference() {
        return fileSizeDifference;
    }

    public void setFileSizeDifference(PercentagePair fileSizeDifference) {
        this.fileSizeDifference = fileSizeDifference;
    }

    public PercentagePair getDexSizeDifference() {
        return dexSizeDifference;
    }

    public void setDexSizeDifference(PercentagePair dexSizeDifference) {
        this.dexSizeDifference = dexSizeDifference;
    }

    public PercentagePair getArscSizeDifference() {
        return arscSizeDifference;
    }

    public void setArscSizeDifference(PercentagePair arscSizeDifference) {
        this.arscSizeDifference = arscSizeDifference;
    }

    public Boolean getPackageNameSame() {
        return isPackageNameSame;
    }

    public void setPackageNameSame(Boolean packageNameSame) {
        isPackageNameSame = packageNameSame;
    }

    public String getPackageNameDifference() {
        return packageNameDifference;
    }

    public void setPackageNameDifference(String packageNameDifference) {
        this.packageNameDifference = packageNameDifference;
    }

    public Boolean getVersionCodeSame() {
        return isVersionCodeSame;
    }

    public void setVersionCodeSame(Boolean versionCodeSame) {
        isVersionCodeSame = versionCodeSame;
    }

    public String getVersionCodeDifference() {
        return versionCodeDifference;
    }

    public void setVersionCodeDifference(String versionCodeDifference) {
        this.versionCodeDifference = versionCodeDifference;
    }

    public Boolean getInstallLocationSame() {
        return isInstallLocationSame;
    }

    public void setInstallLocationSame(Boolean installLocationSame) {
        isInstallLocationSame = installLocationSame;
    }

    public String getInstallLocationDifference() {
        return installLocationDifference;
    }

    public void setInstallLocationDifference(String installLocationDifference) {
        this.installLocationDifference = installLocationDifference;
    }

    public Boolean getUsesMinSdkVersionSame() {
        return isUsesMinSdkVersionSame;
    }

    public void setUsesMinSdkVersionSame(Boolean usesMinSdkVersionSame) {
        isUsesMinSdkVersionSame = usesMinSdkVersionSame;
    }

    public String getUsesMinSdkVersionDifference() {
        return usesMinSdkVersionDifference;
    }

    public void setUsesMinSdkVersionDifference(String usesMinSdkVersionDifference) {
        this.usesMinSdkVersionDifference = usesMinSdkVersionDifference;
    }

    public Boolean getUsesTargetSdkVersionSame() {
        return isUsesTargetSdkVersionSame;
    }

    public void setUsesTargetSdkVersionSame(Boolean usesTargetSdkVersionSame) {
        isUsesTargetSdkVersionSame = usesTargetSdkVersionSame;
    }

    public String getUsesTargetSdkVersionDifference() {
        return usesTargetSdkVersionDifference;
    }

    public void setUsesTargetSdkVersionDifference(String usesTargetSdkVersionDifference) {
        this.usesTargetSdkVersionDifference = usesTargetSdkVersionDifference;
    }

    public Boolean getUsesMaxSdkVersionSame() {
        return isUsesMaxSdkVersionSame;
    }

    public void setUsesMaxSdkVersionSame(Boolean usesMaxSdkVersionSame) {
        isUsesMaxSdkVersionSame = usesMaxSdkVersionSame;
    }

    public String getUsesMaxSdkVersionDifference() {
        return usesMaxSdkVersionDifference;
    }

    public void setUsesMaxSdkVersionDifference(String usesMaxSdkVersionDifference) {
        this.usesMaxSdkVersionDifference = usesMaxSdkVersionDifference;
    }

    public Boolean getSupportsScreensResizeableSame() {
        return isSupportsScreensResizeableSame;
    }

    public void setSupportsScreensResizeableSame(Boolean supportsScreensResizeableSame) {
        isSupportsScreensResizeableSame = supportsScreensResizeableSame;
    }

    public String getSupportsScreensResizeableDifference() {
        return supportsScreensResizeableDifference;
    }

    public void setSupportsScreensResizeableDifference(String supportsScreensResizeableDifference) {
        this.supportsScreensResizeableDifference = supportsScreensResizeableDifference;
    }

    public Boolean getSupportsScreensSmallSame() {
        return isSupportsScreensSmallSame;
    }

    public void setSupportsScreensSmallSame(Boolean supportsScreensSmallSame) {
        isSupportsScreensSmallSame = supportsScreensSmallSame;
    }

    public String getSupportsScreensSmallDifference() {
        return supportsScreensSmallDifference;
    }

    public void setSupportsScreensSmallDifference(String supportsScreensSmallDifference) {
        this.supportsScreensSmallDifference = supportsScreensSmallDifference;
    }

    public Boolean getSupportsScreensNormalSame() {
        return isSupportsScreensNormalSame;
    }

    public void setSupportsScreensNormalSame(Boolean supportsScreensNormalSame) {
        isSupportsScreensNormalSame = supportsScreensNormalSame;
    }

    public String getSupportsScreensNormalDifference() {
        return supportsScreensNormalDifference;
    }

    public void setSupportsScreensNormalDifference(String supportsScreensNormalDifference) {
        this.supportsScreensNormalDifference = supportsScreensNormalDifference;
    }

    public Boolean getSupportsScreensLargeSame() {
        return isSupportsScreensLargeSame;
    }

    public void setSupportsScreensLargeSame(Boolean supportsScreensLargeSame) {
        isSupportsScreensLargeSame = supportsScreensLargeSame;
    }

    public String getSupportsScreensLargeDifference() {
        return supportsScreensLargeDifference;
    }

    public void setSupportsScreensLargeDifference(String supportsScreensLargeDifference) {
        this.supportsScreensLargeDifference = supportsScreensLargeDifference;
    }

    public Boolean getSupportsScreensXLargeSame() {
        return isSupportsScreensXLargeSame;
    }

    public void setSupportsScreensXLargeSame(Boolean supportsScreensXLargeSame) {
        isSupportsScreensXLargeSame = supportsScreensXLargeSame;
    }

    public String getSupportsScreensXLargeDifference() {
        return supportsScreensXLargeDifference;
    }

    public void setSupportsScreensXLargeDifference(String supportsScreensXLargeDifference) {
        this.supportsScreensXLargeDifference = supportsScreensXLargeDifference;
    }

    public Boolean getSupportsScreensAnyDansitySame() {
        return isSupportsScreensAnyDansitySame;
    }

    public void setSupportsScreensAnyDansitySame(Boolean supportsScreensAnyDansitySame) {
        isSupportsScreensAnyDansitySame = supportsScreensAnyDansitySame;
    }

    public String getSupportsScreensAnyDensityDifference() {
        return supportsScreensAnyDensityDifference;
    }

    public void setSupportsScreensAnyDensityDifference(String supportsScreensAnyDensityDifference) {
        this.supportsScreensAnyDensityDifference = supportsScreensAnyDensityDifference;
    }

    public PercentagePair getNumberOfActivitiesDifference() {
        return numberOfActivitiesDifference;
    }

    public void setNumberOfActivitiesDifference(PercentagePair numberOfActivitiesDifference) {
        this.numberOfActivitiesDifference = numberOfActivitiesDifference;
    }

    public List<String> getAdditionalActivitiesInA() {
        return additionalActivitiesInA;
    }

    public void setAdditionalActivitiesInA(List<String> additionalActivitiesInA) {
        this.additionalActivitiesInA = additionalActivitiesInA;
    }

    public List<String> getAdditionalActivitiesInB() {
        return additionalActivitiesInB;
    }

    public void setAdditionalActivitiesInB(List<String> additionalActivitiesInB) {
        this.additionalActivitiesInB = additionalActivitiesInB;
    }

    public PercentagePair getNumberOfServicesDifference() {
        return numberOfServicesDifference;
    }

    public void setNumberOfServicesDifference(PercentagePair numberOfServicesDifference) {
        this.numberOfServicesDifference = numberOfServicesDifference;
    }

    public List<String> getAdditionalServicesInA() {
        return additionalServicesInA;
    }

    public void setAdditionalServicesInA(List<String> additionalServicesInA) {
        this.additionalServicesInA = additionalServicesInA;
    }

    public List<String> getAdditionalServicesInB() {
        return additionalServicesInB;
    }

    public void setAdditionalServicesInB(List<String> additionalServicesInB) {
        this.additionalServicesInB = additionalServicesInB;
    }

    public PercentagePair getNumberOfContentProvidersDifference() {
        return numberOfContentProvidersDifference;
    }

    public void setNumberOfContentProvidersDifference(PercentagePair numberOfContentProvidersDifference) {
        this.numberOfContentProvidersDifference = numberOfContentProvidersDifference;
    }

    public List<String> getAdditionalContentProvidersInA() {
        return additionalContentProvidersInA;
    }

    public void setAdditionalContentProvidersInA(List<String> additionalContentProvidersInA) {
        this.additionalContentProvidersInA = additionalContentProvidersInA;
    }

    public List<String> getAdditionalContentProvidersInB() {
        return additionalContentProvidersInB;
    }

    public void setAdditionalContentProvidersInB(List<String> additionalContentProvidersInB) {
        this.additionalContentProvidersInB = additionalContentProvidersInB;
    }

    public PercentagePair getNumberOfBroadcastReceiversDifference() {
        return numberOfBroadcastReceiversDifference;
    }

    public void setNumberOfBroadcastReceiversDifference(PercentagePair numberOfBroadcastReceiversDifference) {
        this.numberOfBroadcastReceiversDifference = numberOfBroadcastReceiversDifference;
    }

    public List<String> getAdditionalBroadcastReceiversInA() {
        return additionalBroadcastReceiversInA;
    }

    public void setAdditionalBroadcastReceiversInA(List<String> additionalBroadcastReceiversInA) {
        this.additionalBroadcastReceiversInA = additionalBroadcastReceiversInA;
    }

    public List<String> getAdditionalBroadcastReceiversInB() {
        return additionalBroadcastReceiversInB;
    }

    public void setAdditionalBroadcastReceiversInB(List<String> additionalBroadcastReceiversInB) {
        this.additionalBroadcastReceiversInB = additionalBroadcastReceiversInB;
    }

    public PercentagePair getNumberOfPermissionsDifference() {
        return numberOfPermissionsDifference;
    }

    public void setNumberOfPermissionsDifference(PercentagePair numberOfPermissionsDifference) {
        this.numberOfPermissionsDifference = numberOfPermissionsDifference;
    }

    public List<String> getAdditionalPermissionsInA() {
        return additionalPermissionsInA;
    }

    public void setAdditionalPermissionsInA(List<String> additionalPermissionsInA) {
        this.additionalPermissionsInA = additionalPermissionsInA;
    }

    public List<String> getAdditionalPermissionsInB() {
        return additionalPermissionsInB;
    }

    public void setAdditionalPermissionsInB(List<String> additionalPermissionsInB) {
        this.additionalPermissionsInB = additionalPermissionsInB;
    }

    public PercentagePair getNumberOfLibrariesDifference() {
        return numberOfLibrariesDifference;
    }

    public void setNumberOfLibrariesDifference(PercentagePair numberOfLibrariesDifference) {
        this.numberOfLibrariesDifference = numberOfLibrariesDifference;
    }

    public List<String> getAdditionalLibrariesInA() {
        return additionalLibrariesInA;
    }

    public void setAdditionalLibrariesInA(List<String> additionalLibrariesInA) {
        this.additionalLibrariesInA = additionalLibrariesInA;
    }

    public List<String> getAdditionalLibrariesInB() {
        return additionalLibrariesInB;
    }

    public void setAdditionalLibrariesInB(List<String> additionalLibrariesInB) {
        this.additionalLibrariesInB = additionalLibrariesInB;
    }

    public PercentagePair getNumberOfFeaturesDifference() {
        return numberOfFeaturesDifference;
    }

    public void setNumberOfFeaturesDifference(PercentagePair numberOfFeaturesDifference) {
        this.numberOfFeaturesDifference = numberOfFeaturesDifference;
    }

    public List<String> getAdditionalFeaturesInA() {
        return additionalFeaturesInA;
    }

    public void setAdditionalFeaturesInA(List<String> additionalFeaturesInA) {
        this.additionalFeaturesInA = additionalFeaturesInA;
    }

    public List<String> getAdditionalFeaturesInB() {
        return additionalFeaturesInB;
    }

    public void setAdditionalFeaturesInB(List<String> additionalFeaturesInB) {
        this.additionalFeaturesInB = additionalFeaturesInB;
    }

    public Boolean getCertificateSignAlgorithmSame() {
        return isCertificateSignAlgorithmSame;
    }

    public void setCertificateSignAlgorithmSame(Boolean certificateSignAlgorithmSame) {
        isCertificateSignAlgorithmSame = certificateSignAlgorithmSame;
    }

    public String getCertificateSignAlgorithmDifference() {
        return certificateSignAlgorithmDifference;
    }

    public void setCertificateSignAlgorithmDifference(String certificateSignAlgorithmDifference) {
        this.certificateSignAlgorithmDifference = certificateSignAlgorithmDifference;
    }

    public Boolean getCertificateStartDateSame() {
        return isCertificateStartDateSame;
    }

    public void setCertificateStartDateSame(Boolean certificateStartDateSame) {
        isCertificateStartDateSame = certificateStartDateSame;
    }

    public String getCertificateStartDateDifference() {
        return certificateStartDateDifference;
    }

    public void setCertificateStartDateDifference(String certificateStartDateDifference) {
        this.certificateStartDateDifference = certificateStartDateDifference;
    }

    public Boolean getCertificateEndDateSame() {
        return isCertificateEndDateSame;
    }

    public void setCertificateEndDateSame(Boolean certificateEndDateSame) {
        isCertificateEndDateSame = certificateEndDateSame;
    }

    public String getCertificateEndDateDifference() {
        return certificateEndDateDifference;
    }

    public void setCertificateEndDateDifference(String certificateEndDateDifference) {
        this.certificateEndDateDifference = certificateEndDateDifference;
    }

    public Boolean getCertificatePublicKeySame() {
        return isCertificatePublicKeySame;
    }

    public void setCertificatePublicKeySame(Boolean certificatePublicKeySame) {
        isCertificatePublicKeySame = certificatePublicKeySame;
    }

    public Boolean getCertificateSame() {
        return isCertificateSame;
    }

    public void setCertificateSame(Boolean certificateSame) {
        isCertificateSame = certificateSame;
    }

    public Boolean getCertificateVersionSame() {
        return isCertificateVersionSame;
    }

    public void setCertificateVersionSame(Boolean certificateVersionSame) {
        isCertificateVersionSame = certificateVersionSame;
    }

    public String getCertificateVersionDifference() {
        return certificateVersionDifference;
    }

    public void setCertificateVersionDifference(String certificateVersionDifference) {
        this.certificateVersionDifference = certificateVersionDifference;
    }

    public Boolean getCertificateIssuerNameSame() {
        return isCertificateIssuerNameSame;
    }

    public void setCertificateIssuerNameSame(Boolean certificateIssuerNameSame) {
        isCertificateIssuerNameSame = certificateIssuerNameSame;
    }

    public String getCertificateIssuerNameDifference() {
        return certificateIssuerNameDifference;
    }

    public void setCertificateIssuerNameDifference(String certificateIssuerNameDifference) {
        this.certificateIssuerNameDifference = certificateIssuerNameDifference;
    }

    public Boolean getCertificateSubjectNameSame() {
        return isCertificateSubjectNameSame;
    }

    public void setCertificateSubjectNameSame(Boolean certificateSubjectNameSame) {
        isCertificateSubjectNameSame = certificateSubjectNameSame;
    }

    public String getCertificateSubjectNameDifference() {
        return certificateSubjectNameDifference;
    }

    public void setCertificateSubjectNameDifference(String certificateSubjectNameDifference) {
        this.certificateSubjectNameDifference = certificateSubjectNameDifference;
    }

    public PercentagePair getNumberOfLocalesDifference() {
        return numberOfLocalesDifference;
    }

    public void setNumberOfLocalesDifference(PercentagePair numberOfLocalesDifference) {
        this.numberOfLocalesDifference = numberOfLocalesDifference;
    }

    public List<String> getAdditionalLocalesInA() {
        return additionalLocalesInA;
    }

    public void setAdditionalLocalesInA(List<String> additionalLocalesInA) {
        this.additionalLocalesInA = additionalLocalesInA;
    }

    public List<String> getAdditionalLocalesInB() {
        return additionalLocalesInB;
    }

    public void setAdditionalLocalesInB(List<String> additionalLocalesInB) {
        this.additionalLocalesInB = additionalLocalesInB;
    }

    public PercentagePair getNumberOfStringResourceDifference() {
        return numberOfStringResourceDifference;
    }

    public void setNumberOfStringResourceDifference(PercentagePair numberOfStringResourceDifference) {
        this.numberOfStringResourceDifference = numberOfStringResourceDifference;
    }

    public PercentagePair getNumberOfDifferentDrawablesDifference() {
        return numberOfDifferentDrawablesDifference;
    }

    public void setNumberOfDifferentDrawablesDifference(PercentagePair numberOfDifferentDrawablesDifference) {
        this.numberOfDifferentDrawablesDifference = numberOfDifferentDrawablesDifference;
    }

    public PercentagePair getNumberOfPngDrawablesDifference() {
        return numberOfPngDrawablesDifference;
    }

    public void setNumberOfPngDrawablesDifference(PercentagePair numberOfPngDrawablesDifference) {
        this.numberOfPngDrawablesDifference = numberOfPngDrawablesDifference;
    }

    public PercentagePair getNumberOfJpgDrawablesDifference() {
        return numberOfJpgDrawablesDifference;
    }

    public void setNumberOfJpgDrawablesDifference(PercentagePair numberOfJpgDrawablesDifference) {
        this.numberOfJpgDrawablesDifference = numberOfJpgDrawablesDifference;
    }

    public PercentagePair getNumberOfGifDrawablesDifference() {
        return numberOfGifDrawablesDifference;
    }

    public void setNumberOfGifDrawablesDifference(PercentagePair numberOfGifDrawablesDifference) {
        this.numberOfGifDrawablesDifference = numberOfGifDrawablesDifference;
    }

    public PercentagePair getNumberOfXmlDrawablesDifference() {
        return numberOfXmlDrawablesDifference;
    }

    public void setNumberOfXmlDrawablesDifference(PercentagePair numberOfXmlDrawablesDifference) {
        this.numberOfXmlDrawablesDifference = numberOfXmlDrawablesDifference;
    }

    public PercentagePair getNumberOfLdpiDrawablesDifference() {
        return numberOfLdpiDrawablesDifference;
    }

    public void setNumberOfLdpiDrawablesDifference(PercentagePair numberOfLdpiDrawablesDifference) {
        this.numberOfLdpiDrawablesDifference = numberOfLdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfMdpiDrawablesDifference() {
        return numberOfMdpiDrawablesDifference;
    }

    public void setNumberOfMdpiDrawablesDifference(PercentagePair numberOfMdpiDrawablesDifference) {
        this.numberOfMdpiDrawablesDifference = numberOfMdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfHdpiDrawablesDifference() {
        return numberOfHdpiDrawablesDifference;
    }

    public void setNumberOfHdpiDrawablesDifference(PercentagePair numberOfHdpiDrawablesDifference) {
        this.numberOfHdpiDrawablesDifference = numberOfHdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfXhdpiDrawablesDifference() {
        return numberOfXhdpiDrawablesDifference;
    }

    public void setNumberOfXhdpiDrawablesDifference(PercentagePair numberOfXhdpiDrawablesDifference) {
        this.numberOfXhdpiDrawablesDifference = numberOfXhdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfXxhdpiDrawablesDifference() {
        return numberOfXxhdpiDrawablesDifference;
    }

    public void setNumberOfXxhdpiDrawablesDifference(PercentagePair numberOfXxhdpiDrawablesDifference) {
        this.numberOfXxhdpiDrawablesDifference = numberOfXxhdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfXxxhdpiDrawablesDifference() {
        return numberOfXxxhdpiDrawablesDifference;
    }

    public void setNumberOfXxxhdpiDrawablesDifference(PercentagePair numberOfXxxhdpiDrawablesDifference) {
        this.numberOfXxxhdpiDrawablesDifference = numberOfXxxhdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfUnspecifiedDpiDrawablesDifference() {
        return numberOfUnspecifiedDpiDrawablesDifference;
    }

    public void setNumberOfUnspecifiedDpiDrawablesDifference(PercentagePair numberOfUnspecifiedDpiDrawablesDifference) {
        this.numberOfUnspecifiedDpiDrawablesDifference = numberOfUnspecifiedDpiDrawablesDifference;
    }

    public PercentagePair getNumberOfRawResourcesDifference() {
        return numberOfRawResourcesDifference;
    }

    public void setNumberOfRawResourcesDifference(PercentagePair numberOfRawResourcesDifference) {
        this.numberOfRawResourcesDifference = numberOfRawResourcesDifference;
    }

    public PercentagePair getNumberOfMenusDifference() {
        return numberOfMenusDifference;
    }

    public void setNumberOfMenusDifference(PercentagePair numberOfMenusDifference) {
        this.numberOfMenusDifference = numberOfMenusDifference;
    }

    public PercentagePair getNumberOfLayoutsDifference() {
        return numberOfLayoutsDifference;
    }

    public void setNumberOfLayoutsDifference(PercentagePair numberOfLayoutsDifference) {
        this.numberOfLayoutsDifference = numberOfLayoutsDifference;
    }

    public PercentagePair getNumberOfDifferentLayoutsDifference() {
        return numberOfDifferentLayoutsDifference;
    }

    public void setNumberOfDifferentLayoutsDifference(PercentagePair numberOfDifferentLayoutsDifference) {
        this.numberOfDifferentLayoutsDifference = numberOfDifferentLayoutsDifference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataCompareResult result = (MetadataCompareResult) o;

        if (fileSizeDifference != null ? !fileSizeDifference.equals(result.fileSizeDifference) : result.fileSizeDifference != null)
            return false;
        if (dexSizeDifference != null ? !dexSizeDifference.equals(result.dexSizeDifference) : result.dexSizeDifference != null)
            return false;
        if (arscSizeDifference != null ? !arscSizeDifference.equals(result.arscSizeDifference) : result.arscSizeDifference != null)
            return false;
        if (isPackageNameSame != null ? !isPackageNameSame.equals(result.isPackageNameSame) : result.isPackageNameSame != null)
            return false;
        if (packageNameDifference != null ? !packageNameDifference.equals(result.packageNameDifference) : result.packageNameDifference != null)
            return false;
        if (isVersionCodeSame != null ? !isVersionCodeSame.equals(result.isVersionCodeSame) : result.isVersionCodeSame != null)
            return false;
        if (versionCodeDifference != null ? !versionCodeDifference.equals(result.versionCodeDifference) : result.versionCodeDifference != null)
            return false;
        if (isInstallLocationSame != null ? !isInstallLocationSame.equals(result.isInstallLocationSame) : result.isInstallLocationSame != null)
            return false;
        if (installLocationDifference != null ? !installLocationDifference.equals(result.installLocationDifference) : result.installLocationDifference != null)
            return false;
        if (isUsesMinSdkVersionSame != null ? !isUsesMinSdkVersionSame.equals(result.isUsesMinSdkVersionSame) : result.isUsesMinSdkVersionSame != null)
            return false;
        if (usesMinSdkVersionDifference != null ? !usesMinSdkVersionDifference.equals(result.usesMinSdkVersionDifference) : result.usesMinSdkVersionDifference != null)
            return false;
        if (isUsesTargetSdkVersionSame != null ? !isUsesTargetSdkVersionSame.equals(result.isUsesTargetSdkVersionSame) : result.isUsesTargetSdkVersionSame != null)
            return false;
        if (usesTargetSdkVersionDifference != null ? !usesTargetSdkVersionDifference.equals(result.usesTargetSdkVersionDifference) : result.usesTargetSdkVersionDifference != null)
            return false;
        if (isUsesMaxSdkVersionSame != null ? !isUsesMaxSdkVersionSame.equals(result.isUsesMaxSdkVersionSame) : result.isUsesMaxSdkVersionSame != null)
            return false;
        if (usesMaxSdkVersionDifference != null ? !usesMaxSdkVersionDifference.equals(result.usesMaxSdkVersionDifference) : result.usesMaxSdkVersionDifference != null)
            return false;
        if (isSupportsScreensResizeableSame != null ? !isSupportsScreensResizeableSame.equals(result.isSupportsScreensResizeableSame) : result.isSupportsScreensResizeableSame != null)
            return false;
        if (supportsScreensResizeableDifference != null ? !supportsScreensResizeableDifference.equals(result.supportsScreensResizeableDifference) : result.supportsScreensResizeableDifference != null)
            return false;
        if (isSupportsScreensSmallSame != null ? !isSupportsScreensSmallSame.equals(result.isSupportsScreensSmallSame) : result.isSupportsScreensSmallSame != null)
            return false;
        if (supportsScreensSmallDifference != null ? !supportsScreensSmallDifference.equals(result.supportsScreensSmallDifference) : result.supportsScreensSmallDifference != null)
            return false;
        if (isSupportsScreensNormalSame != null ? !isSupportsScreensNormalSame.equals(result.isSupportsScreensNormalSame) : result.isSupportsScreensNormalSame != null)
            return false;
        if (supportsScreensNormalDifference != null ? !supportsScreensNormalDifference.equals(result.supportsScreensNormalDifference) : result.supportsScreensNormalDifference != null)
            return false;
        if (isSupportsScreensLargeSame != null ? !isSupportsScreensLargeSame.equals(result.isSupportsScreensLargeSame) : result.isSupportsScreensLargeSame != null)
            return false;
        if (supportsScreensLargeDifference != null ? !supportsScreensLargeDifference.equals(result.supportsScreensLargeDifference) : result.supportsScreensLargeDifference != null)
            return false;
        if (isSupportsScreensXLargeSame != null ? !isSupportsScreensXLargeSame.equals(result.isSupportsScreensXLargeSame) : result.isSupportsScreensXLargeSame != null)
            return false;
        if (supportsScreensXLargeDifference != null ? !supportsScreensXLargeDifference.equals(result.supportsScreensXLargeDifference) : result.supportsScreensXLargeDifference != null)
            return false;
        if (isSupportsScreensAnyDansitySame != null ? !isSupportsScreensAnyDansitySame.equals(result.isSupportsScreensAnyDansitySame) : result.isSupportsScreensAnyDansitySame != null)
            return false;
        if (supportsScreensAnyDensityDifference != null ? !supportsScreensAnyDensityDifference.equals(result.supportsScreensAnyDensityDifference) : result.supportsScreensAnyDensityDifference != null)
            return false;
        if (numberOfActivitiesDifference != null ? !numberOfActivitiesDifference.equals(result.numberOfActivitiesDifference) : result.numberOfActivitiesDifference != null)
            return false;
        if (additionalActivitiesInA != null ? !additionalActivitiesInA.equals(result.additionalActivitiesInA) : result.additionalActivitiesInA != null)
            return false;
        if (additionalActivitiesInB != null ? !additionalActivitiesInB.equals(result.additionalActivitiesInB) : result.additionalActivitiesInB != null)
            return false;
        if (numberOfServicesDifference != null ? !numberOfServicesDifference.equals(result.numberOfServicesDifference) : result.numberOfServicesDifference != null)
            return false;
        if (additionalServicesInA != null ? !additionalServicesInA.equals(result.additionalServicesInA) : result.additionalServicesInA != null)
            return false;
        if (additionalServicesInB != null ? !additionalServicesInB.equals(result.additionalServicesInB) : result.additionalServicesInB != null)
            return false;
        if (numberOfContentProvidersDifference != null ? !numberOfContentProvidersDifference.equals(result.numberOfContentProvidersDifference) : result.numberOfContentProvidersDifference != null)
            return false;
        if (additionalContentProvidersInA != null ? !additionalContentProvidersInA.equals(result.additionalContentProvidersInA) : result.additionalContentProvidersInA != null)
            return false;
        if (additionalContentProvidersInB != null ? !additionalContentProvidersInB.equals(result.additionalContentProvidersInB) : result.additionalContentProvidersInB != null)
            return false;
        if (numberOfBroadcastReceiversDifference != null ? !numberOfBroadcastReceiversDifference.equals(result.numberOfBroadcastReceiversDifference) : result.numberOfBroadcastReceiversDifference != null)
            return false;
        if (additionalBroadcastReceiversInA != null ? !additionalBroadcastReceiversInA.equals(result.additionalBroadcastReceiversInA) : result.additionalBroadcastReceiversInA != null)
            return false;
        if (additionalBroadcastReceiversInB != null ? !additionalBroadcastReceiversInB.equals(result.additionalBroadcastReceiversInB) : result.additionalBroadcastReceiversInB != null)
            return false;
        if (numberOfPermissionsDifference != null ? !numberOfPermissionsDifference.equals(result.numberOfPermissionsDifference) : result.numberOfPermissionsDifference != null)
            return false;
        if (additionalPermissionsInA != null ? !additionalPermissionsInA.equals(result.additionalPermissionsInA) : result.additionalPermissionsInA != null)
            return false;
        if (additionalPermissionsInB != null ? !additionalPermissionsInB.equals(result.additionalPermissionsInB) : result.additionalPermissionsInB != null)
            return false;
        if (numberOfLibrariesDifference != null ? !numberOfLibrariesDifference.equals(result.numberOfLibrariesDifference) : result.numberOfLibrariesDifference != null)
            return false;
        if (additionalLibrariesInA != null ? !additionalLibrariesInA.equals(result.additionalLibrariesInA) : result.additionalLibrariesInA != null)
            return false;
        if (additionalLibrariesInB != null ? !additionalLibrariesInB.equals(result.additionalLibrariesInB) : result.additionalLibrariesInB != null)
            return false;
        if (numberOfFeaturesDifference != null ? !numberOfFeaturesDifference.equals(result.numberOfFeaturesDifference) : result.numberOfFeaturesDifference != null)
            return false;
        if (additionalFeaturesInA != null ? !additionalFeaturesInA.equals(result.additionalFeaturesInA) : result.additionalFeaturesInA != null)
            return false;
        if (additionalFeaturesInB != null ? !additionalFeaturesInB.equals(result.additionalFeaturesInB) : result.additionalFeaturesInB != null)
            return false;
        if (isCertificateSignAlgorithmSame != null ? !isCertificateSignAlgorithmSame.equals(result.isCertificateSignAlgorithmSame) : result.isCertificateSignAlgorithmSame != null)
            return false;
        if (certificateSignAlgorithmDifference != null ? !certificateSignAlgorithmDifference.equals(result.certificateSignAlgorithmDifference) : result.certificateSignAlgorithmDifference != null)
            return false;
        if (isCertificateStartDateSame != null ? !isCertificateStartDateSame.equals(result.isCertificateStartDateSame) : result.isCertificateStartDateSame != null)
            return false;
        if (certificateStartDateDifference != null ? !certificateStartDateDifference.equals(result.certificateStartDateDifference) : result.certificateStartDateDifference != null)
            return false;
        if (isCertificateEndDateSame != null ? !isCertificateEndDateSame.equals(result.isCertificateEndDateSame) : result.isCertificateEndDateSame != null)
            return false;
        if (certificateEndDateDifference != null ? !certificateEndDateDifference.equals(result.certificateEndDateDifference) : result.certificateEndDateDifference != null)
            return false;
        if (isCertificatePublicKeySame != null ? !isCertificatePublicKeySame.equals(result.isCertificatePublicKeySame) : result.isCertificatePublicKeySame != null)
            return false;
        if (isCertificateSame != null ? !isCertificateSame.equals(result.isCertificateSame) : result.isCertificateSame != null)
            return false;
        if (isCertificateVersionSame != null ? !isCertificateVersionSame.equals(result.isCertificateVersionSame) : result.isCertificateVersionSame != null)
            return false;
        if (certificateVersionDifference != null ? !certificateVersionDifference.equals(result.certificateVersionDifference) : result.certificateVersionDifference != null)
            return false;
        if (isCertificateIssuerNameSame != null ? !isCertificateIssuerNameSame.equals(result.isCertificateIssuerNameSame) : result.isCertificateIssuerNameSame != null)
            return false;
        if (certificateIssuerNameDifference != null ? !certificateIssuerNameDifference.equals(result.certificateIssuerNameDifference) : result.certificateIssuerNameDifference != null)
            return false;
        if (isCertificateSubjectNameSame != null ? !isCertificateSubjectNameSame.equals(result.isCertificateSubjectNameSame) : result.isCertificateSubjectNameSame != null)
            return false;
        if (certificateSubjectNameDifference != null ? !certificateSubjectNameDifference.equals(result.certificateSubjectNameDifference) : result.certificateSubjectNameDifference != null)
            return false;
        if (numberOfLocalesDifference != null ? !numberOfLocalesDifference.equals(result.numberOfLocalesDifference) : result.numberOfLocalesDifference != null)
            return false;
        if (additionalLocalesInA != null ? !additionalLocalesInA.equals(result.additionalLocalesInA) : result.additionalLocalesInA != null)
            return false;
        if (additionalLocalesInB != null ? !additionalLocalesInB.equals(result.additionalLocalesInB) : result.additionalLocalesInB != null)
            return false;
        if (numberOfStringResourceDifference != null ? !numberOfStringResourceDifference.equals(result.numberOfStringResourceDifference) : result.numberOfStringResourceDifference != null)
            return false;
        if (numberOfDifferentDrawablesDifference != null ? !numberOfDifferentDrawablesDifference.equals(result.numberOfDifferentDrawablesDifference) : result.numberOfDifferentDrawablesDifference != null)
            return false;
        if (numberOfPngDrawablesDifference != null ? !numberOfPngDrawablesDifference.equals(result.numberOfPngDrawablesDifference) : result.numberOfPngDrawablesDifference != null)
            return false;
        if (numberOfJpgDrawablesDifference != null ? !numberOfJpgDrawablesDifference.equals(result.numberOfJpgDrawablesDifference) : result.numberOfJpgDrawablesDifference != null)
            return false;
        if (numberOfGifDrawablesDifference != null ? !numberOfGifDrawablesDifference.equals(result.numberOfGifDrawablesDifference) : result.numberOfGifDrawablesDifference != null)
            return false;
        if (numberOfXmlDrawablesDifference != null ? !numberOfXmlDrawablesDifference.equals(result.numberOfXmlDrawablesDifference) : result.numberOfXmlDrawablesDifference != null)
            return false;
        if (numberOfLdpiDrawablesDifference != null ? !numberOfLdpiDrawablesDifference.equals(result.numberOfLdpiDrawablesDifference) : result.numberOfLdpiDrawablesDifference != null)
            return false;
        if (numberOfMdpiDrawablesDifference != null ? !numberOfMdpiDrawablesDifference.equals(result.numberOfMdpiDrawablesDifference) : result.numberOfMdpiDrawablesDifference != null)
            return false;
        if (numberOfHdpiDrawablesDifference != null ? !numberOfHdpiDrawablesDifference.equals(result.numberOfHdpiDrawablesDifference) : result.numberOfHdpiDrawablesDifference != null)
            return false;
        if (numberOfXhdpiDrawablesDifference != null ? !numberOfXhdpiDrawablesDifference.equals(result.numberOfXhdpiDrawablesDifference) : result.numberOfXhdpiDrawablesDifference != null)
            return false;
        if (numberOfXxhdpiDrawablesDifference != null ? !numberOfXxhdpiDrawablesDifference.equals(result.numberOfXxhdpiDrawablesDifference) : result.numberOfXxhdpiDrawablesDifference != null)
            return false;
        if (numberOfXxxhdpiDrawablesDifference != null ? !numberOfXxxhdpiDrawablesDifference.equals(result.numberOfXxxhdpiDrawablesDifference) : result.numberOfXxxhdpiDrawablesDifference != null)
            return false;
        if (numberOfUnspecifiedDpiDrawablesDifference != null ? !numberOfUnspecifiedDpiDrawablesDifference.equals(result.numberOfUnspecifiedDpiDrawablesDifference) : result.numberOfUnspecifiedDpiDrawablesDifference != null)
            return false;
        if (numberOfRawResourcesDifference != null ? !numberOfRawResourcesDifference.equals(result.numberOfRawResourcesDifference) : result.numberOfRawResourcesDifference != null)
            return false;
        if (numberOfMenusDifference != null ? !numberOfMenusDifference.equals(result.numberOfMenusDifference) : result.numberOfMenusDifference != null)
            return false;
        if (numberOfLayoutsDifference != null ? !numberOfLayoutsDifference.equals(result.numberOfLayoutsDifference) : result.numberOfLayoutsDifference != null)
            return false;
        return !(numberOfDifferentLayoutsDifference != null ? !numberOfDifferentLayoutsDifference.equals(result.numberOfDifferentLayoutsDifference) : result.numberOfDifferentLayoutsDifference != null);

    }

    @Override
    public int hashCode() {
        int result = fileSizeDifference != null ? fileSizeDifference.hashCode() : 0;
        result = 31 * result + (dexSizeDifference != null ? dexSizeDifference.hashCode() : 0);
        result = 31 * result + (arscSizeDifference != null ? arscSizeDifference.hashCode() : 0);
        result = 31 * result + (isPackageNameSame != null ? isPackageNameSame.hashCode() : 0);
        result = 31 * result + (packageNameDifference != null ? packageNameDifference.hashCode() : 0);
        result = 31 * result + (isVersionCodeSame != null ? isVersionCodeSame.hashCode() : 0);
        result = 31 * result + (versionCodeDifference != null ? versionCodeDifference.hashCode() : 0);
        result = 31 * result + (isInstallLocationSame != null ? isInstallLocationSame.hashCode() : 0);
        result = 31 * result + (installLocationDifference != null ? installLocationDifference.hashCode() : 0);
        result = 31 * result + (isUsesMinSdkVersionSame != null ? isUsesMinSdkVersionSame.hashCode() : 0);
        result = 31 * result + (usesMinSdkVersionDifference != null ? usesMinSdkVersionDifference.hashCode() : 0);
        result = 31 * result + (isUsesTargetSdkVersionSame != null ? isUsesTargetSdkVersionSame.hashCode() : 0);
        result = 31 * result + (usesTargetSdkVersionDifference != null ? usesTargetSdkVersionDifference.hashCode() : 0);
        result = 31 * result + (isUsesMaxSdkVersionSame != null ? isUsesMaxSdkVersionSame.hashCode() : 0);
        result = 31 * result + (usesMaxSdkVersionDifference != null ? usesMaxSdkVersionDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensResizeableSame != null ? isSupportsScreensResizeableSame.hashCode() : 0);
        result = 31 * result + (supportsScreensResizeableDifference != null ? supportsScreensResizeableDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensSmallSame != null ? isSupportsScreensSmallSame.hashCode() : 0);
        result = 31 * result + (supportsScreensSmallDifference != null ? supportsScreensSmallDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensNormalSame != null ? isSupportsScreensNormalSame.hashCode() : 0);
        result = 31 * result + (supportsScreensNormalDifference != null ? supportsScreensNormalDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensLargeSame != null ? isSupportsScreensLargeSame.hashCode() : 0);
        result = 31 * result + (supportsScreensLargeDifference != null ? supportsScreensLargeDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensXLargeSame != null ? isSupportsScreensXLargeSame.hashCode() : 0);
        result = 31 * result + (supportsScreensXLargeDifference != null ? supportsScreensXLargeDifference.hashCode() : 0);
        result = 31 * result + (isSupportsScreensAnyDansitySame != null ? isSupportsScreensAnyDansitySame.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensityDifference != null ? supportsScreensAnyDensityDifference.hashCode() : 0);
        result = 31 * result + (numberOfActivitiesDifference != null ? numberOfActivitiesDifference.hashCode() : 0);
        result = 31 * result + (additionalActivitiesInA != null ? additionalActivitiesInA.hashCode() : 0);
        result = 31 * result + (additionalActivitiesInB != null ? additionalActivitiesInB.hashCode() : 0);
        result = 31 * result + (numberOfServicesDifference != null ? numberOfServicesDifference.hashCode() : 0);
        result = 31 * result + (additionalServicesInA != null ? additionalServicesInA.hashCode() : 0);
        result = 31 * result + (additionalServicesInB != null ? additionalServicesInB.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersDifference != null ? numberOfContentProvidersDifference.hashCode() : 0);
        result = 31 * result + (additionalContentProvidersInA != null ? additionalContentProvidersInA.hashCode() : 0);
        result = 31 * result + (additionalContentProvidersInB != null ? additionalContentProvidersInB.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversDifference != null ? numberOfBroadcastReceiversDifference.hashCode() : 0);
        result = 31 * result + (additionalBroadcastReceiversInA != null ? additionalBroadcastReceiversInA.hashCode() : 0);
        result = 31 * result + (additionalBroadcastReceiversInB != null ? additionalBroadcastReceiversInB.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsDifference != null ? numberOfPermissionsDifference.hashCode() : 0);
        result = 31 * result + (additionalPermissionsInA != null ? additionalPermissionsInA.hashCode() : 0);
        result = 31 * result + (additionalPermissionsInB != null ? additionalPermissionsInB.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesDifference != null ? numberOfLibrariesDifference.hashCode() : 0);
        result = 31 * result + (additionalLibrariesInA != null ? additionalLibrariesInA.hashCode() : 0);
        result = 31 * result + (additionalLibrariesInB != null ? additionalLibrariesInB.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesDifference != null ? numberOfFeaturesDifference.hashCode() : 0);
        result = 31 * result + (additionalFeaturesInA != null ? additionalFeaturesInA.hashCode() : 0);
        result = 31 * result + (additionalFeaturesInB != null ? additionalFeaturesInB.hashCode() : 0);
        result = 31 * result + (isCertificateSignAlgorithmSame != null ? isCertificateSignAlgorithmSame.hashCode() : 0);
        result = 31 * result + (certificateSignAlgorithmDifference != null ? certificateSignAlgorithmDifference.hashCode() : 0);
        result = 31 * result + (isCertificateStartDateSame != null ? isCertificateStartDateSame.hashCode() : 0);
        result = 31 * result + (certificateStartDateDifference != null ? certificateStartDateDifference.hashCode() : 0);
        result = 31 * result + (isCertificateEndDateSame != null ? isCertificateEndDateSame.hashCode() : 0);
        result = 31 * result + (certificateEndDateDifference != null ? certificateEndDateDifference.hashCode() : 0);
        result = 31 * result + (isCertificatePublicKeySame != null ? isCertificatePublicKeySame.hashCode() : 0);
        result = 31 * result + (isCertificateSame != null ? isCertificateSame.hashCode() : 0);
        result = 31 * result + (isCertificateVersionSame != null ? isCertificateVersionSame.hashCode() : 0);
        result = 31 * result + (certificateVersionDifference != null ? certificateVersionDifference.hashCode() : 0);
        result = 31 * result + (isCertificateIssuerNameSame != null ? isCertificateIssuerNameSame.hashCode() : 0);
        result = 31 * result + (certificateIssuerNameDifference != null ? certificateIssuerNameDifference.hashCode() : 0);
        result = 31 * result + (isCertificateSubjectNameSame != null ? isCertificateSubjectNameSame.hashCode() : 0);
        result = 31 * result + (certificateSubjectNameDifference != null ? certificateSubjectNameDifference.hashCode() : 0);
        result = 31 * result + (numberOfLocalesDifference != null ? numberOfLocalesDifference.hashCode() : 0);
        result = 31 * result + (additionalLocalesInA != null ? additionalLocalesInA.hashCode() : 0);
        result = 31 * result + (additionalLocalesInB != null ? additionalLocalesInB.hashCode() : 0);
        result = 31 * result + (numberOfStringResourceDifference != null ? numberOfStringResourceDifference.hashCode() : 0);
        result = 31 * result + (numberOfDifferentDrawablesDifference != null ? numberOfDifferentDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfPngDrawablesDifference != null ? numberOfPngDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfJpgDrawablesDifference != null ? numberOfJpgDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfGifDrawablesDifference != null ? numberOfGifDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXmlDrawablesDifference != null ? numberOfXmlDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfLdpiDrawablesDifference != null ? numberOfLdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfMdpiDrawablesDifference != null ? numberOfMdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfHdpiDrawablesDifference != null ? numberOfHdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXhdpiDrawablesDifference != null ? numberOfXhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxhdpiDrawablesDifference != null ? numberOfXxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxxhdpiDrawablesDifference != null ? numberOfXxxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfUnspecifiedDpiDrawablesDifference != null ? numberOfUnspecifiedDpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfRawResourcesDifference != null ? numberOfRawResourcesDifference.hashCode() : 0);
        result = 31 * result + (numberOfMenusDifference != null ? numberOfMenusDifference.hashCode() : 0);
        result = 31 * result + (numberOfLayoutsDifference != null ? numberOfLayoutsDifference.hashCode() : 0);
        result = 31 * result + (numberOfDifferentLayoutsDifference != null ? numberOfDifferentLayoutsDifference.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MetadataCompareResult{" +
                "fileSizeDifference=" + fileSizeDifference +
                ", dexSizeDifference=" + dexSizeDifference +
                ", arscSizeDifference=" + arscSizeDifference +
                ", isPackageNameSame=" + isPackageNameSame +
                ", packageNameDifference='" + packageNameDifference + '\'' +
                ", isVersionCodeSame=" + isVersionCodeSame +
                ", versionCodeDifference='" + versionCodeDifference + '\'' +
                ", isInstallLocationSame=" + isInstallLocationSame +
                ", installLocationDifference='" + installLocationDifference + '\'' +
                ", isUsesMinSdkVersionSame=" + isUsesMinSdkVersionSame +
                ", usesMinSdkVersionDifference='" + usesMinSdkVersionDifference + '\'' +
                ", isUsesTargetSdkVersionSame=" + isUsesTargetSdkVersionSame +
                ", usesTargetSdkVersionDifference='" + usesTargetSdkVersionDifference + '\'' +
                ", isUsesMaxSdkVersionSame=" + isUsesMaxSdkVersionSame +
                ", usesMaxSdkVersionDifference='" + usesMaxSdkVersionDifference + '\'' +
                ", isSupportsScreensResizeableSame=" + isSupportsScreensResizeableSame +
                ", supportsScreensResizeableDifference='" + supportsScreensResizeableDifference + '\'' +
                ", isSupportsScreensSmallSame=" + isSupportsScreensSmallSame +
                ", supportsScreensSmallDifference='" + supportsScreensSmallDifference + '\'' +
                ", isSupportsScreensNormalSame=" + isSupportsScreensNormalSame +
                ", supportsScreensNormalDifference='" + supportsScreensNormalDifference + '\'' +
                ", isSupportsScreensLargeSame=" + isSupportsScreensLargeSame +
                ", supportsScreensLargeDifference='" + supportsScreensLargeDifference + '\'' +
                ", isSupportsScreensXLargeSame=" + isSupportsScreensXLargeSame +
                ", supportsScreensXLargeDifference='" + supportsScreensXLargeDifference + '\'' +
                ", isSupportsScreensAnyDansitySame=" + isSupportsScreensAnyDansitySame +
                ", supportsScreensAnyDensityDifference='" + supportsScreensAnyDensityDifference + '\'' +
                ", numberOfActivitiesDifference=" + numberOfActivitiesDifference +
                ", additionalActivitiesInA=" + additionalActivitiesInA +
                ", additionalActivitiesInB=" + additionalActivitiesInB +
                ", numberOfServicesDifference=" + numberOfServicesDifference +
                ", additionalServicesInA=" + additionalServicesInA +
                ", additionalServicesInB=" + additionalServicesInB +
                ", numberOfContentProvidersDifference=" + numberOfContentProvidersDifference +
                ", additionalContentProvidersInA=" + additionalContentProvidersInA +
                ", additionalContentProvidersInB=" + additionalContentProvidersInB +
                ", numberOfBroadcastReceiversDifference=" + numberOfBroadcastReceiversDifference +
                ", additionalBroadcastReceiversInA=" + additionalBroadcastReceiversInA +
                ", additionalBroadcastReceiversInB=" + additionalBroadcastReceiversInB +
                ", numberOfPermissionsDifference=" + numberOfPermissionsDifference +
                ", additionalPermissionsInA=" + additionalPermissionsInA +
                ", additionalPermissionsInB=" + additionalPermissionsInB +
                ", numberOfLibrariesDifference=" + numberOfLibrariesDifference +
                ", additionalLibrariesInA=" + additionalLibrariesInA +
                ", additionalLibrariesInB=" + additionalLibrariesInB +
                ", numberOfFeaturesDifference=" + numberOfFeaturesDifference +
                ", additionalFeaturesInA=" + additionalFeaturesInA +
                ", additionalFeaturesInB=" + additionalFeaturesInB +
                ", isCertificateSignAlgorithmSame=" + isCertificateSignAlgorithmSame +
                ", certificateSignAlgorithmDifference='" + certificateSignAlgorithmDifference + '\'' +
                ", isCertificateStartDateSame=" + isCertificateStartDateSame +
                ", certificateStartDateDifference='" + certificateStartDateDifference + '\'' +
                ", isCertificateEndDateSame=" + isCertificateEndDateSame +
                ", certificateEndDateDifference='" + certificateEndDateDifference + '\'' +
                ", isCertificatePublicKeySame=" + isCertificatePublicKeySame +
                ", isCertificateSame=" + isCertificateSame +
                ", isCertificateVersionSame=" + isCertificateVersionSame +
                ", certificateVersionDifference='" + certificateVersionDifference + '\'' +
                ", isCertificateIssuerNameSame=" + isCertificateIssuerNameSame +
                ", certificateIssuerNameDifference='" + certificateIssuerNameDifference + '\'' +
                ", isCertificateSubjectNameSame=" + isCertificateSubjectNameSame +
                ", certificateSubjectNameDifference='" + certificateSubjectNameDifference + '\'' +
                ", numberOfLocalesDifference=" + numberOfLocalesDifference +
                ", additionalLocalesInA=" + additionalLocalesInA +
                ", additionalLocalesInB=" + additionalLocalesInB +
                ", numberOfStringResourceDifference=" + numberOfStringResourceDifference +
                ", numberOfDifferentDrawablesDifference=" + numberOfDifferentDrawablesDifference +
                ", numberOfPngDrawablesDifference=" + numberOfPngDrawablesDifference +
                ", numberOfJpgDrawablesDifference=" + numberOfJpgDrawablesDifference +
                ", numberOfGifDrawablesDifference=" + numberOfGifDrawablesDifference +
                ", numberOfXmlDrawablesDifference=" + numberOfXmlDrawablesDifference +
                ", numberOfLdpiDrawablesDifference=" + numberOfLdpiDrawablesDifference +
                ", numberOfMdpiDrawablesDifference=" + numberOfMdpiDrawablesDifference +
                ", numberOfHdpiDrawablesDifference=" + numberOfHdpiDrawablesDifference +
                ", numberOfXhdpiDrawablesDifference=" + numberOfXhdpiDrawablesDifference +
                ", numberOfXxhdpiDrawablesDifference=" + numberOfXxhdpiDrawablesDifference +
                ", numberOfXxxhdpiDrawablesDifference=" + numberOfXxxhdpiDrawablesDifference +
                ", numberOfUnspecifiedDpiDrawablesDifference=" + numberOfUnspecifiedDpiDrawablesDifference +
                ", numberOfRawResourcesDifference=" + numberOfRawResourcesDifference +
                ", numberOfMenusDifference=" + numberOfMenusDifference +
                ", numberOfLayoutsDifference=" + numberOfLayoutsDifference +
                ", numberOfDifferentLayoutsDifference=" + numberOfDifferentLayoutsDifference +
                '}';
    }
}
