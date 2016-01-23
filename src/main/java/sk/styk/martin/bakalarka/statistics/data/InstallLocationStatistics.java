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
    private Map<String, PercentagePair> installLocationTable;

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

    public Map<String, PercentagePair> getInstallLocationTable() {
        return installLocationTable;
    }

    public void setInstallLocationTable(Map<String, PercentagePair> installLocationTable) {
        this.installLocationTable = installLocationTable;
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
        return true;

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (installLocationTagFoundInApks != null ? installLocationTagFoundInApks.hashCode() : 0);
        result = 31 * result + (installLocationTable != null ? installLocationTable.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InstallLocationStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", installLocationTagFoundInApks=" + installLocationTagFoundInApks +
                ", installLocationTable=" + installLocationTable +
                '}';
    }
}
