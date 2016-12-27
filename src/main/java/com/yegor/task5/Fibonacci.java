package com.yegor.task5;

import java.util.Arrays;

/**
 * Created by YegorKost on 26.12.2016.
 */
public class Fibonacci {

    private int[] fibonacciOrder;

    public int[] getFibonacciOrder(int n) {

        if (n > 0){
            fibonacciOrder = new int[n];
            fibonacciOrder[0] = 1;
            int penultimateNumber = 0;
            for (int i = 1; i < n;){
                fibonacciOrder[i] = penultimateNumber + fibonacciOrder[i-1];
                i++;
                penultimateNumber = fibonacciOrder[i-2];
            }
        } else {
            System.out.println("Enter the number more then zero");
        }
        return fibonacciOrder;
    }

}
