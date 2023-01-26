package org.example;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int [] arr = {-2,5,6,7,9,3};
        System.out.println(evenSum(arr));
    }

    public static int evenSum(int [] arr){
        int sum = 0;
        for (int i: arr ){
            if(i > 0) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
