package com.datastructures.linkedlist;

import com.datastructures.array.ListNode;
import java.util.HashMap;
import java.util.Map;

public class MyLinkedList {

    ListNode head;
    ListNode tail;

    public MyLinkedList() {

    }

    // 1 -> 2 -> 3  
    public int get(int index) {
        ListNode curr = head;
        int i = 0;
        while(curr != null) {
            if(i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    //  2 -> 3 > 5
    // head = 2;
    // newNode = newNode(1);
    // mewNode.next = head;
    // head = newNOde
    // 
    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode(val);
            tail = head;
        } else {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        if(tail == null) {
            tail = new ListNode(val);
            if( head == null) {
                head = tail;
            }
        } else {
            ListNode newNode = new ListNode(val);
            tail.next = newNode;
            tail = newNode;
        }

    }


    // 1 -> 3 index = 1 add = 2
    // i curr newNode
    // 0  1   ->  2
        //2 -> 3>
        //1 -> 2
    //
    // curr
    // curr.next = newNode;
    // newNode.next = current.next.next;
    //
    public void addAtIndex(int index, int val) {
        ListNode curr = head;
        int i = 0;
        while(curr != null) {
            if(i == index -1) {
                ListNode newNode = new ListNode(val);
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }
            curr = curr.next;
            i++;
        }
    }

    //  1 -> 2 -> 3 index = 1
    //
    public void deleteAtIndex(int index) {
        ListNode curr = head;
        int i = 0;
        if(index == 0) {
            head = null;
            return;
        }
        while(curr != null) {
            if(i == index-1) {
                curr.next = curr.next.next;
                head = curr.next;
                break;
            }
        }
    }

    // 1 -> 2 -> 3
    public static void main(String[] args) {
        Map map  = new HashMap<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        String s = "string";

    }
}
