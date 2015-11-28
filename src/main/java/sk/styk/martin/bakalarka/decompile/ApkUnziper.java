package sk.styk.martin.bakalarka.decompile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.files.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkUnziper {

    private static final Logger logger = LoggerFactory.getLogger(ApkUnziper.class);
    public static String TEMP_FOLDER_UNZIP = "D:\\Projects\\temp\\unziped";
    private static ApkUnziper instance = null;
    private File apkFile;

    private ApkUnziper() {
        // Exists only to defeat instantiation.
    }

    public static ApkUnziper getInstance(File apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new ApkUnziper();
        }
        instance.apkFile = apkFile;
        return instance;
    }

    public void unzip() {

        byte[] buffer = new byte[1024];

        File folder = new File(TEMP_FOLDER_UNZIP);

        try {
            FileUtils.cleanDirectory(folder);
        } catch (IOException e) {
            logger.warn("Temp directory " + folder.getPath() + " wasn`t cleaned");
        }


        ZipInputStream zis = null;
        try {
            zis = new ZipInputStream(new FileInputStream(apkFile));
            //get the zipped file list entry
            ZipEntry ze = zis.getNextEntry();

            logger.info("Starting unzip of apk " + apkFile.getName());
            while (ze != null) {

                String fileName = ze.getName();
                File newFile = new File(TEMP_FOLDER_UNZIP + File.separator + fileName);

                logger.trace("Unziping file : " + newFile.getAbsoluteFile());

                //create all non exists folders
                //else you will hit FileNotFoundException for compressed folder
                new File(newFile.getParent()).mkdirs();

                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    logger.trace("Unziping file " + newFile.getPath());
                } catch (IOException e) {
                    logger.trace("Unziping file " + newFile.getPath() + " failed");
                } finally {
                    if (fos != null) {
                        fos.close();
                    }
                }
                ze = zis.getNextEntry();
            }
            logger.info("Finished unzip of apk " + apkFile.getName());

        } catch (IOException ex) {
            logger.error("Error unziping " + apkFile.getName());
        } finally {
            if (zis != null) {
                try {
                    zis.closeEntry();
                    zis.close();
                } catch (IOException e) {
                    logger.error("Closing ZipInputStream failed");
                }
            }

        }
    }
}
