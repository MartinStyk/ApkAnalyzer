package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 06.12.2015.
 */
public class ResourceData {

    //versions of string.xml file
    private List<String> locale;

    //number of different resource entries from default /res/values/strings.xml
    private Integer numberOfStringResource;

    //types of drawables
    private Integer pngDrawables;
    private Integer jpgDrawables;
    private Integer gifDrawables;
    private Integer xmlDrawables;

    //number of drawables with different name (i.e. /res/hdpi/a.png == /res/xhdpi/a.png)
    private Integer differentDrawables;

    //drawables according to dimensions
    private Integer ldpiDrawables;
    private Integer mdpiDrawables;
    private Integer hdpiDrawables;
    private Integer xhdpiDrawables;
    private Integer xxhdpiDrawables;
    private Integer xxxhdpiDrawables;
    private Integer unspecifiedDpiDrawables;

    //resources that should not be comprimed in res/raw folder
    private Integer rawResources;

    //number of menu layout resources in res/menu directory
    private Integer menu;

    private Integer layouts;
    //number of layouts with different name (i.e. /res/layout/a.xml == /res/layout-land/a.xml)
    private Integer differentLayouts;


    public List<String> getLocale() {
        return locale;
    }

    public void setLocale(List<String> locale) {
        this.locale = locale;
    }

    public Integer getPngDrawables() {
        return pngDrawables;
    }

    public void setPngDrawables(Integer pngDrawables) {
        this.pngDrawables = pngDrawables;
    }

    public Integer getJpgDrawables() {
        return jpgDrawables;
    }

    public void setJpgDrawables(Integer jpgDrawables) {
        this.jpgDrawables = jpgDrawables;
    }

    public Integer getGifDrawables() {
        return gifDrawables;
    }

    public Integer getXmlDrawables() {
        return xmlDrawables;
    }

    public void setXmlDrawables(Integer xmlDrawables) {
        this.xmlDrawables = xmlDrawables;
    }

    public void setGifDrawables(Integer gifDrawables) {
        this.gifDrawables = gifDrawables;
    }

    public Integer getDifferentDrawables() {
        return differentDrawables;
    }

    public void setDifferentDrawables(Integer differentDrawables) {
        this.differentDrawables = differentDrawables;
    }

    public Integer getLdpiDrawables() {
        return ldpiDrawables;
    }

    public void setLdpiDrawables(Integer ldpiDrawables) {
        this.ldpiDrawables = ldpiDrawables;
    }

    public Integer getMdpiDrawables() {
        return mdpiDrawables;
    }

    public void setMdpiDrawables(Integer mdpiDrawables) {
        this.mdpiDrawables = mdpiDrawables;
    }

    public Integer getHdpiDrawables() {
        return hdpiDrawables;
    }

    public void setHdpiDrawables(Integer hdpiDrawables) {
        this.hdpiDrawables = hdpiDrawables;
    }

    public Integer getXhdpiDrawables() {
        return xhdpiDrawables;
    }

    public void setXhdpiDrawables(Integer xhdpiDrawables) {
        this.xhdpiDrawables = xhdpiDrawables;
    }

    public Integer getXxhdpiDrawables() {
        return xxhdpiDrawables;
    }

    public void setXxhdpiDrawables(Integer xxhdpiDrawables) {
        this.xxhdpiDrawables = xxhdpiDrawables;
    }

    public Integer getXxxhdpiDrawables() {
        return xxxhdpiDrawables;
    }

    public void setXxxhdpiDrawables(Integer xxxhdpiDrawables) {
        this.xxxhdpiDrawables = xxxhdpiDrawables;
    }

    public Integer getUnspecifiedDpiDrawables() {
        return unspecifiedDpiDrawables;
    }

    public void setUnspecifiedDpiDrawables(Integer unspecifiedDpiDrawables) {
        this.unspecifiedDpiDrawables = unspecifiedDpiDrawables;
    }

    public Integer getNumberOfStringResource() {
        return numberOfStringResource;
    }

    public void setNumberOfStringResource(Integer numberOfStringResource) {
        this.numberOfStringResource = numberOfStringResource;
    }

    public Integer getRawResources() {
        return rawResources;
    }

    public Integer getDifferentLayouts() {
        return differentLayouts;
    }

    public void setDifferentLayouts(Integer differentLayouts) {
        this.differentLayouts = differentLayouts;
    }

    public Integer getLayouts() {
        return layouts;
    }

    public void setLayouts(Integer layouts) {
        this.layouts = layouts;
    }

