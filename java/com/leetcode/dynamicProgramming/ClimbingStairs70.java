package com.leetcode.dynamicProgramming;
import java.util.HashMap;
public class ClimbingStairs70 { public int climbStairs(int n) {
    HashMap<Integer , Integer> map = new HashMap<>();
    map.put(1 , 1);
    map.put(2 , 2);
    map.put(0 , 0);
    return findClimbStairs(map , n);
}
    public int findClimbStairs(HashMap<Integer , Integer> map , int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        map.put(n , findClimbStairs(map , n - 1) + findClimbStairs(map ,n -2));
        return map.get(n);
    }
}
