package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.HashData;
import sk.styk.martin.bakalarka.statistics.data.FileStatistics;
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
public class FileStatisticsProcessor extends TopValueProcessorBase {
    private static final Logger logger = LoggerFactory.getLogger(FileStatisticsProcessor.class);
    private List<File> jsons;
    private FileStatistics fileStatistics;

    public FileStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static FileStatisticsProcessor ofFiles(List<File> jsons) {
        return new FileStatisticsProcessor(jsons);
    }

    public FileStatistics process() {

        fileStatistics = new FileStatistics();

        List<Double> layoutDirectorySizeList = new ArrayList<Double>();
        List<Double> drawableDirectorySizeList = new ArrayList<Double>();
        List<Double> otherDirectorySizeList = new ArrayList<Double>();
        List<Double> apkTotalFilesList = new ArrayList<Double>();

        requestMaxValues(Type.LAYOUT);
        requestMaxValues(Type.DRAWABLE);
        requestMaxValues(Type.OTHER);
        requestMaxValues(Type.ALL);

        RecordPair layoutRecordPairMax = null;
        RecordPair drawableRecordPairMax = null;
        RecordPair otherRecordPairMax = null;
        RecordPair allRecordPairMax = null;

        requestMinValues(Type.LAYOUT);
        requestMinValues(Type.DRAWABLE);
        requestMinValues(Type.OTHER);
        requestMinValues(Type.ALL);

        RecordPair layoutRecordPairMin = null;
        RecordPair drawableRecordPairMin = null;
        RecordPair otherRecordPairMin = null;
        RecordPair allRecordPairMin = null;

        int hashDataFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f,ApkData.class);
            HashData hashData = null;


            if (data != null && data.getFileDigest() != null) {

                hashData = data.getFileDigest();

                int drawable = hashData.getDrawableHash() == null ? 0 : hashData.getDrawableHash().size();
                int layout = hashData.getLayoutHash() == null ? 0 : hashData.getLayoutHash().size();
                int other = hashData.getOtherHash() == null ? 0 : hashData.getOtherHash().size() + 2; //arsc + dex not included by default
                int total = drawable + layout + other;

                if (drawable != 0 || layout != 0 || other != 0) {
                    hashDataFound++;
                    if (drawable != 0) {
                        drawableDirectorySizeList.add(new Double(drawable));
                        drawableRecordPairMax = processMaxExtreme(Type.DRAWABLE, drawable, data.getFileName());
                        drawableRecordPairMin = processMinExtreme(Type.DRAWABLE, drawable, data.getFileName());
                    }
                    if (layout != 0) {
                        layoutDirectorySizeList.add(new Double(layout));
                        layoutRecordPairMax = processMaxExtreme(Type.LAYOUT, layout, data.getFileName());
                        layoutRecordPairMin = processMinExtreme(Type.LAYOUT, layout, data.getFileName());
                    }
                    if (other != 0) {
                        otherDirectorySizeList.add(new Double(other));
                        otherRecordPairMax = processMaxExtreme(Type.OTHER, other, data.getFileName());
                        otherRecordPairMin = processMinExtreme(Type.OTHER, other, data.getFileName());
                    }

                    allRecordPairMax = processMaxExtreme(Type.ALL, total, data.getFileName());
                    allRecordPairMin = processMinExtreme(Type.ALL, total, data.getFileName());
                    apkTotalFilesList.add(new Double(total));
                }
            }
        }
        fileStatistics.setAnalyzedApks(hashDataFound);

        setValues(Type.LAYOUT, layoutDirectorySizeList, layoutDirectorySizeList.size(), layoutRecordPairMin, layoutRecordPairMax);
        setValues(Type.DRAWABLE, drawableDirectorySizeList, drawableDirectorySizeList.size(), drawableRecordPairMin, drawableRecordPairMax);
        setValues(Type.OTHER, otherDirectorySizeList, otherDirectorySizeList.size(), otherRecordPairMin, otherRecordPairMax);
        setValues(Type.ALL, apkTotalFilesList, hashDataFound, allRecordPairMin, allRecordPairMax);
        return fileStatistics;
    }

    private void setValues(Type type, List<Double> list, int resourceDataFound, RecordPair min, RecordPair max) {

        if (fileStatistics == null) {
            throw new NullPointerException("fileStatistics null");
        }

        logger.info("Started processing files " + type.toString());

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(list.size(), resourceDataFound), list, min, max);

        switch (type) {
            case LAYOUT:
                fileStatistics.setFilesInLayoutFolder(mathStatistics);
                break;
            case DRAWABLE:
                fileStatistics.setFilesInDrawableFolder(mathStatistics);
                break;
            case OTHER:
                fileStatistics.setOtherFiles(mathStatistics);
                break;
            case ALL:
                fileStatistics.setAllFiles(mathStatistics);
                break;
        }

        logger.info("Finished processing files " + type.toString());
    }

    private enum Type {
        LAYOUT,
        DRAWABLE,
        OTHER,
        ALL
    }
}
