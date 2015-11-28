package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class AndroidManifestData {

    private String packageName;
    private Integer numberOfActivities;
    private Integer numberOfServices;
    private Integer numberOfContentProviders;
    private Integer numberOfBroadcastReceivers;
    private List<String> usesPermissions;
    private List<String> usesLibrary;
    private List<String> usesFeature;
    private String usesMinSdkVersion;
    private String usesTargetSdkVersion;
    private String usesMaxSdkVersion;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AndroidManifestData that = (AndroidManifestData) o;

        if (packageName != null ? !packageName.equals(that.packageName) : that.packageName != null) return false;
        if (numberOfActivities != null ? !numberOfActivities.equals(that.numberOfActivities) : that.numberOfActivities != null)
            return false;
        if (numberOfServices != null ? !numberOfServices.equals(that.numberOfServices) : that.numberOfServices != null)
            return false;
        if (numberOfContentProviders != null ? !numberOfContentProviders.equals(that.numberOfContentProviders) : that.numberOfContentProviders != null)
            return false;
        if (numberOfBroadcastReceivers != null ? !numberOfBroadcastReceivers.equals(that.numberOfBroadcastReceivers) : that.numberOfBroadcastReceivers != null)
            return false;
        if (usesPermissions != null ? !usesPermissions.equals(that.usesPermissions) : that.usesPermissions != null)
            return false;
        if (usesLibrary != null ? !usesLibrary.equals(that.usesLibrary) : that.usesLibrary != null) return false;
        if (usesFeature != null ? !usesFeature.equals(that.usesFeature) : that.usesFeature != null) return false;
        if (usesMinSdkVersion != null ? !usesMinSdkVersion.equals(that.usesMinSdkVersion) : that.usesMinSdkVersion != null)
            return false;
        if (usesTargetSdkVersion != null ? !usesTargetSdkVersion.equals(that.usesTargetSdkVersion) : that.usesTargetSdkVersion != null)
            return false;
        return !(usesMaxSdkVersion != null ? !usesMaxSdkVersion.equals(that.usesMaxSdkVersion) : that.usesMaxSdkVersion != null);

    }

    @Override
    public int hashCode() {
        int result = packageName != null ? packageName.hashCode() : 0;
        result = 31 * result + (numberOfActivities != null ? numberOfActivities.hashCode() : 0);
        result = 31 * result + (numberOfServices != null ? numberOfServices.hashCode() : 0);
        result = 31 * result + (numberOfContentProviders != null ? numberOfContentProviders.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceivers != null ? numberOfBroadcastReceivers.hashCode() : 0);
        result = 31 * result + (usesPermissions != null ? usesPermissions.hashCode() : 0);
        result = 31 * result + (usesLibrary != null ? usesLibrary.hashCode() : 0);
        result = 31 * result + (usesFeature != null ? usesFeature.hashCode() : 0);
        result = 31 * result + (usesMinSdkVersion != null ? usesMinSdkVersion.hashCode() : 0);
        result = 31 * result + (usesTargetSdkVersion != null ? usesTargetSdkVersion.hashCode() : 0);
        result = 31 * result + (usesMaxSdkVersion != null ? usesMaxSdkVersion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AndroidManifestData{" +
                "packageName='" + packageName + '\'' +
                ", numberOfActivities=" + numberOfActivities +
                ", numberOfServices=" + numberOfServices +
                ", numberOfContentProviders=" + numberOfContentProviders +
                ", numberOfBroadcastReceivers=" + numberOfBroadcastReceivers +
                ", usesPermissions=" + usesPermissions +
                ", usesLibrary=" + usesLibrary +
                ", usesFeature=" + usesFeature +
                ", usesMinSdkVersion='" + usesMinSdkVersion + '\'' +
                ", usesTargetSdkVersion='" + usesTargetSdkVersion + '\'' +
                ", usesMaxSdkVersion='" + usesMaxSdkVersion + '\'' +
                '}';
    }
}
