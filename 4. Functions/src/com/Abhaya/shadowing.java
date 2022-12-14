package com.Abhaya;

public class shadowing {
    static int x= 100;   // this will be shadowed at line 9
    // x will be available anywhere inside the block of x
    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x);  // scope will begin when value is initialised.
        x= 50;  // the class variable at line 4 is shadowed by this.
        System.out.println(x);
        fun();// we can access x anywhere inside fun or block scope since x is defined in all their parents.
    }

    static void fun(){
        System.out.println(x);  // here also we can access x, no errors.
    }
}
