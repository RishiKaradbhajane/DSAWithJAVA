package NeetCode150;
/*
LEETCODE 2
TC = O(max(m,n))
SC = O(1)
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static ListNode addTwoNumberss(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int x = l1!=null ? l1.val : 0;
            int y = l2!=null ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            ans.next = new ListNode(sum%10);
            ans = ans.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args){
        // Example: l1 = [2,4,3] (represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Example: l2 = [5,6,4] (represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("\nList 2: ");
        printList(l2);
        System.out.println("\nAfter adding numbers : ");
        ListNode result = addTwoNumberss(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
