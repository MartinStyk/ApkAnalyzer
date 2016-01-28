package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.ResourceData;
import sk.styk.martin.bakalarka.statistics.data.ResourceStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class ResourceStatisticsProcessor {
    private List<File> jsons;
    private ResourceStatistics resourceStatistics;
    private ResourceData resourceData;
    private static final Logger logger = LoggerFactory.getLogger(ResourceStatisticsProcessor.class);

    private enum Type {
        LAYOUT,
        LAYOUT_NONZERO,
        LAYOUT_DIFFERENT,
        LAYOUT_DIFFERENT_NONZERO,
        MENU,
        MENU_NONZERO,
        RAW,
        RAW_NONZERO
    }

    public ResourceStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static ResourceStatisticsProcessor ofFiles(List<File> jsons) {
        return new ResourceStatisticsProcessor(jsons);
    }

    public ResourceStatistics process() {

        resourceStatistics = new ResourceStatistics();

        List<Double> layoutList = new ArrayList<Double>();
        List<Double> layoutListNonZero = new ArrayList<Double>();
        List<Double> diffLayoutList = new ArrayList<Double>();
        List<Double> diffLayoutListNonZero = new ArrayList<Double>();
        List<Double> menuList = new ArrayList<Double>();
        List<Double> menuListNonZero = new ArrayList<Double>();
        List<Double> rawList = new ArrayList<Double>();
        List<Double> rawListNonZero = new ArrayList<Double>();

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

                obtainValue(resourceData.getLayouts(), layoutList, layoutListNonZero);
                obtainValue(resourceData.getDifferentLayouts(), diffLayoutList, diffLayoutListNonZero);
                obtainValue(resourceData.getMenu(), menuList, menuListNonZero);
                obtainValue(resourceData.getRawResources(), rawList, rawListNonZero);
            }
        }

        resourceStatistics.setAnalyzedApks(resourceDataFound);

        setValues(Type.LAYOUT, layoutList, resourceDataFound);
        setValues(Type.LAYOUT_NONZERO, layoutListNonZero, resourceDataFound);

        setValues(Type.LAYOUT_DIFFERENT, diffLayoutList, resourceDataFound);
        setValues(Type.LAYOUT_DIFFERENT_NONZERO, diffLayoutListNonZero, resourceDataFound);

        setValues(Type.MENU, menuList, resourceDataFound);
        setValues(Type.MENU_NONZERO, menuListNonZero, resourceDataFound);

        setValues(Type.RAW, rawList, resourceDataFound);
        setValues(Type.RAW_NONZERO, rawListNonZero, resourceDataFound);

        return resourceStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound) {

        if (resourceStatistics == null) {
            throw new NullPointerException("resourceStatistics null");
        }

        logger.info("Started processing resources " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(list.size(), resourceDataFound), list);


        switch (type) {
            case LAYOUT:
                resourceStatistics.setLayouts(mathStatistics);
                break;
            case LAYOUT_NONZERO:
                resourceStatistics.setLayoutsNonZero(mathStatistics);
                break;
            case LAYOUT_DIFFERENT:
                resourceStatistics.setDifferentLayouts(mathStatistics);
                break;
            case LAYOUT_DIFFERENT_NONZERO:
                resourceStatistics.setDifferentLayoutsNonZero(mathStatistics);
                break;
            case MENU:
                resourceStatistics.setMenu(mathStatistics);
                break;
            case MENU_NONZERO:
                resourceStatistics.setMenuNonZero(mathStatistics);
                break;
            case RAW:
                resourceStatistics.setRawResources(mathStatistics);
                break;
            case RAW_NONZERO:
                resourceStatistics.setRawResourcesNonZero(mathStatistics);
                break;
        }

        logger.info("Finished processing resources " + type.toString());
    }

    private void obtainValue(Integer value, List<Double> list, List<Double> listNonZero) {
        if (value != null) {
            list.add(new Double(value));
            if (value != 0) {
                listNonZero.add(new Double(value));
            }
        }
    }
}
