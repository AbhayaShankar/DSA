package com.Abhaya;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        System.out.println(word.trim());  // trim removes the extra spaces between words
//        System.out.println(word.trim().charAt(0)); // charAt(index) - returns the character at the index
//        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("'l'owercase");
        } else {
            System.out.println("'U'ppercase");
        }
    }
}
