package LinkedList;

import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node tail;
    public static Node head;
    public static int size;

    public void addAtFirst(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("" + null);
    }

    public void insert(int data, int index) {
        if (index == 0) {
            addAtFirst(data);
            return;
        }
        Node temp = head;
        Node node = new Node(data);
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty..");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty..");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int search(int data) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == data) {
                return i + 1;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int searchRecursive(int data) {
        Node temp = head;
        int i = 0;
        if (temp.data == data) {
            return i;
        } else {
            temp = temp.next;
            searchRecursive(temp.data);
            i++;
        }
        return i;
    }

    public void reverseLL(LinkedList arr) { // O(N)
        System.out.println();
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Amazon, flipkart,Qualcomm
    public void findNthNode(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;

        }
        prev.next = prev.next.next;
        return;
    }

    public boolean isPallindrome(Node head) {
        // T.C. O(N) AND S.C O(N)
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp.next != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        System.out.println(arr.toString());

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != arr.get(arr.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /*
     * solving using slow and fast approach
     * two pointers : slow, fast(both will start from head of the list)
     * slow will increment by +1
     * fast will increment by +2
     * also we have to find mid of the list
     * if list size is even
     * while(fast!=null)
     * if list size is odd
     * while(fast.next!=null)
     * because of above case when fast will reach at end, slow will be at mid point
     * of the list
     * if list before mid is equal to list after mid then is is pallindrome else not
     */
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPallindrome2() {
        if (head == null || head.next != null) {
            return true;
        }
        // step 1: findMid
        Node midNode = findMid(head);

        // step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // step 3: check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return;
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != head) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // midnode
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(0);
        Node temp = mergeLL.next;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, rightHead);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtFirst(1);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.display();
        System.out.println("\n" + ll.search(1));
        System.out.println(ll.searchRecursive(4));
        ll.insert(5, 2);
        //
        ll.display();
        System.out.println();
        // ll.reverseLL(ll);
        System.out.println();
        ll.display();
        System.out.println();
        ll.findNthNode(3);
        System.out.println();
        ll.display();
        System.out.println();

        LinkedList l = new LinkedList();
        l.addAtFirst(1);
        l.addAtFirst(2);
        l.addAtFirst(2);
        l.addAtFirst(1);
        System.out.println(l.isPallindrome(head));

        System.out.println();

        l.head = l.mergeSort(l.head);
        l.display();

        // LinkedList l2 = new LinkedList();
        // boolean b = l2.isPallindrome2();
        // System.out.println(b);

    }
}
