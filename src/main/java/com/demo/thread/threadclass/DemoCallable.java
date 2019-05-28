package com.demo.thread.threadclass;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class DemoCallable implements Callable<Integer> {

    private int[] array;
    public DemoCallable(int[] array) {
        this.array = array;
    }


    public Integer call() {
        // 业务处理逻辑，对数组求和
        System.out.println(Thread.currentThread().getName()+"数组为"+ Arrays.toString(this.array));
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"&&&数组求和为："+sum);
        return sum;
    }
}
