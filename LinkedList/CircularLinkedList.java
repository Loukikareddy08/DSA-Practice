class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect nodes
        head.next = second;
        second.next = third;

        // Last node points back to head
        third.next = head;

        // Traverse circular linked list
        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}
