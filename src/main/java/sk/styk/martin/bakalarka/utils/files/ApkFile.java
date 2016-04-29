package sk.styk.martin.bakalarka.utils.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import sk.styk.martin.bakalarka.utils.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.utils.decompile.ApkUnziper;

import java.io.File;
import java.io.IOException;

/**
 * Represents APK file. Extends File with information and methods useful when working with APK
 *
 * Created by Martin Styk on 06.12.2015.
 */
public class ApkFile extends File {

    private static final Logger logger = LoggerFactory.getLogger(ApkFile.class);
    private TempFileManager apkWorkingDirectoryManager = new TempFileManager(this);

    private Exception decompilationException;
    private Exception unzipException;

    /**
     * Creates APK file
     * @param file apk file
     */
    public ApkFile(File file) {
        this(file.getAbsolutePath());
    }


    /**
     * Creates APK file
     * @param pathname path to apk file
     */
    public ApkFile(String pathname) {
        super(pathname);
        if (!(pathname.endsWith(".apk") || pathname.endsWith(".APK"))) {
            throw new IllegalArgumentException(pathname + " not apk file");
        }
    }

    /**
     * Creates APK file
     * @param parent parent directory
     * @param child name of APK file
     */
    public ApkFile(String parent, String child) {
        super(parent, child);
        if (!child.endsWith(".apk")) {
            throw new IllegalArgumentException("not apk file");
        }
    }

    /**
     * @see TempFileManager
     * @return manger of temporary directory of APK file
     */
    public TempFileManager getApkWorkingDirectoryManager() {
        return apkWorkingDirectoryManager;
    }

    /**
     * @return temporary directory where APK file is unzipped
     */
    public File getUnzipDirectory() {
        return apkWorkingDirectoryManager.getApkUnzipedDirectory();
    }

    /**
     * @return temporary directory where APK file is decompiled
     */
    public File getDecompiledDirectory() {
        return apkWorkingDirectoryManager.getApkDecompiledDirectory();
    }

    /**
     * Delete everything created in directory where current apk is unzipped/decompiled
     */
    public void cleanApkWorkingDirectory() {
        try {
            apkWorkingDirectoryManager.deleteApkWorkingDirectory();
        } catch (IOException e) {
            logger.error("cannot clean working directory of" + getName());
        }
    }

    /**
     * Unzip APK file
     * @see ApkUnziper
     */
    public void unzip() {
        try {
            ApkUnziper.getInstance(this).unzip();
        } catch (Exception e) {
            unzipException = e;
            logger.error(getMarker() + " unzip failed");
        }
    }

    /**
     * Decompile APK file
     * @see ApkDecompiler
     */
    public void decompile() {
        try {
            ApkDecompiler.getInstance(this).decompile();
        } catch (Exception e) {
            decompilationException = e;
            logger.error(getMarker() + " decompilation failed");
        }
    }

    public boolean isDecompiled() {
        return apkWorkingDirectoryManager.getApkDecompiledDirectory().listFiles().length > 0;
    }

    public boolean isDecompilationFailed() {
        return decompilationException != null;
    }

    public boolean isUnziped() {
        return apkWorkingDirectoryManager.getApkUnzipedDirectory().listFiles().length > 0;
    }

    public boolean isUnzipFailed() {
        return unzipException != null;
    }

    /**
     * @return directory where APK is unzipped, perform unzip if needed
     */
    public File getUnzipDirectoryWithUnzipedData() {
        if (!isUnziped() && !isUnzipFailed()) {
            unzip();
        }
        return getUnzipDirectory();
    }

    /**
     * @return directory where APK is decompiled, perform decomplation if needed
     */
    public File getDecompiledDirectoryWithDecompiledData() {
        if (!isDecompiled() && !isDecompilationFailed()) {
            decompile();
        }
        return getDecompiledDirectory();
    }

    public Exception getDecompilationException() {
        return decompilationException;
    }

    public Exception getUnzipException() {
        return unzipException;
    }

    public Marker getMarker() {
        return MarkerFactory.getMarker(" [" + getName() + "] ");
    }
}
