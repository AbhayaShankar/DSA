package com.Abhaya;

public class reversing_a_number {
    public static void main(String[] args) {
        //1234 = 4321;
        int n = 2134364;
        int x = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            x = x * 10 + rem;
        }
        System.out.println(x);
    }
}
