package com.atguigu.java;

/*多线程*/
//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类的run()-->将此线程执行的操作声明在run()中

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }

    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //4.通过此对象调用start()
        //Start方法有两个作用：①启动当前线程②调用当前线程的run()
        t1.start();

        for(int i = 0;i<100;i++){
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }

}
