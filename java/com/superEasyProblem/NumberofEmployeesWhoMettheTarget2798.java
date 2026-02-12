package com.superEasyProblem;

public class NumberofEmployeesWhoMettheTarget2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int numberOfEmployees = 0;
        for(int i = 0; i< hours.length; i++){
            int n = hours[i];
            if(target <= n){
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
    }
}
