package com.leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;

public class Finding3_DigitEvenNumbers2094 {
    public int[] findEvenNumbers(int[] digits) {

        boolean [] isTrue = new boolean[digits.length];
        HashSet<Integer> set = find3Digits(digits , new HashSet<>() , 0 , 0, isTrue);
        int [] arr = new int[set.size()];
        int ind = 0;
        for(int x : set){
            arr[ind++] = x;
        }
        Arrays.sort(arr);
        return arr;
    }

    public HashSet<Integer> find3Digits(int [] digits , HashSet<Integer> set , int n , int index , boolean [] isTrue){

        if(index == 3) {
            if(n % 2== 0){
                set.add(n);
            }
            return set;
        }

        for(int i = 0; i< digits.length; i++){
            int num = (n * 10) + digits[i];
            if(num == 0 || isTrue[i]) continue;
            isTrue[i] = true;
            find3Digits(digits , set , num , index + 1 , isTrue);
            isTrue[i] = false;
        }
        return set;
    }
}
