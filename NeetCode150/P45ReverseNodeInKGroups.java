package NeetCode150;
/*
LEETCODE 25
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
public class P45ReverseNodeInKGroups {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode ptr = head;
        ListNode newHead = null;
        ListNode KTail = null;

        while(ptr != null){
            int count = 0;
            ptr = head;

            while(count < k && ptr != null){
                ptr = ptr.next;
                count++;
            }
            if(count == k){
                ListNode revHead = reverseList(head, k);

                if(newHead == null){
                    newHead = revHead;
                }
                if(KTail != null){
                    KTail.next = revHead;
                }
                KTail = head;
                head = ptr;
            }
        }
        if(KTail != null){
            KTail.next = head;
        }
        return newHead==null?head:newHead;
    }
    public static ListNode reverseList(ListNode head, int k){
        ListNode ptr = head;
        ListNode newHead = null;

        while(k>0){
            ListNode newNode = ptr.next;
            ptr.next = newHead;
            newHead = ptr;
            ptr = newNode;
            k--;
        }
        return newHead;
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        P45ReverseNodeInKGroups obj = new P45ReverseNodeInKGroups();

        // Create sample list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        int k = 3;

        System.out.println("Original List:");
        printList(head);

        head = obj.reverseKGroup(head, k);

        System.out.println("After reversing in groups of " + k + ":");
        printList(head);
    }

}
