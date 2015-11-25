package sk.styk.martin.bakalarka.decompile;

import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.directory.DirectoryException;

import java.io.File;
import java.io.IOException;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkDecompiler {

    private File apkFile;

    public ApkDecompiler(File apkFile) {
        if (apkFile == null) {
            throw new NullPointerException("apkFile is null!");
        }
        if (!apkFile.exists()) {
            throw new IllegalArgumentException("apkFile doesn`t exists");
        }
        this.apkFile = apkFile;
    }

    public void decompile(){
        decompile(true);
    }

    public void decompile(boolean arsc) {
        ApkDecoder decoder = new ApkDecoder();
        decoder.setApkFile(apkFile);
        decoder.setForceDelete(true);

        String outDirName = apkFile.getName();
        outDirName = outDirName.substring(0, outDirName.length() - 4);


        if(!arsc){
            try {
                decoder.setDecodeResources((short)256);
            } catch (AndrolibException e) {
                e.printStackTrace();
            }
        }

        try {
            decoder.setOutDir(new File("D:\\Projects\\ApkToolTest\\" + outDirName));
        } catch (AndrolibException e) {
            e.printStackTrace();
        }

        try {
            decoder.decode();
        } catch (AndrolibException e) {
            e.printStackTrace();
            if(e.getMessage().contains("arsc")){
                decompile(false);
            }
        } catch (DirectoryException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
