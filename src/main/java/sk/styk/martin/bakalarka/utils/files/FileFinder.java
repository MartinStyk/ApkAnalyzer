package sk.styk.martin.bakalarka.utils.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Returns desired files
 *
 * Created by Martin Styk on 23.11.2015.
 */
public class FileFinder {

    private List<File> searchedFolders;
    private List<File> files;

    public FileFinder(File folder) {
        if (folder == null) {
            throw new NullPointerException("folder null");
        }
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not valid directory");
        }
        this.searchedFolders = new ArrayList<File>();
        this.searchedFolders.add(folder);
    }

    public FileFinder(File... folders) {
        this.searchedFolders = new ArrayList<File>();
        for (File folder : folders) {
            if (folder == null) {
                throw new NullPointerException("folder null");
            }
            if (!folder.isDirectory()) {
                throw new IllegalArgumentException("folder is not valid directory" + folder.getAbsolutePath());
            }
            this.searchedFolders.add(folder);
        }
    }

    public FileFinder(List<File> folders) {
        this.searchedFolders = new ArrayList<File>();
        for (File folder : folders) {
            if (folder == null) {
                throw new NullPointerException("folder null");
            }
            if (!folder.isDirectory()) {
                throw new IllegalArgumentException("folder is not valid directory" + folder.getAbsolutePath());
            }
            this.searchedFolders.add(folder);
        }
    }

    public List<File> getAllFilesInDirectories() {
        files = new ArrayList<File>();
        for (File f : searchedFolders) {
            getAllFilesInDirectory(f);
        }
        return files;
    }

    private void getAllFilesInDirectory(File directory) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {

                files.add(file);

            } else if (file.isDirectory()) {
                getAllFilesInDirectory(new File(file.getAbsolutePath()));
            }
        }
    }

    public List<ApkFile> getApkFilesInDirectories() {
        files = getFilesInDirectoriesFileTypeMatch("apk", "APK");
        List<ApkFile> apkFiles = new ArrayList<ApkFile>();
        for (File f : files) {
            apkFiles.add(new ApkFile(f));
        }
        return apkFiles;
    }

    public List<File> getCertificateFilesInDirectories() {
        return getFilesInDirectoriesFileTypeMatch("RSA", "DSA");
    }

    public List<File> getMFFilesInDirectories() {
        return getFilesInDirectoriesFileTypeMatch("MF");
    }

    public List<File> getJsonFilesInDirectories() {
        return getFilesInDirectoriesFileTypeMatch("json");
    }

    public List<File> getXmlFilesInDirectories() {
        return getFilesInDirectoriesFileTypeMatch("xml", "XML");
    }

    public List<File> getDrawableResourceFiles() {
        return getFilesInDirectoriesFileTypeMatch(".jpg", ".jpeg", ".JPG", ".JPEG", ".gif", ".GIF", "png", "PNG", ".xml", ".XML");
    }

    public List<File> getFilesInDirectoriesFileTypeMatch(String... typeFilter) {
        files = new ArrayList<File>();
        for (File directory : searchedFolders) {
            getFilesInDirectoryFileTypeMatch(directory, typeFilter);
        }
        return files;
    }

    private void getFilesInDirectoryFileTypeMatch(File directory, String... typeFilter) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                for (String type : typeFilter) {
                    if (file.getName().endsWith(type))
                        files.add(file);
                    //break;
                }
            } else if (file.isDirectory()) {
                getFilesInDirectoryFileTypeMatch(new File(file.getAbsolutePath()), typeFilter);
            }
        }
    }

    public List<File> getStringResourceFilesInDirectories() {
        files = new ArrayList<File>();
        for (File directory : searchedFolders) {
            getFilesInDirectoryFullNameMatch(directory, "strings.xml");
        }
        return files;
    }

    public void getFilesInDirectoryFullNameMatch(File directory, String... typeFilter) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                for (String type : typeFilter) {
                    if (file.getName().equals(type))
                        files.add(file);
                    break;
                }
            } else if (file.isDirectory()) {
                getFilesInDirectoryFullNameMatch(new File(file.getAbsolutePath()), typeFilter);
            }
        }
    }

    public List<File> getDirectoriesContainingExpression(String matchExpression) {
        files = new ArrayList<File>();
        for (File directory : searchedFolders) {
            getDirectoriesContainingExpression(directory, matchExpression);
        }
        return files;
    }

    private void getDirectoriesContainingExpression(File directory, String matchExpression) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isDirectory()) {
                if (file.getName().contains(matchExpression)) {
                    files.add(file);
                }
                getDirectoriesContainingExpression(new File(file.getAbsolutePath()), matchExpression);
            }
        }
    }

    public List<File> getDirectoriesStartsWithExpression(String matchExpression) {
        files = new ArrayList<File>();
        for (File directory : searchedFolders) {
            getDirectoriesStartsWithExpression(directory, matchExpression);
        }
        return files;
    }

    private void getDirectoriesStartsWithExpression(File directory, String matchExpression) {
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isDirectory()) {
                if (file.getName().startsWith(matchExpression)) {
                    files.add(file);
                }
                getDirectoriesStartsWithExpression(new File(file.getAbsolutePath()), matchExpression);
            }
        }
    }
}
