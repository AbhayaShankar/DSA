package com.Abhaya;

public class ValidPerfectSquare {
    // 367. Valid Perfect Square
    // https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
         long start = 0;
         long end = num;
         while(start <= end){
             long mid = start + (end - start)/2;
             if(mid*mid == num){
                 return true;
             }else if(mid * mid < num){
                 start = mid + 1;
             }else{
                 end = mid-1;
             }
         }
         return false;
/*
        for(long i = 1; i * i <= num ; i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
 */
    }

}
