package com.leetcode;

import java.util.Scanner;
import java.util.Arrays;

public class QueenPlace {

    public static int [][] possibleMoves(int[][] path , int x  , int y ,int x1 , int y1 , int change){

        if(x >= path.length && y >= path[0].length){
            return path;
        }
        else if((x >= path.length || x < 0) || (y >=path[0].length || y < 0)){
            return path;
        }
        path[x][y] =  path[x][y] + change;
        return possibleMoves(path , x + x1 , y + y1 , x1 , y1 ,  change);

    }

    public static int[][] ruleApply(int [][] path , int x , int y , int change){

        int [] xvalues = {0 , 0 , 1 ,-1 ,-1,-1, 1, 1};

        int [] yvalues ={ 1,  -1 ,0 , 0 ,  -1 , 1 , -1 , 1};


        for(int i = 0; i< xvalues.length; i++){
            possibleMoves(path , x , y , xvalues[i] , yvalues[i] , change);
        }
        return path;
    }
    public static boolean findRoute(int [][] path , int x , int y){

        if(x >= path.length){
            return true;
        }

        boolean isTrue = false;
        for(int i = 0; i< path[x].length; i++){
            int n = path[x][i];
            if(n == 0){
                ruleApply(path , x , i , -1);
                if(findRoute(path , x +1 , 0)){
                    isTrue = true;
                    path[x][i] = 1;
                }
                else{
                    ruleApply(path , x , i , 1);
                }
            }
        }
        return isTrue;
    }
    public static int[][] NQueenBoard(int n){
        int path[][] = new int[n][n];
        findRoute(path , 0 , 0);
        int [][] returnArr = new int[n][n];
        for(int j = 0; j< path.length; j++){
            for(int i = 0; i< path[j].length; i++){
                int x = path[j][i];
                returnArr[j][i] = x == 1 ? x : 0;
            }
        }
      return returnArr;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number Of queen");
        int n = scan.nextInt();
        int path[][] = NQueenBoard(n);
        for(int[] a:path){
            System.out.println(Arrays.toString(a));
        }
    }
}
