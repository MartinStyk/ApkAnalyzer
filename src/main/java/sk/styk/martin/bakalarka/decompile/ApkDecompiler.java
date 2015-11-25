package sk.styk.martin.bakalarka.decompile;

import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.directory.DirectoryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkDecompiler {

    private static final Logger logger = LoggerFactory.getLogger(ApkDecompiler.class);
    public static String TEMP_FOLDER_UNZIP = "D:\\Projects\\temp\\decompiled";

    private File apkFile;

    public static void decompile(File apkFile) {
        try {
            decompileIt(apkFile, true);
            return;
        } catch (AndrolibException e) {

        }

        logger.warn("Decompilation of apk " + apkFile.getName() + " unsuccessful. Retrying without resources");

        try {
            decompileIt(apkFile, false);
            return;
        } catch (AndrolibException e) {
        }
        logger.error("Decompilation of apk " + apkFile.getName() + " failed");
    }

    private static void decompileIt(File apkFile, boolean arsc) throws AndrolibException {

        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);
        decoder.setDecodeSources((short)0);

        if (!arsc) {
            try {
                decoder.setDecodeResources((short) 256);
            } catch (AndrolibException e) {
                e.printStackTrace();
            }
        }

        File outDirectory = new File(TEMP_FOLDER_UNZIP);
        outDirectory.mkdirs();


        try {
            decoder.setOutDir(outDirectory);
        } catch (AndrolibException e) {
            e.printStackTrace();
        }
        logger.info("Starting decompilation of apk " + apkFile.getName());
        try {
            decoder.decode();
        } catch (DirectoryException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Succesfully finished decompilation of apk " + apkFile.getName());
    }
}
