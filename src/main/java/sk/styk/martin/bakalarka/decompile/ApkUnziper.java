package sk.styk.martin.bakalarka.decompile;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    public static void unZipApk(File zipFile) {

        byte[] buffer = new byte[1024];

        try {
            File folder = new File(TEMP_FOLDER_UNZIP);
            //create output directory is not exists
            if (folder.exists()) {
                FileUtils.deleteDirectory(folder);
            }
            folder.mkdir();
            //get the zip file content
            ZipInputStream zis =
                    new ZipInputStream(new FileInputStream(zipFile));
            //get the zipped file list entry
            ZipEntry ze = zis.getNextEntry();

            logger.info("Starting unzip of apk " + zipFile.getName());
            while (ze != null) {

                String fileName = ze.getName();
                File newFile = new File(TEMP_FOLDER_UNZIP + File.separator + fileName);

                logger.trace("file unzip : " + newFile.getAbsoluteFile());

                //create all non exists folders
                //else you will hit FileNotFoundException for compressed folder
                new File(newFile.getParent()).mkdirs();

                FileOutputStream fos = new FileOutputStream(newFile);

                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }

                fos.close();
                ze = zis.getNextEntry();
            }

            zis.closeEntry();
            zis.close();

            logger.info("Finished unzip of apk " + zipFile.getName());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
