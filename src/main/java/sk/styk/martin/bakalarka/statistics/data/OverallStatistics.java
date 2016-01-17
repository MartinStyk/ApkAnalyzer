package sk.styk.martin.bakalarka.statistics.data;


/**
 * Created by Martin Styk on 16.01.2016.
 */
public class OverallStatistics {

    private Integer totalAnalyzedApks;

    private FileSizeStatistics fileSizeStatistics;

    private InstallLocationStatistics installLocationStatistics;

    private AppComponentsStatistics appComponentsStatistics;

    private PermissionsStatistics permissionsStatistics;

    private LibrariesStatistics librariesStatistics;

    private SdkStatistics sdkStatistics;

    private ScreenStatistics screenStatistics;

    private LocalizationsStatistics localizationsStatistics;

    private DrawableStatistics drawableStatistics;

    private AdditionalResourceStatistics additionalResourceStatistics;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OverallStatistics that = (OverallStatistics) o;

        if (totalAnalyzedApks != null ? !totalAnalyzedApks.equals(that.totalAnalyzedApks) : that.totalAnalyzedApks != null)
            return false;
        if (fileSizeStatistics != null ? !fileSizeStatistics.equals(that.fileSizeStatistics) : that.fileSizeStatistics != null)
            return false;
        if (installLocationStatistics != null ? !installLocationStatistics.equals(that.installLocationStatistics) : that.installLocationStatistics != null)
            return false;
        if (appComponentsStatistics != null ? !appComponentsStatistics.equals(that.appComponentsStatistics) : that.appComponentsStatistics != null)
            return false;
        if (permissionsStatistics != null ? !permissionsStatistics.equals(that.permissionsStatistics) : that.permissionsStatistics != null)
            return false;
        if (librariesStatistics != null ? !librariesStatistics.equals(that.librariesStatistics) : that.librariesStatistics != null)
            return false;
        if (sdkStatistics != null ? !sdkStatistics.equals(that.sdkStatistics) : that.sdkStatistics != null)
            return false;
        if (screenStatistics != null ? !screenStatistics.equals(that.screenStatistics) : that.screenStatistics != null)
            return false;
        if (localizationsStatistics != null ? !localizationsStatistics.equals(that.localizationsStatistics) : that.localizationsStatistics != null)
            return false;
        if (drawableStatistics != null ? !drawableStatistics.equals(that.drawableStatistics) : that.drawableStatistics != null)
            return false;
        return !(additionalResourceStatistics != null ? !additionalResourceStatistics.equals(that.additionalResourceStatistics) : that.additionalResourceStatistics != null);

    }

    @Override
    public int hashCode() {
        int result = totalAnalyzedApks != null ? totalAnalyzedApks.hashCode() : 0;
        result = 31 * result + (fileSizeStatistics != null ? fileSizeStatistics.hashCode() : 0);
        result = 31 * result + (installLocationStatistics != null ? installLocationStatistics.hashCode() : 0);
        result = 31 * result + (appComponentsStatistics != null ? appComponentsStatistics.hashCode() : 0);
        result = 31 * result + (permissionsStatistics != null ? permissionsStatistics.hashCode() : 0);
        result = 31 * result + (librariesStatistics != null ? librariesStatistics.hashCode() : 0);
        result = 31 * result + (sdkStatistics != null ? sdkStatistics.hashCode() : 0);
        result = 31 * result + (screenStatistics != null ? screenStatistics.hashCode() : 0);
        result = 31 * result + (localizationsStatistics != null ? localizationsStatistics.hashCode() : 0);
        result = 31 * result + (drawableStatistics != null ? drawableStatistics.hashCode() : 0);
        result = 31 * result + (additionalResourceStatistics != null ? additionalResourceStatistics.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OverallStatistics{" +
                "totalAnalyzedApks=" + totalAnalyzedApks +
                ", fileSizeStatistics=" + fileSizeStatistics +
                ", installLocationStatistics=" + installLocationStatistics +
                ", appComponentsStatistics=" + appComponentsStatistics +
                ", permissionsStatistics=" + permissionsStatistics +
                ", librariesStatistics=" + librariesStatistics +
                ", sdkStatistics=" + sdkStatistics +
                ", screenStatistics=" + screenStatistics +
                ", localizationsStatistics=" + localizationsStatistics +
                ", drawableStatistics=" + drawableStatistics +
                ", additionalResourceStatistics=" + additionalResourceStatistics +
                '}';
    }
}
