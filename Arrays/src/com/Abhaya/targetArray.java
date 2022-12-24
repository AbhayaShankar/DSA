package com.Abhaya;

import java.util.ArrayList;

public class targetArray {
    public static void main(String[] args) {
        //1389. Create Target Array in the Given Order
    }
    public ArrayList<Integer> createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
            target.size();
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = target.get(i);
        }
        return target;
    }

//    public int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = new int[nums.length];
//
//    }
}
