package interview;

public class CircularLinkedList {
    public static void main(String[] args) {
        ListNode circularListNodes = LinkedListUtil.getCircularListNodes();
        System.out.println(detectCircular(circularListNodes));
    }

    private static boolean detectCircular(ListNode circularListNodes) {
        ListNode first = circularListNodes;
        ListNode slow = circularListNodes;
        while (first!=null&& first.next!=null){
            first = first.next.next;
            slow = slow.next;
            if (slow==first) return  true;
        }
        return false;
    }
}
