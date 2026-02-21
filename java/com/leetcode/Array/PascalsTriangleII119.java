package com.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {

        if(rowIndex == 0){
            return Arrays.asList(1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int k = 0; k <= i; k++) {
                int sum = 1;
                if (k == i || k == 0) {
                    sum = 1;
                } else {
                    sum = result.get(i - 1).get(k - 1) + result.get(i - 1).get(k);
                }
                temp.add(sum);
            }
            result.add(new ArrayList<>(temp));
        }
        return result.get(rowIndex);
    }
}
