package com.company;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileReader 文件字符输入流  把硬盘文件中的数据读入内存中
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        /*int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);

        }*/
        char[] cs=new char[1024];
        int len=0;
        while((len=fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
    }
}
