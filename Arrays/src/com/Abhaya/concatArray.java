package com.Abhaya;

public class concatArray {
    public static void main(String[] args) {
        //1929. Concatenation of Array
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
           if(i < nums.length){
               ans[i] = nums[i];
           }
           if (i >= nums.length && i < ans.length){
               ans[i] = nums[i - nums.length];
           }
        }
        return ans;
    }
}
