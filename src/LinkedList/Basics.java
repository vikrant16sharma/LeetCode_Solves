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
    public void displayEnd(Node head){ // Time complexcity of the code will be O(N) and sapce Complexsity will be O(n).
        if(head == null){
            return;
        }
        displayEnd(head.next);
        System.out.print(head.val+"->");
    }
    public void displayRecursive(Node node){
        if(node == null){
            System.out.print("null");
            return;
        }
        System.out.print(node.val+"->");
        displayRecursive(node.next);
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
    public Node RcursiveReverseLL(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node prev = null;
        Node newHead = RcursiveReverseLL(head.next);
        head.next.next = head;
        head.next = prev;
        return newHead;
    }
    public void reverse (){
        head = RcursiveReverseLL(head);
    }
    public Node nthNodeFromTheLast(Node head, int n){
        Node pTemp = head;
        Node pNth = head;
        for(int i = 0;i<n ; i++){
            if(pTemp!=null) {
                pTemp = pTemp.next;
            }
        }
        while(pTemp != null){
            if(pNth == null){
                pNth = head;
            }
            else {
                pNth = pNth.next;
            }
            pTemp = pTemp.next;
        }
        if(pNth != null){
            return pNth;
        }
        return null;
    }
    public int counter = 0;
    public Node result = null;
    public Node nthNodeFromLast(Node head,int n){
        if (head!=null){
            nthNodeFromLast(head.next,n);
            counter++;
            if(counter == n){
                result = head;
            }
        }
        return result;
    }
//    finding the middle element in linked list
    public Node middleElement(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node fast = head.next, slow = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    /*Check wether the linked list is even or odd*/
    public void evenOrOdd(Node head){
        while(head != null && head.next!=null){
            head = head.next.next;
        }
        if(head == null){
            System.out.println("it an even linked list.");
        }
        System.out.println("its an odd.");
    }
//    reversing the pair of the linked list.


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
        obj.displayRecursive(obj.head);
        System.out.println();
//        obj.display(obj.reverseLL(obj.head));
//        System.out.println();
//        obj.reverse();
//        obj.display(obj.head);
//        Node ab = obj.nthNodeFromTheLast(obj.head, 2);
//        System.out.println(ab.val);
//        Node a = obj.nthNodeFromLast(obj.head , 3);
//        System.out.println(a.val);
//        Node middle = obj.middleElement(obj.head);
//        System.out.println(middle.val);
        obj.displayEnd(obj.head);
        obj.evenOrOdd(obj.head);
    }
}




