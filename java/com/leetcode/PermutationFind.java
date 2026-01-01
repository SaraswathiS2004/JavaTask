package com.leetcode;

import java.util.Arrays;

public class PermutationFind {
    public static String[] printPermutation(char[] arr){
        String [] tempArr = new String[0];
        for(int i = 0; i< arr.length; i++){
            char c = arr[i];
            if(i == 0) {
                tempArr = createCombination(new String[]{} , c );
            }
            else {
                tempArr = createCombination(tempArr , c);
            }
        }
        System.out.println(tempArr.length);
        return tempArr;
    }
    public static String [] createCombination(String [] arr , char c ){

        String [] temp = new String[0];
        if(arr.length == 0){
           return temp = new String[]{""+c};
        }
        String [] outputArr = new String[arr.length * (arr[0].length() + 1)];
        int index = 0;
            for(int n = 0; n < arr.length; n++){
                temp = insertValue(arr[n] , c);
                for(int i = 0; i< temp.length; i++){
                    outputArr[index] = temp[i];
                    index ++;
                }
            }

        return outputArr;
    }
    public static String[] insertValue(String str , char c){
        String [] resultArr = new String[str.length() + 1];
        char [] temp = new char[str.length() + 1];
        int count = 0;
        for(int j = 0; j< temp.length; j++){
            temp[j] = c;
            int ind = 0;
            int index = 0;
           while(ind != temp.length){
               if(ind != j){
                   temp[ind] = str.charAt(index);
                   index++;
               }
               ind++;
           }
            String s ="";
            for(int k = 0; k< temp.length; k++){
                s += temp[k];
            }
            resultArr[count] = s;
            count++;
        }
        return resultArr;
    }
    public static void main(String[] args){
       String [] arr = printPermutation(new char[]{'A' , 'B' , 'C' , 'D'});
       System.out.println(Arrays.toString(arr));
    }
}

