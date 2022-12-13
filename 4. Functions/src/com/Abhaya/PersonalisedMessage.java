package com.Abhaya;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class PersonalisedMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String myName = in.nextLine();
        String personalisedMessage = greet(myName);
        System.out.println(personalisedMessage);
    }

    static String greet(String name) {
        String mess =  ("hello " + name);
        return mess;
    }


}
