package com.Abhaya;

public class Main {
    public static void main(String[] args) {
        // Q: store a list of 100 roll no. || Store a list of name of a class of 90 students.
        //This we can do using traditional declaring and innitialising values to variables, but that is not a good practice.
        // What we can do in this case is to use an Array.

        // Syntax :
        //datatype[] varName = new datatype[size];
        // Q : store 5 roll no :
        int[] rnos = new int[5];   // size of the array is 5, since we need to store 5 values. indexing from (0-4).
        // or we can initialise it while declaring the array:
        int[] rno = {1,2,3,4,5}; // Roll nos. declared and initialised.

        int[] ros; //declaration of array. Array is getting defined in the STACK.
        ros = new int[5];   //initialisation :  here, actually object is being created in the memory (heap memory).

//        System.out.println(ros[0]);  // by default arr when declared but not initialised, each element will contain 0's.
//        [0,0,0,0,0]
        String[] str = new String[4];
//        System.out.println(str[2]); // Strings by default contains null.

        int a = Integer.parseInt(null);
    }
}