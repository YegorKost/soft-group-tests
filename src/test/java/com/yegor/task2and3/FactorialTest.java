package com.yegor.task2and3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YegorKost on 27.12.2016.
 */
public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void printFactorialWithFor() throws Exception {
        System.out.println("Task 2 (with for loop): ");
        factorial.printFactorialWithFor(7);
        System.out.println();
    }

    @Test
    public void printFactorialWithWile() throws Exception {
        System.out.println("Task 3 part 2 (with while loop): ");
        factorial.printFactorialWithWile(7);
        System.out.println();
    }

}