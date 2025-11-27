package com.datastructures.linkedlist;

public class BrowserHistory {
    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }


    //curr -> tail
    //visit url  curr add new Node.
    // a <-> b <->d
    //       |
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.pre = curr;
        curr.next = newNode;
        curr = curr.next;
    }

    //int i = 0, i = steps
    //curr = currhomePage
    // prev != null
    // currhomePage

    // a <-> b <-> c <-> d step = 2
    // |
    public String back(int steps) {
        int i = 0;
        while(curr != null) {
            if(i == steps || curr.pre == null) {
                return curr.val;
            }
            i++;
            curr = curr.pre;
        }
        return curr.val;
    }

    //int =0, i == steps? current = currhomePage && curr.next!=null
    //if i < steps && current.next == null return currhomePage;
    // a <-> b <-> c <-> d
    //.            |
    public String forward(int steps) {
        int i = 0;
        while (curr != null) {
            if( i == steps || curr.next == null) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return curr.val;
    }
}

class Node {
    Node next;
    Node pre;
    String val;
    public Node(String val) {
        this.val = val;
        next = null;
        pre = null;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */