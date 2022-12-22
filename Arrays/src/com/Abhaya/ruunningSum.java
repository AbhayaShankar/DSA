package com.Abhaya;

public class ruunningSum {
    public static void main(String[] args) {
        //1480. Running Sum of 1d Array
    }
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sums[i] = nums[i] + sum;
            sum = sums[i];

        }
        return sums;
    }
}
