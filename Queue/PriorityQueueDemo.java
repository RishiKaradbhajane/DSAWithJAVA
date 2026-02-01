package Queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering ( for primitivs lowest to highest)
        // Does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        // System.out.println(pq.remove());
        // System.out.println(pq.peek());
        // Below loop will print all the elements in ASCEDING order
        // Note: PriorityQueue does not sort the elements in the queue itself, it just ensures that the head of the queue is the smallest element
        System.out.println(pq); // May not be in sorted order
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        /*
         * Internal working  of Priority Queue:
         * PriorityQueue is implemented as a min-heap by default (for natural ordering).
         * A min-heap is a complete binary tree where the value of each node is less than or equal to the values of its children.
         * This property ensures that the smallest element is always at the root of the tree.
         * T.C. of insertion, deletion is O(log n)
         * T.C. of peek is O(1)
         */
        // To impelement max-heap using PriorityQueue
        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(15);
        maxHeap.add(10);    
        maxHeap.add(30);
        maxHeap.add(5);
        System.out.println("Max Heap: "+ maxHeap);
        while(!maxHeap.isEmpty()){
            System.out.print(" "+maxHeap.poll());
        }
        PriorityQueue<Employee> empPQ  = new PriorityQueue<>((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        empPQ.add(new Employee(1,"Alice","HR",60000));
        empPQ.add(new Employee(2,"Bob","IT",75000));
        empPQ.add(new Employee(3,"Charlie","Finance",50000));
        System.out.println("\nEmployees in ascending order of salary:");
        while(!empPQ.isEmpty()){
            Employee emp = empPQ.poll();
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }
    }
}
