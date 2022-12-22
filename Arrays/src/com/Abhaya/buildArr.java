package com.Abhaya;

public class buildArr {
    public static void main(String[] args) {
        // Leetcode 1920. Build Array from Permutations
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
