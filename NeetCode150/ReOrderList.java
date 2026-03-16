package NeetCode150;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReOrderList {
    public static void reorderList(ListNode head) {
        if(head == null) return;
        ListNode fast =  head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode  prev = null, curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head, second = prev;
        while(second.next!=null){
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        node1.next = node2;
        ListNode node3 = new ListNode(30);
        node2.next = node3;
        ListNode node4 = new ListNode(40);
        node3.next = node4;
        ListNode node5 = new ListNode(50);
        node4.next = node5;
        ListNode node6 = new ListNode(60);
        node5.next = node6;
        System.out.println("Printing the elements of linkedlist : ");
        printList(node1);
        System.out.println("\nreordering the elements of linkedlist : ");
        reorderList(node1);
        printList(node1);
    }
}

