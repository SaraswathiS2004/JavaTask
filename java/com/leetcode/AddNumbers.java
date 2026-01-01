package com.leetcode;

public class AddNumbers {

    public static ListNode add(){

        int sum1 = 0;
        int sum2 = 0;
        ListNode node1 = null;
        ListNode node2 = null;

        int n1 = 243;
        int n2 = 564;
        while(n1 != 0 || n2 != 0){
            sum1 += n1 % 10;
            n1 = n1 / 10;
            sum2 += n2 % 10;
            n2 = n2 /10;
        }
        System.out.println(sum1 +" "+ sum2);

        return new ListNode();
    }
    public static void main(String [] args){

        add();
    }
}
