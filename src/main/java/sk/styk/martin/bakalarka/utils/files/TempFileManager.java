package sk.styk.martin.bakalarka.utils.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 29.11.2015.
 */
public class TempFileManager {

    private static final Logger logger = LoggerFactory.getLogger(TempFileManager.class);
    File decompiledDir;
    File unzipDir;
    File workingDir;
    private File defaultTempDirBase = new File(System.getProperty("java.io.tmpdir"), "apk_tmp");
    private File apk;

    public TempFileManager(File apk) {
        if (apk == null) {
            throw new IllegalArgumentException("apk");
        }
        this.apk = apk;
    }

    public static TempFileManager forApk(File apk) {
        return new TempFileManager(apk);
    }

    public File getDefaultTempFileBaseDir() {
        return defaultTempDirBase;
    }

    public void setDefaultTempFileBaseDir(File defaultTempFileBaseDir) {
        defaultTempDirBase = defaultTempFileBaseDir;
    }

    public File getApkWorkingDirectory() {
        return workingDir == null ? createApkWorkingDirectory() : workingDir;
    }

    public File createApkWorkingDirectory() {
        File newDir = new File(defaultTempDirBase, apk.getName());
        if (!newDir.exists()) {
            logger.trace("creating working dir " + newDir.getAbsolutePath());
            newDir.mkdirs();
        }
        return newDir;
    }

    public File getApkUnzipedDirectory() {
        return workingDir == null ? createApkUnzipedDirectory() : unzipDir;
    }

    public File createApkUnzipedDirectory() {
        workingDir = getApkWorkingDirectory();
        unzipDir = new File(workingDir, "unziped");
        if (!unzipDir.exists()) {
            logger.trace("creating unzip dir " + unzipDir.getAbsolutePath());
            unzipDir.mkdirs();
        }
        return unzipDir;
    }

    public File getApkDecompiledDirectory() {
        return decompiledDir == null ? createApkDecompiledDirectory() : decompiledDir;
    }

    public File createApkDecompiledDirectory() {
        workingDir = getApkWorkingDirectory();
        decompiledDir = new File(workingDir, "decompiled");
        if (!decompiledDir.exists()) {
            logger.trace("creating decompiled dir " + decompiledDir.getAbsolutePath());
            decompiledDir.mkdirs();
        }
        return decompiledDir;
    }

    public void deleteApkDecompiledDirectory() throws IOException {
        if (decompiledDir != null)
            FileUtils.deleteDirectory(decompiledDir);
    }

    public void deleteApkUnzipedDirectory() throws IOException {
        if (unzipDir != null)
            FileUtils.deleteDirectory(unzipDir);
    }

    public void deleteApkWorkingDirectory() throws IOException {
        deleteApkDecompiledDirectory();
        deleteApkUnzipedDirectory();
        if (workingDir != null)
            FileUtils.deleteDirectory(workingDir);

    }


}
