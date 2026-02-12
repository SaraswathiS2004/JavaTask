package com.superEasyProblem;

public class CheckiftheSentenceIsPangram1832 {
    public boolean checkIfPangram(String sentence) {

        //using hashset

        // HashSet<Character> set = new HashSet();
        // for(int i = 0; i < sentence.length(); i++){
        //     set.add(sentence.charAt(i));
        // }
        // return set.size() == 26;
        // }


        //using array;
        boolean [] panagrams = new boolean[26];
        for(int i = 0; i< sentence.length(); i++){
            panagrams[sentence.charAt(i) - 'a'] = true;
        }
        for(int i = 0; i< panagrams.length; i++){
            boolean isTrue = panagrams[i];
            if(!isTrue){
                return false;
            }
        }
        return true;
    }
}
