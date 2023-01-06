package com.Abhaya;

public class searchInRotatedArray {
    public static void main(String[] args) {
        // 33. Search in Rotated Sorted Array
        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 0;
        int ans = pivot(nums);
        System.out.println(ans);
    }

    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start &&  nums[mid]< nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr , int target , int start , int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int pivot = pivot(nums);
        if (pivot == -1){
            // array is not rotated.
            return binarySearch(nums , target , 0 , nums.length -1);
        }
        // if pivot is found, we have gotten two asc sorted arrays.
        if (nums[pivot] == target){
            return pivot;
        }
        if (target > nums[start]){
            return binarySearch(nums , target , 0 , pivot -1);
        } else{
            return binarySearch(nums , target , pivot +1 , end );
        }
    }
}
