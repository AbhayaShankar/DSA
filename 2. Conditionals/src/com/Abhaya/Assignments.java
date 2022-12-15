package com.Abhaya;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        ----------------- BASIC JAVA ASSIGNMENTS ----------------

        //1. Area Of Circle Java Program
//        System.out.print("Enter radius of Circle : ");
//        double r = in.nextDouble();
//        double areaOfCircle = 3.14 * r * r;
//        System.out.println("Area of Circle is : " + areaOfCircle + "sq. units");


        //2. Area Of Triangle
//        System.out.print("Enter the height of triangle : ");
//        double h = in.nextDouble();
//        System.out.print("Enter the length of triangle : ");
//        double l = in.nextDouble();
//        double areaOfTriangle = 0.5 * h * l;
//        System.out.println("The area of Triangle is : " + areaOfTriangle + "sq. units");

        // Similar questions so skipping them, though writing the formula for them.
        // 3. Area Of Rectangle Program
//                area = l * b;


        // 4. Area Of Isosceles Triangle
//            area = A = b * h/2;

        // 5. Area Of Parallelogram
//            area = b * h;


        // 6. Area Of Rhombus
        // area = 0.5 * d1 * d2; // if diagonals are given
        // area = b * h ; //if base and height are given

        // 7. Area of Equilateral triangle

//        System.out.print("Enter the side of Equilateral triangle : ");
//        double side = in.nextDouble();
//        double areaOfEquiTriangle = Math.sqrt(3) * side * side / 4;
//        System.out.println("Area of Equilateral Triangle is : " + areaOfEquiTriangle);

        // 8. Perimeter Of Circle
//            perimeter = 2 * pi * r;

        // 9. Perimeter Of Equilateral Triangle
//            perimeter = 3 * side;

        // 10. Perimeter Of Parallelogram
//            perimeter = 2 * ( l1 + l2);

        // 11. Perimeter Of Rectangle
//            perimeter = 2 * ( l + b);

        // 12. Perimeter Of Square
//            perimeter = 4 * side;

//         13. Perimeter Of Rhombus
//            perimeter = 4 * side;


        // 14. Volume Of Cone Java Program
//        System.out.print("Enter the radius of Cone : ");
//        double r = in.nextDouble();
//        System.out.print("Enter the height of cone : ");
//        double h = in.nextDouble();
//        double volumeOfCone = 3.14 * r * r * h / 3;
//        System.out.println("Volume of Cone is : " + volumeOfCone + "cubic units");

        // 15. Volume Of Prism
//            volume = different for different structures
        // refer photo for more.

        // 16. Volume Of Cylinder
//            volume = pi * r * r * h;

        // 17. Volume Of Sphere
//            volume = 4/3 * pi * r * r * r;

        // 18. Volume Of Pyramid
//                volume = l * h * b / 3;

        // 19. Curved Surface Area Of Cylinder
//             csaCylinder = 2 * pi * r * l;

        // 20. Total Surface Area Of Cube
//            tsaCube = 6 * a * a;

        // 21. Fibonacci series in Java
//        int a = 0;
//        int b = 1;
//        for (int n = 0; n <= 10; n++) {
//            int c = b;
//            System.out.println(c);
//            b = b + a;
//            c = a;
//        }

        // 22. Subtract the Product and Sum of Digits of an Integer

        // let number = 419 --> answer : (4 * 1 * 9) - (4 + 1 + 9) = 22;
//        System.out.print("Enter the Number : ");
//        int num = in.nextInt();
//        int sum = 0 ;
//        int prod = 1;
//        while(num > 0){
//            int rem = num % 10;
//            sum = sum + rem;
//            prod = prod * rem;
//            num = num / 10;
//        }
//
//        System.out.println("Answer is : " + ( prod - sum)); // Answer is : 22.

        // 23. Input a number and print all the factors of that number (use loops).

        // Using for loops :
//
//        System.out.print("Enter a number : ");
//        int n = in.nextInt();
//        int x = 2;
//        if (n <= 0){
//            System.out.println("Please Enter a valid number. Negatives are not allowed.");
//        }
//        if (n == 1){
//            System.out.println("1 is neither prime nor composite.");
//        }
//        for (int i = 1 ; i <= n ; i++){
//            if ( n % x == 0){
//                System.out.print("  " + x);
//            }
//            x = x + 1;
//        }

// Using while loops :
//        System.out.print("Enter a  number : ");
//        int n = in.nextInt();
//        int x = 2;
//        while (x  <= n){
//            if ( n % x == 0){
//                System.out.print("  " + x);
//            }
//            x = x + 1;
//        }


        // 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//        int n = 1;
//        int ans = 0;
//        while(n != 0){
//            n = in.nextInt();
//            ans = ans + n;
//        }
//        System.out.println("Sum of all numbers : " + ans);


        // 25. Take integer inputs till the user enters 0 and print the largest number from all.

//        int max = 0;
//        int n = 1;
//        while(n != 0){
//            n = in.nextInt();
//            if (n > max){
//                max = n;
//            }
//        }
//        System.out.println(max);


        // 26. Addition Of Two Numbers
//        System.out.print("Enter num1 : ");
//        double num1 = in.nextDouble();
//        System.out.print("Enter num2 : ");
//        double num2 = in.nextDouble();
//
//        double sum = num1 + num2;
//        System.out.println("Sum of two numbers is : " + sum);


