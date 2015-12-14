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

    private static final Logger logger = LoggerFactory.getLogger(ApkDecompiler.class);
    private Marker apkNameMarker;

    private static ApkDecompiler instance = null;
    private ApkFile apkFile;

    private ApkDecompiler() {
        // Exists only to defeat instantiation.
    }

    public static ApkDecompiler getInstance(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new ApkDecompiler();
            installFramework(); //we need to install framework, otherwise some apk cannot be decompiled (arsc cannot decompile)
        }
        instance.apkFile = apkFile;
        instance.apkNameMarker = apkFile.getMarker();
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

    public void decompile() throws Exception {

        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);

        try {
            decoder.setOutDir(apkFile.getDecompiledDirectory());
        } catch (AndrolibException e) {
            logger.error(apkNameMarker + "Setting out directory failed : " + e.toString());
            throw e;
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

    public void compile() throws Exception {

        File outFile = null;
        ApkOptions apkOptions = new ApkOptions();
        apkOptions.forceBuildAll = true;
        outFile = apkFile.getCompiledFile();

        new Androlib(apkOptions).build(apkFile.getDecompiledDirectory(), outFile);

    }

}
