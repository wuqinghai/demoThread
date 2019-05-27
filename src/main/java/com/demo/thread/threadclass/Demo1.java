package com.demo.thread.threadclass;

import java.util.Arrays;

public class Demo1 extends Thread {

    private int[] array;
    public Demo1(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        // 业务处理逻辑，对数组求和
        //int[] array = {1,2,3,4,5};
        System.out.println(Thread.currentThread().getName()+"数组为"+ Arrays.toString(this.array));
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println(Thread.currentThread().getName()+"&&&数组求和为："+sum);
    }
}
