package com.leetcode.Array;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        //Two pointer approach
        int left = 0, right = height.length - 1;
        int maxAmount = 0;
        while (left <= right) {
            int amountOfWater = Math.min(height[left], height[right]);
            int area = amountOfWater * (right - left);
            maxAmount = Math.max(maxAmount, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxAmount;
    }
}
