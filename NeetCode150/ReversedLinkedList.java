package NeetCode150;
/*
LEETCODE 206
TC = O(N)
SC = O(1)
 */
 class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReversedLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }
        return prev;
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
        System.out.println("Printing the elements of linkedlist : ");
        printList(node1);
        System.out.println("\nPrinting the elements of linkedlist in reverse order : ");
        reverseList(node1);
        printList(node4);
    }
}
