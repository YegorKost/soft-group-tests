package com.yegor.task6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 27.12.2016.
 */
public class NArrayTest {

    @Test
    public void getNArray() throws Exception {
        System.out.println("Task 6 - create and print a two-dimensional array:");
        NArray nArray = new NArray();
        System.out.println(Arrays.deepToString(nArray.getNArray(8, 5, 10, 100)));
        System.out.println();
    }

}