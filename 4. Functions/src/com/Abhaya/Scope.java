package com.Abhaya;

import org.w3c.dom.ls.LSOutput;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int score = 359;

        System.out.println(a + b);
        // block scope
        {
//            int a = 30; // cannot redeclare a variable inside a block scope whose parent already have the variable declared.
             a = 25; //changing/modifying the value.

            System.out.println(score); // variable defined in the parent.

            // block can access the value of its parent but variables declared inside block scope cannot be accessed outside of its scope.
            int c = 80;
            {
                score = 456;
                System.out.println(score);
            }


        }

        System.out.println(a);

//        System.out.println(c); // cannot access the value outside of block scope which is defined inside the block.
    }
//        System.out.println(marks); // function scope variables cannot be accessed anywhere but in their scope.

        static void marks(int marks){
            System.out.println(marks);
            int num = 30;
            System.out.println(num);

//            System.out.println(a + b); // same with this as well --> function scope


        }


}
