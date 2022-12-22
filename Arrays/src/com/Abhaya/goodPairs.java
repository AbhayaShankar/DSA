package com.Abhaya;

public class goodPairs {
    public static void main(String[] args) {
        //1512. Number of Good Pairs
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i<j && nums[i] == nums[j]){
                    count+=1;
                }
            }
            
        }
        return count;
    }

//    public int numIdenticalPairs(int[] nums) {
//        int[] count = new int[102];
//        for(int num : nums){
//            count[num]++;
//        }
//        int totalCount = 0;
//        for(int i : count){
//            totalCount += ((i)*(i-1))/2;
//        }
//        return totalCount;
//    }

//    public int numIdenticalPairs(int[] nums) {
//        int n=0;
//        for(int i=0; i<nums.length-1; i++)
//            for(int j=i+1; j<nums.length; j++)
//                if(nums[i]==nums[j])
//                    n++;
//        return n;
//    }
}
