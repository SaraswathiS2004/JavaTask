package com.leetcode;

import javax.smartcardio.ATR;
import java.util.Arrays;

public class Permutation {
    public static String [] printPermutation(char [] arr){
        String [] resultArr = new String[factorial(arr.length)];
        int index = 0;
        String [] array = new String[index];
        for(int i = 0; i< arr.length; i++){
            char c = arr[i];
            if(index == 0){
                array = insertValue(new String[]{}, c);
            }
            else {
                array = insertValue(array, c);
            }
           index++;
        }
        resultArr = array;
        return resultArr;
    }
    char c = 0;
    public static String [] insertValue(String [] array , char c){

        int len = array.length * (array.length + 1);
        String[] returnArr = new String[len];
        int index = 0;
        if(len == 0){
            returnArr = new String[]{"" + c};
        }
        else {
            for(int i = 0; i< len; i++){
                String s = array[i];
                int m = 0;
                for(int j = 0; j< array[i].length(); j++) {

                    char[] a = createCombination(s, c , m);
                   m++;
                    String s1 = "";
                    for (int l = 0; l < a.length; l++) {
                        s1 += a[l];
                    }
                    returnArr[index] = s1;
                    index++;
                }
            }
        }
        return returnArr;
    }
    public static char [] createCombination(String str , char c2 , int index){
        char [] arr  = new char [str.length() + 1];

        for(int i = 0; i< str.length(); i++){
            arr[index] = str.charAt(i);
            for(int j = 0; j< arr.length; j++) {
                if (j != index) {
                    arr[j] = c2;
                }
            }
        }
        return arr;
    }
    public static int factorial(int n){

        if(n >= 1){
            return n;
        }
        return n * factorial(n -1);
    }
    public static void main(String[] args){
//      String [] arr = printPermutation(new char[]{'A' , 'B'});
      System.out.println(Arrays.toString(printPermutation(new char[]{'A' , 'B'})));
    }
}
