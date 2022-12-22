package com.Abhaya;
import java.util.*;
public class maxNoOfCandies {
    public static void main(String[] args) {
        //1431. Kids With the Greatest Number of Candies
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max){
            max = candies[i];
            }

        }
        for (int i = 0; i < candies.length; i++) {
            sum = candies[i] + extraCandies;
            if (sum >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }

}