//        ------------ INTERMEDIATE JAVA ASSIGNMENTS ---------------
        // 1. Factorial Program In Java

//        int fact = 1;
//        System.out.print("Enter a number : ");
//        int n = in.nextInt();
//        for (int i = 1 ; i <= n; i++){
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + n + " is : " + fact);


        // 2. Calculate Electricity Bill
//        1 kWh is equal to 1 Unit .
//            duration electricity is being used = 10hrs in a day.
//            total wattage capacity = 1200 Watts
//            bill for month = 30 (days)
//
//            total usage = (duration * wattage Capacity * 30) watt/hour
//                TotalUsageInKWh = total usage/ 1000 = 1KWh
//            Cost of 1 unit = let 6 Rs.
//
//            Electricity Bill = TotalUsageInKWh * unitPrice

//        System.out.print("Enter duration for which Electricity is being used : ");
//        double duration = in.nextDouble();
//        System.out.print("Enter total watts of Electricity being used : ");
//        double watt = in.nextDouble();
//        System.out.print("Enter days in the month : ");
//        double daysInMonth = in.nextDouble();
//        System.out.print("Unit price : ");
//        Double unitPrice = in.nextDouble();
//
//        double TEB = (duration * watt * daysInMonth ) * unitPrice /1000;
//        System.out.print("Electricity for the month is :  " + TEB + " Rs.");


        // 3. Calculate Average Of N Numbers
//        double N = in.nextDouble();
//        double n = 1;
//        double sum = 0;
//        if (N == 0){
//            System.out.println("Error : Enter a Valid Natural Number.");
//        }
//        for (int i = 1 ; i <= N ; i++){
//            n = in.nextDouble();
//            sum = sum + n;
//        }
//        double avg = sum / N;
//        System.out.println("Average : " + avg);


        // 4. Calculate Discount Of Product
//            discount  = priceOfProduct * discountPercentage / 1000;


        // 5. Calculate distance between two points
//            dist = sq.root((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // 6. Calculate Commission Percentage


        // 7. Power In Java
//        System.out.print("Enter number : ");
//            double num1 = in.nextDouble();
//        System.out.print("Enter power : ");
//            double power = in.nextDouble();
//        System.out.println("Power of : " + Math.pow(num1, power) );


        // 8. Calculate Depreciation of Value
        // 9. Calculate Batting Average

        // 10. Calculate CGPA Java Program
//        System.out.println("CGPA Program");
//        int noOfSubjects = in.nextInt();
//        int grade;
//        double sum = 0;
//        for (int i = 1 ; i <= noOfSubjects ; i++){
//            System.out.print("Enter marks in Subject" + i + " : ");
//            double marks = in.nextDouble();
//            if (marks >= 90){
//                grade = 10;
//            } else if (marks >= 80 && marks < 90) {
//                grade = 9;
//            }
//            else if (marks >= 70 && marks < 80) {
//                grade = 8;
//            }
//            else if (marks >= 60 && marks < 70) {
//                grade = 7;
//            }
//            else if (marks >= 50 && marks < 60) {
//                grade = 6;
//            }
//            else {
//                grade = 5;
//            }
//            sum = sum + grade;
//            System.out.println("Grade is : " + grade);
//
//        }
//        System.out.println("CGPA for the Student is :  " + (sum / noOfSubjects ) );


        // 11. Compound Interest Java Program

//        double ans = ci(10000, 7.5F, 4);
//        System.out.println("ci is : " + ans );

        // 12. Calculate Average Marks
        // 13. Sum Of N Numbers

        // 14. Armstrong Number In Java
//        int num = in.nextInt();
//        double ans = armstrong(num);
//        if (ans == num) {
//            System.out.println(num + " is a Armstrong Number.");
//        } else {
//            System.out.println("Not a Armstrong Number.");
//        }

        // 15. Find Ncr & Npr
//        System.out.print("Enter n : ");
//        int n = in.nextInt();
//        System.out.print("Enter r : ");
//        int r = in.nextInt();
//        System.out.print(n + "C" + r + " = ") ;
//        int ans = (fact(n)/(fact(n-r) * fact(r)));
//        System.out.println(ans);


//        System.out.print("Enter n : ");
//        int n = in.nextInt();
//        System.out.print("Enter r : ");
//        int r = in.nextInt();
//        System.out.print(n + "P" + r + " = ") ;
//        int ans = (fact(n)/(fact(n-r)));
//        System.out.println(ans);


        // 16. Reverse A String In Java

        String name = "Abhaya";
        

        // 17. Find if a number is palindrome or not

        // 18. Future Investment Value

        // 19. HCF Of Two Numbers Program

        // 20. LCM Of Two Numbers

        // 21. Java Program Vowel Or Consonant

        // 22. Perfect Number In Java

        // 23. Check Leap Year Or Not

        // 24. Sum Of A Digits Of Number

        // 25. Abhaya is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        //
        // 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

    }

    static double ci(int p, float r, float t){
        float rate = (1 + (r/100));
        double rp = Math.pow(rate,t);
        double ci = p * rp;
        return ci;
    }

    static double armstrong(int n){
        double sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + Math.pow(rem , 3);
            n = n /10;
        }
        return sum;
    }

    static int fact(int num){
        int facto = 1;
        for (int i = 1 ; i < num ; i++){
           facto = facto * (i+1);
        }
        return facto;
    }

}
