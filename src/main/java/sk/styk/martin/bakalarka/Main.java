package sk.styk.martin.bakalarka;

import sk.styk.martin.bakalarka.analyze.processors.ApkProcessor;
import sk.styk.martin.bakalarka.compare.processors.ApkBatchCompare;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;
import sk.styk.martin.bakalarka.statistics.data.OverallStatistics;
import sk.styk.martin.bakalarka.statistics.processors.StatisticsProcessor;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class Main {

    private static String APK_TEST = "D:\\Projects\\ApkToolTest";
    private static String APK_APPSAPK = "D:\\APK\\APK_appsApk";
    private static String APK_ANDROIDAPKSFREE = "D:\\APK\\APK_androidApksFree";
    private static String APK_TORRENT = "D:\\APK\\APK_torrent";
    private static String APK_ULOZTO = "D:\\APK\\APK_ulozto";
    private static String APK_PLAY = "D:\\APK\\APK_playdrone";
    private static String APK_ZIPPY = "D:\\APK\\APK_zippyshare";
    private static String APK_ZIPPY2 = "D:\\APK\\APK_zippyshare2";

    public static void main(String[] args) throws Exception {

        final long startTime = System.currentTimeMillis();

        //analyze();
        //compareTwo();
        //compareAll();
        computeStats();
        final long endTime = System.currentTimeMillis();

        Date date = new Date(endTime - startTime);
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
        String dateFormatted = formatter.format(date);

        System.out.print("RUN TIME : " + dateFormatted);

    }

    public static void analyze() {

        //possible input from user
        final String ANALYZED_APK = APK_TEST;
        final String OUTPUT_DIR = "D:\\APK\\metadata";

        //code that handle 'analyze use case'
        final File analyzedFile = new File(ANALYZED_APK);
        List<ApkFile> apks;
        ApkProcessor analyzer;

        if (analyzedFile.isDirectory()) {
            FileFinder ff = new FileFinder(new File(ANALYZED_APK));
            apks = ff.getApkFilesInDirectories();
            analyzer = new ApkProcessor(apks);
        } else {
            ApkFile apk = new ApkFile(analyzedFile);
            analyzer = new ApkProcessor(apk);
        }

        File outputDirectory = new File(OUTPUT_DIR);
        analyzer.processFiles(outputDirectory);
    }

    public static void compareTwo() {

        //possible input from user
        final String ANALYZED_APK_1 = "D:\\TEST\\1.json";
        final String ANALYZED_APK_2 = "D:\\TEST\\2.json";
        final String OUTPUT_DIR = "D:\\output";

        //code that handle 'compare two use case'
        List<File> jsons = Arrays.asList(new File(ANALYZED_APK_1), new File(ANALYZED_APK_2));
        ApkBatchCompare apkBatchCompare = new ApkBatchCompare(jsons);
        apkBatchCompare.processFiles(new File(OUTPUT_DIR));

    }

    public static void compareAll() {

        //possible input from user
        final String INPUT_DIR = "D:\\TEST";
        final String OUTPUT_DIR = "D:\\output";

        //code that handle 'compare two use case'

        FileFinder ff = new FileFinder(new File(INPUT_DIR));
        List<File> jsons = ff.getJsonFilesInDirectories();

        ApkBatchCompare apkBatchCompare = new ApkBatchCompare(jsons);
        apkBatchCompare.processFiles(new File(OUTPUT_DIR));

    }

    public static void computeStats() {
        //possible input from user
        final String INPUT_DIR = "D:\\APK\\metadata";
        final String OUTPUT_FILE = "D:\\output\\stats.json";

        //code that handle 'computeStats use case'

        FileFinder ff = new FileFinder(new File(INPUT_DIR));
        List<File> jsons = ff.getJsonFilesInDirectories();

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(jsons);
        statisticsProcessor.setOutputFile(new File(OUTPUT_FILE));
        OverallStatistics overallStatistics = statisticsProcessor.processFiles();
    }

//    public static void a() throws IOException {
//        final String INPUT_DIR = "D:\\APK\\metadata";
//        final String OUTPUT_FILE = "D:\\output\\stats.txt";
//        String everything =null;
//        //code that handle 'computeStats use case'
//
//        FileFinder ff = new FileFinder(new File(INPUT_DIR));
//        List<File> jsons = ff.getJsonFilesInDirectories();
//
//        for(File f : jsons){
//            boolean replace = false;
//            BufferedReader br = null;
//            try {
//                br = new BufferedReader(new FileReader(f));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            try {
//                StringBuilder sb = new StringBuilder();
//                String line = br.readLine();
//
//                while (line != null) {
//                    if(line.contains("\"androidManifest\": {},")){
//                        System.out.print("REPLACE FOUND +" + f.getName());
//                        replace=true;
//                    }else {
//                        sb.append(line);
//                        sb.append(System.lineSeparator());
//                    }
//                    line = br.readLine();
//                }
//                everything = sb.toString();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                br.close();
//            }
//
//            if(replace){
//                PrintWriter writer = new PrintWriter(f.getAbsoluteFile(), "UTF-8");
//                writer.print(everything);
//                writer.close();
//
//                ApkData data = JsonUtils.fromJson(f);
//                if(data==null){
//                    throw new RuntimeException("bad conversion");
//                }
//            }
//
//
//        }
//    }
}

