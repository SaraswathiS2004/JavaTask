package com.leetcode;

import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum1 = 0;
        long sum2 = 0;
        ListNode list1 = l1;
        ListNode list2 = l2;
        long digit = 1;
        int value1 = list1.val;
        int value2 = list2.val;
        while (list1 != null || list2 != null) {
            if (list1 != null) {
                sum1 = sum1 + (value1 * digit);
                list1 = list1.next;
                if (list1 != null) {
                    value1 = list1.val;
                }
            }
            if (list2 != null) {
                sum2 = sum2 + (value2 * digit);
                list2 = list2.next;
                if (list2 != null) {
                    value2 = list2.val;
                }
            }
            digit *= 10;
        }
        long sum = sum1 + sum2;
        ListNode firstNode = null;
        ListNode previousNode = null;
        long result = 0;
        while (true) {
            ListNode node = new ListNode();
            result = sum % 10;
            node.val = Math.toIntExact(result);
            sum = sum / 10;
            if (firstNode == null) {
                firstNode = node;
                previousNode = node;
            } else {
                previousNode.next = node;
                previousNode = node;
            }
            if (sum == 0) {
                break;
            }
        }

        return firstNode;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] arr1 = {5, 6, 4};
        ListNode previous = null;
        ListNode first = null;
        for (int a : arr) {
            ListNode temp = new ListNode();
            temp.val = a;
            if (previous == null) {
                first = temp;
                previous = temp;
            } else {
                previous.next = temp;
                previous = temp;
            }
        }

        ListNode secondNode = null;
        ListNode secondPre = null;
        for (int a : arr1) {
            ListNode n2 = new ListNode(a);
            n2.val = a;
            if (secondPre == null) {
                secondNode = n2;
                secondPre = n2;
            } else {
                secondPre.next = n2;
                secondPre = n2;
            }
        }
        ListNode a = addTwoNumbers(first, secondNode);
        printNode(a);
    }

    public static void printNode(ListNode list) {
        ListNode li = list;
        while (li != null) {
            System.out.println(li.val);
            li = li.next;
        }
    }
}
