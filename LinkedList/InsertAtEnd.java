class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Create new node
        Node newNode = new Node(40);

        // Find the last node
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Connect new node at the end
        current.next = newNode;

        // Print the linked list
        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
