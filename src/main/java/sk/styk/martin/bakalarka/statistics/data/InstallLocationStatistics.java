package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class InstallLocationStatistics {

    //installLocation
    private Integer installLocationTotalApks;
    private Integer installLocationAutoPercentage;
    private Integer installLocationInternalOnlyPercentage;
    private Integer installLocationPreferExternalPercentage;

    public Integer getInstallLocationTotalApks() {
        return installLocationTotalApks;
    }

    public void setInstallLocationTotalApks(Integer installLocationTotalApks) {
        this.installLocationTotalApks = installLocationTotalApks;
    }

    public Integer getInstallLocationAutoPercentage() {
        return installLocationAutoPercentage;
    }

    public void setInstallLocationAutoPercentage(Integer installLocationAutoPercentage) {
        this.installLocationAutoPercentage = installLocationAutoPercentage;
    }

    public Integer getInstallLocationInternalOnlyPercentage() {
        return installLocationInternalOnlyPercentage;
    }

    public void setInstallLocationInternalOnlyPercentage(Integer installLocationInternalOnlyPercentage) {
        this.installLocationInternalOnlyPercentage = installLocationInternalOnlyPercentage;
    }

    public Integer getInstallLocationPreferExternalPercentage() {
        return installLocationPreferExternalPercentage;
    }

    public void setInstallLocationPreferExternalPercentage(Integer installLocationPreferExternalPercentage) {
        this.installLocationPreferExternalPercentage = installLocationPreferExternalPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstallLocationStatistics that = (InstallLocationStatistics) o;

        if (installLocationTotalApks != null ? !installLocationTotalApks.equals(that.installLocationTotalApks) : that.installLocationTotalApks != null)
            return false;
        if (installLocationAutoPercentage != null ? !installLocationAutoPercentage.equals(that.installLocationAutoPercentage) : that.installLocationAutoPercentage != null)
            return false;
        if (installLocationInternalOnlyPercentage != null ? !installLocationInternalOnlyPercentage.equals(that.installLocationInternalOnlyPercentage) : that.installLocationInternalOnlyPercentage != null)
            return false;
        return !(installLocationPreferExternalPercentage != null ? !installLocationPreferExternalPercentage.equals(that.installLocationPreferExternalPercentage) : that.installLocationPreferExternalPercentage != null);

    }

    @Override
    public int hashCode() {
        int result = installLocationTotalApks != null ? installLocationTotalApks.hashCode() : 0;
        result = 31 * result + (installLocationAutoPercentage != null ? installLocationAutoPercentage.hashCode() : 0);
        result = 31 * result + (installLocationInternalOnlyPercentage != null ? installLocationInternalOnlyPercentage.hashCode() : 0);
        result = 31 * result + (installLocationPreferExternalPercentage != null ? installLocationPreferExternalPercentage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InstallLocationStatistics{" +
                "installLocationTotalApks=" + installLocationTotalApks +
                ", installLocationAutoPercentage=" + installLocationAutoPercentage +
                ", installLocationInternalOnlyPercentage=" + installLocationInternalOnlyPercentage +
                ", installLocationPreferExternalPercentage=" + installLocationPreferExternalPercentage +
                '}';
    }
}
