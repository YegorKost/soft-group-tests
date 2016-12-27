package com.yegor.task4;

import java.util.*;

/**
 * Created by YegorKost on 26.12.2016.
 */
public class ArrayOfOddNumbers {

    public int[] getArrayOfOddNumbers(int min, int max) {

        List<Integer> integerList = new ArrayList<Integer>();
        while (max-min >= 0){
            if (min%2 != 0)
                integerList.add(min);
            min++;
        }
        int index = 0;
        int[] array = new int[integerList.size()];
        for (int i: integerList) {
            array[index++] = i;
        }
        return array;
    }

    public int[] getInverseArray(int[] arrayToInverse) {

        int arraySize = arrayToInverse.length;
        int[] inverseArray = new int[arraySize];
        for (int i = arraySize; i > 0; i--){
            inverseArray[arraySize-i] = arrayToInverse[i-1];
        }
        return inverseArray;
    }

    public void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

}
