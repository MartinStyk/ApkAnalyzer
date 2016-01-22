package sk.styk.martin.bakalarka.statistics.processors;

import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.*;

import java.io.File;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class StatisticsProcessor {

    public static int PRINT_MESSAGE_INTERVAL = 250;

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

        PermissionsStatistics permissionsStatistics = PermissionsStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setPermissionsStatistics(permissionsStatistics);

        LibrariesStatistics librariesStatistics = LibrariesStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setLibrariesStatistics(librariesStatistics);

        FeaturesStatistics featuresStatistics = FeaturesStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setFeaturesStatistics(featuresStatistics);

        SdkStatistics sdkStatistics = SdkStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setSdkStatistics(sdkStatistics);

        ScreenStatistics screenStatistics = ScreenStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setScreenStatistics(screenStatistics);

        CertificateStatistics certificateStatistics = CertificateStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setCertificateStatistics(certificateStatistics);

        LocalizationsStatistics localizationsStatistics = LocalizationsStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setLocalizationsStatistics(localizationsStatistics);

        DrawableStatistics drawableStatistics = DrawableStatisticsProcessors
        .ofFiles(jsons)
                .process();

        overallStatistics.setDrawableStatistics(drawableStatistics);

        ResourceStatistics resourceStatistics = ResourceStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setAdditionalResourceStatistics(resourceStatistics);

        FileStatistics fileStatistics = FileStatisticsProcessor
                .ofFiles(jsons)
                .process();

        overallStatistics.setFileStatistics(fileStatistics);


        if (outputFile != null) {
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
