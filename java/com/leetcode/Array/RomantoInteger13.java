package com.leetcode.Array;

import java.util.HashMap;

public class RomantoInteger13 {
    public int romanToInt(String s) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("I" , 1);
        map.put("V" , 5);
        map.put("X" , 10);
        map.put("L" , 50);
        map.put("C"  , 100);
        map.put("D", 500);
        map.put("M" , 1000);
        int sum = 0;

        for(int i = 0;i< s.length(); i++){
            Integer current = map.get(Character.toString(s.charAt(i)));
            Integer next = 0;
            if(i + 1 < s.length()){
                next = map.get(Character.toString(s.charAt(i + 1)));
            }
            if(current < next){
                sum -= current; //I V    -- I < V  subtract -currentvalue (or) I > V sum + currentValue
            }
            else {
                sum += current;
            }
        }
        return sum;
    }
}
