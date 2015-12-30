package sk.styk.martin.bakalarka.decompile;

import brut.androlib.Androlib;
import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.androlib.ApkOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import sk.styk.martin.bakalarka.files.ApkFile;

import java.io.File;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkDecompiler {

    private static boolean isFrameworkInstalled;
    private static final Logger logger = LoggerFactory.getLogger(ApkDecompiler.class);
    private Marker apkNameMarker;

    private ApkFile apkFile;

    public ApkDecompiler(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        synchronized (ApkDecompiler.class){
            if (isFrameworkInstalled == false) {
                installFramework(); //we need to install framework, otherwise some apk cannot be decompiled (arsc cannot decompile)
                isFrameworkInstalled = true;
            }
        }

        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public static ApkDecompiler getInstance(ApkFile apkFile) {
        return new ApkDecompiler(apkFile);
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

    public void decompile() throws Exception {

        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);

        try {
            decoder.setDecodeSources((short) 0);
        } catch (AndrolibException e) {
            logger.error(apkNameMarker + e.toString());
        }

        try {
            decoder.setOutDir(apkFile.getDecompiledDirectory());
        } catch (AndrolibException e) {
            logger.error(apkNameMarker + "Setting out directory failed : " + e.toString());
        }
        logger.info(apkNameMarker + "Starting decompilation");
        try {
            decoder.decode();
            logger.info(apkNameMarker + "Succesfully finished decompilation");
        } catch (Exception e) {
            logger.error(apkNameMarker + "Finished decompilation with exception : " + e.toString());
            throw e;
        }

    }
}
