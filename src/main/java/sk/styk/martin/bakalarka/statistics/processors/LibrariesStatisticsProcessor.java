package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.LibrariesStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class LibrariesStatisticsProcessor extends TopListProcessorBase {
    private static final Logger logger = LoggerFactory.getLogger(LibrariesStatisticsProcessor.class);
    private List<File> jsons;
    private LibrariesStatistics librariesStatistics;


    public LibrariesStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static LibrariesStatisticsProcessor ofFiles(List<File> jsons) {
        return new LibrariesStatisticsProcessor(jsons);
    }

    public LibrariesStatistics process() {

        librariesStatistics = new LibrariesStatistics();
        Map<String, Integer> topLibraries = new HashMap<String, Integer>();
        List<Double> librariesNumbersList = new ArrayList<Double>();
        List<Double> librariesNumbersListNonZero = new ArrayList<Double>();
        int manifestFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            AndroidManifestData manifestData = null;


            if (data != null && data.getAndroidManifest() != null) {

                manifestFound++;
                manifestData = data.getAndroidManifest();

                List<String> librariesList = manifestData.getUsesLibrary();

                if (librariesList != null) {
                    int listSize = librariesList.size();
                    librariesNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        librariesNumbersListNonZero.add(new Double(listSize));
                    }

                    for (String perm : librariesList) {
                        if (topLibraries.containsKey(perm)) {
                            Integer oldValue = topLibraries.get(perm);
                            topLibraries.put(perm, ++oldValue);
                        } else {
                            topLibraries.put(perm, 1);
                        }
                    }

                }

            }
        }

        librariesStatistics.setAnalyzedApks(manifestFound);
        setValues(manifestFound, librariesNumbersList, false);
        setValues(manifestFound, librariesNumbersListNonZero, true);
        librariesStatistics.setTopLibraries(getTopValuesMap(topLibraries, librariesNumbersList.size(), "libraries"));

        return librariesStatistics;
    }

    private void setValues(int manifestFound, List<Double> librariesNumbersList, boolean isNonZero) {

        if (librariesNumbersList == null) {
            throw new NullPointerException("librariesNumbersList null");
        }

        logger.info("Started processing libraries");

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(librariesNumbersList.size(), manifestFound), librariesNumbersList);

        if (isNonZero) {
            librariesStatistics.setLibrariesNonZero(mathStatistics);
        } else {
            librariesStatistics.setLibraries(mathStatistics);
        }
        logger.info("Finished processing permissions");
        logger.info("Finished processing libraries");
    }

    protected Logger getLogger() {
        return logger;
    }

}


