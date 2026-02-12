package com.superEasyProblem;

public class XOROperationinanArray1486 {
    public int xorOperation(int n, int start) {
        int arr[] = new int [n];
        for(int i = 0; i< n; i++){
            int value = start + 2 * i;
            arr[i] = value;
        }
        int result = arr[0];
        for(int j = 1; j< arr.length; j++){
            result = arr[j -1] ^ arr[j];
            arr[j] = result;
        }
        return result;
      //another way
//        int result = 0;
//        for(int i = 0; i< arr.length; i++){
//            arr[i] = start + 2 * i;
//            result ^= arr[i];
//        }
//        return result;
    }
}
