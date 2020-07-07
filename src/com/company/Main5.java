package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:11:42
 * 一万年太久，只争朝夕，加油
 */
//load()
public class Main5 {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        Properties p=new Properties();
        FileReader fr=new FileReader("E:\\java_2020_07_07\\src\\a.txt");
        p.load(fr);
        Set<String> set=p.stringPropertyNames();
        for(String key:set){
            String value=p.getProperty(key);
            System.out.println(key+"="+value);

        }
        fr.close();
    }
}
