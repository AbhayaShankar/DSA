package com.Abhaya;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a , b);
        System.out.println(a + "   "  +  b);

        String name = "Abhaya Shankar";
        changeName(name);
        System.out.println(name);  // name will be still pointing to Abhaya Shankar while naam will point to Harshit after a different object was created.
    }

     static void changeName(String name) {
        name = "Harshit"; // we are not modifying the object, we are creating a new object.
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
