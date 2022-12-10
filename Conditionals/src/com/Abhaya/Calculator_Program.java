package com.Abhaya;

import java.util.Scanner;

public class Calculator_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user and exits the loop when user enters 'x' or 'X'
        int ans = 0;
        while(true){  //take the operator as input
            char str = in.next().trim().charAt(0);
            if(str == '+' || str == '-' || str == '*' || str == '/' || str == '%'){
                int a = in.nextInt();
                int b = in.nextInt();

                if(str == '+'){
                    ans = a + b;
                }

                if(str == '-'){
                    ans = a - b;
                }

                if(str == '*'){
                    ans = a * b;
                }

                if(str == '%'){
                    ans = a % b;
                }

                if(str == '/'){
                    if (b != 0){
                        ans = a / b;
                    }
                }
                else if (str == 'x' || str == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
            }
                System.out.println(ans);
        }


    }
}
