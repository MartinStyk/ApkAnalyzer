package sk.styk.martin.bakalarka.statistics.processors;

import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.AppComponentsStatistics;
import sk.styk.martin.bakalarka.statistics.data.FileSizeStatistics;
import sk.styk.martin.bakalarka.statistics.data.InstallLocationStatistics;
import sk.styk.martin.bakalarka.statistics.data.OverallStatistics;

import java.io.File;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class StatisticsProcessor {

    private List<File> jsons;
    private File outputFile;
    private OverallStatistics overallStatistics;

    public StatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty()) {
            throw new IllegalArgumentException("jsons not valid");
        }
        this.jsons = jsons;
    }

    public static StatisticsProcessor ofFiles(List<File> jsons) {
        return new StatisticsProcessor(jsons);
    }

    public OverallStatistics processFiles() {
        overallStatistics = new OverallStatistics();
        overallStatistics.setTotalAnalyzedApks(jsons.size());

        FileSizeStatistics fileSizeStatistics = FileSizeStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setFileSizeStatistics(fileSizeStatistics);

        InstallLocationStatistics installLocationStatistics = InstallLocationProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setInstallLocationStatistics(installLocationStatistics);


        AppComponentsStatistics appComponentsStatistics = AppComponentsStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setAppComponentsStatistics(appComponentsStatistics);


        if(outputFile != null){
            JsonUtils.toJson(overallStatistics, outputFile);
        }

        return overallStatistics;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }
}
