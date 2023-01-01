package com.Abhaya;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {23,35,12},
                {45,67,88,103}
        };
        int target = 89;
        int ans = searchin2darrays(arr,target);
        int[] ans2 = searchin2darrays2(arr,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans2));

    }

    static int searchin2darrays(int [][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return arr[i][j];
                }
            }
        }
        return -1;
    }


    static int[] searchin2darrays2(int [][] arr , int target){
        int [] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[] {i,j};

                }
            }
        }
        return new int[] {-1,-1};
    }


}
