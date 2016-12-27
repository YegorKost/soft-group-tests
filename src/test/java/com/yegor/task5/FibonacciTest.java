package com.yegor.task5;

import com.yegor.task2and3.Factorial;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 27.12.2016.
 */
public class FibonacciTest {

    @Test
    public void getFibonacciOrder() throws Exception {
        System.out.println("Task 5 - print the first numbers of Fibonacci order: ");
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(Arrays.toString(fibonacci.getFibonacciOrder(20)));
        System.out.println();
    }

}