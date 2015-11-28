package sk.styk.martin.bakalarka.decompile;

import brut.androlib.Androlib;
import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.androlib.ApkOptions;
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
    private static ApkDecompiler instance = null;
    public static String TEMP_FOLDER_UNZIP = "D:\\Projects\\temp\\decompiled";

    private File apkFile;

    private ApkDecompiler() {
        // Exists only to defeat instantiation.
    }

    public static ApkDecompiler getInstance(File apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new ApkDecompiler();
            installFramework(); //we need to install framework, otherwise some apk cannot be decompiled (arsc cannot decompile)
        }
        instance.apkFile = apkFile;
        return instance;
    }

    public void decompile()  {

        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);

        try {
            decoder.setDecodeSources((short) 0);
        } catch (AndrolibException e) {
            logger.error(e.toString());
        }

        File outDirectory = new File(TEMP_FOLDER_UNZIP);
        outDirectory.mkdirs();


        try {
            decoder.setOutDir(outDirectory);
        } catch (AndrolibException e) {
            logger.error("Setting out directory failed : " + e.toString());
        }
        logger.info("Starting decompilation of apk " + apkFile.getName());
        try {
            decoder.decode();
            logger.info("Succesfully finished decompilation of apk " + apkFile.getName());
        } catch (Exception e) {
            logger.error("Finished decompilation with exception : " + e.toString());
        }

    }

    private static void installFramework() {

        logger.info("Installing framework-res.apk");

        ApkOptions apkOptions = new ApkOptions();
        try {
            new Androlib(apkOptions).installFramework(new File("lib" + File.separator + "framework-res.apk"));
        } catch (AndrolibException e) {
            logger.warn("Installing framework-res.apk FAILED");
        }
    }
}
