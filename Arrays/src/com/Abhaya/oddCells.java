package com.Abhaya;

import java.util.Arrays;

public class oddCells {
    public static void main(String[] args) {
        // 1252. Cells with Odd Values in a Matrix
//        int m = 2;
//        int n = 3;
//        int [][] indices = {{0,1} , {1,1}};
//        int[][] res = new int[m][n];
//        for (int i = 0; i < indices.length; i++) {
//            for (int j = 0; j < indices[i].length; j++) {
//                res[indices[i][j]][j] += 1;
//            }
//        }
//        for (int i = 0; i < indices.length; i++) {
//            for (int j = 0; j < indices[i].length; j++) {
//                System.out.println(res[i][j]);
//            }
//        }
//        System.out.println(res);
    }

    public int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int count =0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                res[indices[i][0]][j] += 1;
            }
            for (int j = 0; j < m; j++) {
                res[j][indices[i][1]] += 1;
            }
        }

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] % 2 != 0){
                    count+=1;
                }
            }
        }
        return count;
    }
}
