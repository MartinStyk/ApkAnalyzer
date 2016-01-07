package sk.styk.martin.bakalarka.compare.data;

import java.util.List;

/**Everything relates to first APK
 * if difference is +5, then A+5=B
 *
 * Created by Martin Styk on 06.01.2016.
 */
public class MetadataCompareResult {

    //file size
    private Long fileSizeDifference;
    private Integer fileSizeDifferencePercentage;

    private Long dexSizeDifference;
    private Integer dexSizeDifferencePercentage;

    private Long arscSizeDifference;
    private Integer arscSizeDifferencePercentage;


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

    private Integer numberOfActivitiesDifference;
    private Integer numberOfActivitiesDifferencePercentage;
    private List<String> additionalActivitiesInA;
    private List<String> additionalActivitiesInB;

    private Integer numberOfServicesDifference;
    private Integer numberOfServicesDifferencePercentage;
    private List<String> additionalServicesInA;
    private List<String> additionalServicesInB;

    private Integer numberOfContentProvidersDifference;
    private Integer numberOfContentProvidersDifferencePercentage;
    private List<String> additionalContentProvidersInA;
    private List<String> additionalContentProvidersInB;

    private Integer numberOfBroadcastReceiversDifference;
    private Integer numberOfBroadcastReceiversDifferencePercentage;
    private List<String> additionalBroadcastReceiversInA;
    private List<String> additionalBroadcastReceiversInB;

    private Integer numberOfPermissionsDifference;
    private Integer numberOfPermissionsDifferencePercentage;
    private List<String> additionalPermissionsInA;
    private List<String> additionalPermissionsInB;

    private Integer numberOfLibrariesDifference;
    private Integer numberOfLibrariesDifferencePercentage;
    private List<String> additionalLibrariesInA;
    private List<String> additionalLibrariesInB;

    private Integer numberOfFeaturesDifference;
    private Integer numberOfFeaturesDifferencePercentage;
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

    private Integer numberOfLocalesDifference;
    private Integer getNumberOfLocalesDifferencePercentage;
    private List<String> additionalLocalesInA;
    private List<String> additionalLocalesInB;

    private Integer numberOfStringResourceDifference;
    private Integer numberOfStringResourceDifferencePercentage;

    private Integer numberOfDifferentDrawablesDifference;
    private Integer numberOfDifferentDrawablesDifferencePercentage;

    private Integer numberOfPngDrawablesDifference;
    private Integer numberOfPngDrawablesDifferencePercentage;

    private Integer numberOfJpgDrawablesDifference;
    private Integer numberOfJpgDrawablesDifferencePercentage;

    private Integer numberOfGifDrawablesDifference;
    private Integer numberOfGifDrawablesDifferencePercentage;

    private Integer numberOfXmlDrawablesDifference;
    private Integer numberOfXmlDrawablesDifferencePercentage;

    private Integer numberOfLdpiDrawablesDifference;
    private Integer numberOfLdpiDrawablesDifferencePercentage;

    private Integer numberOfMdpiDrawablesDifference;
    private Integer numberOfMdpiDrawablesDifferencePercentage;

    private Integer numberOfHdpiDrawablesDifference;
    private Integer numberOfHdpiDrawablesDifferencePercentage;

    private Integer numberOfXhdpiDrawablesDifference;
    private Integer numberOfXhdpiDrawablesDifferencePercentage;

    private Integer numberOfXxhdpiDrawablesDifference;
    private Integer numberOfXxhdpiDrawablesDifferencePercentage;

    private Integer numberOfXxxhdpiDrawablesDifference;
    private Integer numberOfXxxhdpiDrawablesDifferencePercentage;

    private Integer numberOfUnspecifiedDpiDrawablesDifference;
    private Integer numberOfUnspecifiedDpiDrawablesDifferencePercentage;

    private Integer numberOfRawResourcesDifference;
    private Integer numberOfRawResourcesDifferencePercentage;

    private Integer numberOfMenusDifference;
    private Integer numberOfMenusDifferencePercentage;

    private Integer numberOfLayoutsDifference;
    private Integer numberOfLayoutsDifferencePercentage;

    private Integer numberOfDifferentLayoutsDifference;
    private Integer numberOfDifferentLayoutsDifferencePercentage;

    public Long getFileSizeDifference() {
        return fileSizeDifference;
    }

    public void setFileSizeDifference(Long fileSizeDifference) {
        this.fileSizeDifference = fileSizeDifference;
    }

    public Integer getFileSizeDifferencePercentage() {
        return fileSizeDifferencePercentage;
    }

    public void setFileSizeDifferencePercentage(Integer fileSizeDifferencePercentage) {
        this.fileSizeDifferencePercentage = fileSizeDifferencePercentage;
    }

    public Long getDexSizeDifference() {
        return dexSizeDifference;
    }

    public void setDexSizeDifference(Long dexSizeDifference) {
        this.dexSizeDifference = dexSizeDifference;
    }

    public Integer getDexSizeDifferencePercentage() {
        return dexSizeDifferencePercentage;
    }

    public void setDexSizeDifferencePercentage(Integer dexSizeDifferencePercentage) {
        this.dexSizeDifferencePercentage = dexSizeDifferencePercentage;
    }

    public Long getArscSizeDifference() {
        return arscSizeDifference;
    }

    public void setArscSizeDifference(Long arscSizeDifference) {
        this.arscSizeDifference = arscSizeDifference;
    }

    public Integer getArscSizeDifferencePercentage() {
        return arscSizeDifferencePercentage;
    }

