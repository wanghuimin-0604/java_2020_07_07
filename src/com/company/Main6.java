package com.company;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:11:53
 * 一万年太久，只争朝夕，加油
 */
public class Main6 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("E:\\java_2020_07_07\\src\\b.txt");
        BufferedOutputStream bops=new BufferedOutputStream(fos,1024);
        bops.write("我把数据写入到内部缓冲区中".getBytes());
        bops.flush();
        bops.close();


    }
}
