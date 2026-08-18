class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchNode {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int value = 30;
        boolean found = false;

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                found = true;
                break;
            }

            current = current.next;
        }

        if (found) {
            System.out.println(value + " found");
        } else {
            System.out.println(value + " not found");
        }
    }
}
