package com.Abhaya;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        For loop syntax:
        for (initialisation ; condition ; increment/decrement){
            //body
        }
         */

        //Q : print numbers from 10 to 1

//        for(int n = 10 ; n>=1 ; n--){
//            System.out.println(n);
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <= n; num += 2) {
//            System.out.println(num);
//        }
        /*
        While loop syntax :
        while(condition){
            //body
        }

         */
//        int n = 1;
//        while(n <= 5){
//            System.out.println(n);
//            n += 1;
//        }

        //Do while loops syntax:
        /*

        do{
            //body
        } while(condition);

         */
        // in do.. while loops, the loop will run atleast once.
        int n = 1;
        do {
            System.out.println("Hello");
        } while(n != 1);
        //Although the condition is false the first time it executes, yet the loop runs atleast once.

//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        } while(n <=5);
    }
}
