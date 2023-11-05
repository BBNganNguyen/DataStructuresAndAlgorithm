package com.datastructures.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {



    @Test
    public void testAddTwoNumbers(){
        ListNode node1 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node1.next = node12;
        node12.next = node13;

        ListNode node2 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node2.next = node22;
        node22.next = node23;
        ListNode result = AddTwoNumbers.addTwoNumbers(node1,node2);


        assertEquals( 7, result.val);
        assertEquals( 0, result.next.val);
        assertEquals( 8, result.next.next.val);
    }

    @Test
    public void testAddTwoNumbers_return0(){
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);

        ListNode result = AddTwoNumbers.addTwoNumbers(node1,node2);
        assertEquals( 0, result.val);
    }

    @Test
    public void testAddTwoNumbers_nullListNode_return0(){
        ListNode node1 = null;
        ListNode node2 = null;

        ListNode result = AddTwoNumbers.addTwoNumbers(node1,node2);
        assertEquals( 0, result.val);
    }

}
