package interview;

import util.LinkedListUtil;
import util.ListNode;

public class NthNodeFromLast {
    public static void main(String[] args) {
        ListNode listNodes = LinkedListUtil.getListNodes();
        System.out.println(findNthNode(listNodes,2).data);
    }

    private static ListNode findNthNode(ListNode listNodes, int k) {
        ListNode first = listNodes;
        ListNode slow = listNodes;
        for (int i=01; i<=k;i++){
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            slow=slow.next;
        }
        return slow;
    }
}
