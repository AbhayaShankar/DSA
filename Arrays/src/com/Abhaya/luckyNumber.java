package com.Abhaya;
import java.util.*;

public class luckyNumber {
    public static void main(String[] args) {
        // 1380. Lucky Numbers in a Matrix
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int minIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
        int min = 100000;
            int max = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }

            }
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][minIndex] > max){
                    max = matrix[j][minIndex];
                }
            }

            if (max == min){
                result.add(max);
            }
        }
        return result;
    }
}
