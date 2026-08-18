class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtPosition {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        int position = 3;
        int value = 30;

        Node newNode = new Node(value);

        Node current = head;

        // Move to the node before the position
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        // Print the list
        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
