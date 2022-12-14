package com.Abhaya;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[1] = 34; // modifying the existing array. not changing the object.
        //If you make a change to the object via this ref variable, same object will be changed.
//        nums = new int[]{92, 23, 453};
    }


}
