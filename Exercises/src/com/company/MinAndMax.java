package com.company;

public class MinAndMax  {
    int i ;
    int max;
    int min;
    public MinAndMax(int[]arr){
        this.max = arr[0];
        this.min = arr[0];
    }
    public int min(){
        for (i = 1; i < arr.length; i++) {
            System.out.println(arr.length);
            if(min>arr[i]){
                min = arr[i];
            }
        }return min;
    }

    public int max(){
//        this.max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }return max;
    }
}
