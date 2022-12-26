package com.Abhaya;
import  java.util.*;
public class twoSum {
    public static void main(String[] args) {
        // 1. Two Sum
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = count.get(target - nums[i]);
                return result;
            }
            count.put(nums[i], i);
        }
        return result;

    }
}
