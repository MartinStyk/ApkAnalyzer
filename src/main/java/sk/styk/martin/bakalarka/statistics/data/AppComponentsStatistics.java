package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class AppComponentsStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;

    private MathStatistics activities;
    private MathStatistics activitiesNonZero;
    private MathStatistics services;
    private MathStatistics servicesNonZero;
    private MathStatistics broadcastReceivers;
    private MathStatistics broadcastReceiversNonZero;
    private MathStatistics contentProviders;
    private MathStatistics contentProvidersNonZero;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getActivities() {
        return activities;
    }

    public void setActivities(MathStatistics activities) {
        this.activities = activities;
    }

    public MathStatistics getActivitiesNonZero() {
        return activitiesNonZero;
    }

    public void setActivitiesNonZero(MathStatistics activitiesNonZero) {
        this.activitiesNonZero = activitiesNonZero;
    }

    public MathStatistics getServices() {
        return services;
    }

    public void setServices(MathStatistics services) {
        this.services = services;
    }

    public MathStatistics getServicesNonZero() {
        return servicesNonZero;
    }

    public void setServicesNonZero(MathStatistics servicesNonZero) {
        this.servicesNonZero = servicesNonZero;
    }

    public MathStatistics getBroadcastReceivers() {
        return broadcastReceivers;
    }

    public void setBroadcastReceivers(MathStatistics broadcastReceivers) {
        this.broadcastReceivers = broadcastReceivers;
    }

    public MathStatistics getBroadcastReceiversNonZero() {
        return broadcastReceiversNonZero;
    }

    public void setBroadcastReceiversNonZero(MathStatistics broadcastReceiversNonZero) {
        this.broadcastReceiversNonZero = broadcastReceiversNonZero;
    }

    public MathStatistics getContentProviders() {
        return contentProviders;
    }

    public void setContentProviders(MathStatistics contentProviders) {
        this.contentProviders = contentProviders;
    }

    public MathStatistics getContentProvidersNonZero() {
        return contentProvidersNonZero;
    }

    public void setContentProvidersNonZero(MathStatistics contentProvidersNonZero) {
        this.contentProvidersNonZero = contentProvidersNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppComponentsStatistics that = (AppComponentsStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (activities != null ? !activities.equals(that.activities) : that.activities != null) return false;
        if (activitiesNonZero != null ? !activitiesNonZero.equals(that.activitiesNonZero) : that.activitiesNonZero != null)
            return false;
        if (services != null ? !services.equals(that.services) : that.services != null) return false;
        if (servicesNonZero != null ? !servicesNonZero.equals(that.servicesNonZero) : that.servicesNonZero != null)
            return false;
        if (broadcastReceivers != null ? !broadcastReceivers.equals(that.broadcastReceivers) : that.broadcastReceivers != null)
            return false;
        if (broadcastReceiversNonZero != null ? !broadcastReceiversNonZero.equals(that.broadcastReceiversNonZero) : that.broadcastReceiversNonZero != null)
            return false;
        if (contentProviders != null ? !contentProviders.equals(that.contentProviders) : that.contentProviders != null)
            return false;
        return !(contentProvidersNonZero != null ? !contentProvidersNonZero.equals(that.contentProvidersNonZero) : that.contentProvidersNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (activities != null ? activities.hashCode() : 0);
        result = 31 * result + (activitiesNonZero != null ? activitiesNonZero.hashCode() : 0);
        result = 31 * result + (services != null ? services.hashCode() : 0);
        result = 31 * result + (servicesNonZero != null ? servicesNonZero.hashCode() : 0);
        result = 31 * result + (broadcastReceivers != null ? broadcastReceivers.hashCode() : 0);
        result = 31 * result + (broadcastReceiversNonZero != null ? broadcastReceiversNonZero.hashCode() : 0);
        result = 31 * result + (contentProviders != null ? contentProviders.hashCode() : 0);
        result = 31 * result + (contentProvidersNonZero != null ? contentProvidersNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppComponentsStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", activities=" + activities +
                ", activitiesNonZero=" + activitiesNonZero +
                ", services=" + services +
                ", servicesNonZero=" + servicesNonZero +
                ", broadcastReceivers=" + broadcastReceivers +
                ", broadcastReceiversNonZero=" + broadcastReceiversNonZero +
                ", contentProviders=" + contentProviders +
                ", contentProvidersNonZero=" + contentProvidersNonZero +
                '}';
    }
}