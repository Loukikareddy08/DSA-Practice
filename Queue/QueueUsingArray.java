public class QueueUsingArray {

    private final int[] queue;
    private final int capacity;

    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.capacity = capacity;
        this.queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Add element at rear
    public void enqueue(int value) {

        if (size == capacity) {
            throw new IllegalStateException("Queue Overflow");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Remove element from front
    public int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }

        int value = queue[front];

        front = (front + 1) % capacity;
        size--;

        return value;
    }

    // View front element
    public int peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());

        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Front: " + queue.peek());
    }
}
