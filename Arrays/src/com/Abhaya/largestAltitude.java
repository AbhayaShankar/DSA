package com.Abhaya;

public class largestAltitude {
    public static void main(String[] args) {
        // 1732. Find the Highest Altitude
    }
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        int highest = 0;
        arr[1] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + gain[i-1];
            if (arr[i] > highest){
                highest = arr[i];
            }
        }
        return highest;
    }
}
