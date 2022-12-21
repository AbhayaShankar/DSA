package com.Abhaya;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 111;
        arr[3] = 1111;
        arr[4] = 11111;

        //[1,11,111,1111,11111]
        System.out.println(arr[2]);
        // Now if we declare like this, it still is tedious task.
        // We can input using for loop :
        int[] rno = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < rno.length ; i++) {
                rno[i] = in.nextInt();
        }
//        for (int i = 0; i < rno.length ; i++) {
//            System.out.print(rno[i] + "  ");
//        }

//        for (int num : rno) {
//            System.out.print(num + "  ");  // for (int num : arr) { sout(num)}   // For datatype in array { print datatype}
//        }                                   // here num denotes element in the array.

        // Another way to print this is using Arrays.toString() method
        System.out.println(Arrays.toString(rno));
    }
}
