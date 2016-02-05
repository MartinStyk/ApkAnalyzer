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

    private AttributeComparisonResult packageName;

    private AttributeComparisonResult versionCode;

    private AttributeComparisonResult installLocation;

    private AttributeComparisonResult usesMinSdkVersion;

    private AttributeComparisonResult usesTargetSdkVersion;

    private AttributeComparisonResult usesMaxSdkVersion;

    private AttributeComparisonResult supportsScreensResizeable;

    private AttributeComparisonResult supportsScreensSmall;

    private AttributeComparisonResult supportsScreensNormal;

    private AttributeComparisonResult supportsScreensLarge;

    private AttributeComparisonResult supportsScreensXlarge;

    private AttributeComparisonResult supportsScreensAnyDensity;

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

    private PercentagePair numberOfDefinedPermissionsDifference;
    private List<String> additionalDefinedPermissionsInA;
    private List<String> additionalDefinedPermissionsInB;


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

    private PercentagePair numberOfNinePatchDrawablesDifference;

    private PercentagePair numberOfXmlDrawablesDifference;

    private PercentagePair numberOfLdpiDrawablesDifference;

    private PercentagePair numberOfMdpiDrawablesDifference;

    private PercentagePair numberOfHdpiDrawablesDifference;

    private PercentagePair numberOfXhdpiDrawablesDifference;

    private PercentagePair numberOfXxhdpiDrawablesDifference;

    private PercentagePair numberOfXxxhdpiDrawablesDifference;

    private PercentagePair numberOfNodpihdpiDrawablesDifference;

    private PercentagePair numberOfTvdpiDrawablesDifference;

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

    public AttributeComparisonResult getPackageName() {
        return packageName;
    }

    public void setPackageName(AttributeComparisonResult packageName) {
        this.packageName = packageName;
    }

    public AttributeComparisonResult getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(AttributeComparisonResult versionCode) {
        this.versionCode = versionCode;
    }

    public AttributeComparisonResult getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(AttributeComparisonResult installLocation) {
        this.installLocation = installLocation;
    }

    public AttributeComparisonResult getUsesMinSdkVersion() {
        return usesMinSdkVersion;
    }

    public void setUsesMinSdkVersion(AttributeComparisonResult usesMinSdkVersion) {
        this.usesMinSdkVersion = usesMinSdkVersion;
    }

    public AttributeComparisonResult getUsesTargetSdkVersion() {
        return usesTargetSdkVersion;
    }

    public void setUsesTargetSdkVersion(AttributeComparisonResult usesTargetSdkVersion) {
        this.usesTargetSdkVersion = usesTargetSdkVersion;
    }

    public AttributeComparisonResult getUsesMaxSdkVersion() {
        return usesMaxSdkVersion;
    }

    public void setUsesMaxSdkVersion(AttributeComparisonResult usesMaxSdkVersion) {
        this.usesMaxSdkVersion = usesMaxSdkVersion;
    }

    public AttributeComparisonResult getSupportsScreensResizeable() {
        return supportsScreensResizeable;
    }

    public void setSupportsScreensResizeable(AttributeComparisonResult supportsScreensResizeable) {
        this.supportsScreensResizeable = supportsScreensResizeable;
    }

    public AttributeComparisonResult getSupportsScreensSmall() {
        return supportsScreensSmall;
    }

    public void setSupportsScreensSmall(AttributeComparisonResult supportsScreensSmall) {
        this.supportsScreensSmall = supportsScreensSmall;
    }

    public AttributeComparisonResult getSupportsScreensNormal() {
        return supportsScreensNormal;
    }

    public void setSupportsScreensNormal(AttributeComparisonResult supportsScreensNormal) {
        this.supportsScreensNormal = supportsScreensNormal;
    }

    public AttributeComparisonResult getSupportsScreensLarge() {
        return supportsScreensLarge;
    }

    public void setSupportsScreensLarge(AttributeComparisonResult supportsScreensLarge) {
        this.supportsScreensLarge = supportsScreensLarge;
    }

    public AttributeComparisonResult getSupportsScreensXlarge() {
        return supportsScreensXlarge;
    }

    public void setSupportsScreensXlarge(AttributeComparisonResult supportsScreensXlarge) {
        this.supportsScreensXlarge = supportsScreensXlarge;
    }

    public AttributeComparisonResult getSupportsScreensAnyDensity() {
        return supportsScreensAnyDensity;
    }

    public void setSupportsScreensAnyDensity(AttributeComparisonResult supportsScreensAnyDensity) {
        this.supportsScreensAnyDensity = supportsScreensAnyDensity;
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

    public PercentagePair getNumberOfNinePatchDrawablesDifference() {
        return numberOfNinePatchDrawablesDifference;
    }

    public void setNumberOfNinePatchDrawablesDifference(PercentagePair numberOfNinePatchDrawablesDifference) {
        this.numberOfNinePatchDrawablesDifference = numberOfNinePatchDrawablesDifference;
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

    public PercentagePair getNumberOfNodpihdpiDrawablesDifference() {
        return numberOfNodpihdpiDrawablesDifference;
    }

    public void setNumberOfNodpihdpiDrawablesDifference(PercentagePair numberOfNodpihdpiDrawablesDifference) {
        this.numberOfNodpihdpiDrawablesDifference = numberOfNodpihdpiDrawablesDifference;
    }

    public PercentagePair getNumberOfTvdpiDrawablesDifference() {
        return numberOfTvdpiDrawablesDifference;
    }

    public void setNumberOfTvdpiDrawablesDifference(PercentagePair numberOfTvdpiDrawablesDifference) {
        this.numberOfTvdpiDrawablesDifference = numberOfTvdpiDrawablesDifference;
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

    public PercentagePair getNumberOfDefinedPermissionsDifference() {
        return numberOfDefinedPermissionsDifference;
    }

    public void setNumberOfDefinedPermissionsDifference(PercentagePair numberOfDefinedPermissionsDifference) {
        this.numberOfDefinedPermissionsDifference = numberOfDefinedPermissionsDifference;
    }

    public List<String> getAdditionalDefinedPermissionsInA() {
        return additionalDefinedPermissionsInA;
    }

    public void setAdditionalDefinedPermissionsInA(List<String> additionalDefinedPermissionsInA) {
        this.additionalDefinedPermissionsInA = additionalDefinedPermissionsInA;
    }

    public List<String> getAdditionalDefinedPermissionsInB() {
        return additionalDefinedPermissionsInB;
    }

    public void setAdditionalDefinedPermissionsInB(List<String> additionalDefinedPermissionsInB) {
        this.additionalDefinedPermissionsInB = additionalDefinedPermissionsInB;
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
        if (packageName != null ? !packageName.equals(result.packageName) : result.packageName != null) return false;
        if (versionCode != null ? !versionCode.equals(result.versionCode) : result.versionCode != null) return false;
        if (installLocation != null ? !installLocation.equals(result.installLocation) : result.installLocation != null)
            return false;
        if (usesMinSdkVersion != null ? !usesMinSdkVersion.equals(result.usesMinSdkVersion) : result.usesMinSdkVersion != null)
            return false;
        if (usesTargetSdkVersion != null ? !usesTargetSdkVersion.equals(result.usesTargetSdkVersion) : result.usesTargetSdkVersion != null)
            return false;
        if (usesMaxSdkVersion != null ? !usesMaxSdkVersion.equals(result.usesMaxSdkVersion) : result.usesMaxSdkVersion != null)
            return false;
        if (supportsScreensResizeable != null ? !supportsScreensResizeable.equals(result.supportsScreensResizeable) : result.supportsScreensResizeable != null)
            return false;
        if (supportsScreensSmall != null ? !supportsScreensSmall.equals(result.supportsScreensSmall) : result.supportsScreensSmall != null)
            return false;
        if (supportsScreensNormal != null ? !supportsScreensNormal.equals(result.supportsScreensNormal) : result.supportsScreensNormal != null)
            return false;
        if (supportsScreensLarge != null ? !supportsScreensLarge.equals(result.supportsScreensLarge) : result.supportsScreensLarge != null)
            return false;
        if (supportsScreensXlarge != null ? !supportsScreensXlarge.equals(result.supportsScreensXlarge) : result.supportsScreensXlarge != null)
            return false;
        if (supportsScreensAnyDensity != null ? !supportsScreensAnyDensity.equals(result.supportsScreensAnyDensity) : result.supportsScreensAnyDensity != null)
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
        if (numberOfDefinedPermissionsDifference != null ? !numberOfDefinedPermissionsDifference.equals(result.numberOfDefinedPermissionsDifference) : result.numberOfDefinedPermissionsDifference != null)
            return false;
        if (additionalDefinedPermissionsInA != null ? !additionalDefinedPermissionsInA.equals(result.additionalDefinedPermissionsInA) : result.additionalDefinedPermissionsInA != null)
            return false;
        if (additionalDefinedPermissionsInB != null ? !additionalDefinedPermissionsInB.equals(result.additionalDefinedPermissionsInB) : result.additionalDefinedPermissionsInB != null)
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
        if (numberOfNinePatchDrawablesDifference != null ? !numberOfNinePatchDrawablesDifference.equals(result.numberOfNinePatchDrawablesDifference) : result.numberOfNinePatchDrawablesDifference != null)
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
        if (numberOfNodpihdpiDrawablesDifference != null ? !numberOfNodpihdpiDrawablesDifference.equals(result.numberOfNodpihdpiDrawablesDifference) : result.numberOfNodpihdpiDrawablesDifference != null)
            return false;
        if (numberOfTvdpiDrawablesDifference != null ? !numberOfTvdpiDrawablesDifference.equals(result.numberOfTvdpiDrawablesDifference) : result.numberOfTvdpiDrawablesDifference != null)
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
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        result = 31 * result + (versionCode != null ? versionCode.hashCode() : 0);
        result = 31 * result + (installLocation != null ? installLocation.hashCode() : 0);
        result = 31 * result + (usesMinSdkVersion != null ? usesMinSdkVersion.hashCode() : 0);
        result = 31 * result + (usesTargetSdkVersion != null ? usesTargetSdkVersion.hashCode() : 0);
        result = 31 * result + (usesMaxSdkVersion != null ? usesMaxSdkVersion.hashCode() : 0);
        result = 31 * result + (supportsScreensResizeable != null ? supportsScreensResizeable.hashCode() : 0);
        result = 31 * result + (supportsScreensSmall != null ? supportsScreensSmall.hashCode() : 0);
        result = 31 * result + (supportsScreensNormal != null ? supportsScreensNormal.hashCode() : 0);
        result = 31 * result + (supportsScreensLarge != null ? supportsScreensLarge.hashCode() : 0);
        result = 31 * result + (supportsScreensXlarge != null ? supportsScreensXlarge.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensity != null ? supportsScreensAnyDensity.hashCode() : 0);
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
        result = 31 * result + (numberOfDefinedPermissionsDifference != null ? numberOfDefinedPermissionsDifference.hashCode() : 0);
        result = 31 * result + (additionalDefinedPermissionsInA != null ? additionalDefinedPermissionsInA.hashCode() : 0);
        result = 31 * result + (additionalDefinedPermissionsInB != null ? additionalDefinedPermissionsInB.hashCode() : 0);
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
        result = 31 * result + (numberOfNinePatchDrawablesDifference != null ? numberOfNinePatchDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXmlDrawablesDifference != null ? numberOfXmlDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfLdpiDrawablesDifference != null ? numberOfLdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfMdpiDrawablesDifference != null ? numberOfMdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfHdpiDrawablesDifference != null ? numberOfHdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXhdpiDrawablesDifference != null ? numberOfXhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxhdpiDrawablesDifference != null ? numberOfXxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxxhdpiDrawablesDifference != null ? numberOfXxxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfNodpihdpiDrawablesDifference != null ? numberOfNodpihdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfTvdpiDrawablesDifference != null ? numberOfTvdpiDrawablesDifference.hashCode() : 0);
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
                ", packageName=" + packageName +
                ", versionCode=" + versionCode +
                ", installLocation=" + installLocation +
                ", usesMinSdkVersion=" + usesMinSdkVersion +
                ", usesTargetSdkVersion=" + usesTargetSdkVersion +
                ", usesMaxSdkVersion=" + usesMaxSdkVersion +
                ", supportsScreensResizeable=" + supportsScreensResizeable +
                ", supportsScreensSmall=" + supportsScreensSmall +
                ", supportsScreensNormal=" + supportsScreensNormal +
                ", supportsScreensLarge=" + supportsScreensLarge +
                ", supportsScreensXlarge=" + supportsScreensXlarge +
                ", supportsScreensAnyDensity=" + supportsScreensAnyDensity +
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
                ", numberOfDefinedPermissionsDifference=" + numberOfDefinedPermissionsDifference +
                ", additionalDefinedPermissionsInA=" + additionalDefinedPermissionsInA +
                ", additionalDefinedPermissionsInB=" + additionalDefinedPermissionsInB +
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
                ", numberOfNinePatchDrawablesDifference=" + numberOfNinePatchDrawablesDifference +
                ", numberOfXmlDrawablesDifference=" + numberOfXmlDrawablesDifference +
                ", numberOfLdpiDrawablesDifference=" + numberOfLdpiDrawablesDifference +
                ", numberOfMdpiDrawablesDifference=" + numberOfMdpiDrawablesDifference +
                ", numberOfHdpiDrawablesDifference=" + numberOfHdpiDrawablesDifference +
                ", numberOfXhdpiDrawablesDifference=" + numberOfXhdpiDrawablesDifference +
                ", numberOfXxhdpiDrawablesDifference=" + numberOfXxhdpiDrawablesDifference +
                ", numberOfXxxhdpiDrawablesDifference=" + numberOfXxxhdpiDrawablesDifference +
                ", numberOfNodpihdpiDrawablesDifference=" + numberOfNodpihdpiDrawablesDifference +
                ", numberOfTvdpiDrawablesDifference=" + numberOfTvdpiDrawablesDifference +
                ", numberOfUnspecifiedDpiDrawablesDifference=" + numberOfUnspecifiedDpiDrawablesDifference +
                ", numberOfRawResourcesDifference=" + numberOfRawResourcesDifference +
                ", numberOfMenusDifference=" + numberOfMenusDifference +
                ", numberOfLayoutsDifference=" + numberOfLayoutsDifference +
                ", numberOfDifferentLayoutsDifference=" + numberOfDifferentLayoutsDifference +
                '}';
    }
}
