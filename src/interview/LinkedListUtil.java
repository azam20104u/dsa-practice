package interview;

public class LinkedListUtil {
    public static ListNode getListNodes(){
        ListNode node = new ListNode(10);
        node.next = new ListNode(20);
        node.next.next=new ListNode(30);
        node.next.next.next=new ListNode(40);
        node.next.next.next.next=new ListNode(50);
        return node;
    }
    public static ListNode getCircularListNodes(){
        ListNode node = new ListNode(10);
        node.next = new ListNode(20);
        node.next.next=new ListNode(30);
        node.next.next.next=new ListNode(40);
        node.next.next.next.next=new ListNode(50);
        node.next.next.next.next.next=node.next.next;
        return node;
    }
    public static void printListNodes(ListNode node){
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
