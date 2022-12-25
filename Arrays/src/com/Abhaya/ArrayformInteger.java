package com.Abhaya;
import java.util.*;
public class ArrayformInteger {
    public static void main(String[] args) {
        // 989. Add to Array-Form of Integer
//        ArrayList<Integer> arr = new ArrayList<>();
//        int[] num = {1,2,6,3,0,7,1,7,1};
//        int k = 516;
//        long sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i] * (long) Math.pow(10 , num.length - i-1);
//        }
//        long res = (sum + k);
//        long rem = 0;
//        while(res > 0){
//            rem = res % 10;
//            arr.add((int) rem);
//            res = res / 10;
//        }
//        System.out.println(arr);

    }


    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> arr = new LinkedList<>();
//        ArrayList<Integer> arr2 = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i] * Math.pow(10, num.length - i-1);
        }
        int res = (int)(sum + k);
        System.out.println(sum);
        int rem = 0;
        while(res > 0){
            rem = res % 10;
            arr.addFirst(rem);
            res = res / 10;
        }
        return arr;
    }

    public List<Integer> addToArrayForm2(int[] num, int k) {
        LinkedList<Integer> arr = new LinkedList<>();
        int len = num.length - 1;
        while (len >= 0 || k != 0) {
            if (len >= 0) {
                k += num[len--];
            }

            arr.addFirst(k % 10);
            k /= 10;
        }
        return arr;
    }
}
