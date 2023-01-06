package com.Abhaya;

public class CountRotationInSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,0,1,2,3};
        int ans = pivot(nums);
        if (ans == -1){
            System.out.println(0);
        }else{
            System.out.println(ans+1);
        }
    }
    // For sorted rotated array having unique values.
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
    // for sorted rotated array having duplicate values.
    static int pivot2(int[] nums){
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
            if (nums[mid] ==  nums[start] && nums[mid] == nums[end]){
                if(nums.length == 1){
                    return mid;
                }
                if (start < mid && nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (end > mid && nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
