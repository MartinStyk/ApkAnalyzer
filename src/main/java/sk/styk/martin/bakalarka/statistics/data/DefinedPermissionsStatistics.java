package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class DefinedPermissionsStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with location tag found in manifest
     */

    //permissions
    private MathStatistics permissions;
    private MathStatistics permissionsNonZero;

    private Map<String, PercentagePair> topProtectionLevel;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getPermissions() {
        return permissions;
    }

    public void setPermissions(MathStatistics permissions) {
        this.permissions = permissions;
    }

    public MathStatistics getPermissionsNonZero() {
        return permissionsNonZero;
    }

    public void setPermissionsNonZero(MathStatistics permissionsNonZero) {
        this.permissionsNonZero = permissionsNonZero;
    }

    public Map<String, PercentagePair> getTopProtectionLevel() {
        return topProtectionLevel;
    }

    public void setTopProtectionLevel(Map<String, PercentagePair> topProtectionLevel) {
        this.topProtectionLevel = topProtectionLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefinedPermissionsStatistics that = (DefinedPermissionsStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (permissions != null ? !permissions.equals(that.permissions) : that.permissions != null) return false;
        if (permissionsNonZero != null ? !permissionsNonZero.equals(that.permissionsNonZero) : that.permissionsNonZero != null)
            return false;
        return !(topProtectionLevel != null ? !topProtectionLevel.equals(that.topProtectionLevel) : that.topProtectionLevel != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        result = 31 * result + (permissionsNonZero != null ? permissionsNonZero.hashCode() : 0);
        result = 31 * result + (topProtectionLevel != null ? topProtectionLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PermissionsStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", permissions=" + permissions +
                ", permissionsNonZero=" + permissionsNonZero +
                ", topProtectionLevel=" + topProtectionLevel +
                '}';
    }
}