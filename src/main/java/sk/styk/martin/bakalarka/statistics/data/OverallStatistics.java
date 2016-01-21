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

    private FeaturesStatistics featuresStatistics;

    private SdkStatistics sdkStatistics;

    private ScreenStatistics screenStatistics;

    private LocalizationsStatistics localizationsStatistics;

    private DrawableStatistics drawableStatistics;

    private AdditionalResourceStatistics additionalResourceStatistics;

    public Integer getTotalAnalyzedApks() {
        return totalAnalyzedApks;
    }

    public void setTotalAnalyzedApks(Integer totalAnalyzedApks) {
        this.totalAnalyzedApks = totalAnalyzedApks;
    }

    public FileSizeStatistics getFileSizeStatistics() {
        return fileSizeStatistics;
    }

    public void setFileSizeStatistics(FileSizeStatistics fileSizeStatistics) {
        this.fileSizeStatistics = fileSizeStatistics;
    }

    public InstallLocationStatistics getInstallLocationStatistics() {
        return installLocationStatistics;
    }

    public void setInstallLocationStatistics(InstallLocationStatistics installLocationStatistics) {
        this.installLocationStatistics = installLocationStatistics;
    }

    public AppComponentsStatistics getAppComponentsStatistics() {
        return appComponentsStatistics;
    }

    public void setAppComponentsStatistics(AppComponentsStatistics appComponentsStatistics) {
        this.appComponentsStatistics = appComponentsStatistics;
    }

    public PermissionsStatistics getPermissionsStatistics() {
        return permissionsStatistics;
    }

    public void setPermissionsStatistics(PermissionsStatistics permissionsStatistics) {
        this.permissionsStatistics = permissionsStatistics;
    }

    public LibrariesStatistics getLibrariesStatistics() {
        return librariesStatistics;
    }

    public void setLibrariesStatistics(LibrariesStatistics librariesStatistics) {
        this.librariesStatistics = librariesStatistics;
    }

    public FeaturesStatistics getFeaturesStatistics() {
        return featuresStatistics;
    }

    public void setFeaturesStatistics(FeaturesStatistics featuresStatistics) {
        this.featuresStatistics = featuresStatistics;
    }

    public SdkStatistics getSdkStatistics() {
        return sdkStatistics;
    }

    public void setSdkStatistics(SdkStatistics sdkStatistics) {
        this.sdkStatistics = sdkStatistics;
    }

    public ScreenStatistics getScreenStatistics() {
        return screenStatistics;
    }

    public void setScreenStatistics(ScreenStatistics screenStatistics) {
        this.screenStatistics = screenStatistics;
    }

    public LocalizationsStatistics getLocalizationsStatistics() {
        return localizationsStatistics;
    }

    public void setLocalizationsStatistics(LocalizationsStatistics localizationsStatistics) {
        this.localizationsStatistics = localizationsStatistics;
    }

    public DrawableStatistics getDrawableStatistics() {
        return drawableStatistics;
    }

    public void setDrawableStatistics(DrawableStatistics drawableStatistics) {
        this.drawableStatistics = drawableStatistics;
    }

    public AdditionalResourceStatistics getAdditionalResourceStatistics() {
        return additionalResourceStatistics;
    }

    public void setAdditionalResourceStatistics(AdditionalResourceStatistics additionalResourceStatistics) {
        this.additionalResourceStatistics = additionalResourceStatistics;
    }

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
        if (featuresStatistics != null ? !featuresStatistics.equals(that.featuresStatistics) : that.featuresStatistics != null)
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
        result = 31 * result + (featuresStatistics != null ? featuresStatistics.hashCode() : 0);
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
                ", featuresStatistics=" + featuresStatistics +
                ", sdkStatistics=" + sdkStatistics +
                ", screenStatistics=" + screenStatistics +
                ", localizationsStatistics=" + localizationsStatistics +
                ", drawableStatistics=" + drawableStatistics +
                ", additionalResourceStatistics=" + additionalResourceStatistics +
                '}';
    }
}
