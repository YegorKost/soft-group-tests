package com.yegor.task6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by YegorKost on 26.12.2016.
 */
public class NArray {

    public int[][] getNArray(int rows, int column, int minInclusive, int maxExclusive) {
        int[][] randomNumbers = new int[rows][column];

        Random random = new Random();

        for (int r = 0; r < rows; r++){
            for (int c = 0; c < column; c++){
                randomNumbers[r][c] = minInclusive + random.nextInt(maxExclusive - minInclusive);
            }
        }
        return randomNumbers;
    }

}
