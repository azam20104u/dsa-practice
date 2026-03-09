package interview;

import util.LinkedListUtil;
import util.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = LinkedListUtil.getListNodes();
        ListNode prev = reverseListNodes(head);
        LinkedListUtil.printListNodes(prev);
    }

    private static ListNode reverseListNodes(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
