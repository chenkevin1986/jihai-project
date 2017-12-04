package com.jihai.mengmian.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Created by kevinchen on 2017/2/28.
 */
public class JarUtils {
    static String jarPath ="/Users/kevinchen/.gradle/caches/modules-2/files-2.1/com.alibaba/druid/1.0.18/9e4da3cbebad34c9eb3900ef9dc30cb4a60cffe0/druid-1.0.18.jar";
    static String jarPath1 ="/Users/kevinchen/.gradle/caches/modules-2/files-2.1/com.alibaba/druid/1.0.18/9e4da3cbebad34c9eb3900ef9dc30cb4a60cffe0/druid-1.0.18.jar";

    private static List getClassesFromJARFile(String jar, String packageName){
        final List classes = new ArrayList();
        JarInputStream jarFile = null;
        try {
            jarFile = new JarInputStream(new FileInputStream(jar));
            JarEntry jarEntry;
            do {
                try {
                    jarEntry = jarFile.getNextJarEntry();
                } catch(IOException ioe) {
                    throw new RuntimeException("Unable to get next jar entry from jar file '"+jar+"'", ioe);
                }
                if (jarEntry != null) {
                    extractClassFromJar(jar, packageName, classes, jarEntry);
                }
            } while (jarEntry != null);
            closeJarFile(jarFile);
        } catch(IOException ioe) {
            throw new RuntimeException("Unable to get Jar input stream from '"+jar+"'", ioe);
        } finally {
            closeJarFile(jarFile);
        }
        return classes;
    }


    private static void extractClassFromJar(final String jar, final String packageName, final List classes, JarEntry jarEntry){
        String className = jarEntry.getName();
        if (className.endsWith(".class")) {
            className = className.substring(0, className.length() - ".class".length());
            if (className.startsWith(packageName)) {
                try {
                    classes.add(Class.forName(className.replace('/', '.')));
                } catch (ClassNotFoundException cnfe) {
                    throw new RuntimeException("unable to find class named " + className.replace('/', '.') + "' within jar '" + jar + "'", cnfe);
                }
            }
        }
    }



    private static void closeJarFile(final JarInputStream jarFile) {
        if(jarFile != null) {
            try {
                jarFile.close();
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    private static List<String> getStaticResources(String jarPath,String resources,String replaceName){
        final List<String> statics = new ArrayList<String>();
        JarInputStream jarFile = null;
        JarEntry jarEntry =null;
        try {
            jarFile = new JarInputStream(new FileInputStream(jarPath));
            do {
                jarEntry = jarFile.getNextJarEntry();
                if (jarEntry != null && jarEntry.getName().startsWith(resources)){
                    statics.add(jarEntry.getName().replace(resources,replaceName));
                }
            }while (jarEntry != null);
            closeJarFile(jarFile);
        } catch(IOException ioe) {
            throw new RuntimeException("Unable to get Jar input stream from '"+jarPath+"'", ioe);
        } finally {
            closeJarFile(jarFile);
        }
        return statics;
    }

    public static void main(String[] args) {
         //getStaticResources(jarPath, "support/http/resources","druid");
        List<String> druid = getStaticResources(jarPath, "support/http/resources", "druid");
        System.out.println(druid);

    }

}
