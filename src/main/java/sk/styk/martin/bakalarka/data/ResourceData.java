package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 06.12.2015.
 */
public class ResourceData {

    //versions of string.xml file
    private List<String> locale;

    //types of drawables
    private Integer pngDrawables;
    private Integer jpgDrawables;
    private Integer gifDrawables;

    //number of drawables with different name
    private Integer differentDrawables;

    //drawables according to dimensions
    private Integer ldpiDrawables;
    private Integer mdpiDrawables;
    private Integer hdpiDrawables;
    private Integer xhdpiDrawables;
    private Integer xxhdpiDrawables;
    private Integer xxxhdpiDrawables;



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
}
