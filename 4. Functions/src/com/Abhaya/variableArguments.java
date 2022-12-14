package com.Abhaya;

import java.sql.Array;
import java.util.Arrays;

public class variableArguments { //variable length arguments
    public static void main(String[] args) {
        fun(23,25,246,65474,7857,24,531,53,3251,2526,26);
        fun2();
        multiple(10, "ABhaya" , 4,6,6,7,3);

    }

    static void multiple(int a , String b , int ...c){   // we can define different data types in var length args as well.

    }

    static void fun(int ...varArgs){   // ...variableName creates a variable length arguments
        System.out.println(Arrays.toString(varArgs));
    }


    static String fun2(){
        int[] arr = {2,3,4};
        String marks = Arrays.toString(arr);
        System.out.println(marks);
        return marks;
    }
}
