package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.data.ResourceData;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Martin Styk on 29.11.2015.
 */
public class ResourceProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ResourceProcessor.class);
    private static ResourceProcessor instance = null;
    private ApkData data;
    private ApkFile apkFile;
    private ResourceData resourceData;

    private ResourceProcessor() {
        // Exists only to defeat instantiation.
    }

    public static ResourceProcessor getInstance(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        if (instance == null) {
            instance = new ResourceProcessor();
        }
        instance.data = data;
        instance.apkFile = apkFile;
        instance.resourceData = null;
        return instance;
    }

    public static ResourceProcessor getInstance(ApkFile apkFile) {
        if (instance == null) {
            instance = new ResourceProcessor();
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }
        instance.data = null;
        instance.apkFile = apkFile;
        instance.resourceData = null;
        return instance;
    }

    public ResourceData processResources() {

        logger.trace("Started processing of resources");

        resourceData = new ResourceData();
        resourceData.setLocale(getStringLocalizations());

        List<File> files = null;

        try {
            FileFinder ff = new FileFinder(new File(apkFile.getUnzipDirectoryWithUnzipedData(), "res"));
            files = ff.getDrawableResourceFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn("res directory doesn`t exists");
        }
        processDrawablesTypes(files);
        processDifferentDrawables(files);

        if (data != null) {
            data.setResourceData(resourceData);
        }

        logger.trace("Finished processing of localizations");

        return resourceData;
    }

    private List<String> getStringLocalizations() {

        List<File> files = null;

        try {
            FileFinder ff = new FileFinder(new File(apkFile.getDecompiledDirectoryWithDecompiledData(), "res"));
            files = ff.getStringResourceFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn("res directory doesn`t exists");
            return null;
        }

        List<String> localizations = new ArrayList<String>();

        for (File f : files) {
            processLocalization(f, localizations);
        }

        return localizations.isEmpty() ? null : localizations;

    }

    private void processLocalization(File f, List<String> localizations) {

        String parentName = null;
        try {
            parentName = f.getParentFile().getName();
        } catch (Exception e) {
            logger.warn("parent of file " + f.getPath() + " not found");
            return;
        }

        String REGEX = "values-(\\D*)";
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(parentName);


        if (matcher.find()) {
            localizations.add(matcher.group(1));
        }
    }

    private void processDrawablesTypes(List<File> files) {

        if (files == null || files.isEmpty()) {
            return;
        }

        int numJpg = 0;
        int numGif = 0;
        int numPng = 0;

        for (File f : files) {
            if (f.getName().endsWith(".jpg") ||
                    f.getName().endsWith(".JPG") ||
                    f.getName().endsWith(".jpeg") ||
                    f.getName().endsWith(".JPEG")) {
                numJpg++;
            } else if (f.getName().endsWith(".gif") ||
                    f.getName().endsWith(".GIF")) {
                numGif++;
            } else if (f.getName().endsWith(".png") ||
                    f.getName().endsWith(".PNG")) {
                numPng++;
            }
        }
        if (numGif != 0) resourceData.setGifDrawables(numGif);
        if (numPng != 0) resourceData.setPngDrawables(numPng);
        if (numJpg != 0) resourceData.setJpgDrawables(numJpg);

    }

    private void processDifferentDrawables(List<File> files) {
        Set<String> names = new HashSet<String>();
        for (File f : files) {
            names.add(f.getName());
        }
        if (!names.isEmpty())
            resourceData.setDifferentDrawables(names.size());
    }

}
