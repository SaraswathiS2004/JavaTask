package com.superEasyProblem;
import java.util.ArrayList;
public class BaseballGame682 {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< operations.length; i++){
            String s = operations[i];

            if(s.equals("C")){
                arr.removeLast();
            }
            else if(s.equals("D")){
                int n = arr.getLast();
                arr.add(n * 2);
            }
            else if(s.equals("+")){
                int sum = 0;
                for(int j = arr.size() -1; j >=arr.size() -2; j--){
                    sum += arr.get(j);
                }
                arr.add(sum);
            }
            else {
                arr.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(Integer x : arr){
            sum += x;
        }
        return sum;
    }
}
