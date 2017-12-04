package com.jihai.mengmian.zip;

import com.jihai.mengmian.utils.common.LOG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * 通过Java的Zip输入输出流实现压缩和解压文件
 *
 * @Author: laiqiuhua.
 * @Date: 2017/9/8 10:45.
 */
public final class ZipUtil {

    private ZipUtil() {}

    /**
     * 压缩文件-由于out要在递归调用外,所以封装一个方法用来
     * 调用ZipFiles(ZipOutputStream out,String path,File... srcFiles)
     * @param zip
     * @param path
     * @param srcFiles
     * @throws IOException
     */
    public static void ZipFiles(File zip,String path,File... srcFiles) throws IOException{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zip));
        ZipFiles(out,path,srcFiles);
        out.close();
        LOG.info(ZipUtil.class, "*****************压缩完毕*******************");
    }

    /**
     * 压缩文件-File
     * @param out
     * @param path
     * @param srcFiles
     */
    public static void ZipFiles(ZipOutputStream out,String path,File... srcFiles){
        path = path.replaceAll("\\*", "/");
        if(!path.endsWith("/")){
            path+="/";
        }
        byte[] buf = new byte[1024];
        try {
            for(int i=0;i<srcFiles.length;i++){
                if(srcFiles[i].isDirectory()){
                    File[] files = srcFiles[i].listFiles();
                    String srcPath = srcFiles[i].getName();
                    srcPath = srcPath.replaceAll("\\*", "/");
                    if(!srcPath.endsWith("/")){
                        srcPath+="/";
                    }
                    out.putNextEntry(new ZipEntry(path+srcPath));
                    ZipFiles(out,path+srcPath,files);
                }
                else{
                    FileInputStream in = new FileInputStream(srcFiles[i]);
                    System.out.println(path + srcFiles[i].getName());
                    out.putNextEntry(new ZipEntry(path + srcFiles[i].getName()));
                    int len;
                    while((len=in.read(buf))>0){
                        out.write(buf,0,len);
                    }
                    out.closeEntry();
                    in.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 解压到指定目录
     * @param zipPath
     * @param descDir
     */
    public static void unZipFiles(String zipPath,String descDir)throws IOException{
        unZipFiles(new File(zipPath), descDir);
    }
    /**
     * 解压文件到指定目录
     * @param zipFile
     * @param descDir
     */
    public static void unZipFiles(File zipFile,String descDir) throws IOException{
        File pathFile = new File(descDir);
        if(!pathFile.exists()){
            forceMkdir(pathFile);
        }
        ZipFile zip = new ZipFile(zipFile);
        for(Enumeration entries = zip.entries(); entries.hasMoreElements();){
            ZipEntry entry = (ZipEntry)entries.nextElement();
            String zipEntryName = entry.getName();
            String outPath = (descDir+zipEntryName);
            //判断路径是否存在,不存在则创建文件路径
            File file = new File(outPath);

            // 目录直接创建
            if(entry.isDirectory()) {
                forceMkdir(file);
                continue;
            }
            InputStream in = zip.getInputStream(entry);

            OutputStream out = new FileOutputStream(outPath);
            byte[] buf1 = new byte[1024];
            int len;
            while((len=in.read(buf1))>0){
                out.write(buf1,0,len);
            }
            in.close();
            out.close();
        }
        LOG.info(ZipUtil.class, "******************解压完毕********************");
    }

    public static void forceMkdir(File directory) throws IOException {
        String message;
        if(directory.exists()) {
            if(directory.isFile()) {
                message = "File " + directory + " exists and is " + "not a directory. Unable to create directory.";
                throw new IOException(message);
            }
        } else if(!directory.mkdirs()) {
            message = "Unable to create directory " + directory;
            throw new IOException(message);
        }

    }

}
