public class QueueUsingLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Add element at rear
    public void enqueue(int value) {

        Node newNode = new Node(value);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Remove element from front
    public int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow");
        }

        int value = front.data;

        front = front.next;
        size--;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // View front element
    public int peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node current = front;

        System.out.print("Queue: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());
        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}
