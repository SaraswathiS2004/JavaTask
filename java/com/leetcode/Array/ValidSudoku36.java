package com.leetcode.Array;
import java.util.ArrayList;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        boolean horizontal = checkHorizontal(board);
        boolean vertical = checkVertical(board);

        if(!horizontal || !vertical){
            return false;
        }
        else{
            outer : for(int i = 0; i< board.length; i+= 3){
                for(int j = 0; j < board[0].length; j+=3){
                    ArrayList<Character> arr = new ArrayList<>();
                    for(int k = i; k< i+3; k++){
                        int col = 0;
                        for(int l = j; l< j+3; l++){
                            if(board[k][l] == '.') continue;
                            else if(arr.contains(board[k][l])){
                                return false;
                            }
                            else arr.add(board[k][l]);
                        }
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkHorizontal(char [][] nums ){
        for(int j = 0; j< nums.length; j++) {
            ArrayList<Character> map = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(nums[j][i] == '.') continue;
                else if (map.contains(nums[j][i])) return false;
                else map.add(nums[j][i]);
            }
        }
        return true;
    }
    public static boolean checkVertical(char [][] nums ){
        for(int k = 0; k < nums.length; k++) {
            ArrayList<Character> map = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(nums[i][k] == '.') continue;
                else if(map.contains(nums[i][k])) return false;
                else map.add(nums[i][k]);
            }
        }
        return true;
    }
}
