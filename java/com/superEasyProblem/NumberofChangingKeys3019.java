package com.superEasyProblem;

public class NumberofChangingKeys3019 {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i< s.length() - 1; i++){
            char c = s.charAt(i);
            char c1 = s.charAt(i + 1);
            if(c != c1){
                count++;
            }
        }
        return count;
    }
}
