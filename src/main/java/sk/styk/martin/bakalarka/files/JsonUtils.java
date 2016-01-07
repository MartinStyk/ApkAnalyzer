package sk.styk.martin.bakalarka.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.compare.data.ComparisonResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    public static void toJson(ApkData data, File outputDirectory) {

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
            logger.info("Creating metadata directory" + outputDirectory.getName());
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();

        String jsonString = gson.toJson(data);

        File outFile = new File(outputDirectory, getMetadataFileName(data));

        FileWriter writer = null;

        try {
            writer = new FileWriter(outFile);
            writer.write(jsonString);
            logger.info(data.getFileName() + " written to " + outFile.getName() + " in " + outputDirectory.getName());

        } catch (IOException e) {
            logger.error("Error saving file to " + outFile.getName());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    logger.error("Error closing FileWriter : " + e.toString());
                }
            }
        }
    }

    public static ApkData fromJson(File jsonFile) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();

        ApkData obj = null;
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(jsonFile);
            br = new BufferedReader(fr);

            obj = gson.fromJson(br, ApkData.class);

            System.out.println(obj);

        } catch (IOException e) {
            logger.error("Error reading file from " + jsonFile.getName());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    logger.error("Error closing FileReader : " + e.toString());
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    logger.error("Error closing BufferedReader : " + e.toString());
                }
            }
        }
        return obj;
    }


    public static List<ApkData> ListfromJson(File jsonFolder) {

        if (jsonFolder == null || !jsonFolder.exists()) {
            throw new IllegalArgumentException("jsonFolder");
        }

        FileFinder ff = new FileFinder(jsonFolder);
        List<File> jsons = ff.getJsonFilesInDirectories();

        List<ApkData> list = new ArrayList<ApkData>();

        for (File f : jsons) {
            list.add(fromJson(f));
        }

        return list;
    }

    public static void toJson(ComparisonResult data, File outputDirectory) {

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
            logger.info("Creating compare metadata directory" + outputDirectory.getName());
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();

        String jsonString = gson.toJson(data);

        File outFile = new File(outputDirectory, getMetadataFileName(data));

        FileWriter writer = null;

        try {
            writer = new FileWriter(outFile);
            writer.write(jsonString);
            logger.info(data.getNameA() + " vs " + data.getNameB() + " written to " + outFile.getName() + " in " + outputDirectory.getName());

        } catch (IOException e) {
            logger.error("Error saving file to " + outFile.getName());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    logger.error("Error closing FileWriter : " + e.toString());
                }
            }
        }
    }

    private static String getMetadataFileName(ApkData data) {
        String apkName = data.getFileName();
        String jsonName = apkName.substring(0, apkName.length() - 3) + "json";

        return jsonName;
    }

    private static String getMetadataFileName(ComparisonResult data) {
        String apkNameA = data.getNameA();
        String apkNameB = data.getNameB();

        return apkNameA + "-VS-" + apkNameB + ".json";
    }
}
