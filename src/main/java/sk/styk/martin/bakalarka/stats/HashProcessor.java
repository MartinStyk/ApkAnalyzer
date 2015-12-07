package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import sk.styk.martin.bakalarka.data.ApkData;
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

    private static HashProcessor instance = null;
    private List<String> hashes;
    private ApkData data;
    private ApkFile apkFile;

    private HashProcessor() {
        // Exists only to defeat instantiation.
    }

    public static HashProcessor getInstance(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new HashProcessor();
        }
        instance.data = data;
        instance.apkFile = apkFile;
        instance.hashes = new ArrayList<String>();
        instance.apkNameMarker = apkFile.getMarker();
        return instance;
    }

    public static HashProcessor getInstance(ApkFile apkFile) {
        if (instance == null) {
            instance = new HashProcessor();
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }
        instance.data = null;
        instance.apkFile = apkFile;
        instance.hashes = new ArrayList<String>();
        instance.apkNameMarker = apkFile.getMarker();
        return instance;
    }

    public List<String> getHashes() {
        return getHashes(new File(apkFile.getUnzipDirectoryWithUnzipedData(), "META-INF"));
    }

    public List<String> getHashes(File dirWithManifestMF) {

        logger.trace(apkNameMarker + "Started processing of hashes");

        List<File> files = null;

        try {
            FileFinder ff = new FileFinder(dirWithManifestMF);
            files = ff.getMFFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn(apkNameMarker + "META-INF directory doesn`t exists");
            return null;
        }

        hashes = new ArrayList<String>();

        for (File f : files) {
            processHashesFile(f);
        }
        if (data != null) {
            data.setFileDigest(hashes);
        }

        logger.trace(apkNameMarker + "Finished processing of hashes");

        return hashes;
    }

    private void processHashesFile(File file) {
        String content = null;

        try {
            content = FileUtils.fileToString(file);
        } catch (IOException e) {
            logger.error(apkNameMarker + "Unable to read file " + file.getName());
            return;
        }


        String REGEX = "SHA1-Digest:\\s(.*)";
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(content);


        while (matcher.find()) {
            hashes.add(matcher.group(1));
        }

    }

}
