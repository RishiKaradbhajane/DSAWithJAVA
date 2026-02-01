package LinkedList;

public class LinkedList2 {
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
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
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

        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null; // breaking LinkedList from mid
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate zig-zag merge
        while (left != null && right != null) {
             nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("" + null);
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);

        System.out.println("before sorting");

        ll.display();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("\nAfter Sorting");
        ll.display();

        ll.zigZag();

        ll.display();

    }
}
