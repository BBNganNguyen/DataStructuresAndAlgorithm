package com.datastructures.array;


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
        ListNode retNode = new ListNode(0);
        ListNode firstNode = retNode;
        int number1 = 0;
        int number2 = 0;
        int z = 1;
        while (l1 != null) {
            number1 += l1.val * z;
            l1 = l1.next;
            z = z * 10;
        }
        z = 1;
        while (l2 != null) {
            number2 += l2.val * z;
            z = z * 10;
            l2 = l2.next;
        }
        int sum = number1 + number2;
        if( sum == 0) {
            return retNode;
        }
        while (sum > 0) {
            firstNode.next = new ListNode(sum % 10);
            sum /= 10;
            firstNode = firstNode.next;
        }
        return retNode.next;
    }

}
