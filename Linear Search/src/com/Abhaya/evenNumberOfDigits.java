package com.Abhaya;

public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,7,1246,432};
        int ans = evendigits(nums);
        System.out.println(ans);
    }


    static int evendigits(int[] nums){
        int count=0;
        for(int n : nums){
            int ans = (int) (Math.log10(n) + 1);
            if(ans % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
