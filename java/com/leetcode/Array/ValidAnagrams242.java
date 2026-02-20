package com.leetcode.Array;

public class ValidAnagrams242 {
    public boolean isAnagram(String s, String t) {

        // Sorting Algorithm Approach for Anagram
        // if(s.length() != t.length()) return false;

        // char [] sarr = s.toCharArray();
        // char [] tarr = t.toCharArray();
        // Arrays.sort(sarr);
        // Arrays.sort(tarr);
        // return isValidAnagrams(sarr , tarr);

// public static boolean isValidAnagrams(char [] sarr , char [] tarr){
//     int length = sarr.length;
//     for(int j = 0; j < length; j++){
//         if(sarr[j] != tarr[j]) return false;
//     }
//     return true;
// }
        // sliding window
        if(s.length() != t.length()){
            return false;
        }
        int [] tarr = new int[26];
        int [] sarr = new int[26];
        for(int i = 0; i< t.length(); i++){
            tarr[t.charAt(i) - 'a']++;
        }
        int count = 0;
        int left = 0 , k = 0;
        for(int right = 0; right < s.length(); right ++){
            sarr[s.charAt(right) - 'a']++;
            count++;
            while(count > t.length()){
                sarr[s.charAt(left) - 'a']--;
                left++;
                count--;
            }
            if(isValidAnagrams(sarr , tarr)){
                return true;
            }
            k++;
        }
        return false;
    }

    public static boolean isValidAnagrams(int [] sarr , int [] tarr){
        for(int j = 0; j < 26; j++){
            if(sarr[j] != tarr[j]) return false;
        }
        return true;
    }

}
