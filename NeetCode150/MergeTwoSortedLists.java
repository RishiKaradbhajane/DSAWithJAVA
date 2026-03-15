package NeetCode150;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(1);
        ListNode merge = dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                merge.next = list1;
                list1 = list1.next;
            }else{
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        while(list1!=null){
            merge.next = list1;
            merge = merge.next;
            list1 = list1.next;
        }
        while(list2!=null){
            merge.next = list2;
            merge = merge.next;
            list2 = list2.next;
        }
        return dummy.next;
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
    }
}
