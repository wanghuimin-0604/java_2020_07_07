package com.company;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-07
 * Time:11:12
 * 一万年太久，只争朝夕，加油
 */
public class Main3 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw=new FileWriter("D:\\Javaweb课件\\3.JavaWeb\\a.txt",true);
            for(int i=0;i<20;i++){
                fw.write("hello\r\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
