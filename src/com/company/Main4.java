package com.company;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:11:26
 * 一万年太久，只争朝夕，加油
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    private static void show03() throws IOException {
        //创建集合对象
        Properties properties=new Properties();
        properties.setProperty("赵丽颖","168");
        properties.setProperty("迪丽热巴","165");
        properties.setProperty("古力娜扎","160");
        FileOutputStream fos=new FileOutputStream("E:\\java_2020_07_07\\src\\b.txt");
        properties.store(fos,"save data");
        fos.close();


    }

    //store()把硬盘中的数据写入到硬盘中
    private static void show02() throws IOException {
        //创建集合对象
        Properties properties=new Properties();
        properties.setProperty("赵丽颖","168");
        properties.setProperty("迪丽热巴","165");
        properties.setProperty("古力娜扎","160");
        //创建输出流，绑定目的地
        FileWriter fw=new FileWriter("E:\\java_2020_07_07\\src\\a.txt");
        //使用方法
        properties.store(fw,"save data");
        //关闭
        fw.close();
    }

    //使用Properties集合存储数据
    private static void show01() {
        Properties properties=new Properties();
        properties.setProperty("赵丽颖","168");
        properties.setProperty("迪丽热巴","165");
        properties.setProperty("古力娜扎","160");

        Set<String> set=properties.stringPropertyNames();

        for(String key:set){
            String value=properties.getProperty(key);
            System.out.println(key+"="+value);
        }

    }
}
