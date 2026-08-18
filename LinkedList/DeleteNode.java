class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int value = 30;

        // If the head itself needs to be deleted
        if (head != null && head.data == value) {
            head = head.next;
        } else {

            Node current = head;

            // Find the node before the node to delete
            while (current != null &&
                   current.next != null &&
                   current.next.data != value) {

                current = current.next;
            }

            // Delete the node
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }

        // Print the list
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
