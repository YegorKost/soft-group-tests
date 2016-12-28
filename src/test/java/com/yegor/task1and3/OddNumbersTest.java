package com.yegor.task1and3;

import org.junit.Test;

/**
 * Created by YegorKost on 27.12.2016.
 */
public class OddNumbersTest {

    private OddNumbers oddNumbers = new OddNumbers();

    @Test
    public void printOddNumbersWithFor() throws Exception {
        System.out.println("Task 1 (with for loop): ");
        oddNumbers.printOddNumbersWithFor(1, 99);
        System.out.println("\n");
    }

    @Test
    public void printOddNumbersWithWile() throws Exception {
        System.out.println("Task 3 part 1 (with while loop): ");
        oddNumbers.printOddNumbersWithWhile(1, 99);
        System.out.println("\n");
    }

}