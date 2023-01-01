package com.Abhaya;

public class searchInRange {
    public static void main(String[] args) {
       int arr[] = {5,7,-14,24,7,9,33,-8,40};
       int target = -14;
       int start = 3;
       int end = 5;
       int ans = inRange(arr , target , start , end);
        System.out.println(ans);
    }

    static int inRange(int[] arr , int target,  int start  , int end){
        for (int index = start ; index < end; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
