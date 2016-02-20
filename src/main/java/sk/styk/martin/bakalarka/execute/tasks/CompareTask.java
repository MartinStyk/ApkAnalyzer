package sk.styk.martin.bakalarka.execute.tasks;

import sk.styk.martin.bakalarka.compare.processors.ApkBatchCompare;
import sk.styk.martin.bakalarka.utils.files.FileFinder;

import java.io.File;
import java.util.List;

/**
 * code that handle 'analyze use case'
 * <p/>
 * Created by Martin Styk on 20.02.2016.
 */
public class CompareTask implements Task {

    private String inputDirectory;
    private String outDirectory;

    public Task setInputDirectory(String inputDirectory) {
        if (inputDirectory == null || inputDirectory.isEmpty())
            throw new IllegalArgumentException("input");

        this.inputDirectory = inputDirectory;

        return this;
    }

    public Task setOutputDirectory(String outDirectory) {
        if (outDirectory == null || outDirectory.isEmpty())
            throw new IllegalArgumentException("outDirectory");

        this.outDirectory = outDirectory;

        return this;
    }

    public void execute() {

        FileFinder ff = new FileFinder(new File(inputDirectory));
        List<File> jsons = ff.getJsonFilesInDirectories();

        ApkBatchCompare apkBatchCompare = new ApkBatchCompare(jsons);
        apkBatchCompare.processFiles(new File(outDirectory));
    }
}
