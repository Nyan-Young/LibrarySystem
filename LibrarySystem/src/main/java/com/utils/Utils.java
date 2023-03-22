package com.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utils {
    public static void main(String[] args) {
        Utils utils=new Utils();
        System.out.println(utils.webapp());
    }
    public String webapp(){
        String classpath = "";
        classpath = this.getClass().getResource("/").getPath().replaceFirst("/", "");
        // 把WEB-INF/classes截取
        String webappRoot = classpath.replaceAll("WEB-INF/classes/", "");
        // 拼接文件目录
        return webappRoot;
    }
    public static List<String> getImageHistogram(File f1) {
        ImageHistogram histogram = new ImageHistogram();
        List<String> l = new ArrayList<String>();
        try {
            File f = new File("D:\\JAVA\\LibrarySystem\\target\\LibrarySystem-1.0-SNAPSHOT\\books");
            File imgs[] = f.listFiles();
            Map<String, Double> temp = new LinkedHashMap<>();
            //  循环遍历
            for(int i = 0; i<imgs.length; i++){
                File f2 = imgs[i];
                double score = histogram.match(f1, f2);
                temp.put(f2.getName().split("\\.")[0], score);
            }
            Map<String, Double> sortMap = MapSort.sortMapByValues(temp);
            String[] temp0 = sortMap.keySet().toArray(new String[0]);
            l.add(temp0[0]);
            l.add(temp0[1]);
            l.add(temp0[2]);
            System.out.println(l.get(0));
            System.out.println(l.get(1));
            System.out.println(l.get(2));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }
    public final static File transferToFile(MultipartFile multipartFile) {
        //选择用缓冲区来实现这个转换即使用java 创建的临时文件 使用 MultipartFile.transferto()方法 。
        File file = null;
        try {
            String originalFilename = multipartFile.getOriginalFilename();
            String[] filename = originalFilename.split("\\.");
            file = File.createTempFile("temp" + UUID.randomUUID(), filename[1]);    //注意下面的 特别注意！！！
            multipartFile.transferTo(file);
            file.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
