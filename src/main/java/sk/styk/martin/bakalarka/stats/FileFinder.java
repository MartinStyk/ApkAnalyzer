package sk.styk.martin.bakalarka.stats;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class FileFinder {

    private List<File> apkFolders;
    private List<File> files = new ArrayList<File>();

    public FileFinder(File apkFolder) {
        if (apkFolder == null) {
            throw new NullPointerException("apkFolder null");
        }
        if (!apkFolder.isDirectory()) {
            throw new IllegalArgumentException("apkFolder is not valid directory");
        }
        this.apkFolders = new ArrayList<File>();
        this.apkFolders.add(apkFolder);
    }

    public FileFinder(File... apkFolders) {
        this.apkFolders = new ArrayList<File>();
        for (File folder : apkFolders) {
            if (folder == null) {
                throw new NullPointerException("apkFolder null");
            }
            if (!folder.isDirectory()) {
                throw new IllegalArgumentException("apkFolder is not valid directory" + folder.getAbsolutePath());
            }
            this.apkFolders.add(folder);
        }
    }

    public List<File> getFilesInDirectories() {
        for (File directory : apkFolders) {
            getFilesInDirectory(directory);
        }
        return files;
    }

    private void getFilesInDirectory(File directory) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                if (file.getName().endsWith(".apk") || file.getName().endsWith(".APK"))
                    files.add(file);
            } else if (file.isDirectory()) {
                getFilesInDirectory(new File(file.getAbsolutePath()));
            }
        }
    }
}
