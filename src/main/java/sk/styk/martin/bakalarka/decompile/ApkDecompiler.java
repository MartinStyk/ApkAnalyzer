package sk.styk.martin.bakalarka.decompile;

import brut.androlib.Androlib;
import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.androlib.ApkOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.files.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkDecompiler {

    private static final Logger logger = LoggerFactory.getLogger(ApkDecompiler.class);
    private static ApkDecompiler instance = null;
    private File apkFile;
    private File outDirectory;

    private ApkDecompiler() {
        // Exists only to defeat instantiation.
    }

    public static ApkDecompiler getInstance(File apkFile, File outDirectory) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }
        if (outDirectory == null) {
            throw new IllegalArgumentException("outDirectory null");
        }

        if (instance == null) {
            instance = new ApkDecompiler();
            installFramework(); //we need to install framework, otherwise some apk cannot be decompiled (arsc cannot decompile)
        }
        instance.apkFile = apkFile;
        instance.outDirectory = outDirectory;
        return instance;
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

    public void decompile() {

        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);

        try {
            decoder.setDecodeSources((short) 0);
        } catch (AndrolibException e) {
            logger.error(e.toString());
        }

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
            logger.error("Finished decompilation of apk " + apkFile.getName() + " with exception : " + e.toString());
        }

    }
}
