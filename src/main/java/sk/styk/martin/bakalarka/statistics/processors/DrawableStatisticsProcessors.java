package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.statistics.data.DrawableStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.data.RecordPair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class DrawableStatisticsProcessors extends TopValueProcessorBase{
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

        requestMaxValues(Type.PNG);
        requestMaxValues(Type.JPG);
        requestMaxValues(Type.GIF);
        requestMaxValues(Type.XML);
        requestMaxValues(Type.NINE_PATCH);
        requestMaxValues(Type.DIFFERENT_DRAWABLES);
        requestMaxValues(Type.LDPI);
        requestMaxValues(Type.MDPI);
        requestMaxValues(Type.HDPI);
        requestMaxValues(Type.XHDPI);
        requestMaxValues(Type.XXHDPI);
        requestMaxValues(Type.XXXHDPI);
        requestMaxValues(Type.UNSPECIFIED_DPI);
        requestMaxValues(Type.TVDPI);
        requestMaxValues(Type.NODPI);

        RecordPair pngRecordPair = null;
        RecordPair jpgRecordPair =null;
        RecordPair gifRecordPair = null;
        RecordPair xmlRecordPair = null;
        RecordPair ninePatchRecordPair = null;
        RecordPair differentDrawablesRecordPair = null;
        RecordPair ldpiRecordPair = null;
        RecordPair mdpiRecordPair = null;
        RecordPair hdpiRecordPair = null;
        RecordPair xhdpiRecordPair = null;
        RecordPair xxhdpiRecordPair = null;
        RecordPair xxxhdpiRecordPair = null;
        RecordPair unspecifiedDpiRecordPair = null;
        RecordPair tvdpiRecordPair = null;
        RecordPair nodpiRecordPair = null;

        int resourceDataFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f,ApkData.class);

            if (data != null && data.getResourceData() != null) {

                resourceDataFound++;
                resourceData = data.getResourceData();

                obtainValue(resourceData.getPngDrawables(), pngList, pngListNonZero);
                pngRecordPair = processMaxExtreme(Type.PNG, resourceData.getPngDrawables(), data.getFileName());

                obtainValue(resourceData.getJpgDrawables(), jpgList, jpgListNonZero);
                jpgRecordPair = processMaxExtreme(Type.JPG, resourceData.getJpgDrawables(), data.getFileName());

                obtainValue(resourceData.getGifDrawables(), gifList, gifListNonZero);
                gifRecordPair = processMaxExtreme(Type.GIF, resourceData.getGifDrawables(), data.getFileName());

                obtainValue(resourceData.getXmlDrawables(), xmlList, xmlListNonZero);
                xmlRecordPair = processMaxExtreme(Type.XML, resourceData.getXmlDrawables(), data.getFileName());

                obtainValue(resourceData.getNinePatchDrawables(), ninePatchList, ninePatchListNonZero);
                ninePatchRecordPair = processMaxExtreme(Type.NINE_PATCH, resourceData.getNinePatchDrawables(), data.getFileName());

                obtainValue(resourceData.getDifferentDrawables(), differentDrawablesList, differentDrawablesListNonZero);
                differentDrawablesRecordPair = processMaxExtreme(Type.DIFFERENT_DRAWABLES, resourceData.getDifferentDrawables(), data.getFileName());

                obtainValue(resourceData.getLdpiDrawables(), ldpiList, ldpiListNonZero);
                ldpiRecordPair = processMaxExtreme(Type.LDPI, resourceData.getLdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getMdpiDrawables(), mdpiList, mdpiListNonZero);
                mdpiRecordPair = processMaxExtreme(Type.MDPI, resourceData.getMdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getHdpiDrawables(), hdpiList, hpdiListNonZero);
                hdpiRecordPair = processMaxExtreme(Type.HDPI, resourceData.getHdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getXhdpiDrawables(), xhdpiList, xhpdiListNonZero);
                xhdpiRecordPair = processMaxExtreme(Type.XHDPI, resourceData.getXhdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getXxhdpiDrawables(), xxhdpiList, xxhpdiListNonZero);
                xxhdpiRecordPair = processMaxExtreme(Type.XXHDPI, resourceData.getXxhdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getXxxhdpiDrawables(), xxxhdpiList, xxxhpdiListNonZero);
                xxxhdpiRecordPair = processMaxExtreme(Type.XXXHDPI, resourceData.getXxxhdpiDrawables(), data.getFileName());

                obtainValue(resourceData.getUnspecifiedDpiDrawables(), unspecifiedDpiList, unspecifiedDpiListNonZero);
                unspecifiedDpiRecordPair = processMaxExtreme(Type.UNSPECIFIED_DPI, resourceData.getUnspecifiedDpiDrawables(), data.getFileName());

                obtainValue(resourceData.getNodpiDrawables(), nodpiList, nodpiListNonZero);
                nodpiRecordPair = processMaxExtreme(Type.NODPI, resourceData.getNodpiDrawables(), data.getFileName());

                obtainValue(resourceData.getTvdpiDrawables(), tvdpiList, tvdpiListNonZero);
                tvdpiRecordPair = processMaxExtreme(Type.TVDPI, resourceData.getTvdpiDrawables(), data.getFileName());
            }
        }

        drawableStatistics.setAnalyzedApks(resourceDataFound);

        setValues(Type.PNG, pngList, resourceDataFound, pngRecordPair);
        setValues(Type.PNG_NONZERO, pngListNonZero, resourceDataFound, pngRecordPair);

        setValues(Type.JPG, jpgList, resourceDataFound, jpgRecordPair);
        setValues(Type.JPG_NONZERO, jpgListNonZero, resourceDataFound, jpgRecordPair);

        setValues(Type.GIF, gifList, resourceDataFound, gifRecordPair);
        setValues(Type.GIF_NONZERO, gifListNonZero, resourceDataFound, gifRecordPair);

        setValues(Type.XML, xmlList, resourceDataFound, xmlRecordPair);
        setValues(Type.XML_NONZERO, xmlListNonZero, resourceDataFound, xmlRecordPair);

        setValues(Type.NINE_PATCH, ninePatchList, resourceDataFound, ninePatchRecordPair);
        setValues(Type.NINE_PATCH_NONZERO, ninePatchListNonZero, resourceDataFound, ninePatchRecordPair);

        setValues(Type.DIFFERENT_DRAWABLES, differentDrawablesList, resourceDataFound, differentDrawablesRecordPair);
        setValues(Type.DIFFERENT_DRAWABLES_NONZERO, differentDrawablesListNonZero, resourceDataFound, differentDrawablesRecordPair);

        setValues(Type.LDPI, ldpiList, resourceDataFound, ldpiRecordPair);
        setValues(Type.LDPI_NONZERO, ldpiListNonZero, resourceDataFound, ldpiRecordPair);

        setValues(Type.MDPI, mdpiList, resourceDataFound, mdpiRecordPair);
        setValues(Type.MDPI_NONZERO, mdpiListNonZero, resourceDataFound, mdpiRecordPair);

        setValues(Type.HDPI, hdpiList, resourceDataFound, hdpiRecordPair);
        setValues(Type.HDPI_NONZERO, hpdiListNonZero, resourceDataFound, hdpiRecordPair);

        setValues(Type.XHDPI, xhdpiList, resourceDataFound, xhdpiRecordPair);
        setValues(Type.XHDPI_NONZERO, xhpdiListNonZero, resourceDataFound, xhdpiRecordPair);

        setValues(Type.XXHDPI, xxhdpiList, resourceDataFound, xxhdpiRecordPair);
        setValues(Type.XXHDPI_NONZERO, xxhpdiListNonZero, resourceDataFound, xxhdpiRecordPair);

        setValues(Type.XXXHDPI, xxxhdpiList, resourceDataFound,xxxhdpiRecordPair);
        setValues(Type.XXXHDPI_NONZERO, xxxhpdiListNonZero, resourceDataFound,xxxhdpiRecordPair);

        setValues(Type.UNSPECIFIED_DPI, unspecifiedDpiList, resourceDataFound, unspecifiedDpiRecordPair);
        setValues(Type.UNSPECIFIED_DPI_NONZERO, unspecifiedDpiListNonZero, resourceDataFound, unspecifiedDpiRecordPair);

        setValues(Type.TVDPI, tvdpiList, resourceDataFound, tvdpiRecordPair);
        setValues(Type.TVDPI_NONZERO, tvdpiListNonZero, resourceDataFound, tvdpiRecordPair);

        setValues(Type.NODPI, nodpiList, resourceDataFound, nodpiRecordPair);
        setValues(Type.NODPI_NONZERO, nodpiListNonZero, resourceDataFound, nodpiRecordPair);

        return drawableStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound, RecordPair maxRecordPair) {

        if (drawableStatistics == null) {
            throw new NullPointerException("drawableStatistics null");
        }

        logger.info("Started processing drawables " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(list.size(), resourceDataFound), list, null, maxRecordPair);

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
