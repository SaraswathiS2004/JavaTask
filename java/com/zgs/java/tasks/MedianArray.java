package com.zgs.java.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class MedianArray {
    public static int [] MergeArray(int [] num1 , int [] num2){
        int [] newarr = new int[num1.length + num2.length];
        boolean isFirst = true;
        int k = 0;
        for(int i = 0; i< newarr.length; i++){
            if(isFirst){
                newarr[i] = num1[k];
                if(i == num1.length - 1){
                    k = -1;
                    isFirst = false;
                }
            }
            else{
                newarr[i] = num2[k];
            }
            k++;
        }
        for(int m = 0; m< newarr.length; m++){
            for(int j = m; j>0; j--){
                int a = newarr[j];
                int b = newarr[j -1];
                if(b > a){
                    newarr[j] = b;
                    newarr[j - 1] = a;
                }
            }
        }
        return newarr;
    }
    public static double findMedian(int [] array ,int length){
        double res = 0.0f;

        if(length % 2 == 0){
            res = (array[length / 2] + array[(length/2) - 1])/2f;
        }
        else {
            res = length / 2f;
        }
        return res;
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
        int array [] = MergeArray(num1 , num2);
        System.out.println("Merged Arrray : "+Arrays.toString(array));
        System.out.printf("Median : %.5f\n",findMedian(array , array.length));
    }
}
