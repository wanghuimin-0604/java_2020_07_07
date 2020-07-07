package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:10:54
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        fw.write(97);
        fw.close();
    }
}
