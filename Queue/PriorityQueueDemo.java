import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Priority Queue: " + pq);

        // View highest-priority element
        System.out.println("Highest Priority: " + pq.peek());

        // Remove elements according to priority
        System.out.println("Removed: " + pq.poll());
        System.out.println("Removed: " + pq.poll());

        System.out.println("Highest Priority: " + pq.peek());

        // Check size
        System.out.println("Size: " + pq.size());

        // Check empty
        System.out.println("Is Empty: " + pq.isEmpty());
    }
}
