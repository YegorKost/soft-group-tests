package com.yegor.task1and3;

/**
 * Created by YegorKost on 26.12.2016.
 */
public class OddNumbers {

    public void printOddNumbersWithFor(int min, int max) {
        for (int i = min; i <= max; i++){
            if (i%2 != 0)
                System.out.print(i + ", ");
        }
    }

    public void printOddNumbersWithWhile(int min, int max){
        while ((max - min) >= 0){
            if (min%2 != 0)
                System.out.print(min + "; ");
            min++;
        }
    }
}
