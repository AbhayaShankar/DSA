package com.Abhaya;

import java.util.Arrays;

public class firstLastElement {
    public static void main(String[] args) {
        // 34. Find First and Last Position of Element in Sorted Array
        int[] nums = {8,8,8,8,8,8};
        int target = 8;
        int[] ans = searchRange(nums , target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        if(nums.length == 0){
            return ans;
        }
        int start = search(nums , target , true);
        int end = search(nums , target , false);
        ans[0] = start;
        ans[1] = end;
        return ans;


    }


    static int search(int[] nums , int target , boolean startIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
