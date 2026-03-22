package NeetCode150;
/*
LEETCODE 141
TC = O(N)
SC = O(1)
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class P41LinkedListCycle {
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        l3.next = l2;

        //printList(l1);
        
        boolean flag = hasCycle(l1);
        if(flag == true){
            System.out.println("the LinkedList contains the cycle ");
        }else{
            System.out.println("the above LinkedList does not contains the cycle");
        }
    }
}
