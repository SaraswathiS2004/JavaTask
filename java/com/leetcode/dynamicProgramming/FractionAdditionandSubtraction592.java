package com.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class FractionAdditionandSubtraction592 {
    public String fractionAddition(String expression) {
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        splitTheNumber(expression , n , d);
        int mul = 1;
        for(Integer i : d){
            mul *= i;
        }
        int sum = 0;
        for(int j = 0; j < n.size(); j++){
            sum += n.get(j) * (mul / d.get(j));
        }

        int commonFactor = findCommonFactor(sum , mul);
        sum = sum/commonFactor;
        mul = mul/commonFactor;
        if(mul < 0){
            mul *= -1;
            sum = -sum;
        }
        String res = sum == 0 ? "0/1" : sum +"/"+mul;
        return res;
    }

    public int findCommonFactor(int a , int b){
        if(b == 0){
            return a;
        }
        return findCommonFactor(b , a % b);
    }
    public static void splitTheNumber(String str , ArrayList<Integer> numarator , ArrayList<Integer> dinaminator){
        boolean isTrue = true;
        for(int i = 0; i< str.length(); i++){
            int n = str.charAt(i);
            if(isTrue ){
                String res ="";
                for(int j = i; j< str.length(); j++){
                    int m = str.charAt(j);
                    if(m == 47){
                        break;
                    }
                    else {
                        res += str.charAt(j);
                        i++;
                    }
                }
                numarator.add(Integer.parseInt(res));
                isTrue = false;
            }
            else if(n == 47 || !isTrue){
                String res = "";
                for(int j = i; j< str.length(); j++){
                    int m = str.charAt(j);
                    if(m == 45 || m == 43){
                        i +=-1;
                        break;
                    }
                    else{
                        res += str.charAt(j);
                        i++;
                    }
                }
                dinaminator.add(Integer.parseInt(res));
                isTrue = true;
            }
        }
        System.out.println(numarator);
        System.out.println(dinaminator);
    }
}
