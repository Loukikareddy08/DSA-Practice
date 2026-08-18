class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {

            // Save next node
            next = current.next;

            // Reverse the link
            current.next = prev;

            // Move prev forward
            prev = current;

            // Move current forward
            current = next;
        }

        // New head
        head = prev;

        // Print reversed list
        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
