package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.data.HashData;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;
import sk.styk.martin.bakalarka.files.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Martin Styk on 25.11.2015.
 */
public class HashProcessor {

    private static final Logger logger = LoggerFactory.getLogger(HashProcessor.class);
    private Marker apkNameMarker;

    private HashData hashData;
    private ApkData data;
    private ApkFile apkFile;

    public HashProcessor(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = data;
        this.apkFile = apkFile;
        this.hashData = new HashData();
        this.apkNameMarker = apkFile.getMarker();
    }

    public HashProcessor(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.apkFile = apkFile;
        this.hashData = new HashData();
        this.apkNameMarker = apkFile.getMarker();
    }


    public static HashProcessor getInstance(ApkData data, ApkFile apkFile) {
        return new HashProcessor(data, apkFile);
    }

    public static HashProcessor getInstance(ApkFile apkFile) {
        return new HashProcessor(apkFile);
    }

    public HashData getHashes() {
        return getHashes(new File(apkFile.getUnzipDirectoryWithUnzipedData(), "META-INF"));
    }

    public HashData getHashes(File dirWithManifestMF) {

        logger.trace(apkNameMarker + "Started processing of hashes");

        List<File> files = null;

        try {
            FileFinder ff = new FileFinder(dirWithManifestMF);
            files = ff.getMFFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn(apkNameMarker + "META-INF directory doesn`t exists");
            return null;
        }

        hashData = new HashData();
        hashData.setDrawableHash(new ArrayList<String>());
        hashData.setLayoutHash(new ArrayList<String>());
        hashData.setOtherHash(new ArrayList<String>());

        for (File f : files) {
            processHashesFile(f);
        }
        if (data != null) {
            data.setFileDigest(hashData);
        }

        logger.trace(apkNameMarker + "Finished processing of hashes");

        return hashData;
    }

    private void processHashesFile(File file) {
        String content = null;

        try {
            content = FileUtils.fileToString(file);
        } catch (IOException e) {
            logger.error(apkNameMarker + "Unable to read file " + file.getName());
            return;
        }


        String REGEX = "Name: (.*)\\r\\nSHA1-Digest:\\s(.*)";
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(content);


        while (matcher.find()) {
            String fileName = matcher.group(1);
            String fileHash = matcher.group(2);
            if (fileName.equals("classes.dex")) {
                hashData.setDexHash(fileHash);
            } else if (fileName.equals("resources.arsc")) {
                hashData.setArscHash(fileHash);
            } else if (fileName.startsWith("res/drawable")) {
                hashData.getDrawableHash().add(fileHash);
            } else if (fileName.startsWith("res/layout")) {
                hashData.getLayoutHash().add(fileHash);
            } else {
                hashData.getOtherHash().add(fileHash);
            }
        }

    }

}
