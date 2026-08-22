public class Deque {

    private final int[] deque;
    private final int capacity;

    private int front;
    private int size;

    public Deque(int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be positive"
            );
        }

        this.capacity = capacity;
        this.deque = new int[capacity];

        front = 0;
        size = 0;
    }

    // Add element at front
    public void addFirst(int value) {

        if (isFull()) {
            throw new IllegalStateException("Deque is Full");
        }

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;

        size++;
    }

    // Add element at rear
    public void addLast(int value) {

        if (isFull()) {
            throw new IllegalStateException("Deque is Full");
        }

        int rear = (front + size) % capacity;

        deque[rear] = value;

        size++;
    }

    // Remove element from front
    public int removeFirst() {

        if (isEmpty()) {
            throw new IllegalStateException("Deque is Empty");
        }

        int value = deque[front];

        front = (front + 1) % capacity;

        size--;

        return value;
    }

    // Remove element from rear
    public int removeLast() {

        if (isEmpty()) {
            throw new IllegalStateException("Deque is Empty");
        }

        int rear = (front + size - 1) % capacity;

        int value = deque[rear];

        size--;

        return value;
    }

    // View first element
    public int peekFirst() {

        if (isEmpty()) {
            throw new IllegalStateException("Deque is Empty");
        }

        return deque[front];
    }

    // View last element
    public int peekLast() {

        if (isEmpty()) {
            throw new IllegalStateException("Deque is Empty");
        }

        int rear = (front + size - 1) % capacity;

        return deque[rear];
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
            System.out.println("Deque is Empty");
            return;
        }

        System.out.print("Deque: ");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % capacity;

            System.out.print(deque[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Deque deque = new Deque(5);

        deque.addLast(20);
        deque.addLast(30);

        deque.addFirst(10);
        deque.addFirst(5);

        deque.display();

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        deque.display();

        System.out.println("Size: " + deque.size());
    }
}
