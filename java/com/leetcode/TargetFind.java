package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TargetFind {
        public static void  findTarget(int [] arr , int n){

            for(int i = 0; i< arr.length; i++) {
                int a = arr[i];
                if (a > n || a == n) {
                    System.out.println("The target number is position at " + i);
                }
            }
            System.out.println("The target number will be placed at "+ arr.length +" position");;
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
            findTarget(arr , scan.nextInt());

        }
    }
