package com.Abhaya;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] nums = {3,0,8,9};
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

        System.out.println( res);
    }
}
