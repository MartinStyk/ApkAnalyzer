package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class AppComponentsStatistics {

    //activities
    private Integer numberOfActivitiesObtainedSuccessfully;
    private Integer numberOfActivitiesArithmeticMean;
    private Integer numberOfActivitiesModus;
    private Integer numberOfActivitiesMedian;

    //services
    private Integer numberOfServicesObtainedSuccessfully;
    private Integer numberOfServicesArithmeticMean;
    private Integer numberOfServicesModus;
    private Integer numberOfServicesMedian;

    //content providers
    private Integer numberOfContentProvidersObtainedSuccessfully;
    private Integer numberOfContentProvidersArithmeticMean;
    private Integer numberOfContentProvidersModus;
    private Integer numberOfContentProvidersMedian;

    //broadcast receivers
    private Integer numberOfBroadcastReceiversObtainedSuccessfully;
    private Integer numberOfBroadcastReceiversArithmeticMean;
    private Integer numberOfBroadcastReceiversModus;
    private Integer numberOfBroadcastReceiversMedian;

    public Integer getNumberOfActivitiesObtainedSuccessfully() {
        return numberOfActivitiesObtainedSuccessfully;
    }

    public void setNumberOfActivitiesObtainedSuccessfully(Integer numberOfActivitiesObtainedSuccessfully) {
        this.numberOfActivitiesObtainedSuccessfully = numberOfActivitiesObtainedSuccessfully;
    }

    public Integer getNumberOfActivitiesArithmeticMean() {
        return numberOfActivitiesArithmeticMean;
    }

    public void setNumberOfActivitiesArithmeticMean(Integer numberOfActivitiesArithmeticMean) {
        this.numberOfActivitiesArithmeticMean = numberOfActivitiesArithmeticMean;
    }

    public Integer getNumberOfActivitiesModus() {
        return numberOfActivitiesModus;
    }

    public void setNumberOfActivitiesModus(Integer numberOfActivitiesModus) {
        this.numberOfActivitiesModus = numberOfActivitiesModus;
    }

    public Integer getNumberOfActivitiesMedian() {
        return numberOfActivitiesMedian;
    }

    public void setNumberOfActivitiesMedian(Integer numberOfActivitiesMedian) {
        this.numberOfActivitiesMedian = numberOfActivitiesMedian;
    }

    public Integer getNumberOfServicesObtainedSuccessfully() {
        return numberOfServicesObtainedSuccessfully;
    }

    public void setNumberOfServicesObtainedSuccessfully(Integer numberOfServicesObtainedSuccessfully) {
        this.numberOfServicesObtainedSuccessfully = numberOfServicesObtainedSuccessfully;
    }

    public Integer getNumberOfServicesArithmeticMean() {
        return numberOfServicesArithmeticMean;
    }

    public void setNumberOfServicesArithmeticMean(Integer numberOfServicesArithmeticMean) {
        this.numberOfServicesArithmeticMean = numberOfServicesArithmeticMean;
    }

    public Integer getNumberOfServicesModus() {
        return numberOfServicesModus;
    }

    public void setNumberOfServicesModus(Integer numberOfServicesModus) {
        this.numberOfServicesModus = numberOfServicesModus;
    }

    public Integer getNumberOfServicesMedian() {
        return numberOfServicesMedian;
    }

    public void setNumberOfServicesMedian(Integer numberOfServicesMedian) {
        this.numberOfServicesMedian = numberOfServicesMedian;
    }

    public Integer getNumberOfContentProvidersObtainedSuccessfully() {
        return numberOfContentProvidersObtainedSuccessfully;
    }

    public void setNumberOfContentProvidersObtainedSuccessfully(Integer numberOfContentProvidersObtainedSuccessfully) {
        this.numberOfContentProvidersObtainedSuccessfully = numberOfContentProvidersObtainedSuccessfully;
    }

    public Integer getNumberOfContentProvidersArithmeticMean() {
        return numberOfContentProvidersArithmeticMean;
    }

    public void setNumberOfContentProvidersArithmeticMean(Integer numberOfContentProvidersArithmeticMean) {
        this.numberOfContentProvidersArithmeticMean = numberOfContentProvidersArithmeticMean;
    }

    public Integer getNumberOfContentProvidersModus() {
        return numberOfContentProvidersModus;
    }

    public void setNumberOfContentProvidersModus(Integer numberOfContentProvidersModus) {
        this.numberOfContentProvidersModus = numberOfContentProvidersModus;
    }

    public Integer getNumberOfContentProvidersMedian() {
        return numberOfContentProvidersMedian;
    }

    public void setNumberOfContentProvidersMedian(Integer numberOfContentProvidersMedian) {
        this.numberOfContentProvidersMedian = numberOfContentProvidersMedian;
    }

    public Integer getNumberOfBroadcastReceiversObtainedSuccessfully() {
        return numberOfBroadcastReceiversObtainedSuccessfully;
    }

    public void setNumberOfBroadcastReceiversObtainedSuccessfully(Integer numberOfBroadcastReceiversObtainedSuccessfully) {
        this.numberOfBroadcastReceiversObtainedSuccessfully = numberOfBroadcastReceiversObtainedSuccessfully;
    }

    public Integer getNumberOfBroadcastReceiversArithmeticMean() {
        return numberOfBroadcastReceiversArithmeticMean;
    }

    public void setNumberOfBroadcastReceiversArithmeticMean(Integer numberOfBroadcastReceiversArithmeticMean) {
        this.numberOfBroadcastReceiversArithmeticMean = numberOfBroadcastReceiversArithmeticMean;
    }

    public Integer getNumberOfBroadcastReceiversModus() {
        return numberOfBroadcastReceiversModus;
    }

    public void setNumberOfBroadcastReceiversModus(Integer numberOfBroadcastReceiversModus) {
        this.numberOfBroadcastReceiversModus = numberOfBroadcastReceiversModus;
    }

    public Integer getNumberOfBroadcastReceiversMedian() {
        return numberOfBroadcastReceiversMedian;
    }

    public void setNumberOfBroadcastReceiversMedian(Integer numberOfBroadcastReceiversMedian) {
        this.numberOfBroadcastReceiversMedian = numberOfBroadcastReceiversMedian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppComponentsStatistics that = (AppComponentsStatistics) o;

        if (numberOfActivitiesObtainedSuccessfully != null ? !numberOfActivitiesObtainedSuccessfully.equals(that.numberOfActivitiesObtainedSuccessfully) : that.numberOfActivitiesObtainedSuccessfully != null)
            return false;
        if (numberOfActivitiesArithmeticMean != null ? !numberOfActivitiesArithmeticMean.equals(that.numberOfActivitiesArithmeticMean) : that.numberOfActivitiesArithmeticMean != null)
            return false;
        if (numberOfActivitiesModus != null ? !numberOfActivitiesModus.equals(that.numberOfActivitiesModus) : that.numberOfActivitiesModus != null)
            return false;
        if (numberOfActivitiesMedian != null ? !numberOfActivitiesMedian.equals(that.numberOfActivitiesMedian) : that.numberOfActivitiesMedian != null)
            return false;
        if (numberOfServicesObtainedSuccessfully != null ? !numberOfServicesObtainedSuccessfully.equals(that.numberOfServicesObtainedSuccessfully) : that.numberOfServicesObtainedSuccessfully != null)
            return false;
        if (numberOfServicesArithmeticMean != null ? !numberOfServicesArithmeticMean.equals(that.numberOfServicesArithmeticMean) : that.numberOfServicesArithmeticMean != null)
            return false;
        if (numberOfServicesModus != null ? !numberOfServicesModus.equals(that.numberOfServicesModus) : that.numberOfServicesModus != null)
            return false;
        if (numberOfServicesMedian != null ? !numberOfServicesMedian.equals(that.numberOfServicesMedian) : that.numberOfServicesMedian != null)
            return false;
        if (numberOfContentProvidersObtainedSuccessfully != null ? !numberOfContentProvidersObtainedSuccessfully.equals(that.numberOfContentProvidersObtainedSuccessfully) : that.numberOfContentProvidersObtainedSuccessfully != null)
            return false;
        if (numberOfContentProvidersArithmeticMean != null ? !numberOfContentProvidersArithmeticMean.equals(that.numberOfContentProvidersArithmeticMean) : that.numberOfContentProvidersArithmeticMean != null)
            return false;
        if (numberOfContentProvidersModus != null ? !numberOfContentProvidersModus.equals(that.numberOfContentProvidersModus) : that.numberOfContentProvidersModus != null)
            return false;
        if (numberOfContentProvidersMedian != null ? !numberOfContentProvidersMedian.equals(that.numberOfContentProvidersMedian) : that.numberOfContentProvidersMedian != null)
            return false;
        if (numberOfBroadcastReceiversObtainedSuccessfully != null ? !numberOfBroadcastReceiversObtainedSuccessfully.equals(that.numberOfBroadcastReceiversObtainedSuccessfully) : that.numberOfBroadcastReceiversObtainedSuccessfully != null)
            return false;
        if (numberOfBroadcastReceiversArithmeticMean != null ? !numberOfBroadcastReceiversArithmeticMean.equals(that.numberOfBroadcastReceiversArithmeticMean) : that.numberOfBroadcastReceiversArithmeticMean != null)
            return false;
        if (numberOfBroadcastReceiversModus != null ? !numberOfBroadcastReceiversModus.equals(that.numberOfBroadcastReceiversModus) : that.numberOfBroadcastReceiversModus != null)
            return false;
        return !(numberOfBroadcastReceiversMedian != null ? !numberOfBroadcastReceiversMedian.equals(that.numberOfBroadcastReceiversMedian) : that.numberOfBroadcastReceiversMedian != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfActivitiesObtainedSuccessfully != null ? numberOfActivitiesObtainedSuccessfully.hashCode() : 0;
        result = 31 * result + (numberOfActivitiesArithmeticMean != null ? numberOfActivitiesArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfActivitiesModus != null ? numberOfActivitiesModus.hashCode() : 0);
        result = 31 * result + (numberOfActivitiesMedian != null ? numberOfActivitiesMedian.hashCode() : 0);
        result = 31 * result + (numberOfServicesObtainedSuccessfully != null ? numberOfServicesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (numberOfServicesArithmeticMean != null ? numberOfServicesArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfServicesModus != null ? numberOfServicesModus.hashCode() : 0);
        result = 31 * result + (numberOfServicesMedian != null ? numberOfServicesMedian.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersObtainedSuccessfully != null ? numberOfContentProvidersObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersArithmeticMean != null ? numberOfContentProvidersArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersModus != null ? numberOfContentProvidersModus.hashCode() : 0);
        result = 31 * result + (numberOfContentProvidersMedian != null ? numberOfContentProvidersMedian.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversObtainedSuccessfully != null ? numberOfBroadcastReceiversObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversArithmeticMean != null ? numberOfBroadcastReceiversArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversModus != null ? numberOfBroadcastReceiversModus.hashCode() : 0);
        result = 31 * result + (numberOfBroadcastReceiversMedian != null ? numberOfBroadcastReceiversMedian.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppComponentsStatistics{" +
                "numberOfActivitiesObtainedSuccessfully=" + numberOfActivitiesObtainedSuccessfully +
                ", numberOfActivitiesArithmeticMean=" + numberOfActivitiesArithmeticMean +
                ", numberOfActivitiesModus=" + numberOfActivitiesModus +
                ", numberOfActivitiesMedian=" + numberOfActivitiesMedian +
                ", numberOfServicesObtainedSuccessfully=" + numberOfServicesObtainedSuccessfully +
                ", numberOfServicesArithmeticMean=" + numberOfServicesArithmeticMean +
                ", numberOfServicesModus=" + numberOfServicesModus +
                ", numberOfServicesMedian=" + numberOfServicesMedian +
                ", numberOfContentProvidersObtainedSuccessfully=" + numberOfContentProvidersObtainedSuccessfully +
                ", numberOfContentProvidersArithmeticMean=" + numberOfContentProvidersArithmeticMean +
                ", numberOfContentProvidersModus=" + numberOfContentProvidersModus +
                ", numberOfContentProvidersMedian=" + numberOfContentProvidersMedian +
                ", numberOfBroadcastReceiversObtainedSuccessfully=" + numberOfBroadcastReceiversObtainedSuccessfully +
                ", numberOfBroadcastReceiversArithmeticMean=" + numberOfBroadcastReceiversArithmeticMean +
                ", numberOfBroadcastReceiversModus=" + numberOfBroadcastReceiversModus +
                ", numberOfBroadcastReceiversMedian=" + numberOfBroadcastReceiversMedian +
                '}';
    }
}
