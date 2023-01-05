package com.Abhaya;

public class mountainPeakElement {
    public static void main(String[] args) {
        // 852. Peak Index in a Mountain Array
        int[] arr = {1,2,10,8,6,5,4,3,2,1};
        int ans1 = peakIndexInMountainArray(arr);
        int ans2 = peakIndexInMountainArray2(arr);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == 0){
                if(arr[mid+1] > arr[mid]){
                    return mid + 1;
                }else{
                    return mid;
                }
            }
            else if(arr[mid-1] > arr[mid]){
                end = mid - 1;
            }else if(arr[mid+1] > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray2(int[] arr) {
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
}
