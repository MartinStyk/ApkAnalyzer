package sk.styk.martin.bakalarka.statistics.data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class PermissionsStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with location tag found in manifest
     */

    //permissions
    private Integer numberOfApksWithPermissionsTagObtained;
    private BigDecimal permissionsArithmeticMean;
    private List<Integer> permissionsModus;
    private Integer permissionsMedian;
    private Integer permissionsMax;
    private Integer permissionsMin;
    private BigDecimal permissionsVariance;
    private BigDecimal permissionsDeviation;

    private Integer numberOfApksWithPermissionsTagObtainedNonZero;
    private BigDecimal permissionsArithmeticMeanNonZero;
    private List<Integer> permissionsModusNonZero;
    private Integer permissionsMedianNonZero;
    private Integer permissionsMaxNonZero;
    private Integer permissionsMinNonZero;
    private BigDecimal permissionsVarianceNonZero;
    private BigDecimal permissionsDeviationNonZero;

    private Map<String,PercentagePair> topPermissions;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public Integer getNumberOfApksWithPermissionsTagObtained() {
        return numberOfApksWithPermissionsTagObtained;
    }

    public void setNumberOfApksWithPermissionsTagObtained(Integer numberOfApksWithPermissionsTagObtained) {
        this.numberOfApksWithPermissionsTagObtained = numberOfApksWithPermissionsTagObtained;
    }

    public BigDecimal getPermissionsArithmeticMean() {
        return permissionsArithmeticMean;
    }

    public void setPermissionsArithmeticMean(BigDecimal permissionsArithmeticMean) {
        this.permissionsArithmeticMean = permissionsArithmeticMean;
    }

    public List<Integer> getPermissionsModus() {
        return permissionsModus;
    }

    public void setPermissionsModus(List<Integer> permissionsModus) {
        this.permissionsModus = permissionsModus;
    }

    public Integer getPermissionsMedian() {
        return permissionsMedian;
    }

    public void setPermissionsMedian(Integer permissionsMedian) {
        this.permissionsMedian = permissionsMedian;
    }

    public Integer getPermissionsMax() {
        return permissionsMax;
    }

    public void setPermissionsMax(Integer permissionsMax) {
        this.permissionsMax = permissionsMax;
    }

    public Integer getPermissionsMin() {
        return permissionsMin;
    }

    public void setPermissionsMin(Integer permissionsMin) {
        this.permissionsMin = permissionsMin;
    }

    public BigDecimal getPermissionsVariance() {
        return permissionsVariance;
    }

    public void setPermissionsVariance(BigDecimal permissionsVariance) {
        this.permissionsVariance = permissionsVariance;
    }

    public BigDecimal getPermissionsDeviation() {
        return permissionsDeviation;
    }

    public void setPermissionsDeviation(BigDecimal permissionsDeviation) {
        this.permissionsDeviation = permissionsDeviation;
    }

    public Map<String, PercentagePair> getTopPermissions() {
        return topPermissions;
    }

    public void setTopPermissions(Map<String, PercentagePair> topPermissions) {
        this.topPermissions = topPermissions;
    }

    public Integer getNumberOfApksWithPermissionsTagObtainedNonZero() {
        return numberOfApksWithPermissionsTagObtainedNonZero;
    }

    public void setNumberOfApksWithPermissionsTagObtainedNonZero(Integer numberOfApksWithPermissionsTagObtainedNonZero) {
        this.numberOfApksWithPermissionsTagObtainedNonZero = numberOfApksWithPermissionsTagObtainedNonZero;
    }

    public BigDecimal getPermissionsArithmeticMeanNonZero() {
        return permissionsArithmeticMeanNonZero;
    }

    public void setPermissionsArithmeticMeanNonZero(BigDecimal permissionsArithmeticMeanNonZero) {
        this.permissionsArithmeticMeanNonZero = permissionsArithmeticMeanNonZero;
    }

    public List<Integer> getPermissionsModusNonZero() {
        return permissionsModusNonZero;
    }

    public void setPermissionsModusNonZero(List<Integer> permissionsModusNonZero) {
        this.permissionsModusNonZero = permissionsModusNonZero;
    }

    public Integer getPermissionsMedianNonZero() {
        return permissionsMedianNonZero;
    }

    public void setPermissionsMedianNonZero(Integer permissionsMedianNonZero) {
        this.permissionsMedianNonZero = permissionsMedianNonZero;
    }

    public Integer getPermissionsMaxNonZero() {
        return permissionsMaxNonZero;
    }

    public void setPermissionsMaxNonZero(Integer permissionsMaxNonZero) {
        this.permissionsMaxNonZero = permissionsMaxNonZero;
    }

    public Integer getPermissionsMinNonZero() {
        return permissionsMinNonZero;
    }

    public void setPermissionsMinNonZero(Integer permissionsMinNonZero) {
        this.permissionsMinNonZero = permissionsMinNonZero;
    }

    public BigDecimal getPermissionsVarianceNonZero() {
        return permissionsVarianceNonZero;
    }

    public void setPermissionsVarianceNonZero(BigDecimal permissionsVarianceNonZero) {
        this.permissionsVarianceNonZero = permissionsVarianceNonZero;
    }

    public BigDecimal getPermissionsDeviationNonZero() {
        return permissionsDeviationNonZero;
    }

    public void setPermissionsDeviationNonZero(BigDecimal permissionsDeviationNonZero) {
        this.permissionsDeviationNonZero = permissionsDeviationNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PermissionsStatistics that = (PermissionsStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (numberOfApksWithPermissionsTagObtained != null ? !numberOfApksWithPermissionsTagObtained.equals(that.numberOfApksWithPermissionsTagObtained) : that.numberOfApksWithPermissionsTagObtained != null)
            return false;
        if (permissionsArithmeticMean != null ? !permissionsArithmeticMean.equals(that.permissionsArithmeticMean) : that.permissionsArithmeticMean != null)
            return false;
        if (permissionsModus != null ? !permissionsModus.equals(that.permissionsModus) : that.permissionsModus != null)
            return false;
        if (permissionsMedian != null ? !permissionsMedian.equals(that.permissionsMedian) : that.permissionsMedian != null)
            return false;
        if (permissionsMax != null ? !permissionsMax.equals(that.permissionsMax) : that.permissionsMax != null)
            return false;
        if (permissionsMin != null ? !permissionsMin.equals(that.permissionsMin) : that.permissionsMin != null)
            return false;
        if (permissionsVariance != null ? !permissionsVariance.equals(that.permissionsVariance) : that.permissionsVariance != null)
            return false;
        if (permissionsDeviation != null ? !permissionsDeviation.equals(that.permissionsDeviation) : that.permissionsDeviation != null)
            return false;
        if (topPermissions != null ? !topPermissions.equals(that.topPermissions) : that.topPermissions != null)
            return false;
        if (numberOfApksWithPermissionsTagObtainedNonZero != null ? !numberOfApksWithPermissionsTagObtainedNonZero.equals(that.numberOfApksWithPermissionsTagObtainedNonZero) : that.numberOfApksWithPermissionsTagObtainedNonZero != null)
            return false;
        if (permissionsArithmeticMeanNonZero != null ? !permissionsArithmeticMeanNonZero.equals(that.permissionsArithmeticMeanNonZero) : that.permissionsArithmeticMeanNonZero != null)
            return false;
        if (permissionsModusNonZero != null ? !permissionsModusNonZero.equals(that.permissionsModusNonZero) : that.permissionsModusNonZero != null)
            return false;
        if (permissionsMedianNonZero != null ? !permissionsMedianNonZero.equals(that.permissionsMedianNonZero) : that.permissionsMedianNonZero != null)
            return false;
        if (permissionsMaxNonZero != null ? !permissionsMaxNonZero.equals(that.permissionsMaxNonZero) : that.permissionsMaxNonZero != null)
            return false;
        if (permissionsMinNonZero != null ? !permissionsMinNonZero.equals(that.permissionsMinNonZero) : that.permissionsMinNonZero != null)
            return false;
        if (permissionsVarianceNonZero != null ? !permissionsVarianceNonZero.equals(that.permissionsVarianceNonZero) : that.permissionsVarianceNonZero != null)
            return false;
        return !(permissionsDeviationNonZero != null ? !permissionsDeviationNonZero.equals(that.permissionsDeviationNonZero) : that.permissionsDeviationNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (numberOfApksWithPermissionsTagObtained != null ? numberOfApksWithPermissionsTagObtained.hashCode() : 0);
        result = 31 * result + (permissionsArithmeticMean != null ? permissionsArithmeticMean.hashCode() : 0);
        result = 31 * result + (permissionsModus != null ? permissionsModus.hashCode() : 0);
        result = 31 * result + (permissionsMedian != null ? permissionsMedian.hashCode() : 0);
        result = 31 * result + (permissionsMax != null ? permissionsMax.hashCode() : 0);
        result = 31 * result + (permissionsMin != null ? permissionsMin.hashCode() : 0);
        result = 31 * result + (permissionsVariance != null ? permissionsVariance.hashCode() : 0);
        result = 31 * result + (permissionsDeviation != null ? permissionsDeviation.hashCode() : 0);
        result = 31 * result + (topPermissions != null ? topPermissions.hashCode() : 0);
        result = 31 * result + (numberOfApksWithPermissionsTagObtainedNonZero != null ? numberOfApksWithPermissionsTagObtainedNonZero.hashCode() : 0);
        result = 31 * result + (permissionsArithmeticMeanNonZero != null ? permissionsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (permissionsModusNonZero != null ? permissionsModusNonZero.hashCode() : 0);
        result = 31 * result + (permissionsMedianNonZero != null ? permissionsMedianNonZero.hashCode() : 0);
        result = 31 * result + (permissionsMaxNonZero != null ? permissionsMaxNonZero.hashCode() : 0);
        result = 31 * result + (permissionsMinNonZero != null ? permissionsMinNonZero.hashCode() : 0);
        result = 31 * result + (permissionsVarianceNonZero != null ? permissionsVarianceNonZero.hashCode() : 0);
        result = 31 * result + (permissionsDeviationNonZero != null ? permissionsDeviationNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PermissionsStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", numberOfApksWithPermissionsTagObtained=" + numberOfApksWithPermissionsTagObtained +
                ", permissionsArithmeticMean=" + permissionsArithmeticMean +
                ", permissionsModus=" + permissionsModus +
                ", permissionsMedian=" + permissionsMedian +
                ", permissionsMax=" + permissionsMax +
                ", permissionsMin=" + permissionsMin +
                ", permissionsVariance=" + permissionsVariance +
                ", permissionsDeviation=" + permissionsDeviation +
                ", topPermissions=" + topPermissions +
                ", numberOfApksWithPermissionsTagObtainedNonZero=" + numberOfApksWithPermissionsTagObtainedNonZero +
                ", permissionsArithmeticMeanNonZero=" + permissionsArithmeticMeanNonZero +
                ", permissionsModusNonZero=" + permissionsModusNonZero +
                ", permissionsMedianNonZero=" + permissionsMedianNonZero +
                ", permissionsMaxNonZero=" + permissionsMaxNonZero +
                ", permissionsMinNonZero=" + permissionsMinNonZero +
                ", permissionsVarianceNonZero=" + permissionsVarianceNonZero +
                ", permissionsDeviationNonZero=" + permissionsDeviationNonZero +
                '}';
    }
}
