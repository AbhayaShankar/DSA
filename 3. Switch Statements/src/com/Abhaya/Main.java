package com.Abhaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
     // String fruits = in.next();

//        if (fruits == "Mango"){
//            System.out.println("King of all Fruits");
//        }
        // ex:
//        String a = "Abhaya";
//        String b = "Abhaya";
//
//        System.out.println(a == b); // true
          // '==' checks the value as well as the reference of the variables.

        // another method for using == is .equals
        // .equals only check the value of the variables. Even though if a and b has different references, but if
        // they have the same value, .equals results true
        /*
        if-else statements:

        if (fruits.equals("Mango")){
            System.out.println("King of all Fruits");
        }
        if (fruits.equals("Apple")){
            System.out.println("A Red sweet fruit");
        }
        if (fruits.equals("Orange")){
            System.out.println("Same as the color Orange");
        }
        if (fruits.equals("Grapes")){
            System.out.println("Small sour fruit");
        }

        */

        // we can write the same code using switch-case statements : Code looks clean and easy to read and write.
/*
        switch (fruits){
            case "Mango":
                System.out.println("King of all Fruits");
                break;
            case "Apple" :
                System.out.println("A Red sweet fruit");
                break;
            case "Orange" :
                System.out.println("Same as the color Orange");
                break;

            case "Grapes" :
                System.out.println("Small sour fruit");
                break;

            default:
                System.out.println("Enter a valid Fruit");
        }

       // break is used to terminate the sequence. If break is not used , it will continue the next case and run all the code till it finds the break statement.
*/
        /*

        switch (fruits){
            case "Mango":
                System.out.println("King of all Fruits");
                break;
            case "Apple" :
                System.out.println("A Red sweet fruit");
                break;
            case "Orange" :
                System.out.println("Same as the color Orange");

            case "Grapes" :
                System.out.println("Small sour fruit");

            default:
                System.out.println("Enter a valid Fruit");

                // Since there is no break statements in "Orange" and "Grapes" , If user inputs Orange -- output :
                // Same as the color Orange
                // Small sour fruit
                // Enter a valid Fruit
        }

        */

        // Enhanced switch statements using a method similar to arrow functions in js.
        // The code looks even cleaner and more readable. This also doesn't use break at the end of the case.
/*
        switch (fruits) {
            case "Mango" -> System.out.println("King of all Fruits");
            case "Apple" -> System.out.println("A Red sweet fruit");
            case "Orange" -> System.out.println("Same as the color Orange");
            case "Grapes" -> System.out.println("Small sour fruit");
            default -> System.out.println("Enter a valid Fruit");
        }
    */
        int day = in.nextInt();

//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//        }
// using break statements differently for executing a weekdays and weekends.
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;

        }
//Enhanced Switch statements :
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }
    }


}