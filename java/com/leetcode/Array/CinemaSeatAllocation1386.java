package com.leetcode.Array;

import java.util.*;

public class CinemaSeatAllocation1386 {
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {

            //    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

            //     int count = 0;
            //     for(int i = 0; i< reservedSeats.length; i++){
            //         if(map.containsKey(reservedSeats[i][0])){
            //             ArrayList <Integer> arr = map.get(reservedSeats[i][0]);
            //             arr.add(reservedSeats[i][1]);
            //             map.put(reservedSeats[i][0] , new ArrayList<>(arr));
            //         }
            //         else{
            //             ArrayList<Integer> arr = new ArrayList<>();
            //             arr.add(reservedSeats[i][1]);
            //             map.put(reservedSeats[i][0] , arr);
            //         }
            //     }

            //     for(int i = 1; i<= n; i++){

            //         if(!map.containsKey(i)){
            //             count +=2;
            //             continue;
            //         }
            //         int k = isAvailableSeats(map , i , 2 , 5);
            //         int m = isAvailableSeats(map ,i , 6 , 9);
            //         if(k != -1 && m != -1){
            //             count += 2;
            //         }
            //         else if(k == -1 && m == -1){
            //             int l = isAvailableSeats(map ,i , 4 , 7);
            //             if(l != -1){
            //                 count += 1;
            //             }
            //         }
            //         else {
            //             count += 1;
            //         }
            //     }
            //     return count;
            // }
            // public static int isAvailableSeats(HashMap<Integer , ArrayList<Integer>> map , int index , int start , int end){

            //     for(int i = start; i<= end; i++){

            //         if(map.containsKey(index)){
            //             ArrayList<Integer> arr = map.get(index);
            //             if(arr.contains(i)){
            //                 return -1;
            //             }
            //         }
            //     }
            //     return 1;
            // } //it is my method but Time limit exceeded

            HashMap<Integer , Set<Integer>> map = new HashMap<>();
            int count = 0;
            for(int i = 0; i<reservedSeats.length; i++){
                if(map.containsKey(reservedSeats[i][0])){
                    Set<Integer> set = map.get(reservedSeats[i][0]);
                    set.add(reservedSeats[i][1]);
                    map.put(reservedSeats[i][0] , set);
                }
                else {
                    Set<Integer> set = new HashSet<>();
                    set.add(reservedSeats[i][1]);
                    map.put(reservedSeats[i][0] , set);
                }
            }
            count = (n - map.size()) * 2;
            for(Set<Integer> reserved : map.values()){
                boolean left = !(reserved.contains(2) || reserved.contains(3) || reserved.contains(4) || reserved.contains(5));
                boolean right = !(reserved.contains(6) || reserved.contains(7) || reserved.contains(8) || reserved.contains(9));
                boolean middle = !(reserved.contains(4) || reserved.contains(5) || reserved.contains(6) || reserved.contains(7));

                if(left) count++;
                if(right) count++;
                if(!left && !right && middle){
                    count ++;
                }

            }

            return count;
    }
    public static void main(String [] args){
        int n = maxNumberOfFamilies(3 ,new int[][]{{2,1},{1,8},{2,6}});
        System.out.println(n);
    }
}
