package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class AndroidManifestData {

    private String packageName;
    private String versionCode;

    private String installLocation;

    private Integer numberOfActivities;
    private Integer numberOfServices;
    private Integer numberOfContentProviders;
    private Integer numberOfBroadcastReceivers;

    private List<String> namesOfActivities;
    private List<String> namesOfServices;
    private List<String> namesOfContentProviders;
    private List<String> namesOfBroadcastReceivers;

    private List<String> usesPermissions;
    private List<String> usesLibrary;
    private List<String> usesFeature;

    private String usesMinSdkVersion;
    private String usesTargetSdkVersion;
    private String usesMaxSdkVersion;

    private Boolean supportsScreensResizeable;
    private Boolean supportsScreensSmall;
    private Boolean supportsScreensNormal;
    private Boolean supportsScreensLarge;
    private Boolean supportsScreensXlarge;
    private Boolean supportsScreensAnyDensity;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public int getNumberOfActivities() {
        return numberOfActivities;
    }

    public void setNumberOfActivities(int numberOfActivities) {
        this.numberOfActivities = numberOfActivities;
    }

    public int getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public int getNumberOfContentProviders() {
        return numberOfContentProviders;
    }

    public void setNumberOfContentProviders(int numberOfContentProviders) {
        this.numberOfContentProviders = numberOfContentProviders;
    }

    public int getNumberOfBroadcastReceivers() {
        return numberOfBroadcastReceivers;
    }

    public void setNumberOfBroadcastReceivers(int numberOfBroadcastReceivers) {
        this.numberOfBroadcastReceivers = numberOfBroadcastReceivers;
    }

    public List<String> getNamesOfActivities() {
        return namesOfActivities;
    }

    public void setNamesOfActivities(List<String> namesOfActivities) {
        this.namesOfActivities = namesOfActivities;
    }

    public List<String> getNamesOfServices() {
        return namesOfServices;
    }

    public void setNamesOfServices(List<String> namesOfServices) {
        this.namesOfServices = namesOfServices;
    }

    public List<String> getNamesOfContentProviders() {
        return namesOfContentProviders;
    }

    public void setNamesOfContentProviders(List<String> namesOfContentProviders) {
        this.namesOfContentProviders = namesOfContentProviders;
    }

    public List<String> getNamesOfBroadcastReceivers() {
        return namesOfBroadcastReceivers;
    }

    public void setNamesOfBroadcastReceivers(List<String> namesOfBroadcastReceivers) {
        this.namesOfBroadcastReceivers = namesOfBroadcastReceivers;
    }

    public List<String> getUsesPermissions() {
        return usesPermissions;
    }

    public void setUsesPermissions(List<String> usesPermissions) {
        this.usesPermissions = usesPermissions;
    }

    public List<String> getUsesLibrary() {
        return usesLibrary;
    }

    public void setUsesLibrary(List<String> usesLibrary) {
        this.usesLibrary = usesLibrary;
    }

    public List<String> getUsesFeature() {
        return usesFeature;
    }

    public void setUsesFeature(List<String> usesFeature) {
        this.usesFeature = usesFeature;
    }

    public String getUsesMaxSdkVersion() {
        return usesMaxSdkVersion;
    }

    public void setUsesMaxSdkVersion(String usesMaxSdkVersion) {
        this.usesMaxSdkVersion = usesMaxSdkVersion;
    }

    public String getUsesMinSdkVersion() {
        return usesMinSdkVersion;
    }

    public void setUsesMinSdkVersion(String usesMinSdkVersion) {
        this.usesMinSdkVersion = usesMinSdkVersion;
    }

    public String getUsesTargetSdkVersion() {
        return usesTargetSdkVersion;
    }

    public void setUsesTargetSdkVersion(String usesTargetSdkVersion) {
        this.usesTargetSdkVersion = usesTargetSdkVersion;
    }

    public Boolean getSupportsScreensResizeable() {
        return supportsScreensResizeable;
    }

    public void setSupportsScreensResizeable(Boolean supportsScreensResizeable) {
        this.supportsScreensResizeable = supportsScreensResizeable;
    }

    public Boolean getSupportsScreensSmall() {
        return supportsScreensSmall;
    }

    public void setSupportsScreensSmall(Boolean supportsScreensSmall) {
        this.supportsScreensSmall = supportsScreensSmall;
    }

    public Boolean getSupportsScreensNormal() {
        return supportsScreensNormal;
    }

    public void setSupportsScreensNormal(Boolean supportsScreensNormal) {
        this.supportsScreensNormal = supportsScreensNormal;
    }

    public Boolean getSupportsScreensLarge() {
        return supportsScreensLarge;
    }

    public void setSupportsScreensLarge(Boolean supportsScreensLarge) {
        this.supportsScreensLarge = supportsScreensLarge;
    }

    public Boolean getSupportsScreensXlarge() {
        return supportsScreensXlarge;
    }

    public void setSupportsScreensXlarge(Boolean supportsScreensXlarge) {
        this.supportsScreensXlarge = supportsScreensXlarge;
    }

    public Boolean getSupportsScreensAnyDensity() {
        return supportsScreensAnyDensity;
    }

    public void setSupportsScreensAnyDensity(Boolean supportsScreensAnyDensity) {
        this.supportsScreensAnyDensity = supportsScreensAnyDensity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AndroidManifestData that = (AndroidManifestData) o;

        if (packageName != null ? !packageName.equals(that.packageName) : that.packageName != null) return false;
        if (versionCode != null ? !versionCode.equals(that.versionCode) : that.versionCode != null) return false;
        if (installLocation != null ? !installLocation.equals(that.installLocation) : that.installLocation != null)
            return false;
        if (numberOfActivities != null ? !numberOfActivities.equals(that.numberOfActivities) : that.numberOfActivities != null)
            return false;
        if (numberOfServices != null ? !numberOfServices.equals(that.numberOfServices) : that.numberOfServices != null)
            return false;
        if (numberOfContentProviders != null ? !numberOfContentProviders.equals(that.numberOfContentProviders) : that.numberOfContentProviders != null)
            return false;
        if (numberOfBroadcastReceivers != null ? !numberOfBroadcastReceivers.equals(that.numberOfBroadcastReceivers) : that.numberOfBroadcastReceivers != null)
            return false;
        if (namesOfActivities != null ? !namesOfActivities.equals(that.namesOfActivities) : that.namesOfActivities != null)
            return false;
        if (namesOfServices != null ? !namesOfServices.equals(that.namesOfServices) : that.namesOfServices != null)
            return false;
        if (namesOfContentProviders != null ? !namesOfContentProviders.equals(that.namesOfContentProviders) : that.namesOfContentProviders != null)
            return false;
        if (namesOfBroadcastReceivers != null ? !namesOfBroadcastReceivers.equals(that.namesOfBroadcastReceivers) : that.namesOfBroadcastReceivers != null)
            return false;
        if (usesPermissions != null ? !usesPermissions.equals(that.usesPermissions) : that.usesPermissions != null)
            return false;
        if (usesLibrary != null ? !usesLibrary.equals(that.usesLibrary) : that.usesLibrary != null) return false;
        if (usesFeature != null ? !usesFeature.equals(that.usesFeature) : that.usesFeature != null) return false;
        if (usesMinSdkVersion != null ? !usesMinSdkVersion.equals(that.usesMinSdkVersion) : that.usesMinSdkVersion != null)
            return false;
        if (usesTargetSdkVersion != null ? !usesTargetSdkVersion.equals(that.usesTargetSdkVersion) : that.usesTargetSdkVersion != null)
            return false;
        if (usesMaxSdkVersion != null ? !usesMaxSdkVersion.equals(that.usesMaxSdkVersion) : that.usesMaxSdkVersion != null)
            return false;
        if (supportsScreensResizeable != null ? !supportsScreensResizeable.equals(that.supportsScreensResizeable) : that.supportsScreensResizeable != null)
            return false;
        if (supportsScreensSmall != null ? !supportsScreensSmall.equals(that.supportsScreensSmall) : that.supportsScreensSmall != null)
            return false;
        if (supportsScreensNormal != null ? !supportsScreensNormal.equals(that.supportsScreensNormal) : that.supportsScreensNormal != null)
            return false;
        if (supportsScreensLarge != null ? !supportsScreensLarge.equals(that.supportsScreensLarge) : that.supportsScreensLarge != null)
            return false;
        if (supportsScreensXlarge != null ? !supportsScreensXlarge.equals(that.supportsScreensXlarge) : that.supportsScreensXlarge != null)
            return false;
        return !(supportsScreensAnyDensity != null ? !supportsScreensAnyDensity.equals(that.supportsScreensAnyDensity) : that.supportsScreensAnyDensity != null);

    }

    @Override
    public int hashCode() {
        int result = packageName != null ? packageName.hashCode() : 0;
        result = 31 * result + (versionCode != null ? versionCode.hashCode() : 0);
        result = 31 * result + (installLocation != null ? installLocation.hashCode() : 0);
        result = 31 * result + (numberOfActivities != null ? numberOfActivities.hashCode() : 0);
        result = 31 * result + (numberOfServices != null ? numberOfServices.hashCode() : 0);
        result = 31 * result + (numberOfContentProviders != null ? numberOfContentProviders.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceivers != null ? numberOfBroadcastReceivers.hashCode() : 0);
        result = 31 * result + (namesOfActivities != null ? namesOfActivities.hashCode() : 0);
        result = 31 * result + (namesOfServices != null ? namesOfServices.hashCode() : 0);
        result = 31 * result + (namesOfContentProviders != null ? namesOfContentProviders.hashCode() : 0);
        result = 31 * result + (namesOfBroadcastReceivers != null ? namesOfBroadcastReceivers.hashCode() : 0);
        result = 31 * result + (usesPermissions != null ? usesPermissions.hashCode() : 0);
        result = 31 * result + (usesLibrary != null ? usesLibrary.hashCode() : 0);
        result = 31 * result + (usesFeature != null ? usesFeature.hashCode() : 0);
        result = 31 * result + (usesMinSdkVersion != null ? usesMinSdkVersion.hashCode() : 0);
        result = 31 * result + (usesTargetSdkVersion != null ? usesTargetSdkVersion.hashCode() : 0);
        result = 31 * result + (usesMaxSdkVersion != null ? usesMaxSdkVersion.hashCode() : 0);
        result = 31 * result + (supportsScreensResizeable != null ? supportsScreensResizeable.hashCode() : 0);
        result = 31 * result + (supportsScreensSmall != null ? supportsScreensSmall.hashCode() : 0);
        result = 31 * result + (supportsScreensNormal != null ? supportsScreensNormal.hashCode() : 0);
        result = 31 * result + (supportsScreensLarge != null ? supportsScreensLarge.hashCode() : 0);
        result = 31 * result + (supportsScreensXlarge != null ? supportsScreensXlarge.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensity != null ? supportsScreensAnyDensity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AndroidManifestData{" +
                "packageName='" + packageName + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", installLocation='" + installLocation + '\'' +
                ", numberOfActivities=" + numberOfActivities +
                ", numberOfServices=" + numberOfServices +
                ", numberOfContentProviders=" + numberOfContentProviders +
                ", numberOfBroadcastReceivers=" + numberOfBroadcastReceivers +
                ", namesOfActivities=" + namesOfActivities +
                ", namesOfServices=" + namesOfServices +
                ", namesOfContentProviders=" + namesOfContentProviders +
                ", namesOfBroadcastReceivers=" + namesOfBroadcastReceivers +
                ", usesPermissions=" + usesPermissions +
                ", usesLibrary=" + usesLibrary +
                ", usesFeature=" + usesFeature +
                ", usesMinSdkVersion='" + usesMinSdkVersion + '\'' +
                ", usesTargetSdkVersion='" + usesTargetSdkVersion + '\'' +
                ", usesMaxSdkVersion='" + usesMaxSdkVersion + '\'' +
                ", supportsScreensResizeable=" + supportsScreensResizeable +
                ", supportsScreensSmall=" + supportsScreensSmall +
                ", supportsScreensNormal=" + supportsScreensNormal +
                ", supportsScreensLarge=" + supportsScreensLarge +
                ", supportsScreensXlarge=" + supportsScreensXlarge +
                ", supportsScreensAnyDensity=" + supportsScreensAnyDensity +
                '}';
    }
}
