package com.Abhaya;

public class diagMatrixSum {
    public static void main(String[] args) {
        // 1572. Matrix Diagonal Sum
    }
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][mat.length-i-1];
            sum = sum + mat[i][i];
            if (i == mat.length-i-1){
                sum = sum - mat[i][i];
            }
        }
        return sum;
    }
}
