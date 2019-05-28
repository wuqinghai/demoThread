package com.demo.thread.threadclass;

import java.util.Arrays;

public class DemoRunnable implements Runnable {

    private int[] array;
    public DemoRunnable(int[] array) {
        this.array = array;
    }

    public void run() {
        // 业务处理逻辑，对数组求和
        System.out.println(Thread.currentThread().getName()+"数组为"+ Arrays.toString(this.array));
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println(Thread.currentThread().getName()+"&&&数组求和为："+sum);
    }
}
