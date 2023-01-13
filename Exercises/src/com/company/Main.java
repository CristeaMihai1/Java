package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int arr[] = {6, 9, 66, 4, 999, 998, 29, 63, 90, 765, 890, 892};
        int i;
        MinAndMax minAndMax = new MinAndMax(arr);
        int minValue = minAndMax.min();
        int maxValue = minAndMax.max();
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);


//        System.out.println("Max number is: " + max);
//        System.out.println("Min number is: " + min);
        Sorter.sortArray(arr);
        for (i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
        }

    }
}