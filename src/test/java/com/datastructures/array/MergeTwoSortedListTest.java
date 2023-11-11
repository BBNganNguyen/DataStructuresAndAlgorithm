package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static com.datastructures.array.MergeTwoSortedList.mergeTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListTest {

    @Test
    public void testMergeTwoShortedList() {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(4);

        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);
        ListNode node = mergeTwoLists(a, b);
        assertEquals(1, node.val);
        assertEquals(1, node.next.val);
        assertEquals(2, node.next.next.val);
        assertEquals(3, node.next.next.next.val);
        assertEquals(4, node.next.next.next.next.val);
    }

    @Test
    public void testMergeTwoShortedList_emptyList_returnNull() {
        ListNode a = null;
        ListNode b = null;

        ListNode node = mergeTwoLists(a, b);
        assertEquals(null, node);
    }

    @Test
    public void testMergeTwoShortedList_1emptyList_return0() {
        ListNode a = null;
        ListNode b = new ListNode(0);

        ListNode node = mergeTwoLists(a, b);
        assertEquals(0, node.val);
    }
}
