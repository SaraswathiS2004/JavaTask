package com.leetcode.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList("a", "b", "c")));
        map.put(3, new ArrayList<>(Arrays.asList("d", "e", "f")));
        map.put(4, new ArrayList<>(Arrays.asList("g", "h", "i")));
        map.put(5, new ArrayList<>(Arrays.asList("j", "k", "l")));
        map.put(6, new ArrayList<>(Arrays.asList("m", "n", "o")));
        map.put(7, new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        map.put(8, new ArrayList<>(Arrays.asList("t", "u", "v")));
        map.put(9, new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(int i = 0; i< digits.length(); i++){
            ArrayList<String> str = map.get(digits.charAt(i) - '0');
            res.add(str);
        }

        for(int j = 0; j<res.size() -1; j++){
            ArrayList<String> a = res.get(j);
            ArrayList<String> b = res.get(j +1);
            ArrayList<String> result = findCombination(a , b);
            res.remove(j +1);
            res.add(j +1 , result);
        }
        return res.getLast();
    }
    public ArrayList<String> findCombination(ArrayList<String> a , ArrayList<String> b){
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i< a.size(); i++){
            String s = a.get(i);
            for(int j = 0; j< b.size(); j++){
                String s1 = b.get(j);
                res.add(s + s1);
            }
        }
        return res;
    }
}
