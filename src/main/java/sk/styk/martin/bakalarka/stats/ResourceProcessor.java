package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.decompile.ApkDecompiler;
import sk.styk.martin.bakalarka.files.FileFinder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Martin Styk on 29.11.2015.
 */
public class ResourceProcessor {

    private static final Logger logger = LoggerFactory.getLogger(ResourceProcessor.class);
    private static ResourceProcessor instance = null;
    private List<String> localizations;
    private ApkData data;

    private ResourceProcessor() {
        // Exists only to defeat instantiation.
    }

    public static ResourceProcessor getInstance(ApkData data) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }

        if (instance == null) {
            instance = new ResourceProcessor();
        }
        instance.data = data;
        instance.localizations = new ArrayList<String>();
        return instance;
    }

    public static ResourceProcessor getInstance() {
        if (instance == null) {
            instance = new ResourceProcessor();
        }
        instance.data = null;
        instance.localizations = new ArrayList<String>();
        return instance;
    }

    public List<String> getLocalizations() {

        logger.trace("Started processing of localizations");

        List<File> files = null;

        try {
            FileFinder ff = new FileFinder(new File(ApkDecompiler.TEMP_FOLDER_UNZIP + File.separator + "res"));
            files = ff.getStringResourceFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn("res directory doesn`t exists");
            return null;
        }

        localizations = new ArrayList<String>();

        for (File f : files) {
            processLocalization(f);
        }
        if (data != null) {
            data.setLocale(localizations);
        }

        logger.trace("Finished processing of localizations");

        return localizations;

    }

    private void processLocalization(File f) {

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

}