    public void setArscSizeDifferencePercentage(Integer arscSizeDifferencePercentage) {
        this.arscSizeDifferencePercentage = arscSizeDifferencePercentage;
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

    public Integer getNumberOfActivitiesDifference() {
        return numberOfActivitiesDifference;
    }

    public void setNumberOfActivitiesDifference(Integer numberOfActivitiesDifference) {
        this.numberOfActivitiesDifference = numberOfActivitiesDifference;
    }

    public Integer getNumberOfActivitiesDifferencePercentage() {
        return numberOfActivitiesDifferencePercentage;
    }

    public void setNumberOfActivitiesDifferencePercentage(Integer numberOfActivitiesDifferencePercentage) {
        this.numberOfActivitiesDifferencePercentage = numberOfActivitiesDifferencePercentage;
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

    public Integer getNumberOfServicesDifference() {
        return numberOfServicesDifference;
    }

    public void setNumberOfServicesDifference(Integer numberOfServicesDifference) {
        this.numberOfServicesDifference = numberOfServicesDifference;
    }

    public Integer getNumberOfServicesDifferencePercentage() {
        return numberOfServicesDifferencePercentage;
    }

    public void setNumberOfServicesDifferencePercentage(Integer numberOfServicesDifferencePercentage) {
        this.numberOfServicesDifferencePercentage = numberOfServicesDifferencePercentage;
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

    public Integer getNumberOfContentProvidersDifference() {
        return numberOfContentProvidersDifference;
    }

    public void setNumberOfContentProvidersDifference(Integer numberOfContentProvidersDifference) {
        this.numberOfContentProvidersDifference = numberOfContentProvidersDifference;
    }

    public Integer getNumberOfContentProvidersDifferencePercentage() {
        return numberOfContentProvidersDifferencePercentage;
    }

    public void setNumberOfContentProvidersDifferencePercentage(Integer numberOfContentProvidersDifferencePercentage) {
        this.numberOfContentProvidersDifferencePercentage = numberOfContentProvidersDifferencePercentage;
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

    public Integer getNumberOfBroadcastReceiversDifference() {
        return numberOfBroadcastReceiversDifference;
    }

    public void setNumberOfBroadcastReceiversDifference(Integer numberOfBroadcastReceiversDifference) {
        this.numberOfBroadcastReceiversDifference = numberOfBroadcastReceiversDifference;
    }

    public Integer getNumberOfBroadcastReceiversDifferencePercentage() {
        return numberOfBroadcastReceiversDifferencePercentage;
    }

    public void setNumberOfBroadcastReceiversDifferencePercentage(Integer numberOfBroadcastReceiversDifferencePercentage) {
        this.numberOfBroadcastReceiversDifferencePercentage = numberOfBroadcastReceiversDifferencePercentage;
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

    public Integer getNumberOfPermissionsDifference() {
        return numberOfPermissionsDifference;
    }

    public void setNumberOfPermissionsDifference(Integer numberOfPermissionsDifference) {
        this.numberOfPermissionsDifference = numberOfPermissionsDifference;
    }

    public Integer getNumberOfPermissionsDifferencePercentage() {
        return numberOfPermissionsDifferencePercentage;
    }

    public void setNumberOfPermissionsDifferencePercentage(Integer numberOfPermissionsDifferencePercentage) {
        this.numberOfPermissionsDifferencePercentage = numberOfPermissionsDifferencePercentage;
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

    public Integer getNumberOfLibrariesDifference() {
        return numberOfLibrariesDifference;
    }

    public void setNumberOfLibrariesDifference(Integer numberOfLibrariesDifference) {
        this.numberOfLibrariesDifference = numberOfLibrariesDifference;
    }

    public Integer getNumberOfLibrariesDifferencePercentage() {
        return numberOfLibrariesDifferencePercentage;
    }

    public void setNumberOfLibrariesDifferencePercentage(Integer numberOfLibrariesDifferencePercentage) {
        this.numberOfLibrariesDifferencePercentage = numberOfLibrariesDifferencePercentage;
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

    public Integer getNumberOfFeaturesDifference() {
        return numberOfFeaturesDifference;
    }

    public void setNumberOfFeaturesDifference(Integer numberOfFeaturesDifference) {
        this.numberOfFeaturesDifference = numberOfFeaturesDifference;
    }

    public Integer getNumberOfFeaturesDifferencePercentage() {
        return numberOfFeaturesDifferencePercentage;
    }

    public void setNumberOfFeaturesDifferencePercentage(Integer numberOfFeaturesDifferencePercentage) {
        this.numberOfFeaturesDifferencePercentage = numberOfFeaturesDifferencePercentage;
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

    public Integer getGetNumberOfLocalesDifferencePercentage() {
        return getNumberOfLocalesDifferencePercentage;
    }

    public void setGetNumberOfLocalesDifferencePercentage(Integer getNumberOfLocalesDifferencePercentage) {
        this.getNumberOfLocalesDifferencePercentage = getNumberOfLocalesDifferencePercentage;
    }

    public Integer getNumberOfLocalesDifference() {
        return numberOfLocalesDifference;
    }

    public void setNumberOfLocalesDifference(Integer numberOfLocalesDifference) {
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

    public Integer getNumberOfStringResourceDifference() {
        return numberOfStringResourceDifference;
    }

    public void setNumberOfStringResourceDifference(Integer numberOfStringResourceDifference) {
        this.numberOfStringResourceDifference = numberOfStringResourceDifference;
    }

    public Integer getNumberOfStringResourceDifferencePercentage() {
        return numberOfStringResourceDifferencePercentage;
    }

    public void setNumberOfStringResourceDifferencePercentage(Integer numberOfStringResourceDifferencePercentage) {
        this.numberOfStringResourceDifferencePercentage = numberOfStringResourceDifferencePercentage;
    }

    public Integer getNumberOfPngDrawablesDifference() {
        return numberOfPngDrawablesDifference;
    }

    public void setNumberOfPngDrawablesDifference(Integer numberOfPngDrawablesDifference) {
        this.numberOfPngDrawablesDifference = numberOfPngDrawablesDifference;
    }

    public Integer getNumberOfPngDrawablesDifferencePercentage() {
        return numberOfPngDrawablesDifferencePercentage;
    }

    public void setNumberOfPngDrawablesDifferencePercentage(Integer numberOfPngDrawablesDifferencePercentage) {
        this.numberOfPngDrawablesDifferencePercentage = numberOfPngDrawablesDifferencePercentage;
    }

    public Integer getNumberOfJpgDrawablesDifference() {
        return numberOfJpgDrawablesDifference;
    }

    public void setNumberOfJpgDrawablesDifference(Integer numberOfJpgDrawablesDifference) {
        this.numberOfJpgDrawablesDifference = numberOfJpgDrawablesDifference;
    }

    public Integer getNumberOfJpgDrawablesDifferencePercentage() {
        return numberOfJpgDrawablesDifferencePercentage;
    }

    public void setNumberOfJpgDrawablesDifferencePercentage(Integer numberOfJpgDrawablesDifferencePercentage) {
        this.numberOfJpgDrawablesDifferencePercentage = numberOfJpgDrawablesDifferencePercentage;
    }

    public Integer getNumberOfGifDrawablesDifference() {
        return numberOfGifDrawablesDifference;
    }

    public void setNumberOfGifDrawablesDifference(Integer numberOfGifDrawablesDifference) {
        this.numberOfGifDrawablesDifference = numberOfGifDrawablesDifference;
    }

    public Integer getNumberOfGifDrawablesDifferencePercentage() {
        return numberOfGifDrawablesDifferencePercentage;
    }

    public void setNumberOfGifDrawablesDifferencePercentage(Integer numberOfGifDrawablesDifferencePercentage) {
        this.numberOfGifDrawablesDifferencePercentage = numberOfGifDrawablesDifferencePercentage;
    }

    public Integer getNumberOfXmlDrawablesDifference() {
        return numberOfXmlDrawablesDifference;
    }

    public void setNumberOfXmlDrawablesDifference(Integer numberOfXmlDrawablesDifference) {
        this.numberOfXmlDrawablesDifference = numberOfXmlDrawablesDifference;
    }

    public Integer getNumberOfXmlDrawablesDifferencePercentage() {
        return numberOfXmlDrawablesDifferencePercentage;
    }

    public void setNumberOfXmlDrawablesDifferencePercentage(Integer numberOfXmlDrawablesDifferencePercentage) {
        this.numberOfXmlDrawablesDifferencePercentage = numberOfXmlDrawablesDifferencePercentage;
    }

    public Integer getNumberOfLdpiDrawablesDifference() {
        return numberOfLdpiDrawablesDifference;
    }

    public void setNumberOfLdpiDrawablesDifference(Integer numberOfLdpiDrawablesDifference) {
        this.numberOfLdpiDrawablesDifference = numberOfLdpiDrawablesDifference;
    }

    public Integer getNumberOfLdpiDrawablesDifferencePercentage() {
        return numberOfLdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfLdpiDrawablesDifferencePercentage(Integer numberOfLdpiDrawablesDifferencePercentage) {
        this.numberOfLdpiDrawablesDifferencePercentage = numberOfLdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfDifferentDrawablesDifference() {
        return numberOfDifferentDrawablesDifference;
    }

    public void setNumberOfDifferentDrawablesDifference(Integer numberOfDifferentDrawablesDifference) {
        this.numberOfDifferentDrawablesDifference = numberOfDifferentDrawablesDifference;
    }

    public Integer getNumberOfDifferentDrawablesDifferencePercentage() {
        return numberOfDifferentDrawablesDifferencePercentage;
    }

    public void setNumberOfDifferentDrawablesDifferencePercentage(Integer numberOfDifferentDrawablesDifferencePercentage) {
        this.numberOfDifferentDrawablesDifferencePercentage = numberOfDifferentDrawablesDifferencePercentage;
    }

    public Integer getNumberOfMdpiDrawablesDifference() {
        return numberOfMdpiDrawablesDifference;
    }

    public void setNumberOfMdpiDrawablesDifference(Integer numberOfMdpiDrawablesDifference) {
        this.numberOfMdpiDrawablesDifference = numberOfMdpiDrawablesDifference;
    }

    public Integer getNumberOfMdpiDrawablesDifferencePercentage() {
        return numberOfMdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfMdpiDrawablesDifferencePercentage(Integer numberOfMdpiDrawablesDifferencePercentage) {
        this.numberOfMdpiDrawablesDifferencePercentage = numberOfMdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfHdpiDrawablesDifference() {
        return numberOfHdpiDrawablesDifference;
    }

    public void setNumberOfHdpiDrawablesDifference(Integer numberOfHdpiDrawablesDifference) {
        this.numberOfHdpiDrawablesDifference = numberOfHdpiDrawablesDifference;
    }

    public Integer getNumberOfHdpiDrawablesDifferencePercentage() {
        return numberOfHdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfHdpiDrawablesDifferencePercentage(Integer numberOfHdpiDrawablesDifferencePercentage) {
        this.numberOfHdpiDrawablesDifferencePercentage = numberOfHdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfXhdpiDrawablesDifference() {
        return numberOfXhdpiDrawablesDifference;
    }

    public void setNumberOfXhdpiDrawablesDifference(Integer numberOfXhdpiDrawablesDifference) {
        this.numberOfXhdpiDrawablesDifference = numberOfXhdpiDrawablesDifference;
    }

    public Integer getNumberOfXhdpiDrawablesDifferencePercentage() {
        return numberOfXhdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfXhdpiDrawablesDifferencePercentage(Integer numberOfXhdpiDrawablesDifferencePercentage) {
        this.numberOfXhdpiDrawablesDifferencePercentage = numberOfXhdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfXxhdpiDrawablesDifference() {
        return numberOfXxhdpiDrawablesDifference;
    }

    public void setNumberOfXxhdpiDrawablesDifference(Integer numberOfXxhdpiDrawablesDifference) {
        this.numberOfXxhdpiDrawablesDifference = numberOfXxhdpiDrawablesDifference;
    }

    public Integer getNumberOfXxhdpiDrawablesDifferencePercentage() {
        return numberOfXxhdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfXxhdpiDrawablesDifferencePercentage(Integer numberOfXxhdpiDrawablesDifferencePercentage) {
        this.numberOfXxhdpiDrawablesDifferencePercentage = numberOfXxhdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfXxxhdpiDrawablesDifference() {
        return numberOfXxxhdpiDrawablesDifference;
    }

    public void setNumberOfXxxhdpiDrawablesDifference(Integer numberOfXxxhdpiDrawablesDifference) {
        this.numberOfXxxhdpiDrawablesDifference = numberOfXxxhdpiDrawablesDifference;
    }

    public Integer getNumberOfXxxhdpiDrawablesDifferencePercentage() {
        return numberOfXxxhdpiDrawablesDifferencePercentage;
    }

    public void setNumberOfXxxhdpiDrawablesDifferencePercentage(Integer numberOfXxxhdpiDrawablesDifferencePercentage) {
        this.numberOfXxxhdpiDrawablesDifferencePercentage = numberOfXxxhdpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfUnspecifiedDpiDrawablesDifference() {
        return numberOfUnspecifiedDpiDrawablesDifference;
    }

    public void setNumberOfUnspecifiedDpiDrawablesDifference(Integer numberOfUnspecifiedDpiDrawablesDifference) {
        this.numberOfUnspecifiedDpiDrawablesDifference = numberOfUnspecifiedDpiDrawablesDifference;
    }

    public Integer getNumberOfUnspecifiedDpiDrawablesDifferencePercentage() {
        return numberOfUnspecifiedDpiDrawablesDifferencePercentage;
    }

    public void setNumberOfUnspecifiedDpiDrawablesDifferencePercentage(Integer numberOfUnspecifiedDpiDrawablesDifferencePercentage) {
        this.numberOfUnspecifiedDpiDrawablesDifferencePercentage = numberOfUnspecifiedDpiDrawablesDifferencePercentage;
    }

    public Integer getNumberOfRawResourcesDifference() {
        return numberOfRawResourcesDifference;
    }

    public void setNumberOfRawResourcesDifference(Integer numberOfRawResourcesDifference) {
        this.numberOfRawResourcesDifference = numberOfRawResourcesDifference;
    }

    public Integer getNumberOfRawResourcesDifferencePercentage() {
        return numberOfRawResourcesDifferencePercentage;
    }

    public void setNumberOfRawResourcesDifferencePercentage(Integer numberOfRawResourcesDifferencePercentage) {
        this.numberOfRawResourcesDifferencePercentage = numberOfRawResourcesDifferencePercentage;
    }

    public Integer getNumberOfMenusDifference() {
        return numberOfMenusDifference;
    }

    public void setNumberOfMenusDifference(Integer numberOfMenusDifference) {
        this.numberOfMenusDifference = numberOfMenusDifference;
    }

    public Integer getNumberOfMenusDifferencePercentage() {
        return numberOfMenusDifferencePercentage;
    }

    public void setNumberOfMenusDifferencePercentage(Integer numberOfMenusDifferencePercentage) {
        this.numberOfMenusDifferencePercentage = numberOfMenusDifferencePercentage;
    }

    public Integer getNumberOfLayoutsDifference() {
        return numberOfLayoutsDifference;
    }

    public void setNumberOfLayoutsDifference(Integer numberOfLayoutsDifference) {
        this.numberOfLayoutsDifference = numberOfLayoutsDifference;
    }

    public Integer getNumberOfLayoutsDifferencePercentage() {
        return numberOfLayoutsDifferencePercentage;
    }

    public void setNumberOfLayoutsDifferencePercentage(Integer numberOfLayoutsDifferencePercentage) {
        this.numberOfLayoutsDifferencePercentage = numberOfLayoutsDifferencePercentage;
    }

    public Integer getNumberOfDifferentLayoutsDifference() {
        return numberOfDifferentLayoutsDifference;
    }

    public void setNumberOfDifferentLayoutsDifference(Integer numberOfDifferentLayoutsDifference) {
        this.numberOfDifferentLayoutsDifference = numberOfDifferentLayoutsDifference;
    }

    public Integer getNumberOfDifferentLayoutsDifferencePercentage() {
        return numberOfDifferentLayoutsDifferencePercentage;
    }

    public void setNumberOfDifferentLayoutsDifferencePercentage(Integer numberOfDifferentLayoutsDifferencePercentage) {
        this.numberOfDifferentLayoutsDifferencePercentage = numberOfDifferentLayoutsDifferencePercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataCompareResult that = (MetadataCompareResult) o;

        if (fileSizeDifference != null ? !fileSizeDifference.equals(that.fileSizeDifference) : that.fileSizeDifference != null)
            return false;
        if (fileSizeDifferencePercentage != null ? !fileSizeDifferencePercentage.equals(that.fileSizeDifferencePercentage) : that.fileSizeDifferencePercentage != null)
            return false;
        if (dexSizeDifference != null ? !dexSizeDifference.equals(that.dexSizeDifference) : that.dexSizeDifference != null)
            return false;
        if (dexSizeDifferencePercentage != null ? !dexSizeDifferencePercentage.equals(that.dexSizeDifferencePercentage) : that.dexSizeDifferencePercentage != null)
            return false;
        if (arscSizeDifference != null ? !arscSizeDifference.equals(that.arscSizeDifference) : that.arscSizeDifference != null)
            return false;
        if (arscSizeDifferencePercentage != null ? !arscSizeDifferencePercentage.equals(that.arscSizeDifferencePercentage) : that.arscSizeDifferencePercentage != null)
            return false;
        if (isPackageNameSame != null ? !isPackageNameSame.equals(that.isPackageNameSame) : that.isPackageNameSame != null)
            return false;
        if (packageNameDifference != null ? !packageNameDifference.equals(that.packageNameDifference) : that.packageNameDifference != null)
            return false;
        if (isVersionCodeSame != null ? !isVersionCodeSame.equals(that.isVersionCodeSame) : that.isVersionCodeSame != null)
            return false;
        if (versionCodeDifference != null ? !versionCodeDifference.equals(that.versionCodeDifference) : that.versionCodeDifference != null)
            return false;
        if (isInstallLocationSame != null ? !isInstallLocationSame.equals(that.isInstallLocationSame) : that.isInstallLocationSame != null)
            return false;
        if (installLocationDifference != null ? !installLocationDifference.equals(that.installLocationDifference) : that.installLocationDifference != null)
            return false;
        if (isUsesMinSdkVersionSame != null ? !isUsesMinSdkVersionSame.equals(that.isUsesMinSdkVersionSame) : that.isUsesMinSdkVersionSame != null)
            return false;
        if (usesMinSdkVersionDifference != null ? !usesMinSdkVersionDifference.equals(that.usesMinSdkVersionDifference) : that.usesMinSdkVersionDifference != null)
            return false;
        if (isUsesTargetSdkVersionSame != null ? !isUsesTargetSdkVersionSame.equals(that.isUsesTargetSdkVersionSame) : that.isUsesTargetSdkVersionSame != null)
            return false;
        if (usesTargetSdkVersionDifference != null ? !usesTargetSdkVersionDifference.equals(that.usesTargetSdkVersionDifference) : that.usesTargetSdkVersionDifference != null)
            return false;
        if (isUsesMaxSdkVersionSame != null ? !isUsesMaxSdkVersionSame.equals(that.isUsesMaxSdkVersionSame) : that.isUsesMaxSdkVersionSame != null)
            return false;
        if (usesMaxSdkVersionDifference != null ? !usesMaxSdkVersionDifference.equals(that.usesMaxSdkVersionDifference) : that.usesMaxSdkVersionDifference != null)
            return false;
        if (isSupportsScreensResizeableSame != null ? !isSupportsScreensResizeableSame.equals(that.isSupportsScreensResizeableSame) : that.isSupportsScreensResizeableSame != null)
            return false;
        if (supportsScreensResizeableDifference != null ? !supportsScreensResizeableDifference.equals(that.supportsScreensResizeableDifference) : that.supportsScreensResizeableDifference != null)
            return false;
        if (isSupportsScreensSmallSame != null ? !isSupportsScreensSmallSame.equals(that.isSupportsScreensSmallSame) : that.isSupportsScreensSmallSame != null)
            return false;
        if (supportsScreensSmallDifference != null ? !supportsScreensSmallDifference.equals(that.supportsScreensSmallDifference) : that.supportsScreensSmallDifference != null)
            return false;
        if (isSupportsScreensNormalSame != null ? !isSupportsScreensNormalSame.equals(that.isSupportsScreensNormalSame) : that.isSupportsScreensNormalSame != null)
            return false;
        if (supportsScreensNormalDifference != null ? !supportsScreensNormalDifference.equals(that.supportsScreensNormalDifference) : that.supportsScreensNormalDifference != null)
            return false;
        if (isSupportsScreensLargeSame != null ? !isSupportsScreensLargeSame.equals(that.isSupportsScreensLargeSame) : that.isSupportsScreensLargeSame != null)
            return false;
        if (supportsScreensLargeDifference != null ? !supportsScreensLargeDifference.equals(that.supportsScreensLargeDifference) : that.supportsScreensLargeDifference != null)
            return false;
        if (isSupportsScreensXLargeSame != null ? !isSupportsScreensXLargeSame.equals(that.isSupportsScreensXLargeSame) : that.isSupportsScreensXLargeSame != null)
            return false;
        if (supportsScreensXLargeDifference != null ? !supportsScreensXLargeDifference.equals(that.supportsScreensXLargeDifference) : that.supportsScreensXLargeDifference != null)
            return false;
        if (isSupportsScreensAnyDansitySame != null ? !isSupportsScreensAnyDansitySame.equals(that.isSupportsScreensAnyDansitySame) : that.isSupportsScreensAnyDansitySame != null)
            return false;
        if (supportsScreensAnyDensityDifference != null ? !supportsScreensAnyDensityDifference.equals(that.supportsScreensAnyDensityDifference) : that.supportsScreensAnyDensityDifference != null)
            return false;
        if (numberOfActivitiesDifference != null ? !numberOfActivitiesDifference.equals(that.numberOfActivitiesDifference) : that.numberOfActivitiesDifference != null)
            return false;
        if (numberOfActivitiesDifferencePercentage != null ? !numberOfActivitiesDifferencePercentage.equals(that.numberOfActivitiesDifferencePercentage) : that.numberOfActivitiesDifferencePercentage != null)
            return false;
        if (additionalActivitiesInA != null ? !additionalActivitiesInA.equals(that.additionalActivitiesInA) : that.additionalActivitiesInA != null)
            return false;
        if (additionalActivitiesInB != null ? !additionalActivitiesInB.equals(that.additionalActivitiesInB) : that.additionalActivitiesInB != null)
            return false;
        if (numberOfServicesDifference != null ? !numberOfServicesDifference.equals(that.numberOfServicesDifference) : that.numberOfServicesDifference != null)
            return false;
        if (numberOfServicesDifferencePercentage != null ? !numberOfServicesDifferencePercentage.equals(that.numberOfServicesDifferencePercentage) : that.numberOfServicesDifferencePercentage != null)
            return false;
        if (additionalServicesInA != null ? !additionalServicesInA.equals(that.additionalServicesInA) : that.additionalServicesInA != null)
            return false;
        if (additionalServicesInB != null ? !additionalServicesInB.equals(that.additionalServicesInB) : that.additionalServicesInB != null)
            return false;
        if (numberOfContentProvidersDifference != null ? !numberOfContentProvidersDifference.equals(that.numberOfContentProvidersDifference) : that.numberOfContentProvidersDifference != null)
            return false;
        if (numberOfContentProvidersDifferencePercentage != null ? !numberOfContentProvidersDifferencePercentage.equals(that.numberOfContentProvidersDifferencePercentage) : that.numberOfContentProvidersDifferencePercentage != null)
            return false;
        if (additionalContentProvidersInA != null ? !additionalContentProvidersInA.equals(that.additionalContentProvidersInA) : that.additionalContentProvidersInA != null)
            return false;
        if (additionalContentProvidersInB != null ? !additionalContentProvidersInB.equals(that.additionalContentProvidersInB) : that.additionalContentProvidersInB != null)
            return false;
        if (numberOfBroadcastReceiversDifference != null ? !numberOfBroadcastReceiversDifference.equals(that.numberOfBroadcastReceiversDifference) : that.numberOfBroadcastReceiversDifference != null)
            return false;
        if (numberOfBroadcastReceiversDifferencePercentage != null ? !numberOfBroadcastReceiversDifferencePercentage.equals(that.numberOfBroadcastReceiversDifferencePercentage) : that.numberOfBroadcastReceiversDifferencePercentage != null)
            return false;
        if (additionalBroadcastReceiversInA != null ? !additionalBroadcastReceiversInA.equals(that.additionalBroadcastReceiversInA) : that.additionalBroadcastReceiversInA != null)
            return false;
        if (additionalBroadcastReceiversInB != null ? !additionalBroadcastReceiversInB.equals(that.additionalBroadcastReceiversInB) : that.additionalBroadcastReceiversInB != null)
            return false;
        if (numberOfPermissionsDifference != null ? !numberOfPermissionsDifference.equals(that.numberOfPermissionsDifference) : that.numberOfPermissionsDifference != null)
            return false;
        if (numberOfPermissionsDifferencePercentage != null ? !numberOfPermissionsDifferencePercentage.equals(that.numberOfPermissionsDifferencePercentage) : that.numberOfPermissionsDifferencePercentage != null)
            return false;
        if (additionalPermissionsInA != null ? !additionalPermissionsInA.equals(that.additionalPermissionsInA) : that.additionalPermissionsInA != null)
            return false;
        if (additionalPermissionsInB != null ? !additionalPermissionsInB.equals(that.additionalPermissionsInB) : that.additionalPermissionsInB != null)
            return false;
        if (numberOfLibrariesDifference != null ? !numberOfLibrariesDifference.equals(that.numberOfLibrariesDifference) : that.numberOfLibrariesDifference != null)
            return false;
        if (numberOfLibrariesDifferencePercentage != null ? !numberOfLibrariesDifferencePercentage.equals(that.numberOfLibrariesDifferencePercentage) : that.numberOfLibrariesDifferencePercentage != null)
            return false;
        if (additionalLibrariesInA != null ? !additionalLibrariesInA.equals(that.additionalLibrariesInA) : that.additionalLibrariesInA != null)
            return false;
        if (additionalLibrariesInB != null ? !additionalLibrariesInB.equals(that.additionalLibrariesInB) : that.additionalLibrariesInB != null)
            return false;
        if (numberOfFeaturesDifference != null ? !numberOfFeaturesDifference.equals(that.numberOfFeaturesDifference) : that.numberOfFeaturesDifference != null)
            return false;
        if (numberOfFeaturesDifferencePercentage != null ? !numberOfFeaturesDifferencePercentage.equals(that.numberOfFeaturesDifferencePercentage) : that.numberOfFeaturesDifferencePercentage != null)
            return false;
        if (additionalFeaturesInA != null ? !additionalFeaturesInA.equals(that.additionalFeaturesInA) : that.additionalFeaturesInA != null)
            return false;
        if (additionalFeaturesInB != null ? !additionalFeaturesInB.equals(that.additionalFeaturesInB) : that.additionalFeaturesInB != null)
            return false;
        if (isCertificateSignAlgorithmSame != null ? !isCertificateSignAlgorithmSame.equals(that.isCertificateSignAlgorithmSame) : that.isCertificateSignAlgorithmSame != null)
            return false;
        if (certificateSignAlgorithmDifference != null ? !certificateSignAlgorithmDifference.equals(that.certificateSignAlgorithmDifference) : that.certificateSignAlgorithmDifference != null)
            return false;
        if (isCertificateStartDateSame != null ? !isCertificateStartDateSame.equals(that.isCertificateStartDateSame) : that.isCertificateStartDateSame != null)
            return false;
        if (certificateStartDateDifference != null ? !certificateStartDateDifference.equals(that.certificateStartDateDifference) : that.certificateStartDateDifference != null)
            return false;
        if (isCertificateEndDateSame != null ? !isCertificateEndDateSame.equals(that.isCertificateEndDateSame) : that.isCertificateEndDateSame != null)
            return false;
        if (certificateEndDateDifference != null ? !certificateEndDateDifference.equals(that.certificateEndDateDifference) : that.certificateEndDateDifference != null)
            return false;
        if (isCertificatePublicKeySame != null ? !isCertificatePublicKeySame.equals(that.isCertificatePublicKeySame) : that.isCertificatePublicKeySame != null)
            return false;
        if (isCertificateSame != null ? !isCertificateSame.equals(that.isCertificateSame) : that.isCertificateSame != null)
            return false;
        if (isCertificateVersionSame != null ? !isCertificateVersionSame.equals(that.isCertificateVersionSame) : that.isCertificateVersionSame != null)
            return false;
        if (certificateVersionDifference != null ? !certificateVersionDifference.equals(that.certificateVersionDifference) : that.certificateVersionDifference != null)
            return false;
        if (isCertificateIssuerNameSame != null ? !isCertificateIssuerNameSame.equals(that.isCertificateIssuerNameSame) : that.isCertificateIssuerNameSame != null)
            return false;
        if (certificateIssuerNameDifference != null ? !certificateIssuerNameDifference.equals(that.certificateIssuerNameDifference) : that.certificateIssuerNameDifference != null)
            return false;
        if (isCertificateSubjectNameSame != null ? !isCertificateSubjectNameSame.equals(that.isCertificateSubjectNameSame) : that.isCertificateSubjectNameSame != null)
            return false;
        if (certificateSubjectNameDifference != null ? !certificateSubjectNameDifference.equals(that.certificateSubjectNameDifference) : that.certificateSubjectNameDifference != null)
            return false;
        if (additionalLocalesInA != null ? !additionalLocalesInA.equals(that.additionalLocalesInA) : that.additionalLocalesInA != null)
            return false;
        if (additionalLocalesInB != null ? !additionalLocalesInB.equals(that.additionalLocalesInB) : that.additionalLocalesInB != null)
            return false;
        if (numberOfStringResourceDifference != null ? !numberOfStringResourceDifference.equals(that.numberOfStringResourceDifference) : that.numberOfStringResourceDifference != null)
            return false;
        if (numberOfStringResourceDifferencePercentage != null ? !numberOfStringResourceDifferencePercentage.equals(that.numberOfStringResourceDifferencePercentage) : that.numberOfStringResourceDifferencePercentage != null)
            return false;
        if (numberOfPngDrawablesDifference != null ? !numberOfPngDrawablesDifference.equals(that.numberOfPngDrawablesDifference) : that.numberOfPngDrawablesDifference != null)
            return false;
        if (numberOfPngDrawablesDifferencePercentage != null ? !numberOfPngDrawablesDifferencePercentage.equals(that.numberOfPngDrawablesDifferencePercentage) : that.numberOfPngDrawablesDifferencePercentage != null)
            return false;
        if (numberOfJpgDrawablesDifference != null ? !numberOfJpgDrawablesDifference.equals(that.numberOfJpgDrawablesDifference) : that.numberOfJpgDrawablesDifference != null)
            return false;
        if (numberOfJpgDrawablesDifferencePercentage != null ? !numberOfJpgDrawablesDifferencePercentage.equals(that.numberOfJpgDrawablesDifferencePercentage) : that.numberOfJpgDrawablesDifferencePercentage != null)
            return false;
        if (numberOfGifDrawablesDifference != null ? !numberOfGifDrawablesDifference.equals(that.numberOfGifDrawablesDifference) : that.numberOfGifDrawablesDifference != null)
            return false;
        if (numberOfGifDrawablesDifferencePercentage != null ? !numberOfGifDrawablesDifferencePercentage.equals(that.numberOfGifDrawablesDifferencePercentage) : that.numberOfGifDrawablesDifferencePercentage != null)
            return false;
        if (numberOfXmlDrawablesDifference != null ? !numberOfXmlDrawablesDifference.equals(that.numberOfXmlDrawablesDifference) : that.numberOfXmlDrawablesDifference != null)
            return false;
        if (numberOfXmlDrawablesDifferencePercentage != null ? !numberOfXmlDrawablesDifferencePercentage.equals(that.numberOfXmlDrawablesDifferencePercentage) : that.numberOfXmlDrawablesDifferencePercentage != null)
            return false;
        if (numberOfLdpiDrawablesDifference != null ? !numberOfLdpiDrawablesDifference.equals(that.numberOfLdpiDrawablesDifference) : that.numberOfLdpiDrawablesDifference != null)
            return false;
        if (numberOfLdpiDrawablesDifferencePercentage != null ? !numberOfLdpiDrawablesDifferencePercentage.equals(that.numberOfLdpiDrawablesDifferencePercentage) : that.numberOfLdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfMdpiDrawablesDifference != null ? !numberOfMdpiDrawablesDifference.equals(that.numberOfMdpiDrawablesDifference) : that.numberOfMdpiDrawablesDifference != null)
            return false;
        if (numberOfMdpiDrawablesDifferencePercentage != null ? !numberOfMdpiDrawablesDifferencePercentage.equals(that.numberOfMdpiDrawablesDifferencePercentage) : that.numberOfMdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfHdpiDrawablesDifference != null ? !numberOfHdpiDrawablesDifference.equals(that.numberOfHdpiDrawablesDifference) : that.numberOfHdpiDrawablesDifference != null)
            return false;
        if (numberOfHdpiDrawablesDifferencePercentage != null ? !numberOfHdpiDrawablesDifferencePercentage.equals(that.numberOfHdpiDrawablesDifferencePercentage) : that.numberOfHdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfXhdpiDrawablesDifference != null ? !numberOfXhdpiDrawablesDifference.equals(that.numberOfXhdpiDrawablesDifference) : that.numberOfXhdpiDrawablesDifference != null)
            return false;
        if (numberOfXhdpiDrawablesDifferencePercentage != null ? !numberOfXhdpiDrawablesDifferencePercentage.equals(that.numberOfXhdpiDrawablesDifferencePercentage) : that.numberOfXhdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfXxhdpiDrawablesDifference != null ? !numberOfXxhdpiDrawablesDifference.equals(that.numberOfXxhdpiDrawablesDifference) : that.numberOfXxhdpiDrawablesDifference != null)
            return false;
        if (numberOfXxhdpiDrawablesDifferencePercentage != null ? !numberOfXxhdpiDrawablesDifferencePercentage.equals(that.numberOfXxhdpiDrawablesDifferencePercentage) : that.numberOfXxhdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfXxxhdpiDrawablesDifference != null ? !numberOfXxxhdpiDrawablesDifference.equals(that.numberOfXxxhdpiDrawablesDifference) : that.numberOfXxxhdpiDrawablesDifference != null)
            return false;
        if (numberOfXxxhdpiDrawablesDifferencePercentage != null ? !numberOfXxxhdpiDrawablesDifferencePercentage.equals(that.numberOfXxxhdpiDrawablesDifferencePercentage) : that.numberOfXxxhdpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfUnspecifiedDpiDrawablesDifference != null ? !numberOfUnspecifiedDpiDrawablesDifference.equals(that.numberOfUnspecifiedDpiDrawablesDifference) : that.numberOfUnspecifiedDpiDrawablesDifference != null)
            return false;
        if (numberOfUnspecifiedDpiDrawablesDifferencePercentage != null ? !numberOfUnspecifiedDpiDrawablesDifferencePercentage.equals(that.numberOfUnspecifiedDpiDrawablesDifferencePercentage) : that.numberOfUnspecifiedDpiDrawablesDifferencePercentage != null)
            return false;
        if (numberOfRawResourcesDifference != null ? !numberOfRawResourcesDifference.equals(that.numberOfRawResourcesDifference) : that.numberOfRawResourcesDifference != null)
            return false;
        if (numberOfRawResourcesDifferencePercentage != null ? !numberOfRawResourcesDifferencePercentage.equals(that.numberOfRawResourcesDifferencePercentage) : that.numberOfRawResourcesDifferencePercentage != null)
            return false;
        if (numberOfMenusDifference != null ? !numberOfMenusDifference.equals(that.numberOfMenusDifference) : that.numberOfMenusDifference != null)
            return false;
        if (numberOfMenusDifferencePercentage != null ? !numberOfMenusDifferencePercentage.equals(that.numberOfMenusDifferencePercentage) : that.numberOfMenusDifferencePercentage != null)
            return false;
        if (numberOfLayoutsDifference != null ? !numberOfLayoutsDifference.equals(that.numberOfLayoutsDifference) : that.numberOfLayoutsDifference != null)
            return false;
        if (numberOfLayoutsDifferencePercentage != null ? !numberOfLayoutsDifferencePercentage.equals(that.numberOfLayoutsDifferencePercentage) : that.numberOfLayoutsDifferencePercentage != null)
            return false;
        if (numberOfDifferentLayoutsDifference != null ? !numberOfDifferentLayoutsDifference.equals(that.numberOfDifferentLayoutsDifference) : that.numberOfDifferentLayoutsDifference != null)
            return false;
        return !(numberOfDifferentLayoutsDifferencePercentage != null ? !numberOfDifferentLayoutsDifferencePercentage.equals(that.numberOfDifferentLayoutsDifferencePercentage) : that.numberOfDifferentLayoutsDifferencePercentage != null);

    }

    @Override
    public int hashCode() {
        int result = fileSizeDifference != null ? fileSizeDifference.hashCode() : 0;
        result = 31 * result + (fileSizeDifferencePercentage != null ? fileSizeDifferencePercentage.hashCode() : 0);
        result = 31 * result + (dexSizeDifference != null ? dexSizeDifference.hashCode() : 0);
        result = 31 * result + (dexSizeDifferencePercentage != null ? dexSizeDifferencePercentage.hashCode() : 0);
        result = 31 * result + (arscSizeDifference != null ? arscSizeDifference.hashCode() : 0);
        result = 31 * result + (arscSizeDifferencePercentage != null ? arscSizeDifferencePercentage.hashCode() : 0);
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
        result = 31 * result + (numberOfActivitiesDifferencePercentage != null ? numberOfActivitiesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalActivitiesInA != null ? additionalActivitiesInA.hashCode() : 0);
        result = 31 * result + (additionalActivitiesInB != null ? additionalActivitiesInB.hashCode() : 0);
        result = 31 * result + (numberOfServicesDifference != null ? numberOfServicesDifference.hashCode() : 0);
        result = 31 * result + (numberOfServicesDifferencePercentage != null ? numberOfServicesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalServicesInA != null ? additionalServicesInA.hashCode() : 0);
        result = 31 * result + (additionalServicesInB != null ? additionalServicesInB.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersDifference != null ? numberOfContentProvidersDifference.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersDifferencePercentage != null ? numberOfContentProvidersDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalContentProvidersInA != null ? additionalContentProvidersInA.hashCode() : 0);
        result = 31 * result + (additionalContentProvidersInB != null ? additionalContentProvidersInB.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversDifference != null ? numberOfBroadcastReceiversDifference.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversDifferencePercentage != null ? numberOfBroadcastReceiversDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalBroadcastReceiversInA != null ? additionalBroadcastReceiversInA.hashCode() : 0);
        result = 31 * result + (additionalBroadcastReceiversInB != null ? additionalBroadcastReceiversInB.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsDifference != null ? numberOfPermissionsDifference.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsDifferencePercentage != null ? numberOfPermissionsDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalPermissionsInA != null ? additionalPermissionsInA.hashCode() : 0);
        result = 31 * result + (additionalPermissionsInB != null ? additionalPermissionsInB.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesDifference != null ? numberOfLibrariesDifference.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesDifferencePercentage != null ? numberOfLibrariesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (additionalLibrariesInA != null ? additionalLibrariesInA.hashCode() : 0);
        result = 31 * result + (additionalLibrariesInB != null ? additionalLibrariesInB.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesDifference != null ? numberOfFeaturesDifference.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesDifferencePercentage != null ? numberOfFeaturesDifferencePercentage.hashCode() : 0);
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
        result = 31 * result + (additionalLocalesInA != null ? additionalLocalesInA.hashCode() : 0);
        result = 31 * result + (additionalLocalesInB != null ? additionalLocalesInB.hashCode() : 0);
        result = 31 * result + (numberOfStringResourceDifference != null ? numberOfStringResourceDifference.hashCode() : 0);
        result = 31 * result + (numberOfStringResourceDifferencePercentage != null ? numberOfStringResourceDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfPngDrawablesDifference != null ? numberOfPngDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfPngDrawablesDifferencePercentage != null ? numberOfPngDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfJpgDrawablesDifference != null ? numberOfJpgDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfJpgDrawablesDifferencePercentage != null ? numberOfJpgDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfGifDrawablesDifference != null ? numberOfGifDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfGifDrawablesDifferencePercentage != null ? numberOfGifDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfXmlDrawablesDifference != null ? numberOfXmlDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXmlDrawablesDifferencePercentage != null ? numberOfXmlDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfLdpiDrawablesDifference != null ? numberOfLdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfLdpiDrawablesDifferencePercentage != null ? numberOfLdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfMdpiDrawablesDifference != null ? numberOfMdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfMdpiDrawablesDifferencePercentage != null ? numberOfMdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfHdpiDrawablesDifference != null ? numberOfHdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfHdpiDrawablesDifferencePercentage != null ? numberOfHdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfXhdpiDrawablesDifference != null ? numberOfXhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXhdpiDrawablesDifferencePercentage != null ? numberOfXhdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfXxhdpiDrawablesDifference != null ? numberOfXxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxhdpiDrawablesDifferencePercentage != null ? numberOfXxhdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfXxxhdpiDrawablesDifference != null ? numberOfXxxhdpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfXxxhdpiDrawablesDifferencePercentage != null ? numberOfXxxhdpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfUnspecifiedDpiDrawablesDifference != null ? numberOfUnspecifiedDpiDrawablesDifference.hashCode() : 0);
        result = 31 * result + (numberOfUnspecifiedDpiDrawablesDifferencePercentage != null ? numberOfUnspecifiedDpiDrawablesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfRawResourcesDifference != null ? numberOfRawResourcesDifference.hashCode() : 0);
        result = 31 * result + (numberOfRawResourcesDifferencePercentage != null ? numberOfRawResourcesDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfMenusDifference != null ? numberOfMenusDifference.hashCode() : 0);
        result = 31 * result + (numberOfMenusDifferencePercentage != null ? numberOfMenusDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfLayoutsDifference != null ? numberOfLayoutsDifference.hashCode() : 0);
        result = 31 * result + (numberOfLayoutsDifferencePercentage != null ? numberOfLayoutsDifferencePercentage.hashCode() : 0);
        result = 31 * result + (numberOfDifferentLayoutsDifference != null ? numberOfDifferentLayoutsDifference.hashCode() : 0);
        result = 31 * result + (numberOfDifferentLayoutsDifferencePercentage != null ? numberOfDifferentLayoutsDifferencePercentage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MetadataCompareResult{" +
                "fileSizeDifference=" + fileSizeDifference +
                ", fileSizeDifferencePercentage=" + fileSizeDifferencePercentage +
                ", dexSizeDifference=" + dexSizeDifference +
                ", dexSizeDifferencePercentage=" + dexSizeDifferencePercentage +
                ", arscSizeDifference=" + arscSizeDifference +
                ", arscSizeDifferencePercentage=" + arscSizeDifferencePercentage +
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
                ", numberOfActivitiesDifferencePercentage=" + numberOfActivitiesDifferencePercentage +
                ", additionalActivitiesInA=" + additionalActivitiesInA +
                ", additionalActivitiesInB=" + additionalActivitiesInB +
                ", numberOfServicesDifference=" + numberOfServicesDifference +
                ", numberOfServicesDifferencePercentage=" + numberOfServicesDifferencePercentage +
                ", additionalServicesInA=" + additionalServicesInA +
                ", additionalServicesInB=" + additionalServicesInB +
                ", numberOfContentProvidersDifference=" + numberOfContentProvidersDifference +
                ", numberOfContentProvidersDifferencePercentage=" + numberOfContentProvidersDifferencePercentage +
                ", additionalContentProvidersInA=" + additionalContentProvidersInA +
                ", additionalContentProvidersInB=" + additionalContentProvidersInB +
                ", numberOfBroadcastReceiversDifference=" + numberOfBroadcastReceiversDifference +
                ", numberOfBroadcastReceiversDifferencePercentage=" + numberOfBroadcastReceiversDifferencePercentage +
                ", additionalBroadcastReceiversInA=" + additionalBroadcastReceiversInA +
                ", additionalBroadcastReceiversInB=" + additionalBroadcastReceiversInB +
                ", numberOfPermissionsDifference=" + numberOfPermissionsDifference +
                ", numberOfPermissionsDifferencePercentage=" + numberOfPermissionsDifferencePercentage +
                ", additionalPermissionsInA=" + additionalPermissionsInA +
                ", additionalPermissionsInB=" + additionalPermissionsInB +
                ", numberOfLibrariesDifference=" + numberOfLibrariesDifference +
                ", numberOfLibrariesDifferencePercentage=" + numberOfLibrariesDifferencePercentage +
                ", additionalLibrariesInA=" + additionalLibrariesInA +
                ", additionalLibrariesInB=" + additionalLibrariesInB +
                ", numberOfFeaturesDifference=" + numberOfFeaturesDifference +
                ", numberOfFeaturesDifferencePercentage=" + numberOfFeaturesDifferencePercentage +
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
                ", additionalLocalesInA=" + additionalLocalesInA +
                ", additionalLocalesInB=" + additionalLocalesInB +
                ", numberOfStringResourceDifference=" + numberOfStringResourceDifference +
                ", numberOfStringResourceDifferencePercentage=" + numberOfStringResourceDifferencePercentage +
                ", numberOfPngDrawablesDifference=" + numberOfPngDrawablesDifference +
                ", numberOfPngDrawablesDifferencePercentage=" + numberOfPngDrawablesDifferencePercentage +
                ", numberOfJpgDrawablesDifference=" + numberOfJpgDrawablesDifference +
                ", numberOfJpgDrawablesDifferencePercentage=" + numberOfJpgDrawablesDifferencePercentage +
                ", numberOfGifDrawablesDifference=" + numberOfGifDrawablesDifference +
                ", numberOfGifDrawablesDifferencePercentage=" + numberOfGifDrawablesDifferencePercentage +
                ", numberOfXmlDrawablesDifference=" + numberOfXmlDrawablesDifference +
                ", numberOfXmlDrawablesDifferencePercentage=" + numberOfXmlDrawablesDifferencePercentage +
                ", numberOfLdpiDrawablesDifference=" + numberOfLdpiDrawablesDifference +
                ", numberOfLdpiDrawablesDifferencePercentage=" + numberOfLdpiDrawablesDifferencePercentage +
                ", numberOfMdpiDrawablesDifference=" + numberOfMdpiDrawablesDifference +
                ", numberOfMdpiDrawablesDifferencePercentage=" + numberOfMdpiDrawablesDifferencePercentage +
                ", numberOfHdpiDrawablesDifference=" + numberOfHdpiDrawablesDifference +
                ", numberOfHdpiDrawablesDifferencePercentage=" + numberOfHdpiDrawablesDifferencePercentage +
                ", numberOfXhdpiDrawablesDifference=" + numberOfXhdpiDrawablesDifference +
                ", numberOfXhdpiDrawablesDifferencePercentage=" + numberOfXhdpiDrawablesDifferencePercentage +
                ", numberOfXxhdpiDrawablesDifference=" + numberOfXxhdpiDrawablesDifference +
                ", numberOfXxhdpiDrawablesDifferencePercentage=" + numberOfXxhdpiDrawablesDifferencePercentage +
                ", numberOfXxxhdpiDrawablesDifference=" + numberOfXxxhdpiDrawablesDifference +
                ", numberOfXxxhdpiDrawablesDifferencePercentage=" + numberOfXxxhdpiDrawablesDifferencePercentage +
                ", numberOfUnspecifiedDpiDrawablesDifference=" + numberOfUnspecifiedDpiDrawablesDifference +
                ", numberOfUnspecifiedDpiDrawablesDifferencePercentage=" + numberOfUnspecifiedDpiDrawablesDifferencePercentage +
                ", numberOfRawResourcesDifference=" + numberOfRawResourcesDifference +
                ", numberOfRawResourcesDifferencePercentage=" + numberOfRawResourcesDifferencePercentage +
                ", numberOfMenusDifference=" + numberOfMenusDifference +
                ", numberOfMenusDifferencePercentage=" + numberOfMenusDifferencePercentage +
                ", numberOfLayoutsDifference=" + numberOfLayoutsDifference +
                ", numberOfLayoutsDifferencePercentage=" + numberOfLayoutsDifferencePercentage +
                ", numberOfDifferentLayoutsDifference=" + numberOfDifferentLayoutsDifference +
                ", numberOfDifferentLayoutsDifferencePercentage=" + numberOfDifferentLayoutsDifferencePercentage +
                '}';
    }
}
