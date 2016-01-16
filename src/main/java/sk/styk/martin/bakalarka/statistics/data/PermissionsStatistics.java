package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class PermissionsStatistics {

    //permissions
    private Integer numberOfApksWithPermissionsObtained;
    private Integer numberOfPermissionsArithmeticMean;
    private Integer numberOfPermissionsModus;
    private Integer numberOfPermissionsMedian;
    private Map<String,Integer> topPermissions;

    private Integer numberOfPermissionsArithmeticMeanNonZero;
    private Integer numberOfPermissionsModusNonZero;
    private Integer numberOfPermissionsMedianNonZero;

    public Integer getNumberOfApksWithPermissionsObtained() {
        return numberOfApksWithPermissionsObtained;
    }

    public void setNumberOfApksWithPermissionsObtained(Integer numberOfApksWithPermissionsObtained) {
        this.numberOfApksWithPermissionsObtained = numberOfApksWithPermissionsObtained;
    }

    public Integer getNumberOfPermissionsArithmeticMean() {
        return numberOfPermissionsArithmeticMean;
    }

    public void setNumberOfPermissionsArithmeticMean(Integer numberOfPermissionsArithmeticMean) {
        this.numberOfPermissionsArithmeticMean = numberOfPermissionsArithmeticMean;
    }

    public Integer getNumberOfPermissionsModus() {
        return numberOfPermissionsModus;
    }

    public void setNumberOfPermissionsModus(Integer numberOfPermissionsModus) {
        this.numberOfPermissionsModus = numberOfPermissionsModus;
    }

    public Integer getNumberOfPermissionsMedian() {
        return numberOfPermissionsMedian;
    }

    public void setNumberOfPermissionsMedian(Integer numberOfPermissionsMedian) {
        this.numberOfPermissionsMedian = numberOfPermissionsMedian;
    }

    public Map<String, Integer> getTopPermissions() {
        return topPermissions;
    }

    public void setTopPermissions(Map<String, Integer> topPermissions) {
        this.topPermissions = topPermissions;
    }

    public Integer getNumberOfPermissionsArithmeticMeanNonZero() {
        return numberOfPermissionsArithmeticMeanNonZero;
    }

    public void setNumberOfPermissionsArithmeticMeanNonZero(Integer numberOfPermissionsArithmeticMeanNonZero) {
        this.numberOfPermissionsArithmeticMeanNonZero = numberOfPermissionsArithmeticMeanNonZero;
    }

    public Integer getNumberOfPermissionsModusNonZero() {
        return numberOfPermissionsModusNonZero;
    }

    public void setNumberOfPermissionsModusNonZero(Integer numberOfPermissionsModusNonZero) {
        this.numberOfPermissionsModusNonZero = numberOfPermissionsModusNonZero;
    }

    public Integer getNumberOfPermissionsMedianNonZero() {
        return numberOfPermissionsMedianNonZero;
    }

    public void setNumberOfPermissionsMedianNonZero(Integer numberOfPermissionsMedianNonZero) {
        this.numberOfPermissionsMedianNonZero = numberOfPermissionsMedianNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermissionsStatistics that = (PermissionsStatistics) o;

        if (numberOfApksWithPermissionsObtained != null ? !numberOfApksWithPermissionsObtained.equals(that.numberOfApksWithPermissionsObtained) : that.numberOfApksWithPermissionsObtained != null)
            return false;
        if (numberOfPermissionsArithmeticMean != null ? !numberOfPermissionsArithmeticMean.equals(that.numberOfPermissionsArithmeticMean) : that.numberOfPermissionsArithmeticMean != null)
            return false;
        if (numberOfPermissionsModus != null ? !numberOfPermissionsModus.equals(that.numberOfPermissionsModus) : that.numberOfPermissionsModus != null)
            return false;
        if (numberOfPermissionsMedian != null ? !numberOfPermissionsMedian.equals(that.numberOfPermissionsMedian) : that.numberOfPermissionsMedian != null)
            return false;
        if (topPermissions != null ? !topPermissions.equals(that.topPermissions) : that.topPermissions != null)
            return false;
        if (numberOfPermissionsArithmeticMeanNonZero != null ? !numberOfPermissionsArithmeticMeanNonZero.equals(that.numberOfPermissionsArithmeticMeanNonZero) : that.numberOfPermissionsArithmeticMeanNonZero != null)
            return false;
        if (numberOfPermissionsModusNonZero != null ? !numberOfPermissionsModusNonZero.equals(that.numberOfPermissionsModusNonZero) : that.numberOfPermissionsModusNonZero != null)
            return false;
        return !(numberOfPermissionsMedianNonZero != null ? !numberOfPermissionsMedianNonZero.equals(that.numberOfPermissionsMedianNonZero) : that.numberOfPermissionsMedianNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfApksWithPermissionsObtained != null ? numberOfApksWithPermissionsObtained.hashCode() : 0;
        result = 31 * result + (numberOfPermissionsArithmeticMean != null ? numberOfPermissionsArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsModus != null ? numberOfPermissionsModus.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsMedian != null ? numberOfPermissionsMedian.hashCode() : 0);
        result = 31 * result + (topPermissions != null ? topPermissions.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsArithmeticMeanNonZero != null ? numberOfPermissionsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsModusNonZero != null ? numberOfPermissionsModusNonZero.hashCode() : 0);
        result = 31 * result + (numberOfPermissionsMedianNonZero != null ? numberOfPermissionsMedianNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PermissionsStatistics{" +
                "numberOfApksWithPermissionsObtained=" + numberOfApksWithPermissionsObtained +
                ", numberOfPermissionsArithmeticMean=" + numberOfPermissionsArithmeticMean +
                ", numberOfPermissionsModus=" + numberOfPermissionsModus +
                ", numberOfPermissionsMedian=" + numberOfPermissionsMedian +
                ", topPermissions=" + topPermissions +
                ", numberOfPermissionsArithmeticMeanNonZero=" + numberOfPermissionsArithmeticMeanNonZero +
                ", numberOfPermissionsModusNonZero=" + numberOfPermissionsModusNonZero +
                ", numberOfPermissionsMedianNonZero=" + numberOfPermissionsMedianNonZero +
                '}';
    }
}
