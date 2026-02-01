package Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuDemo {
    public static void main(String[] args) {
        // Thread-safe queue implementation
        // wait for queue to become non-empty / wait for space to become available
        // Simplify concurrency problems like producer-consumer
        // Blocking queue 
          // put() : Blocks if the queue is full until space becomes available
          // take() : Blocks if the queue is empty until an element becomes available
          // offer(E e, long timeout, TimeUnit unit) : Adds an element to the queue, waiting up to the specified time if necessary for space to become available

        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
        // A bounded, blocking queue backed by an array.
    }
}
