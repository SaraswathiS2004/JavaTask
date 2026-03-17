package com.leetcode.Array.TopInterview;

public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i< gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        int stations = 0;

        int currentCycle = 0;
        for(int i = 0; i< gas.length; i++){
            currentCycle += gas[i] - cost[i];
            if(currentCycle < 0){
                currentCycle = 0;
                stations = i+1;
            }
        }
        return stations;
    }
}
