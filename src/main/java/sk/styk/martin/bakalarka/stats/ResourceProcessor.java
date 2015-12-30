package sk.styk.martin.bakalarka.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.w3c.dom.Document;
import sk.styk.martin.bakalarka.data.ApkData;
import sk.styk.martin.bakalarka.data.ResourceData;
import sk.styk.martin.bakalarka.files.ApkFile;
import sk.styk.martin.bakalarka.files.FileFinder;
import sk.styk.martin.bakalarka.stats.helpers.XmlParsingHelper;

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
    private Marker apkNameMarker;

    private ApkData data;
    private ApkFile apkFile;
    private ResourceData resourceData;
    private FileFinder resourceDirectoryFileFinder;

    public ResourceProcessor(ApkData data, ApkFile apkFile) {
        if (data == null) {
            throw new IllegalArgumentException("data null");
        }
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.data = data;
        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }

    public ResourceProcessor(ApkFile apkFile) {
        if (apkFile == null) {
            throw new IllegalArgumentException("apkFile null");
        }

        this.apkFile = apkFile;
        this.apkNameMarker = apkFile.getMarker();
    }


    public static ResourceProcessor getInstance(ApkData data, ApkFile apkFile) {
       return new ResourceProcessor(data,apkFile);
    }

    public static ResourceProcessor getInstance(ApkFile apkFile) {
        return new ResourceProcessor(apkFile);
    }

    public ResourceData processResources() {

        logger.trace(apkNameMarker + "Started processing of resources");

        File resFolder = new File(apkFile.getUnzipDirectoryWithUnzipedData(), "res");
        if(!resFolder.exists()){
            logger.warn(apkNameMarker + "res directory doesn`t exists, aborting getting of resources");
            return null;
        }
        try {
            resourceDirectoryFileFinder = new FileFinder(resFolder);
        }catch (Exception e){
            logger.warn(apkNameMarker + "res directory doesn`t exists, aborting getting of resources");
            return null;
        }

        resourceData = new ResourceData();
        resourceData.setLocale(getStringLocalizations());
        resourceData.setNumberOfStringResource(getNumberOfStringResource());
        resourceData.setRawResources(getNumberOfRawResources());

        processDrawableResources();
        processLayoutResources();
        processMenuResources();

        if (data != null) {
            data.setResourceData(resourceData);
        }

        logger.trace(apkNameMarker + "Finished processing of localizations");

        return resourceData;
    }

    private Integer getNumberOfRawResources() {
        File resFolder = new File(apkFile.getDecompiledDirectoryWithDecompiledData(), "res");
        File rawFolder = new File(resFolder, "raw");

        if(!resFolder.exists()){
            logger.warn(apkNameMarker + "res/raw directory doesn`t exists");
            return null;
        }
        if (!rawFolder.exists()) {
            return 0;
        }

        return new FileFinder(rawFolder).getAllFilesInDirectories().size();

    }

    private void processDrawableResources() {
        List<File> drawableFiles = null;
        List<File> directories = null;

        try {
            directories = resourceDirectoryFileFinder.getDirectoriesContainingExpression("drawable");
            FileFinder ff = new FileFinder(directories);
            drawableFiles = ff.getDrawableResourceFiles();
        } catch (IllegalArgumentException e) {
            logger.warn(apkNameMarker + "res/drawable directory doesn`t exists");
            return;
        }

        resourceData.setDifferentDrawables(processDifferentFileNames(drawableFiles));
        processDrawablesTypes(drawableFiles);
        processDrawableDirectories(directories);
    }

    private void processLayoutResources() {
        List<File> layoutFiles = null;
        List<File> directories = null;

        try {
            directories = resourceDirectoryFileFinder.getDirectoriesContainingExpression("layout");
            FileFinder ff = new FileFinder(directories);
            layoutFiles = ff.getXmlFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn(apkNameMarker + "res/layout directory doesn`t exists");
            return;
        }

        resourceData.setDifferentLayouts(processDifferentFileNames(layoutFiles));
        resourceData.setLayouts(layoutFiles.size());
    }

    private void processMenuResources() {
        List<File> menuFiles = null;
        List<File> menuDirectories = null;

        try {
            menuDirectories = resourceDirectoryFileFinder.getDirectoriesContainingExpression("menu");
            FileFinder ff = new FileFinder(menuDirectories);
            menuFiles = ff.getXmlFilesInDirectories();
        } catch (IllegalArgumentException e) {
            logger.warn(apkNameMarker + "res/menu directory doesn`t exists");
            return;
        }
        resourceData.setMenu(menuFiles.size());
    }

    private List<String> getStringLocalizations() {

        List<File> files = resourceDirectoryFileFinder.getStringResourceFilesInDirectories();

        List<String> localizations = new ArrayList<String>();

        for (File f : files) {
            processLocalization(f, localizations);
        }

        return localizations;

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

    private Integer getNumberOfStringResource() {
        File file = null;
        Document document;

        try {
            file = new File(apkFile.getDecompiledDirectoryWithDecompiledData(), "res" + File.separator + "values" + File.separator + "strings.xml");
            document = XmlParsingHelper.getNormalizedDocument(file);
        } catch (Exception e) {
            logger.warn(apkNameMarker + "strings.xml doesn`t exists");
            return null;
        }

        return XmlParsingHelper.getListOfTagAttributeValues(document, "string", "name").size();
    }

    private void processDrawablesTypes(List<File> files) {

        if (files == null || files.isEmpty()) {
            return;
        }

        int numJpg = 0;
        int numGif = 0;
        int numPng = 0;
        int numXml = 0;

        for (File f : files) {

            String name = f.getName();

            if (name.endsWith(".jpg") ||
                    name.endsWith(".JPG") ||
                    name.endsWith(".jpeg") ||
                    name.endsWith(".JPEG")) {
                numJpg++;
            } else if (name.endsWith(".gif") ||
                    name.endsWith(".GIF")) {
                numGif++;
            } else if (name.endsWith(".png") ||
                    name.endsWith(".PNG")) {
                numPng++;
            } else if (name.endsWith(".xml") ||
                    name.endsWith(".XML")) {
                numXml++;
            }
        }
        resourceData.setGifDrawables(numGif);
        resourceData.setPngDrawables(numPng);
        resourceData.setJpgDrawables(numJpg);
        resourceData.setXmlDrawables(numXml);

    }

    private Integer processDifferentFileNames(List<File> files) {

        if (files == null || files.isEmpty()) {
            return null;
        }

        Set<String> names = new HashSet<String>();
        for (File f : files) {
            names.add(f.getName());
        }
        return names.size();
    }

    private void processDrawableDirectories(List<File> directories) {

        boolean success = false;

        int withoutdpi = 0;
        int ldpi = 0;
        int mdpi = 0;
        int hdpi = 0;
        int xhdpi = 0;
        int xxhdpi = 0;
        int xxxhdpi = 0;

        if (directories == null || directories.isEmpty()) {
            return;
        }

        for (File dir : directories) {
            FileFinder ff = new FileFinder(dir);
            int size = ff.getDrawableResourceFiles().size();

            if (size > 0) {
                success = true;
                if (dir.getName().contains("ldpi")) ldpi += size;
                else if (dir.getName().contains("mdpi")) mdpi += size;
                else if (dir.getName().contains("xxxhdpi")) xxxhdpi += size;
                else if (dir.getName().contains("xxhdpi")) xxhdpi += size;
                else if (dir.getName().contains("xhdpi")) xhdpi += size;
                else if (dir.getName().contains("hdpi")) hdpi += size;
                else if (dir.getName().contains("drawable")) withoutdpi += size;
            }
        }
        if (success) {
            resourceData.setLdpiDrawables(ldpi);
            resourceData.setMdpiDrawables(mdpi);
            resourceData.setHdpiDrawables(hdpi);
            resourceData.setXhdpiDrawables(xhdpi);
            resourceData.setXxhdpiDrawables(xxhdpi);
            resourceData.setXxxhdpiDrawables(xxxhdpi);
            resourceData.setUnspecifiedDpiDrawables(withoutdpi);
        }
    }
}
