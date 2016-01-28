package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class ResourceStatistics {

    /**
     * number of apks with data successfully collected
     */
    private Integer analyzedApks;

    //layouts
    private MathStatistics layouts;
    private MathStatistics layoutsNonZero;

    //different layouts
    private MathStatistics differentLayouts;
    private MathStatistics differentLayoutsNonZero;

    //menu
    private MathStatistics menu;
    private MathStatistics menuNonZero;

    //raw resources
    private MathStatistics rawResources;
    private MathStatistics rawResourcesNonZero;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getLayouts() {
        return layouts;
    }

    public void setLayouts(MathStatistics layouts) {
        this.layouts = layouts;
    }

    public MathStatistics getLayoutsNonZero() {
        return layoutsNonZero;
    }

    public void setLayoutsNonZero(MathStatistics layoutsNonZero) {
        this.layoutsNonZero = layoutsNonZero;
    }

    public MathStatistics getDifferentLayouts() {
        return differentLayouts;
    }

    public void setDifferentLayouts(MathStatistics differentLayouts) {
        this.differentLayouts = differentLayouts;
    }

    public MathStatistics getDifferentLayoutsNonZero() {
        return differentLayoutsNonZero;
    }

    public void setDifferentLayoutsNonZero(MathStatistics differentLayoutsNonZero) {
        this.differentLayoutsNonZero = differentLayoutsNonZero;
    }

    public MathStatistics getMenu() {
        return menu;
    }

    public void setMenu(MathStatistics menu) {
        this.menu = menu;
    }

    public MathStatistics getMenuNonZero() {
        return menuNonZero;
    }

    public void setMenuNonZero(MathStatistics menuNonZero) {
        this.menuNonZero = menuNonZero;
    }

    public MathStatistics getRawResources() {
        return rawResources;
    }

    public void setRawResources(MathStatistics rawResources) {
        this.rawResources = rawResources;
    }

    public MathStatistics getRawResourcesNonZero() {
        return rawResourcesNonZero;
    }

    public void setRawResourcesNonZero(MathStatistics rawResourcesNonZero) {
        this.rawResourcesNonZero = rawResourcesNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceStatistics that = (ResourceStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (layouts != null ? !layouts.equals(that.layouts) : that.layouts != null) return false;
        if (layoutsNonZero != null ? !layoutsNonZero.equals(that.layoutsNonZero) : that.layoutsNonZero != null)
            return false;
        if (differentLayouts != null ? !differentLayouts.equals(that.differentLayouts) : that.differentLayouts != null)
            return false;
        if (differentLayoutsNonZero != null ? !differentLayoutsNonZero.equals(that.differentLayoutsNonZero) : that.differentLayoutsNonZero != null)
            return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (menuNonZero != null ? !menuNonZero.equals(that.menuNonZero) : that.menuNonZero != null) return false;
        if (rawResources != null ? !rawResources.equals(that.rawResources) : that.rawResources != null) return false;
        return !(rawResourcesNonZero != null ? !rawResourcesNonZero.equals(that.rawResourcesNonZero) : that.rawResourcesNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (layouts != null ? layouts.hashCode() : 0);
        result = 31 * result + (layoutsNonZero != null ? layoutsNonZero.hashCode() : 0);
        result = 31 * result + (differentLayouts != null ? differentLayouts.hashCode() : 0);
        result = 31 * result + (differentLayoutsNonZero != null ? differentLayoutsNonZero.hashCode() : 0);
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (menuNonZero != null ? menuNonZero.hashCode() : 0);
        result = 31 * result + (rawResources != null ? rawResources.hashCode() : 0);
        result = 31 * result + (rawResourcesNonZero != null ? rawResourcesNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResourceStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", layouts=" + layouts +
                ", layoutsNonZero=" + layoutsNonZero +
                ", differentLayouts=" + differentLayouts +
                ", differentLayoutsNonZero=" + differentLayoutsNonZero +
                ", menu=" + menu +
                ", menuNonZero=" + menuNonZero +
                ", rawResources=" + rawResources +
                ", rawResourcesNonZero=" + rawResourcesNonZero +
                '}';
    }
}

