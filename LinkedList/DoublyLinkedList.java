class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {

        // Create first node
        Node head = new Node(10);

        // Create second node
        Node second = new Node(20);

        // Connect first and second
        head.next = second;
        second.prev = head;

        // Create third node
        Node third = new Node(30);

        // Connect second and third
        second.next = third;
        third.prev = second;

        // Forward traversal
        System.out.println("Forward:");

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        // Find last node
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        // Backward traversal
        System.out.println("\nBackward:");

        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
    }
}
