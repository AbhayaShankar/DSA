package com.Abhaya;

public class KthMissingElement {
    public static void main(String[] args) {
    //1539. Kth Missing Positive Number
        // https://leetcode.com/problems/kth-missing-positive-number/description/
    }

    public int findKthPositive(int[] arr, int k) {
        int res = 0;
        int count = 0;
        int[] hash = new int[2500];
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]] = 1;
        }

        for(int i = 0; i < hash.length ; i++){
            if(hash[i] == 0){
                count++;
            }
            if(count == k){
                res = i+1;
            }
        }
        return res;
    }
}
