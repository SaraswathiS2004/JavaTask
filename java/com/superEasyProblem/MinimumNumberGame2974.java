package com.superEasyProblem;

public class MinimumNumberGame2974 {
    public int[] numberGame(int[] nums) {

        sort(nums);
        // Arrays.sort(nums);
        int index = 0;
        int[] minimumArr = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int bob = nums[i++];
            int alice = nums[i];
            minimumArr[index ++] = alice;
            minimumArr[index++] = bob;
        }
        return minimumArr;
    }
    public void sort(int[] nums){
        for(int i = 0; i< nums.length; i++){
            for(int j = i; j >0; j --){
                int n = nums[j];
                int n1 = nums[j -1];
                if(n1 > n){
                    int temp = n;
                    nums[j] = n1;
                    nums[j -1] = n;
                }
            }
        }
    }
}
