package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.statistics.data.DrawableStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class DrawableStatisticsProcessors {
    private static final Logger logger = LoggerFactory.getLogger(DrawableStatisticsProcessors.class);
    private List<File> jsons;
    private DrawableStatistics drawableStatistics;
    private ResourceData resourceData;

    public DrawableStatisticsProcessors(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static DrawableStatisticsProcessors ofFiles(List<File> jsons) {
        return new DrawableStatisticsProcessors(jsons);
    }

    public DrawableStatistics process() {

        drawableStatistics = new DrawableStatistics();

        List<Double> pngList = new ArrayList<Double>();
        List<Double> pngListNonZero = new ArrayList<Double>();
        List<Double> jpgList = new ArrayList<Double>();
        List<Double> jpgListNonZero = new ArrayList<Double>();
        List<Double> gifList = new ArrayList<Double>();
        List<Double> gifListNonZero = new ArrayList<Double>();
        List<Double> xmlList = new ArrayList<Double>();
        List<Double> xmlListNonZero = new ArrayList<Double>();
        List<Double> ninePatchList = new ArrayList<Double>();
        List<Double> ninePatchListNonZero = new ArrayList<Double>();
        List<Double> differentDrawablesList = new ArrayList<Double>();
        List<Double> differentDrawablesListNonZero = new ArrayList<Double>();
        List<Double> ldpiList = new ArrayList<Double>();
        List<Double> ldpiListNonZero = new ArrayList<Double>();
        List<Double> mdpiList = new ArrayList<Double>();
        List<Double> mdpiListNonZero = new ArrayList<Double>();
        List<Double> hdpiList = new ArrayList<Double>();
        List<Double> hpdiListNonZero = new ArrayList<Double>();
        List<Double> xhdpiList = new ArrayList<Double>();
        List<Double> xhpdiListNonZero = new ArrayList<Double>();
        List<Double> xxhdpiList = new ArrayList<Double>();
        List<Double> xxhpdiListNonZero = new ArrayList<Double>();
        List<Double> xxxhdpiList = new ArrayList<Double>();
        List<Double> xxxhpdiListNonZero = new ArrayList<Double>();
        List<Double> unspecifiedDpiList = new ArrayList<Double>();
        List<Double> unspecifiedDpiListNonZero = new ArrayList<Double>();
        List<Double> nodpiList = new ArrayList<Double>();
        List<Double> nodpiListNonZero = new ArrayList<Double>();
        List<Double> tvdpiList = new ArrayList<Double>();
        List<Double> tvdpiListNonZero = new ArrayList<Double>();

        int resourceDataFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);

            if (data != null && data.getResourceData() != null) {

                resourceDataFound++;
                resourceData = data.getResourceData();

                obtainValue(resourceData.getPngDrawables(), pngList, pngListNonZero);
                obtainValue(resourceData.getJpgDrawables(), jpgList, jpgListNonZero);
                obtainValue(resourceData.getGifDrawables(), gifList, gifListNonZero);
                obtainValue(resourceData.getXmlDrawables(), xmlList, xmlListNonZero);
                obtainValue(resourceData.getNinePatchDrawables(), ninePatchList, ninePatchListNonZero);
                obtainValue(resourceData.getDifferentDrawables(), differentDrawablesList, differentDrawablesListNonZero);
                obtainValue(resourceData.getLdpiDrawables(), ldpiList, ldpiListNonZero);
                obtainValue(resourceData.getMdpiDrawables(), mdpiList, mdpiListNonZero);
                obtainValue(resourceData.getHdpiDrawables(), hdpiList, hpdiListNonZero);
                obtainValue(resourceData.getXhdpiDrawables(), xhdpiList, xhpdiListNonZero);
                obtainValue(resourceData.getXxhdpiDrawables(), xxhdpiList, xxhpdiListNonZero);
                obtainValue(resourceData.getXxxhdpiDrawables(), xxxhdpiList, xxxhpdiListNonZero);
                obtainValue(resourceData.getUnspecifiedDpiDrawables(), unspecifiedDpiList, unspecifiedDpiListNonZero);
                obtainValue(resourceData.getNodpiDrawables(), nodpiList, nodpiListNonZero);
                obtainValue(resourceData.getTvdpiDrawables(), tvdpiList, tvdpiListNonZero);
            }
        }

        drawableStatistics.setAnalyzedApks(resourceDataFound);

        setValues(Type.PNG, pngList, resourceDataFound);
        setValues(Type.PNG_NONZERO, pngListNonZero, resourceDataFound);

        setValues(Type.JPG, jpgList, resourceDataFound);
        setValues(Type.JPG_NONZERO, jpgListNonZero, resourceDataFound);

        setValues(Type.GIF, gifList, resourceDataFound);
        setValues(Type.GIF_NONZERO, gifListNonZero, resourceDataFound);

        setValues(Type.XML, xmlList, resourceDataFound);
        setValues(Type.XML_NONZERO, xmlListNonZero, resourceDataFound);

        setValues(Type.NINE_PATCH, ninePatchList, resourceDataFound);
        setValues(Type.NINE_PATCH_NONZERO, ninePatchListNonZero, resourceDataFound);

        setValues(Type.DIFFERENT_DRAWABLES, differentDrawablesList, resourceDataFound);
        setValues(Type.DIFFERENT_DRAWABLES_NONZERO, differentDrawablesListNonZero, resourceDataFound);

        setValues(Type.LDPI, ldpiList, resourceDataFound);
        setValues(Type.LDPI_NONZERO, ldpiListNonZero, resourceDataFound);

        setValues(Type.MDPI, mdpiList, resourceDataFound);
        setValues(Type.MDPI_NONZERO, mdpiListNonZero, resourceDataFound);

        setValues(Type.HDPI, hdpiList, resourceDataFound);
        setValues(Type.HDPI_NONZERO, hpdiListNonZero, resourceDataFound);

        setValues(Type.XHDPI, xhdpiList, resourceDataFound);
        setValues(Type.XHDPI_NONZERO, xhpdiListNonZero, resourceDataFound);

        setValues(Type.XXHDPI, xxhdpiList, resourceDataFound);
        setValues(Type.XXHDPI_NONZERO, xxhpdiListNonZero, resourceDataFound);

        setValues(Type.XXXHDPI, xxxhdpiList, resourceDataFound);
        setValues(Type.XXXHDPI_NONZERO, xxxhpdiListNonZero, resourceDataFound);

        setValues(Type.UNSPECIFIED_DPI, unspecifiedDpiList, resourceDataFound);
        setValues(Type.UNSPECIFIED_DPI_NONZERO, unspecifiedDpiListNonZero, resourceDataFound);

        setValues(Type.TVDPI, tvdpiList, resourceDataFound);
        setValues(Type.TVDPI_NONZERO, tvdpiListNonZero, resourceDataFound);

        setValues(Type.NODPI, nodpiList, resourceDataFound);
        setValues(Type.NODPI_NONZERO, nodpiListNonZero, resourceDataFound);

        return drawableStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound) {

        if (drawableStatistics == null) {
            throw new NullPointerException("drawableStatistics null");
        }

        logger.info("Started processing drawables " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(list.size(), resourceDataFound), list);

        switch (type) {
            case PNG:
                drawableStatistics.setPngDrawables(mathStatistics);
                break;
            case PNG_NONZERO:
                drawableStatistics.setPngDrawablesNonZero(mathStatistics);
                break;
            case JPG:
                drawableStatistics.setJpgDrawables(mathStatistics);
                break;
            case JPG_NONZERO:
                drawableStatistics.setJpgDrawablesNonZero(mathStatistics);
                break;
            case GIF:
                drawableStatistics.setGifDrawables(mathStatistics);
                break;
            case GIF_NONZERO:
                drawableStatistics.setGifDrawablesNonZero(mathStatistics);
                break;
            case XML:
                drawableStatistics.setXmlDrawables(mathStatistics);
                break;
            case XML_NONZERO:
                drawableStatistics.setXmlDrawablesNonZero(mathStatistics);
                break;
            case NINE_PATCH:
                drawableStatistics.setNinePatchDrawables(mathStatistics);
                break;
            case NINE_PATCH_NONZERO:
                drawableStatistics.setNinePatchDrawablesNonZero(mathStatistics);
                break;
            case DIFFERENT_DRAWABLES:
                drawableStatistics.setDifferentDrawables(mathStatistics);
                break;
            case DIFFERENT_DRAWABLES_NONZERO:
                drawableStatistics.setDifferentDrawablesNonZero(mathStatistics);
                break;
            case LDPI:
                drawableStatistics.setLdpiDrawables(mathStatistics);
                break;
            case LDPI_NONZERO:
                drawableStatistics.setLdpiDrawablesNonZero(mathStatistics);
                break;
            case MDPI:
                drawableStatistics.setMdpiDrawables(mathStatistics);
                break;
            case MDPI_NONZERO:
                drawableStatistics.setMdpiDrawablesNonZero(mathStatistics);
                break;
            case HDPI:
                drawableStatistics.setHdpiDrawables(mathStatistics);
                break;
            case HDPI_NONZERO:
                drawableStatistics.setHdpiDrawablesNonZero(mathStatistics);
                break;
            case XHDPI:
                drawableStatistics.setXhdpiDrawables(mathStatistics);
                break;
            case XHDPI_NONZERO:
                drawableStatistics.setXhdpiDrawablesNonZero(mathStatistics);
                break;
            case XXHDPI:
                drawableStatistics.setXxhdpiDrawables(mathStatistics);
                break;
            case XXHDPI_NONZERO:
                drawableStatistics.setXxhdpiDrawablesNonZero(mathStatistics);
                break;
            case XXXHDPI:
                drawableStatistics.setXxxhdpiDrawables(mathStatistics);
                break;
            case XXXHDPI_NONZERO:
                drawableStatistics.setXxxhdpiDrawablesNonZero(mathStatistics);
                break;
            case UNSPECIFIED_DPI:
                drawableStatistics.setUnspecifiedDpiDrawables(mathStatistics);
                break;
            case UNSPECIFIED_DPI_NONZERO:
                drawableStatistics.setUnspecifiedDpiDrawablesNonZero(mathStatistics);
                break;
            case TVDPI:
                drawableStatistics.setTvdpiDrawables(mathStatistics);
                break;
            case TVDPI_NONZERO:
                drawableStatistics.setTvdpiDrawablesNonZero(mathStatistics);
                break;
            case NODPI:
                drawableStatistics.setNodpiDrawables(mathStatistics);
                break;
            case NODPI_NONZERO:
                drawableStatistics.setNodpiDrawablesNonZero(mathStatistics);
                break;
        }

        logger.info("Finished processing drawables " + type.toString());
    }

    private void obtainValue(Integer value, List<Double> list, List<Double> listNonZero) {
        if (value != null) {
            list.add(new Double(value));
            if (value != 0) {
                listNonZero.add(new Double(value));
            }
        }
    }

    private enum Type {
        PNG,
        PNG_NONZERO,
        JPG,
        JPG_NONZERO,
        GIF,
        GIF_NONZERO,
        XML,
        XML_NONZERO,
        NINE_PATCH,
        NINE_PATCH_NONZERO,
        DIFFERENT_DRAWABLES,
        DIFFERENT_DRAWABLES_NONZERO,
        LDPI,
        LDPI_NONZERO,
        MDPI,
        MDPI_NONZERO,
        HDPI,
        HDPI_NONZERO,
        XHDPI,
        XHDPI_NONZERO,
        XXHDPI,
        XXHDPI_NONZERO,
        XXXHDPI,
        XXXHDPI_NONZERO,
        UNSPECIFIED_DPI,
        UNSPECIFIED_DPI_NONZERO,
        TVDPI,
        TVDPI_NONZERO,
        NODPI,
        NODPI_NONZERO
    }
}
