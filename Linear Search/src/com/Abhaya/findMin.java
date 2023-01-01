package com.Abhaya;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {5,7,-14,24,7,9,33,-8,40};
        int result = minimum(arr);
        System.out.println(result);
    }

    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] < min){
                min = arr[index];
            }
        }
        return min;
    }
}
