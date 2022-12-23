package com.Abhaya;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
//        Scanner in = new Scanner(System.in);
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        System.out.println(target);
    }
}
