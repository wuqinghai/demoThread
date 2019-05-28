package com.demo.thread;

import com.demo.thread.threadclass.DemoCallable;
import com.demo.thread.threadclass.DemoThread;
import com.demo.thread.util.RandomArrayFactory;

import java.util.Arrays;
import java.util.concurrent.FutureTask;

public class StartApplication {
    public static void main(String[] args) {

        int[] array0 = RandomArrayFactory.createIntArray(5);
        int[] array1 = RandomArrayFactory.createIntArray(5);
        int[] array2 = RandomArrayFactory.createIntArray(5);

        // 创建线程去计算array0的和
        Thread thread0 = new DemoThread(array0);
        thread0.start();
        System.out.println(Thread.currentThread().getName()+"业务逻辑0");
        System.out.println(Thread.currentThread().getName()+"业务逻辑1");
        System.out.println(Thread.currentThread().getName()+"业务逻辑2");
        /*// 创建线程去计算array1的和
        Thread thread1 = new DemoThread(array1);
        thread1.start();
        // main线程计算array2的和
        System.out.println(Thread.currentThread().getName()+"数组为"+ Arrays.toString(array2));
        int sum = 0;
        for (int i : array2) {
            sum = sum + i;
        }
        System.out.println(Thread.currentThread().getName()+"&&&数组求和为："+sum);*/

        /* DemoRunnable demo2 = new DemoRunnable(RandomArrayFactory.createIntArray(5));
        Thread thread1 = new Thread(demo2);
        thread1.start();
        Thread thread2 = new Thread(demo2);
        thread2.start();
        Thread thread3 = new Thread(demo2);
        thread3.start();
        System.out.println(Thread.currentThread().getName()+"____args = [" + args + "]");*/

        /*DemoCallable demoCallable = new DemoCallable(RandomArrayFactory.createIntArray(5));
        // 等同于创建一个runnable接口实现类的对象，只不过这个对象能得到线程执行的结果。
        FutureTask<Integer> futureTask = new FutureTask<Integer>(demoCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("主线程在执行任务开始，call线程也在执行");
        try {
            System.out.println("task运行结果1---"+futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("主线程在执行任务1");
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("主线程在执行任务2");
        try {
            System.out.println("task运行结果2---"+futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("所有任务执行完毕");*/





    }
}
