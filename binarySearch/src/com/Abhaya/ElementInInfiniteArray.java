package com.Abhaya;
// Finding an element in a sorted array of INFINITE size.
// We don't know the size of the array so we cannot use arr.length property.
// Let's reverse think this : Earlier we went from N size array to till we find the elelment in the array.
// Similary lets take a array of 2 size and increase the size of the array by 2 and search in that.
// If not found then again increase by 2 so on and so forth.
public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,3,5,8,12,14,17,20,21,22,25,28,31,32,37,38,40,42,44,45,56,65,76,87,98,100};
        int target = 42;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums , int target){
        int start = 0;
        int end = 2;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
                if(target > nums[end]){
                    end = end * 2;
                }
            }else{
                return mid;
            }
        }
        return -1;
    }
}
