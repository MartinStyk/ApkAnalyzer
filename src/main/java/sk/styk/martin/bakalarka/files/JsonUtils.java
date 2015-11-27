package sk.styk.martin.bakalarka.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    public static void toJson(ApkData data, File outputDirectory){

        if(!outputDirectory.exists()){
            outputDirectory.mkdirs();
            logger.info("Creating metadata directory" + outputDirectory.getName() );
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();
        
        String jsonString = gson.toJson(data);

        File outFile = new File(outputDirectory,getMetadataFileName(data));

        try {
            FileWriter writer = new FileWriter(outFile);
            writer.write(jsonString);
            writer.close();
            logger.info(data.getFileName() + " written to " + outFile.getName() + " in " + outputDirectory.getName());

        } catch (IOException e) {
            logger.error("Error saving file to " + outFile.getName() );
        }

    }

    private static String getMetadataFileName(ApkData data){
        String apkName = data.getFileName();
        String jsonName = apkName.substring(0, apkName.length() - 3) + "json";

        return jsonName;
    }

}
