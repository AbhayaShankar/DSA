package com.Abhaya;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q  : Print max value of three integer values.
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // 1. very iterative method
//        if(a > b){
//            if(a > c){
//                System.out.println("largest is : " + a);
//            } else {
//                System.out.println("largest is : " + c);
//            }
//        } else {
//            if(b > c){
//                System.out.println("largest is : " + b);
//            } else {
//                System.out.println("largest is : " + c);
//            }
//        }
        //2. Method 2
//        int max = a;
//        if(b > max) {
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }
//
//        System.out.println(max);

        //3. Method 3:
//        int max = 0;
//        if(a > b){
//            max = a;
//        } else{
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }
//
//
//        System.out.println(max);

        //4. Method 4 : using Math.max:

        int max = Math.max(c, Math.max(a , b));
        System.out.println(max);
    }
}
