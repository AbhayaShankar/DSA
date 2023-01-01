package com.Abhaya;

import java.util.Arrays;

public class searchInString {
    public static void main(String[] args){
        String str = "Abhaya Shankar";
        char ch = 'k';
        System.out.println(Arrays.toString(str.toCharArray()));
        boolean ans = searchInString2(str , ch);
        System.out.println(ans);
    }

    static boolean searchInString(String str , char ch){
//        int[] arr = str.toCharArray();
        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == ch){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString2(String str , char ch){
//        int[] arr = str.toCharArray();
        if (str.length() == 0){
            return false;
        }

        for(char character : str.toCharArray()){
//            System.out.println(character);
            if(character == ch){
                return true;
            }
        }
        return false;
    }
}
