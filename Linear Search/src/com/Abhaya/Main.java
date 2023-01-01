package com.Abhaya;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,-14,24,7,9,33,-8,40};
        int target = 99;
        int ans = linearSearch(arr, target);
        int ans2 = linearSearch2(arr, target);
        boolean ans3 = linearSearch3(arr, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    // search the array and return index of the target element.
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }

        return -1;
    }

    // foreach loop or Modified for loop :
    // search the array and return the target element.
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for(int num : arr){
            if (num == target){
                return num;
            }
        }

        return Integer.MAX_VALUE;
    }

    // search the array and return the target element.
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for(int num : arr){
            if (num == target){
                return true;
            }
        }

        return false;
    }

}
