package com.zgs.java.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class MedianArray {
    public static int[] AccendingOrder(int [] num1 , int [] num2){

        int [] newArr = new int[num1.length + num2.length];
        for(int i = 0; i< num2 .length; i++){
            int a = num2[i];
            for(int j = 0; j< num1.length; j++){
                int b = num1[j];
                if( a < b){
                    num2[i] = b;
                    num1[j] = a;
                    break;
                }
            }
        }
        boolean isFirst = true;
        int index = 0;
        for(int k = 0; k< newArr.length; k++){
            if(isFirst) {
                newArr[k] = num1[index];
                if (k == num1.length - 1) {
                    index = -1;
                    isFirst = false;
                }
            }
            else if(!isFirst ) {
                newArr[k] = num2[index];
                if (index == num2.length - 1) {
                    break;
                }
            }
            index++;
        }
        return newArr;
    }

    public static double findMedian(int [] array , int n){
        double res = 0.0f;
        if(n % 2 == 1){
            res = array[n/2];
            return res;
        }
        else{
            res =  (array[n /2] + array[(n/2) - 1])/2f;
            return res;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of inputs in first array : ");
        int [] num1 = new int[scan.nextInt()];
        System.out.println("Enter the values");
        for(int i = 0; i< num1.length; i++){
            num1[i] = scan.nextInt();
        }
        System.out.println("Enter the number of inputs in second array : ");
        int [] num2 = new int[scan.nextInt()];
        System.out.println("Enter the values");
        for(int j = 0; j< num2.length; j++){
            num2[j] = scan.nextInt();
        }
        System.out.println("Array 1: "+ Arrays.toString(num1));
        System.out.println("Array 2: "+ Arrays.toString(num2));
        int array [] = AccendingOrder(num1 , num2);
        System.out.println("Merged Arrray : "+Arrays.toString(array));
        System.out.println("Median : %5"+findMedian(array , array.length));
    }
}
