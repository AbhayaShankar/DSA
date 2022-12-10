package com.Abhaya;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*

        // If Statement syntax :
        if( conditions - boolean (true or false)){
            //body
        }
        else{
            //else do this.
        }

         */
        //Multiple if-else Statements
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();
        if(marks > 90){
            System.out.println("Grade : A+");
        } else if (marks > 80 && marks <90) {
            System.out.println("Grade : B+");
        }
        else{
            System.out.println("Grade : C");
        }


    }
}