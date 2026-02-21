package com.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return result;
    }
}
