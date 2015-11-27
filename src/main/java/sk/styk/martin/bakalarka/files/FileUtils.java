package sk.styk.martin.bakalarka.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static void deleteDirectory(File folder){
        deleteDirectory(folder, 10);
    }

    public static void deleteDirectory(File folder, int retries) {

        if(folder==null){
            throw new NullPointerException("folder");
        }

        if (folder.exists()) {
            for (int i = 0; i < retries; i++) {

                if(i!=0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        logger.error("Interrupted");
                    }
                }

                try {
                    org.apache.commons.io.FileUtils.deleteDirectory(folder);
                    break;
                } catch (IOException e) {
                    if (i < retries) {
                        logger.warn("Cannot delete directory " + folder.getName() + "Retrying...");
                    }else{
                        logger.error("Cannot delete directory " + folder.getName() + "Failed!");
                    }
                }
            }
        }
    }

    public static void cleanDirectory(File folder){
        deleteDirectory(folder);
        folder.mkdirs();
    }

    public static void cleanDirectory(File folder, int retries){
        deleteDirectory(folder,retries);
        folder.mkdirs();
    }

}
