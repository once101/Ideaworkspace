package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {
    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1.造流造对象
            oos = new ObjectOutputStream(new FileOutputStream("Object.dat"));
            //2.写出的过程
            oos.writeObject(new String("我爱北京"));
            oos.flush();//刷新操作

            oos.writeObject(new Person("谢家辉",22));//传Person类的对象
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                //3.关闭流
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    /*
    反序列化：将磁盘文件中的对象还原为内存中的一个java对象
    使用ObjectInpitStream来实现
    */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Object.dat"));

            Object obj = ois.readObject();
            String str = (String)obj;

            Person p = (Person) ois.readObject();//强转上面写出的person类

            System.out.println(str);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {

                }
            }
        }




    }
}
