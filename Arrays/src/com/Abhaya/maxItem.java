package com.Abhaya;

public class maxItem {
    public static void main(String[] args) {
        int[] arr = {12,34,45,-220,42,75,42};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
    // writing edge cases here :
    static int maxRange(int[] arr, int start, int end){
        int maximum = arr[start];
        if (end < start){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    static int max(int[] arr){
        int maximum = 0;
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
