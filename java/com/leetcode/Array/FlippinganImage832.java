package com.leetcode.Array;

import java.util.Arrays;

public class FlippinganImage832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int rowLen = image.length;
        int colLen = image[0].length;
        for(int row = 0; row< rowLen; row++){
            int len = colLen -1;
            int length = (colLen %2 == 0) ? (colLen/2) -1 : colLen/2;
            for(int col = 0; col <= length; col++){
                int temp = image[row][col] ^ 1;
                image[row][col] = image[row][len] ^ 1;
                image[row][len --] = temp;
            }
            // for(int c = 0; c < colLen; c ++){
            //     image[row][c]  ^= 1;
            // }
            // }
            // for(int c = 0; c < colLen; c ++){
            //     image[row][c]  ^= 1;
            // }
        }
        return image;
    }
    public static void main(String[] args){
//    },{1,0,1,0}
//    }
        int [][] matrix = {{1,1,0},{1,0,1},{0,0 ,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(matrix)));
    }

}
