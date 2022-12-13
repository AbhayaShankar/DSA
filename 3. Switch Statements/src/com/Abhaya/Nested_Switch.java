package com.Abhaya;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int EmpID = in.nextInt();
        String Department = in.next();
        switch (EmpID){
            case 1 :
                System.out.println("Abhaya Shankar");
                break;

            case 2:
                System.out.println("Pallavi Chandrapuri");
                break;

            case 3 :
                System.out.println("Karuna Jyoti");
                break;

            case 4:
                System.out.println("Employee 4");
                switch (Department){
                    case "Engineering" :
                        System.out.println("Studied Engineering");
                        break;

                    case "UPSC" :
                        System.out.println("Studies UPSC");
                        break;

                    case "Medical" :
                        System.out.println("Studies Medical");
                        break;

                    default:
                        System.out.println("Not a correct Department");
                }
                break;

            default:
                System.out.println("Not a valid Number");
        }

//Enhanced way of writing code with switch statements.
        switch (EmpID) {
            case 1 -> System.out.println("Abhaya Shankar");
            case 2 -> System.out.println("Pallavi Chandrapuri");
            case 3 -> System.out.println("Karuna Jyoti");
            case 4 -> {
                System.out.println("Employee 4");
                switch (Department) {
                    case "Engineering" -> System.out.println("Studied Engineering");
                    case "UPSC" -> System.out.println("Studies UPSC");
                    case "Medical" -> System.out.println("Studies Medical");
                    default -> System.out.println("Not a correct Department");
                }
            }
            default -> System.out.println("Not a valid Number");
        }
    }
}
