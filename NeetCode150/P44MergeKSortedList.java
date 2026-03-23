package NeetCode150;
import java.util.PriorityQueue;
/*
LEETCODE 23
MOST ASKED LINKED LIST QUESTION ON LEETCODE
TC = O(NlgoN) (in priority queue elements are stored in log n and n elments, thus nlogn)
sc = o(N)
Priority queue is the best approach for this
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class P44MergeKSortedList {
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list != null){
                minHeap.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode merge = dummy;

        while(!minHeap.isEmpty()){
            merge.next = new ListNode(minHeap.poll());
            merge = merge.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        // Creating sample linked lists:
        // List 1: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        // Array of lists
        ListNode[] lists = {l1, l2, l3};

        // Merge
        ListNode result = mergeKLists(lists);

        // Print result
        System.out.print("Merged List: ");
        printList(result);
    }
}
