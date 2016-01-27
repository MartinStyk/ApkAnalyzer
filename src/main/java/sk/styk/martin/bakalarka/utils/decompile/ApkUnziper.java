package sk.styk.martin.bakalarka.utils.decompile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import sk.styk.martin.bakalarka.utils.files.ApkFile;

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
    private Marker apkNameMarker;
    private ApkFile apkFile;

    public ApkUnziper(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public static ApkUnziper getInstance(ApkFile apkFile) {
        return new ApkUnziper(apkFile);
    }

    public void unzip() throws IOException {

        byte[] buffer = new byte[1024];

        ZipInputStream zis = null;
        try {
            zis = new ZipInputStream(new FileInputStream(apkFile));
            //get the zipped file list entry
            ZipEntry ze = zis.getNextEntry();

            logger.info(apkNameMarker + "Starting unzip");
            while (ze != null) {

                String fileName = ze.getName();
                File newFile = new File(apkFile.getUnzipDirectory(), fileName);

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
                    logger.trace(apkNameMarker + "Unziping file " + newFile.getPath());
                } catch (IOException e) {
                    logger.trace(apkNameMarker + "Unziping file " + newFile.getPath() + " failed");
                } finally {
                    if (fos != null) {
                        fos.close();
                    }
                }
                ze = zis.getNextEntry();
            }
            logger.info(apkNameMarker + "Finished unzip of apk " + apkFile.getName());

        } catch (IOException ex) {
            logger.error(apkNameMarker + "Error unziping " + apkFile.getName());
            throw ex;
        } finally {
            if (zis != null) {
                try {
                    zis.closeEntry();
                    zis.close();
                } catch (IOException e) {
                    logger.error(apkNameMarker + "Closing ZipInputStream failed");
                }
            }

        }
    }
}
