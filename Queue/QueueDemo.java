package Queue;
import java .util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class QueueDemo {
    public static void main(String[] args) {
        /*
         * Queu is a linear data structure that follows the FIFO (First In First Out) principle.
         * Elements are added at the rear (enqueue) and removed from the front (dequeue).
         * Common operations:
         * 1. enqueue: Add an element to the rear of the queue. 
         * can be done using add() or offer() methods
         * 2. dequeue: Remove and return the front element of the queue.
         * can be done using remove() or poll() methods
         * 3. peek/front: Get the front element without removing it.
         * can be done using element() or peek() methods
         * 4. isEmpty: Check if the queue is empty.
         * can be done using isEmpty() methood
         * 5. size: Get the number of elements in the queue.
         * can be done using size() method
         * 
         * Though queue is an interface in java, it can be implemented using below classes:
         * 1. LinkedList
         * 2.PriorityQueue
         * 3.ArrayDeque
         */
        // when linkedlist is used to implement stack 
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(1); // enqueue
        stack.addFirst(4); // enqueue
        stack.addFirst(3); // enqueue
        System.out.println("elements in a stack "+ stack);
        System.out.println("top of the stack is " +stack.peek()); // Top of the stack
        System.out.println(stack.removeFirst()); // pop the top element
        System.out.println("elements in a stack "+ stack);

        // Linkedlist is also used to impelement queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println("elements in a queue "+ queue);
        System.out.println("front of the queue is " +queue.peek()); // front of the queue
        System.out.println(queue.removeFirst());// dequeue the element from front

        //Implemeting queue using inbuild queue interface
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.offer(4); // enqueue the element at the rear of the queue but if queue is full it returns false
        System.out.println("elements in a queue using queue interface "+ qu);
        System.out.println("front of the queue is " +qu.peek()); // front of the queue
        System.out.println(qu.remove());// dequeue the element from front but if queue is empty it throws exception
        System.out.println(qu.poll()); // dequeue the element from front but if queue is empty it returns null

        System.out.println(qu.element()); // returns the front element but if queue is empty it throws exception
        System.out.println(qu.peek()); // returns the front element but if queue is empty it returns null
        
        Queue<Integer> qu2 = new ArrayBlockingQueue<>(2);
        qu2.add(1);
        qu2.add(2);
        //qu2.add(3); // this will throw exception as the queue is full
        qu.offer(3); // this will return false as the queue is full
        System.out.println("elements in a queue using array blocking queue "+ qu2);
    }
}
