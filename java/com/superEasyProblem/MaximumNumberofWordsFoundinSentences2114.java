package com.superEasyProblem;

public class MaximumNumberofWordsFoundinSentences2114 {
    public int mostWordsFound(String[] sentences) {
        int maximumNumberOfWords = 0;
        for(int i = 0; i< sentences.length; i++){
            String[] arr = sentences[i].split("\\s");
            if(arr.length > maximumNumberOfWords){
                maximumNumberOfWords = arr.length;
            }
        }
        return maximumNumberOfWords;
    }
}
