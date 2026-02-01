package com.leetcode.Array;

public class MedianofTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] newarr = new int[nums1.length + nums2.length];
        boolean isFirst = true;
        int k = 0;
        for(int i = 0; i< newarr.length; i++){
            if(isFirst && k < nums1.length){
                newarr[i] = nums1[k];
                if(i == nums1.length - 1){
                    k = -1;
                    isFirst = false;
                }
            }
            else if(k < nums2.length){
                newarr[i] = nums2[k];
            }
            k++;
        }
        for(int m = 0; m< newarr.length; m++){
            for(int j = m; j>0; j--){
                int a = newarr[j];
                int b = newarr[j -1];
                if(b > a){
                    newarr[j] = b;
                    newarr[j - 1] = a;
                }
            }
        }
        double res;
        if(newarr.length % 2 == 0){
            res = (newarr[newarr.length / 2] + newarr[(newarr.length/2) - 1])/2.0;
        }
        else {
            res = newarr[newarr.length/2];
        }
        return res;
    }
}