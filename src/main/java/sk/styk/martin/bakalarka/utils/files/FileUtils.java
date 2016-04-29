package sk.styk.martin.bakalarka.utils.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Utilities to simplify work with files
 *
 * Created by Martin Styk on 27.11.2015.
 */
public class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static void deleteDirectory(File folder) throws IOException {
        deleteDirectory(folder, 10);
    }

    public static void deleteDirectory(File folder, int retries) throws IOException {

        if (folder == null) {
            throw new NullPointerException("deleteDirectory - folder is null");
        }

        if (folder.exists()) {
            for (int i = 0; i < retries; i++) {

                if (i != 0) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        logger.error("Interrupted");
                    }
                }

                try {
                    org.apache.commons.io.FileUtils.deleteDirectory(folder);
                    break;
                } catch (IOException e) {
                    if (i < retries) {
                        int time = i + 1;
                        logger.warn("Cannot delete directory " + folder.getName() + "Retrying for " + time + " time");
                    } else {
                        throw e;
                    }
                }
            }
            logger.info("Directory " + folder.getName() + " deleted");
        }
    }

    public static void cleanDirectory(File folder) throws IOException {
        deleteDirectory(folder);
        folder.mkdirs();
    }

    public static void cleanDirectory(File folder, int retries) throws IOException {
        deleteDirectory(folder, retries);
        folder.mkdirs();
    }

    public static String fileToString(File f) throws IOException {

        FileInputStream fis = null;
        byte[] data;

        try {
            fis = new FileInputStream(f);
            data = new byte[(int) f.length()];
            fis.read(data);
            fis.close();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }

        return new String(data, "UTF-8");
    }

}
