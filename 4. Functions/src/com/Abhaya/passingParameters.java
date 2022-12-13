package com.Abhaya;

import java.util.Scanner;

public class passingParameters {
    public static void main(String[] args) {
        int ans = sum2(20, 30);
        System.out.println(ans);
    }
//         pass the value as parameters when calling the main()
//         static int sum(int a , int b){
//         body
//        return int sum;
//        }

    static int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
