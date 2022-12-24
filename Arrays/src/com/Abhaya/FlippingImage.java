package com.Abhaya;

public class FlippingImage {
    public static void main(String[] args) {
        // 832. Flipping an Image
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                arr[i][j] = image[i][image[i].length-j-1];
                if (arr[i][j] == 0){
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
