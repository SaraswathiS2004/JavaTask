package com.leetcode.Array;

public class PeakIndexinaMountainArray852 {
    public int peakIndexInMountainArray(int[] arr) {
        int previousElement = Integer.MIN_VALUE;
        //    for(int i = 0; i< arr.length; i++){
        //     if(previousElement < arr[i]){
        //         previousElement = arr[i];
        //     }
        //     else if(previousElement > arr[i]){
        //         return i -1;
        //     }
        //    }
        //    return 0;

//Binary search algorithms time complexity = (o log (n));
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
