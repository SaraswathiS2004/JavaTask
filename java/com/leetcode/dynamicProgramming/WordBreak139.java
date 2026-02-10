package com.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String , Boolean> map = new HashMap<>();
        findDictWord(s , wordDict , map);
        for(boolean x : map.values()){
            if(x){
                return true;
            }
        }
        return false;
    }
    public boolean findDictWord(String s, List<String> wordDict , HashMap<String , Boolean> map ) {
        if (s.length() == 0) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)) {
                String remaining = s.substring(i);
                if (findDictWord(remaining, wordDict, map)) {
                    map.put(s, true);
                    return true;
                }
            }
        }
        map.put(s, false);
        return false;
    }
}