    public void setRawResources(Integer rawResources) {
        this.rawResources = rawResources;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceData that = (ResourceData) o;

        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (numberOfStringResource != null ? !numberOfStringResource.equals(that.numberOfStringResource) : that.numberOfStringResource != null)
            return false;
        if (pngDrawables != null ? !pngDrawables.equals(that.pngDrawables) : that.pngDrawables != null) return false;
        if (jpgDrawables != null ? !jpgDrawables.equals(that.jpgDrawables) : that.jpgDrawables != null) return false;
        if (gifDrawables != null ? !gifDrawables.equals(that.gifDrawables) : that.gifDrawables != null) return false;
        if (xmlDrawables != null ? !xmlDrawables.equals(that.xmlDrawables) : that.xmlDrawables != null) return false;
        if (differentDrawables != null ? !differentDrawables.equals(that.differentDrawables) : that.differentDrawables != null)
            return false;
        if (ldpiDrawables != null ? !ldpiDrawables.equals(that.ldpiDrawables) : that.ldpiDrawables != null)
            return false;
        if (mdpiDrawables != null ? !mdpiDrawables.equals(that.mdpiDrawables) : that.mdpiDrawables != null)
            return false;
        if (hdpiDrawables != null ? !hdpiDrawables.equals(that.hdpiDrawables) : that.hdpiDrawables != null)
            return false;
        if (xhdpiDrawables != null ? !xhdpiDrawables.equals(that.xhdpiDrawables) : that.xhdpiDrawables != null)
            return false;
        if (xxhdpiDrawables != null ? !xxhdpiDrawables.equals(that.xxhdpiDrawables) : that.xxhdpiDrawables != null)
            return false;
        if (xxxhdpiDrawables != null ? !xxxhdpiDrawables.equals(that.xxxhdpiDrawables) : that.xxxhdpiDrawables != null)
            return false;
        if (unspecifiedDpiDrawables != null ? !unspecifiedDpiDrawables.equals(that.unspecifiedDpiDrawables) : that.unspecifiedDpiDrawables != null)
            return false;
        if (rawResources != null ? !rawResources.equals(that.rawResources) : that.rawResources != null) return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (layouts != null ? !layouts.equals(that.layouts) : that.layouts != null) return false;
        return !(differentLayouts != null ? !differentLayouts.equals(that.differentLayouts) : that.differentLayouts != null);

    }

    @Override
    public int hashCode() {
        int result = locale != null ? locale.hashCode() : 0;
        result = 31 * result + (numberOfStringResource != null ? numberOfStringResource.hashCode() : 0);
        result = 31 * result + (pngDrawables != null ? pngDrawables.hashCode() : 0);
        result = 31 * result + (jpgDrawables != null ? jpgDrawables.hashCode() : 0);
        result = 31 * result + (gifDrawables != null ? gifDrawables.hashCode() : 0);
        result = 31 * result + (xmlDrawables != null ? xmlDrawables.hashCode() : 0);
        result = 31 * result + (differentDrawables != null ? differentDrawables.hashCode() : 0);
        result = 31 * result + (ldpiDrawables != null ? ldpiDrawables.hashCode() : 0);
        result = 31 * result + (mdpiDrawables != null ? mdpiDrawables.hashCode() : 0);
        result = 31 * result + (hdpiDrawables != null ? hdpiDrawables.hashCode() : 0);
        result = 31 * result + (xhdpiDrawables != null ? xhdpiDrawables.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawables != null ? xxhdpiDrawables.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawables != null ? xxxhdpiDrawables.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawables != null ? unspecifiedDpiDrawables.hashCode() : 0);
        result = 31 * result + (rawResources != null ? rawResources.hashCode() : 0);
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (layouts != null ? layouts.hashCode() : 0);
        result = 31 * result + (differentLayouts != null ? differentLayouts.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResourceData{" +
                "locale=" + locale +
                ", numberOfStringResource=" + numberOfStringResource +
                ", pngDrawables=" + pngDrawables +
                ", jpgDrawables=" + jpgDrawables +
                ", gifDrawables=" + gifDrawables +
                ", xmlDrawables=" + xmlDrawables +
                ", differentDrawables=" + differentDrawables +
                ", ldpiDrawables=" + ldpiDrawables +
                ", mdpiDrawables=" + mdpiDrawables +
                ", hdpiDrawables=" + hdpiDrawables +
                ", xhdpiDrawables=" + xhdpiDrawables +
                ", xxhdpiDrawables=" + xxhdpiDrawables +
                ", xxxhdpiDrawables=" + xxxhdpiDrawables +
                ", unspecifiedDpiDrawables=" + unspecifiedDpiDrawables +
                ", rawResources=" + rawResources +
                ", menu=" + menu +
                ", layouts=" + layouts +
                ", differentLayouts=" + differentLayouts +
                '}';
    }
}
