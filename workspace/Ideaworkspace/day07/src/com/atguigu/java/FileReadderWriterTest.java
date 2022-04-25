package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadderWriterTest {

    @Test
    public void testFileReader()  {
        FileReader fr = null;
        try {
            File file1 = new File("D:\\workspace\\Ideaworkspace\\day07\\src\\hello.txt");
            fr = new FileReader(file1);

            int data = fr.read();
            while (data != -1){
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
