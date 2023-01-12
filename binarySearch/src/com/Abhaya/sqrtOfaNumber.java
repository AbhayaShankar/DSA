package com.Abhaya;

public class sqrtOfaNumber {
    public static void main(String[] args) {
//69. Sqrt(x)
        //https://leetcode.com/problems/sqrtx/
    }

    static int mySqrt(int x) {
        if(x >= 0){
            double sqroot = Math.sqrt(x);
            return ((int)sqroot);
        }else{
            return -1;
        }
    }
}
