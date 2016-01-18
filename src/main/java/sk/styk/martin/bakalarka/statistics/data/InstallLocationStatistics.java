package sk.styk.martin.bakalarka.statistics.data;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class InstallLocationStatistics {

    //installLocation
    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with location tag found in manifest
     */
    private Integer installLocationTagFoundInApks;
    private Map<String, Integer> installLocationTable;
    private BigDecimal installLocationAutoPercentage;
    private BigDecimal installLocationInternalOnlyPercentage;
    private BigDecimal installLocationPreferExternalPercentage;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public Integer getInstallLocationTagFoundInApks() {
        return installLocationTagFoundInApks;
    }

    public void setInstallLocationTagFoundInApks(Integer installLocationTagFoundInApks) {
        this.installLocationTagFoundInApks = installLocationTagFoundInApks;
    }

    public Map<String, Integer> getInstallLocationTable() {
        return installLocationTable;
    }

    public void setInstallLocationTable(Map<String, Integer> installLocationTable) {
        this.installLocationTable = installLocationTable;
    }

    public BigDecimal getInstallLocationAutoPercentage() {
        return installLocationAutoPercentage;
    }

    public void setInstallLocationAutoPercentage(BigDecimal installLocationAutoPercentage) {
        this.installLocationAutoPercentage = installLocationAutoPercentage;
    }

    public BigDecimal getInstallLocationInternalOnlyPercentage() {
        return installLocationInternalOnlyPercentage;
    }

    public void setInstallLocationInternalOnlyPercentage(BigDecimal installLocationInternalOnlyPercentage) {
        this.installLocationInternalOnlyPercentage = installLocationInternalOnlyPercentage;
    }

    public BigDecimal getInstallLocationPreferExternalPercentage() {
        return installLocationPreferExternalPercentage;
    }

    public void setInstallLocationPreferExternalPercentage(BigDecimal installLocationPreferExternalPercentage) {
        this.installLocationPreferExternalPercentage = installLocationPreferExternalPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstallLocationStatistics that = (InstallLocationStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (installLocationTagFoundInApks != null ? !installLocationTagFoundInApks.equals(that.installLocationTagFoundInApks) : that.installLocationTagFoundInApks != null)
            return false;
        if (installLocationTable != null ? !installLocationTable.equals(that.installLocationTable) : that.installLocationTable != null)
            return false;
        if (installLocationAutoPercentage != null ? !installLocationAutoPercentage.equals(that.installLocationAutoPercentage) : that.installLocationAutoPercentage != null)
            return false;
        if (installLocationInternalOnlyPercentage != null ? !installLocationInternalOnlyPercentage.equals(that.installLocationInternalOnlyPercentage) : that.installLocationInternalOnlyPercentage != null)
            return false;
        return !(installLocationPreferExternalPercentage != null ? !installLocationPreferExternalPercentage.equals(that.installLocationPreferExternalPercentage) : that.installLocationPreferExternalPercentage != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (installLocationTagFoundInApks != null ? installLocationTagFoundInApks.hashCode() : 0);
        result = 31 * result + (installLocationTable != null ? installLocationTable.hashCode() : 0);
        result = 31 * result + (installLocationAutoPercentage != null ? installLocationAutoPercentage.hashCode() : 0);
        result = 31 * result + (installLocationInternalOnlyPercentage != null ? installLocationInternalOnlyPercentage.hashCode() : 0);
        result = 31 * result + (installLocationPreferExternalPercentage != null ? installLocationPreferExternalPercentage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InstallLocationStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", installLocationTagFoundInApks=" + installLocationTagFoundInApks +
                ", installLocationTable=" + installLocationTable +
                ", installLocationAutoPercentage=" + installLocationAutoPercentage +
                ", installLocationInternalOnlyPercentage=" + installLocationInternalOnlyPercentage +
                ", installLocationPreferExternalPercentage=" + installLocationPreferExternalPercentage +
                '}';
    }
}
