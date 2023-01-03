package com.Abhaya;

public class floorOfNumber {
    public static void main(String[] args) {
        int[] nums = {1,10};
        int target = 8 ;
        int ans = searchInsert(nums , target);
        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        boolean isAsc;
        if (nums[start] < nums[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        if (target > nums[end]) {
            return end ;
        }
        if (target <= nums[start]) {
            return -1;
        }

        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}
