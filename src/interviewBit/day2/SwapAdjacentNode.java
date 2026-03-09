package interviewBit.day2;

import util.LinkedListUtil;
import util.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/*
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null || A.next==null) return  A;
        ListNode prev=A;
        ListNode curr=A.next;
        ListNode next = curr.next;

        curr.next=A;
        prev.next=swapPairs(next);
        return curr;
    }
}
*/

public class SwapAdjacentNode {
    public static void main(String[] args) {
        ListNode head = LinkedListUtil.getListNodes();
        System.out.println("Before swape nodes are");
        LinkedListUtil.printListNodes(head);
        ListNode swaptNodes = swapNodes(head);
        LinkedListUtil.printListNodes(swaptNodes);
    }

    private static ListNode swapNodes(ListNode A) {
       ListNode head = A.next; //after swape new head will be the second node
        ListNode prev = null;// make connection between previous and next pair of nodes
        while (A!=null&& A.next!=null){
            ListNode first = A;
            ListNode second = A.next;
            first.next=second.next;
            second.next=first;
            if (prev!=null){
                prev.next=second;
            }
            prev=first;
            A=first.next;
        }
        return head;
    }
}
