package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.stats.ApkProcessor;
import sk.styk.martin.bakalarka.stats.ApkStatistics;
import sk.styk.martin.bakalarka.stats.FileFinder;

import java.io.File;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        FileFinder ff = new FileFinder(new File("D:\\Projects\\ApkToolTest"));
        List<File> apks = ff.getFilesInDirectories();

        ApkProcessor processor = ApkProcessor.ofFiles(apks);
        List<ApkStatistics> stats = processor.processFiles();

        for (ApkStatistics s: stats
             ) {
            System.out.println(s);
        }

    }
}
