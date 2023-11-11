package com.datastructures.array;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeTwoSortedList {
    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode  mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> listNode = new ArrayList<>();
        ListNode returnNode = new ListNode(0);
        ListNode temp = returnNode;
        while (list1 != null) {
            listNode.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            listNode.add(list2.val);
            list2 = list2.next;
        }
        listNode.sort(Comparator.naturalOrder());
        for (Integer node: listNode) {
            returnNode.next = new ListNode(node);
            returnNode = returnNode.next;
        }

        return temp.next;
    }

//    public static void main(String[] args) {
//
//        ListNode a = new ListNode(5);
//        a.next = new ListNode(10);
//        a.next.next = new ListNode(15);
//        a.next.next.next = new ListNode(40);
//
//        ListNode b = new ListNode(2);
//        b.next = new ListNode(3);
//        b.next.next = new ListNode(20);
//       ListNode node =  mergeTwoLists(a,b);
//       while (node != null) {
//           System.out.print(node.val + " ");
//           node = node.next;
//       }
//    }
}

