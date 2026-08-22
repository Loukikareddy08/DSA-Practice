public class CircularQueue {

    private final int[] queue;
    private final int capacity;

    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be positive"
            );
        }

        this.capacity = capacity;
        this.queue = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Add element at rear
    public void enqueue(int value) {

        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;

        size++;
    }

    // Remove element from front
    public int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
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

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % capacity;

            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();

        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}
