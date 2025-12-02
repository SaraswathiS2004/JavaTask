package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TargetFind {
        public static int findTarget(int [] arr , int n){

            for(int i = 0; i< arr.length; i++){
                int a = arr[i];
                if(a > n || a == n ){
                    return i;
                }
            }
            return arr.length;
        }
        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Number of values in array : ");
            int n = scan.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the values : ");
            for(int i = 0; i< n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println("Enter the Target Number : ");
            int result = findTarget(arr , scan.nextInt());
            System.out.println(result);
        }
    }
