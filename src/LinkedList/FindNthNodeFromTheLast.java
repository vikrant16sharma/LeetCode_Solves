package LinkedList;

public class FindNthNodeFromTheLast {
    public int size = 0;
    public Node head;
    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.next = next;
            this.val = val;
        }
    }
    public Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {

    }
}
