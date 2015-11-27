package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class AndroidManifestData {

    private int numberOfActivities;
    private int numberOfServices;
    private int numberOfContentProviders;
    private int numberOfBroadcastReceivers;
    private List<String> usesPermissions;
    private List<String> usesLibrary;
    private List<String> usesFeature;

    @Override
    public String toString() {
        return "AndroidManifestData{" +
                "numberOfActivities=" + numberOfActivities +
                ", numberOfServices=" + numberOfServices +
                ", numberOfContentProviders=" + numberOfContentProviders +
                ", numberOfBroadcastReceivers=" + numberOfBroadcastReceivers +
                ", usesPermissions=" + usesPermissions +
                ", usesLibrary=" + usesLibrary +
                ", usesFeature=" + usesFeature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AndroidManifestData that = (AndroidManifestData) o;

        if (numberOfActivities != that.numberOfActivities) return false;
        if (numberOfServices != that.numberOfServices) return false;
        if (numberOfContentProviders != that.numberOfContentProviders) return false;
        if (numberOfBroadcastReceivers != that.numberOfBroadcastReceivers) return false;
        if (usesPermissions != null ? !usesPermissions.equals(that.usesPermissions) : that.usesPermissions != null)
            return false;
        if (usesLibrary != null ? !usesLibrary.equals(that.usesLibrary) : that.usesLibrary != null) return false;
        return !(usesFeature != null ? !usesFeature.equals(that.usesFeature) : that.usesFeature != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfActivities;
        result = 31 * result + numberOfServices;
        result = 31 * result + numberOfContentProviders;
        result = 31 * result + numberOfBroadcastReceivers;
        result = 31 * result + (usesPermissions != null ? usesPermissions.hashCode() : 0);
        result = 31 * result + (usesLibrary != null ? usesLibrary.hashCode() : 0);
        result = 31 * result + (usesFeature != null ? usesFeature.hashCode() : 0);
        return result;
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
}
