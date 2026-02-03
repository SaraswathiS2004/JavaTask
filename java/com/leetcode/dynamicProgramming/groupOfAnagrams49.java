package com.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupOfAnagrams49{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
            String s = strs[i];
            char [] c = convertCharArray(s);
            String res ="";
            for(char c1 : c){
                res += c1;
            }
            if(map.containsKey(res)){
                ArrayList list =  map.get(res);
                list.add(s);
            }
            else{
                map.put(res , new ArrayList<>());
                map.get(res).add(s);
            }
        }
        return new ArrayList(map.values());
    }

    public char[] convertCharArray(String str){
        char [] array = new char[str.length()];
        for(int j = 0; j< str.length(); j++){
            array[j] = str.charAt(j);
        }
        Arrays.sort(array);
        return array;
    }
}
