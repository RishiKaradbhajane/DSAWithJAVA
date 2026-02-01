package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo{
    public static void main(String[] args) {
        /*
         * Deque (Double Ended Queue) is a linear data structure that allows insertion and deletion of elements from both ends (front and rear).
         * It combines the properties of both stacks and queues.
         * 
         * Insertion Methods:
         * 1. addFirst(E e): Add an element to the front of the deque.
         * 2. addLast(E e): Add an element to the rear of the deque.
         * 3. offerFirst(E e): Add an element to the front of the deque (returns false if it fails).
         * 4. offerLast(E e): Add an element to the rear of the deque (returns false if it fails).
         */
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(30);
        System.out.println("Elements in Deque: " + deque);
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());
        System.out.println("Removed Front element: " + deque.removeFirst());
        System.out.println("Removed Rear element: " + deque.removeLast());
        System.out.println("Elements in Deque after removals: " + deque);

        /*
         * Removal Methods:
         * removeFirst() : Remove and return the front element of the deque.
         * removeLast() : Remove and return the rear element of the deque.
         * pollFirst() : Remove and return the front element of the deque (returns null if deque is empty).
         * pollLast() : Remove and return the rear element of the deque (returns null if
         */

         /*
          *  Examinatio Methods:
          * getFirst() : Retieves, but does not remove, the first element.
          * getLast() : Retrieves, but does not remove, the last element.
          * peekFirst() : Retrieves, but does not remove, the first element (returns null if deque is empty).
          * peekLast() : Retrieves, but does not remove, the last element (returns null if deque is empty).
          */

          /*
           *  Stack Methods:
           * push(E e) : Adds an element at the front (equivalent to addFirst).
           * pop() : Removes and returns the front element (equivalent to removeFirst).
           */

           Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
           // ArrayDeque uses circular array to store elements
           // Thus no need to shift elements, just move head and tail pointers
           // Resizes automatically when full
           System.out.println(deque1);
           deque1.addFirst(5);
           deque1.addLast(10);
           deque1.offerFirst(20);
           deque1.offerLast(25);
           System.out.println("First element : "+deque1.getFirst());
           System.out.println("Last element : "+deque1.getLast());
           deque1.removeFirst();
           deque1.pollLast();

           Deque<Integer> deque2  = new LinkedList<>(); // insertion, deletion somewhere in middle is faster
           // LinkedList uses doubly linked list to store elements
           deque2.remove();
    }

}
