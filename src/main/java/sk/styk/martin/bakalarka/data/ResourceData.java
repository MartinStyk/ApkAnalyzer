package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 06.12.2015.
 */
public class ResourceData {

    private List<String> locale;
    private Integer pngDrawables;
    private Integer jpgDrawables;
    private Integer gifDrawables;
    private Integer differentDrawables;

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
}
