package com.Abhaya;

import java.util.ArrayList;
import java.util.Arrays;

public class pangram {
    public static void main(String[] args) {
        // 1832. Check if the Sentence Is Pangram


    }
    public boolean checkIfPangram(String sentence) {
            int c=0,flag = 0;
            int[] arr = new int[26];
            for (int i = 0; i < sentence.length(); i++) {
                arr[(sentence.charAt(i)) - 97] = 1;
            }
            for(int i =0; i < 26; i++){
                if(arr[i] == 0){
                    flag =0;
                }
                else{
                    flag =1;
                    c+=1;
                }
            }
            if(c>=26){
                return true;
            }else{
                return false;
            }
    }

}
