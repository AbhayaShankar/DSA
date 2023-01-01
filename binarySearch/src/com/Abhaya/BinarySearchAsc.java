package com.Abhaya;

public class BinarySearchAsc {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] arr = {2,4,7,12,19,20,31,44,56,69};
        int target = 6;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        if(arr.length == 0){
            return -1;
        }

        while(start <= end) {
            int mid = start +(end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}