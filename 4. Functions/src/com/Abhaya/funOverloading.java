package com.Abhaya;

public class funOverloading {
    public static void main(String[] args) {
        // fun is calling in accordance to the parameters passed in the fun.
        // When fun with int param is called, 1st fun is called, while when string parameter is passed to the fun, 2nd fun is called.
        fun(18119001);
        fun("Abhaya Shankar");
    }

    static void fun(int rollNo){

    }

    static void fun(String name){

    }
}
