package com.company;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:12:54
 * 一万年太久，只争朝夕，加油
 */
//InputStreamReader  把字节转换成字符（解码）
//OutputStreamWriter  把字符转换成字节（编码）

public class Main8 {
    public static void main(String[] args)throws IOException {
       // OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("D:\\Javaweb课件\\3.JavaWeb\\a.txt"),"utf-8");
        InputStreamReader is=new InputStreamReader(new FileInputStream("D:\\Javaweb课件\\3.JavaWeb\\a.txt"),"utf-8");
       // os.write("你好");
        int len=0;
        while((len=is.read())!=-1) {
            System.out.print((char)len);
        }
        //os.flush();
        is.close();

    }
}
