package LinkedList;

public class Basics {
    public int size = 0;
    public Node head;
    public class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
        public Node(int val,Node next){
            this.next = next;
            this.val = val;
        }
    }
//    Insert FIrst in the linked list
    public Node insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;

        }
        size++;
        return head;
    }
//    insert last in the linked list
    public void insertLast(Node head,int val){
        Node newNode = new Node(val);
        if(head==null){
            insertFirst(val);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
//    display the linked list

    public void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
//    insert the element onthe different ppositons
    public void insertPosition(Node head,int val,int pos){
        if(pos<0 || pos>size){
            System.out.println("it can't ouccur in this senerio.");
        }
        Node newNode = new Node(val);
        if(head == null){
            insertFirst(val);
        }
        Node temp = head;
        for(int i = 0;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static void main(String[] args) {
//        we will perform some basics insertions and deletions on the linked list to getbetter idea of basics
        Basics obj = new Basics();
        obj.insertFirst(3);
        obj.insertFirst(2);
        obj.insertFirst(1);
        obj.display(obj.head);
        System.out.println();
        obj.insertLast(obj.head, 5);
        obj.insertLast(obj.head, 6);
        obj.display(obj.head);
        System.out.println();
        obj.insertPosition(obj.head,4,3);
        obj.display(obj.head);
    }
}




