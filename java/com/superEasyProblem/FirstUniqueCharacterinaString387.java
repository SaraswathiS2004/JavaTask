package com.superEasyProblem;

import java.util.HashMap;

public class FirstUniqueCharacterinaString387 {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> map = new HashMap();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            map.put(c  , map.getOrDefault(c , 0) + 1);
        }
        for(int k = 0; k< s.length(); k++){
            char c = s.charAt(k);
            if(map.get(c) == 1){
                return k;
            }
        }
        return -1;
    }
}
