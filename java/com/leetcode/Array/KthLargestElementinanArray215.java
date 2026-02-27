package com.leetcode.Array;

import java.util.PriorityQueue;

public class KthLargestElementinanArray215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue  = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            queue.add(nums[i]);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.poll();
    }
}
