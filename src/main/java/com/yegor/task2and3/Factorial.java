package com.yegor.task2and3;

/**
 * Created by YegorKost on 26.12.2016.
 */
public class Factorial {

    public void printFactorialWithFor(int n){
        if (n > 0){
            long result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            System.out.println(n + "! = " + result);
        } else {
            System.out.println("The number is less or equal to zero");
        }

    }

    public void printFactorialWithWile(int n){
        int numberForFactorial = n;
        if (n > 0){
            long result = 1;
            while (n > 0){
                result *= n--;
            }
            System.out.println(numberForFactorial + "! = " + result);
        } else {
            System.out.println("The number is less or equal to zero");
        }

    }

}
