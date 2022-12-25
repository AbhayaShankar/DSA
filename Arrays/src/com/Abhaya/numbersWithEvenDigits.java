package com.Abhaya;

public class numbersWithEvenDigits {
    public static void main(String[] args) {
        // 1295. Find Numbers with Even Number of Digits
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int len = str.length();
            if (len % 2 == 0){
                count+=1;
            }
        }
        return count;
    }
}
