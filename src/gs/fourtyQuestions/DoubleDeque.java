package gs.fourtyQuestions;

public class DoubleDeque {
    Node head,tail;
    class Node{
        String value;
        Node next;
        Node prev;
        Node(String value){
            this.value=value;
        }
    }
    void addFirst(String value){
        Node node = new Node(value);
        if (head==null){
            head=tail=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }
    void addLast(String value){
        Node node = new Node(value);
        if (tail==null){
            head=tail=node;
            return;
        }
        node.prev=tail;
        tail.next=node;
        tail=node;
    }
    void removeFirst(){
        if (head==null) return;
        String  value = head.value;
        head=head.next;
        if (head!=null) head.prev=null;
        else tail=null;
    }
    String removeLast(){
        if (tail==null) return  null;
        String value = tail.value;
        tail=tail.prev;
        if (tail!=null) tail.next=null;
        else head=null;

        return value;
    }
    String peakFirst(){
        return head==null?null:head.value;
    }
    String peakLast(){
        return tail==null?null:tail.value;
    }
    public static void main(String[] args) {

    }
}
