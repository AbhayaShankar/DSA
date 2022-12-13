package com.Abhaya;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Sum is : " + ans);
    }

    // return type is int - it basically means that the return of the method is of what data type.
    // an int return type specifies it is of int type.
    // We can store the value of the return type and can use whatever way we feel like it.

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;

        // these will not be evaluated after return is called.
        // System.out.println("Sum is : " + sum);
        // System.out.println("Sum is : " + sum);
        // System.out.println("Sum is : " + sum);  // once return statement is called, its work is done and it will not go the next line, it will jump back to the main method.
    }
}
