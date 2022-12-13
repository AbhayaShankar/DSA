package com.Abhaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String data =  personalDetails();
        System.out.println(data);

    }

        //Functions are referred to as Methods in java.
//        Syntax :

//        accessModifiers return_type name (){
//            // body
//            return_type;
//        }
        static String personalDetails(){
        Scanner in = new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name = in.nextLine();
            System.out.print("Enter your Father's name : ");
            String fname = in.nextLine();
            System.out.print("Enter your Mother's name : ");
            String mname = in.nextLine();

            return (name + '\n' + fname + '\n' + mname);

        }


}