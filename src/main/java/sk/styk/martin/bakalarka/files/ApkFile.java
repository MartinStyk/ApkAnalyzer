package sk.styk.martin.bakalarka.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.decompile.ApkUnziper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 06.12.2015.
 */
public class ApkFile extends File {

    private static final Logger logger = LoggerFactory.getLogger(ApkFile.class);
    private TempFileManager apkWorkingDirectoryManager = new TempFileManager(this);

    private Exception decompilationException;
    private Exception unzipException;

    public ApkFile(String pathname) {
        super(pathname);
        if (!pathname.endsWith(".apk")) {
            throw new IllegalArgumentException("not apk file");
        }
    }

    public ApkFile(String parent, String child) {
        super(parent, child);
        if (!child.endsWith(".apk")) {
            throw new IllegalArgumentException("not apk file");
        }
    }

    public TempFileManager getApkWorkingDirectoryManager() {
        return apkWorkingDirectoryManager;
    }

    public File getUnzipDirectory() {
        return apkWorkingDirectoryManager.getApkUnzipedDirectory();
    }

    public File getDecompiledDirectory() {
        return apkWorkingDirectoryManager.getApkDecompiledDirectory();
    }

    public void cleanApkWorkingDirectory() {
        try {
            apkWorkingDirectoryManager.deleteApkWorkingDirectory();
        } catch (IOException e) {
            logger.error("cannot clean working directory of" + getName());
        }
    }

    public void unzip() {
        try {
            ApkUnziper.getInstance(this).unzip();
        } catch (Exception e) {
            unzipException = e;
            logger.error(getMarker() + " unzip failed");
        }
    }

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

    public File getUnzipDirectoryWithUnzipedData() {
        if (!isUnziped() && !isUnzipFailed()) {
            unzip();
        }
        return getUnzipDirectory();
    }

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
