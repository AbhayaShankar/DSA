package com.Abhaya;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*

            1 2 3
            4 5 6
            7 8 9

         */

//        int[][] arr = new int[3][];
//        System.out.println(arr.length);
        // Defining row in arr is mandatory. If we dont pass columns also no worries.
//        arr = int[rows][columns];
        // hard way of doing this :
//        int [][] array = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        int[][] arrays = new int[3][3];
        for (int i = 0; i < arrays.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < arrays[i].length; j++) { //this equals to the column in each row.
                arrays[i][j] = in.nextInt();

            }

        }

//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                System.out.print(arrays[i][j] + " ");
//
//            }
//            System.out.println(); //change line on console as row comes to end in the matrix.
//
//        }


//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(Arrays.toString(arrays[i]));
////            System.out.println(); //change line on console as row comes to end in the matrix.
//        }

        // Enhanced for loop :
        for (int[] a : arrays){  //here arrays contains collection of arrays, thats ehy we pass array in enhanced for loop.
            // for every array a in arrays , print array 'a'
            System.out.println(Arrays.toString(a));
        }
//
    }
}
