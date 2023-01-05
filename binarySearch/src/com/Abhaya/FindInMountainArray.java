package com.Abhaya;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        // 1095. Find in Mountain Array
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        int element = search(arr , target);
        System.out.println(element);
    }

    static int search(int[] arr , int target) {
        int ans = findPeakElement(arr);
        int start = 0;
        int result = binarySearch(arr, target, start, ans);
        if(result != -1){
            return result;
        }
        return binarySearch(arr , target , ans+1 , arr.length-1);
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr , int target , int start , int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
