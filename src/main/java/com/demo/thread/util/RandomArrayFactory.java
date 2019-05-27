package com.demo.thread.util;

import java.util.Random;

public class RandomArrayFactory {
    public static int[] createIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            /*try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        return array;
    }
}
