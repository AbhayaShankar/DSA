package com.Abhaya;

import java.util.Scanner;
//https://leetcode.com/problems/first-bad-version/
// 278. First Bad Version
public class FirstBadVersion {
    public static void main(String[] args) {

    }

        /*
    public int firstBadVersion(int n) {
       int[] isBadVersion = {1,2,3,4,5,6,7,8,9};
        //  mid = 0;
        if(isBadVersion(1)== true){
            return 1;
        }
        else{
            int start = 0;
            int end = n;
            int mid = 0;
            while(start <= end){
                mid = start + (end - start)/2;
                if(isBadVersion(mid) && isBadVersion(mid-1)== false){
                    return mid;
                }else if(isBadVersion(mid) && isBadVersion(mid-1)== true){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
          //  return mid;
        }
        // return -1;
    }
        */
}
