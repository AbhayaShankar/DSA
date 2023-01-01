package com.Abhaya;

public class orderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-81,-35,-12,-5,0,1,4,11,23,30,42,75};
        int[] arr = {81,35,12,5,0,-1,-4,-11,-23,-30,-42,-75};
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }

//        boolean isAsc;
//        if (arr[start] < arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }
        // it can be written as this also:

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
