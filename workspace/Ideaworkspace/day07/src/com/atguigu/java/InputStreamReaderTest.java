package com.atguigu.java;

import org.junit.Test;

import java.io.*;


public class InputStreamReaderTest {
    //综合使用InputStreamReader和OutputStreamWriter
        @Test
        public void test() throws IOException {
            InputStreamReader isr = null;
            OutputStreamWriter osw = null;
            try {
                //1.造文件
                File file1 = new File("D:\\workspace\\Ideaworkspace\\day07\\src\\hello.txt");
                File file2 = new File("D:\\workspace\\Ideaworkspace\\day07\\src\\hello_gbk .txt");
                //1.1 造流
                FileInputStream fis = new FileInputStream(file1);
                FileOutputStream fos = new FileOutputStream(file2);
                //1.2 转换流
                isr = new InputStreamReader(fis,"utf-8");//将输入的字节流转换为输入的字符流
                osw = new OutputStreamWriter(fos,"gbk");//将输出的字符流转换为输出的字节流

                //2.读写过程
                char[] cbuf = new char[20];
                int len;
                while((len = isr.read(cbuf)) != -1){
                    osw.write(cbuf,0,len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //3.关闭资源
                if (isr != null){
                    try {
                        isr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (osw != null){
                    try {
                        osw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }


        }

}
