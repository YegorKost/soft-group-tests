package com.yegor.task4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 27.12.2016.
 */
public class ArrayOfOddNumbersTest {

    private ArrayOfOddNumbers arrayOfOddNumbers = new ArrayOfOddNumbers();
    private int[] array;

    @Test
    public void getArrayOfOddNumbers() throws Exception {
        System.out.println("Task 4 part 1 - print array of odd numbers: ");
        array = arrayOfOddNumbers.getArrayOfOddNumbers(1, 99);
        arrayOfOddNumbers.printArray(array);
        System.out.println();
    }

    @Test
    public void getInverseArray() throws Exception {
        System.out.println("Task 4 pert 2 - print inverse array: ");
        array = arrayOfOddNumbers.getArrayOfOddNumbers(1, 99);
        array = arrayOfOddNumbers.getInverseArray(array);
        arrayOfOddNumbers.printArray(array);
        System.out.println();
    }

}