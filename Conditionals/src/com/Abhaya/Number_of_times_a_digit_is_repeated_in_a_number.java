package com.Abhaya;

public class Number_of_times_a_digit_is_repeated_in_a_number {
    public static void main(String[] args) {
        // Q : print the number of times a particular digit is repeated in the number.
        int a = 1385757879;
        int count = 0;
        while(a > 0){
            int rem = a % 10;   // it will give me the remainder of the number.
            if(rem == 7){   // 1385757879 % 10 = 9
                count++;   // if remainder matches the desired rem, count i s incremented.
            }
            a = a/10;    // reducing the number by a factor of 10. 1385757879 / 10 = 138575787
                                                                //138575787 / 10 = 13857578
        }
        System.out.println(count);
    }
}
