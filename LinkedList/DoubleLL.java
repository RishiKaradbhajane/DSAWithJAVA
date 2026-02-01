package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("no linkedlist is present");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;  
        head.prev = null;  
        size--;
        return val;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("No DLL present");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }  

    public void reverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.display();
        dll.addLast(4);
        dll.display();
        int d = dll.removeLast();
        System.out.println(d);
        dll.reverseDLL();
        dll.display();
    }

}