package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class DrawableStatistics {

    /**
     * number of apks with data successfully collected
     */
    private Integer analyzedApks;

    //DRAWABLE FORMAT
    //-------------------------------------------------------

    //png
    private MathStatistics pngDrawables;
    private MathStatistics pngDrawablesNonZero;
    //jpg
    private MathStatistics jpgDrawables;
    private MathStatistics jpgDrawablesNonZero;
    //gif
    private MathStatistics gifDrawables;
    private MathStatistics gifDrawablesNonZero;
    //xml
    private MathStatistics xmlDrawables;
    private MathStatistics xmlDrawablesNonZero;


    //DIFFERENT DRAWABLES
    //-------------------------------------------------------

    //different drawables
    private MathStatistics differentDrawables;
    private MathStatistics differentDrawablesNonZero;


    //DRAWABLES RESOLUTION
    //-------------------------------------------------------

    // ldpi
    private MathStatistics ldpiDrawables;
    private MathStatistics ldpiDrawablesNonZero;
    // mdpi
    private MathStatistics mdpiDrawables;
    private MathStatistics mdpiDrawablesNonZero;
    // hdpi
    private MathStatistics hdpiDrawables;
    private MathStatistics hdpiDrawablesNonZero;
    // xdpi
    private MathStatistics xhdpiDrawables;
    private MathStatistics xhdpiDrawablesNonZero;
    // xxdpi
    private MathStatistics xxhdpiDrawables;
    private MathStatistics xxhdpiDrawablesNonZero;
    // xxxdpi
    private MathStatistics xxxhdpiDrawables;
    private MathStatistics xxxhdpiDrawablesNonZero;
    // unspecified dpi
    private MathStatistics unspecifiedDpiDrawables;
    private MathStatistics unspecifiedDpiDrawablesNonZero;


    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getPngDrawables() {
        return pngDrawables;
    }

    public void setPngDrawables(MathStatistics pngDrawables) {
        this.pngDrawables = pngDrawables;
    }

    public MathStatistics getPngDrawablesNonZero() {
        return pngDrawablesNonZero;
    }

    public void setPngDrawablesNonZero(MathStatistics pngDrawablesNonZero) {
        this.pngDrawablesNonZero = pngDrawablesNonZero;
    }

    public MathStatistics getJpgDrawables() {
        return jpgDrawables;
    }

    public void setJpgDrawables(MathStatistics jpgDrawables) {
        this.jpgDrawables = jpgDrawables;
    }

    public MathStatistics getJpgDrawablesNonZero() {
        return jpgDrawablesNonZero;
    }

    public void setJpgDrawablesNonZero(MathStatistics jpgDrawablesNonZero) {
        this.jpgDrawablesNonZero = jpgDrawablesNonZero;
    }

    public MathStatistics getGifDrawables() {
        return gifDrawables;
    }

    public void setGifDrawables(MathStatistics gifDrawables) {
        this.gifDrawables = gifDrawables;
    }

    public MathStatistics getGifDrawablesNonZero() {
        return gifDrawablesNonZero;
    }

    public void setGifDrawablesNonZero(MathStatistics gifDrawablesNonZero) {
        this.gifDrawablesNonZero = gifDrawablesNonZero;
    }

    public MathStatistics getXmlDrawables() {
        return xmlDrawables;
    }

    public void setXmlDrawables(MathStatistics xmlDrawables) {
        this.xmlDrawables = xmlDrawables;
    }

    public MathStatistics getXmlDrawablesNonZero() {
        return xmlDrawablesNonZero;
    }

    public void setXmlDrawablesNonZero(MathStatistics xmlDrawablesNonZero) {
        this.xmlDrawablesNonZero = xmlDrawablesNonZero;
    }

    public MathStatistics getDifferentDrawables() {
        return differentDrawables;
    }

    public void setDifferentDrawables(MathStatistics differentDrawables) {
        this.differentDrawables = differentDrawables;
    }

    public MathStatistics getDifferentDrawablesNonZero() {
        return differentDrawablesNonZero;
    }

    public void setDifferentDrawablesNonZero(MathStatistics differentDrawablesNonZero) {
        this.differentDrawablesNonZero = differentDrawablesNonZero;
    }

    public MathStatistics getLdpiDrawables() {
        return ldpiDrawables;
    }

    public void setLdpiDrawables(MathStatistics ldpiDrawables) {
        this.ldpiDrawables = ldpiDrawables;
    }

    public MathStatistics getLdpiDrawablesNonZero() {
        return ldpiDrawablesNonZero;
    }

    public void setLdpiDrawablesNonZero(MathStatistics ldpiDrawablesNonZero) {
        this.ldpiDrawablesNonZero = ldpiDrawablesNonZero;
    }

    public MathStatistics getMdpiDrawables() {
        return mdpiDrawables;
    }

    public void setMdpiDrawables(MathStatistics mdpiDrawables) {
        this.mdpiDrawables = mdpiDrawables;
    }

    public MathStatistics getMdpiDrawablesNonZero() {
        return mdpiDrawablesNonZero;
    }

    public void setMdpiDrawablesNonZero(MathStatistics mdpiDrawablesNonZero) {
        this.mdpiDrawablesNonZero = mdpiDrawablesNonZero;
    }

    public MathStatistics getHdpiDrawables() {
        return hdpiDrawables;
    }

    public void setHdpiDrawables(MathStatistics hdpiDrawables) {
        this.hdpiDrawables = hdpiDrawables;
    }

    public MathStatistics getHdpiDrawablesNonZero() {
        return hdpiDrawablesNonZero;
    }

    public void setHdpiDrawablesNonZero(MathStatistics hdpiDrawablesNonZero) {
        this.hdpiDrawablesNonZero = hdpiDrawablesNonZero;
    }

    public MathStatistics getXhdpiDrawables() {
        return xhdpiDrawables;
    }

    public void setXhdpiDrawables(MathStatistics xhdpiDrawables) {
        this.xhdpiDrawables = xhdpiDrawables;
    }

    public MathStatistics getXhdpiDrawablesNonZero() {
        return xhdpiDrawablesNonZero;
    }

    public void setXhdpiDrawablesNonZero(MathStatistics xhdpiDrawablesNonZero) {
        this.xhdpiDrawablesNonZero = xhdpiDrawablesNonZero;
    }

    public MathStatistics getXxhdpiDrawables() {
        return xxhdpiDrawables;
    }

    public void setXxhdpiDrawables(MathStatistics xxhdpiDrawables) {
        this.xxhdpiDrawables = xxhdpiDrawables;
    }

    public MathStatistics getXxhdpiDrawablesNonZero() {
        return xxhdpiDrawablesNonZero;
    }

    public void setXxhdpiDrawablesNonZero(MathStatistics xxhdpiDrawablesNonZero) {
        this.xxhdpiDrawablesNonZero = xxhdpiDrawablesNonZero;
    }

    public MathStatistics getXxxhdpiDrawables() {
        return xxxhdpiDrawables;
    }

    public void setXxxhdpiDrawables(MathStatistics xxxhdpiDrawables) {
        this.xxxhdpiDrawables = xxxhdpiDrawables;
    }

    public MathStatistics getXxxhdpiDrawablesNonZero() {
        return xxxhdpiDrawablesNonZero;
    }

    public void setXxxhdpiDrawablesNonZero(MathStatistics xxxhdpiDrawablesNonZero) {
        this.xxxhdpiDrawablesNonZero = xxxhdpiDrawablesNonZero;
    }

    public MathStatistics getUnspecifiedDpiDrawables() {
        return unspecifiedDpiDrawables;
    }

    public void setUnspecifiedDpiDrawables(MathStatistics unspecifiedDpiDrawables) {
        this.unspecifiedDpiDrawables = unspecifiedDpiDrawables;
    }

    public MathStatistics getUnspecifiedDpiDrawablesNonZero() {
        return unspecifiedDpiDrawablesNonZero;
    }

    public void setUnspecifiedDpiDrawablesNonZero(MathStatistics unspecifiedDpiDrawablesNonZero) {
        this.unspecifiedDpiDrawablesNonZero = unspecifiedDpiDrawablesNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrawableStatistics that = (DrawableStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (pngDrawables != null ? !pngDrawables.equals(that.pngDrawables) : that.pngDrawables != null) return false;
        if (pngDrawablesNonZero != null ? !pngDrawablesNonZero.equals(that.pngDrawablesNonZero) : that.pngDrawablesNonZero != null)
            return false;
        if (jpgDrawables != null ? !jpgDrawables.equals(that.jpgDrawables) : that.jpgDrawables != null) return false;
        if (jpgDrawablesNonZero != null ? !jpgDrawablesNonZero.equals(that.jpgDrawablesNonZero) : that.jpgDrawablesNonZero != null)
            return false;
        if (gifDrawables != null ? !gifDrawables.equals(that.gifDrawables) : that.gifDrawables != null) return false;
        if (gifDrawablesNonZero != null ? !gifDrawablesNonZero.equals(that.gifDrawablesNonZero) : that.gifDrawablesNonZero != null)
            return false;
        if (xmlDrawables != null ? !xmlDrawables.equals(that.xmlDrawables) : that.xmlDrawables != null) return false;
        if (xmlDrawablesNonZero != null ? !xmlDrawablesNonZero.equals(that.xmlDrawablesNonZero) : that.xmlDrawablesNonZero != null)
            return false;
        if (differentDrawables != null ? !differentDrawables.equals(that.differentDrawables) : that.differentDrawables != null)
            return false;
        if (differentDrawablesNonZero != null ? !differentDrawablesNonZero.equals(that.differentDrawablesNonZero) : that.differentDrawablesNonZero != null)
            return false;
        if (ldpiDrawables != null ? !ldpiDrawables.equals(that.ldpiDrawables) : that.ldpiDrawables != null)
            return false;
        if (ldpiDrawablesNonZero != null ? !ldpiDrawablesNonZero.equals(that.ldpiDrawablesNonZero) : that.ldpiDrawablesNonZero != null)
            return false;
        if (mdpiDrawables != null ? !mdpiDrawables.equals(that.mdpiDrawables) : that.mdpiDrawables != null)
            return false;
        if (mdpiDrawablesNonZero != null ? !mdpiDrawablesNonZero.equals(that.mdpiDrawablesNonZero) : that.mdpiDrawablesNonZero != null)
            return false;
        if (hdpiDrawables != null ? !hdpiDrawables.equals(that.hdpiDrawables) : that.hdpiDrawables != null)
            return false;
        if (hdpiDrawablesNonZero != null ? !hdpiDrawablesNonZero.equals(that.hdpiDrawablesNonZero) : that.hdpiDrawablesNonZero != null)
            return false;
        if (xhdpiDrawables != null ? !xhdpiDrawables.equals(that.xhdpiDrawables) : that.xhdpiDrawables != null)
            return false;
        if (xhdpiDrawablesNonZero != null ? !xhdpiDrawablesNonZero.equals(that.xhdpiDrawablesNonZero) : that.xhdpiDrawablesNonZero != null)
            return false;
        if (xxhdpiDrawables != null ? !xxhdpiDrawables.equals(that.xxhdpiDrawables) : that.xxhdpiDrawables != null)
            return false;
        if (xxhdpiDrawablesNonZero != null ? !xxhdpiDrawablesNonZero.equals(that.xxhdpiDrawablesNonZero) : that.xxhdpiDrawablesNonZero != null)
            return false;
        if (xxxhdpiDrawables != null ? !xxxhdpiDrawables.equals(that.xxxhdpiDrawables) : that.xxxhdpiDrawables != null)
            return false;
        if (xxxhdpiDrawablesNonZero != null ? !xxxhdpiDrawablesNonZero.equals(that.xxxhdpiDrawablesNonZero) : that.xxxhdpiDrawablesNonZero != null)
            return false;
        if (unspecifiedDpiDrawables != null ? !unspecifiedDpiDrawables.equals(that.unspecifiedDpiDrawables) : that.unspecifiedDpiDrawables != null)
            return false;
        return !(unspecifiedDpiDrawablesNonZero != null ? !unspecifiedDpiDrawablesNonZero.equals(that.unspecifiedDpiDrawablesNonZero) : that.unspecifiedDpiDrawablesNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (pngDrawables != null ? pngDrawables.hashCode() : 0);
        result = 31 * result + (pngDrawablesNonZero != null ? pngDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawables != null ? jpgDrawables.hashCode() : 0);
        result = 31 * result + (jpgDrawablesNonZero != null ? jpgDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawables != null ? gifDrawables.hashCode() : 0);
        result = 31 * result + (gifDrawablesNonZero != null ? gifDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawables != null ? xmlDrawables.hashCode() : 0);
        result = 31 * result + (xmlDrawablesNonZero != null ? xmlDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawables != null ? differentDrawables.hashCode() : 0);
        result = 31 * result + (differentDrawablesNonZero != null ? differentDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawables != null ? ldpiDrawables.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesNonZero != null ? ldpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawables != null ? mdpiDrawables.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesNonZero != null ? mdpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawables != null ? hdpiDrawables.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesNonZero != null ? hdpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawables != null ? xhdpiDrawables.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesNonZero != null ? xhdpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawables != null ? xxhdpiDrawables.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesNonZero != null ? xxhdpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawables != null ? xxxhdpiDrawables.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesNonZero != null ? xxxhdpiDrawablesNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawables != null ? unspecifiedDpiDrawables.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesNonZero != null ? unspecifiedDpiDrawablesNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DrawableStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", pngDrawables=" + pngDrawables +
                ", pngDrawablesNonZero=" + pngDrawablesNonZero +
                ", jpgDrawables=" + jpgDrawables +
                ", jpgDrawablesNonZero=" + jpgDrawablesNonZero +
                ", gifDrawables=" + gifDrawables +
                ", gifDrawablesNonZero=" + gifDrawablesNonZero +
                ", xmlDrawables=" + xmlDrawables +
                ", xmlDrawablesNonZero=" + xmlDrawablesNonZero +
                ", differentDrawables=" + differentDrawables +
                ", differentDrawablesNonZero=" + differentDrawablesNonZero +
                ", ldpiDrawables=" + ldpiDrawables +
                ", ldpiDrawablesNonZero=" + ldpiDrawablesNonZero +
                ", mdpiDrawables=" + mdpiDrawables +
                ", mdpiDrawablesNonZero=" + mdpiDrawablesNonZero +
                ", hdpiDrawables=" + hdpiDrawables +
                ", hdpiDrawablesNonZero=" + hdpiDrawablesNonZero +
                ", xhdpiDrawables=" + xhdpiDrawables +
                ", xhdpiDrawablesNonZero=" + xhdpiDrawablesNonZero +
                ", xxhdpiDrawables=" + xxhdpiDrawables +
                ", xxhdpiDrawablesNonZero=" + xxhdpiDrawablesNonZero +
                ", xxxhdpiDrawables=" + xxxhdpiDrawables +
                ", xxxhdpiDrawablesNonZero=" + xxxhdpiDrawablesNonZero +
                ", unspecifiedDpiDrawables=" + unspecifiedDpiDrawables +
                ", unspecifiedDpiDrawablesNonZero=" + unspecifiedDpiDrawablesNonZero +
                '}';
    }
}
