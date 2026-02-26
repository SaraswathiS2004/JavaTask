package com.leetcode.Array;

public class DetermineColorofaChessboardSquare1812 {
    public boolean squareIsWhite(String coordinates) {
        int  c1 = coordinates.charAt(0) - 'a';
        int c2 = coordinates.charAt(1) - '0';
        if(c1 % 2 == c2 % 2){
            return true;
        }
        else {
            return false;
        }
    }
}
