package com.company;

import java.io.*;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:12:30
 * 一万年太久，只争朝夕，加油
 */
public class Main7 {
    public static void main(String[] args) throws IOException {
        //先创建一个hashMap来保存文本信息
        //key:行号
        //value:文本内容
        HashMap<String,String> map=new HashMap<>();
        //字符输入流、字符输出流
        //把源文件的数据读到内存中，再把内存中的数据写入到另一个文件中
        BufferedReader br=new BufferedReader(new FileReader("E:\\java_2020_07_07\\src\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\java_2020_07_07\\src\\d.txt"));
        String line;
        //说明没读到末尾
        while((line=br.readLine())!=null){
            //进行切割
            String[] arr=line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for(String key:map.keySet()){
            String value=map.get(key);
            line=key+"."+value;
            bw.write(line);
            //换行
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
