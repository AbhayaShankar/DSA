package com.Abhaya;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        //1365. How Many Numbers Are Smaller Than the Current Number
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (j != i && nums[j] < nums[i]){
                    count+=1;
                }
            }
            result[i] = count;
        }
        return result;
    }
// Optimised solution using hashing
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }
}
