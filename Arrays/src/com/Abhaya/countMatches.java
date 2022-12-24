package com.Abhaya;
import java.util.*;
public class countMatches {
    public static void main(String[] args) {
        //1773. Count Items Matching a Rule
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // ArrayList<ArrayList<String> list = new ArrayList<ArrayList<>();
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                count++;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                count++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

}
