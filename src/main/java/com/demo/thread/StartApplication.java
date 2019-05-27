package com.demo.thread;

import com.demo.thread.threadclass.Demo1;
import com.demo.thread.threadclass.Demo2;
import com.demo.thread.util.RandomArrayFactory;

import java.util.Random;

public class StartApplication {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2(RandomArrayFactory.createIntArray(5));
        Thread thread1 = new Thread(demo2);
        thread1.start();
        Thread thread2 = new Thread(demo2);
        thread2.start();
        Thread thread3 = new Thread(demo2);
        thread3.start();
        System.out.println(Thread.currentThread().getName()+"____args = [" + args + "]");
    }
}
