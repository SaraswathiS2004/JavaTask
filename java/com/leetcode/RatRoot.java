package com.leetcode;

public class RatRoot {

    public static boolean findPath(int [][] matrix , int x , int y){

        if( matrix[0].length -1  <= y && matrix.length -1 == x ){
            System.out.println("("+x +" , "+ y +") ");
            return true;
        }
        if( y < 0 || matrix[0].length <= y || matrix.length <= x){
            return false;
        }
        int n = matrix[x][y];
        if(n == 0 ){
            return false;
        }
        System.out.print("("+x +" , "+ y +") -> ");

        return findPath(matrix, x+ 1 , y) ||findPath(matrix , x , y + 1) || findPath(matrix , x , y-1);
    }
    public static void main(String[] args){
        int [] [] matrix = {{1, 0, 1, 1, 0},
                {1, 1, 1, 0, 1},
                {0, 1, 0, 1, 1},
                {1, 1, 1, 1, 1}
        };
        boolean pathFound = findPath(matrix , 0, 0);
        System.out.println(pathFound ? "Path Found" : "Path Not found");
    }
}

