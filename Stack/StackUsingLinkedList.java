public class StackUsingLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    // Push element onto stack
    public void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        size++;
    }

    // Remove and return top element
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        int value = top.data;
        top = top.next;

        size--;

        return value;
    }

    // Return top element without removing
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return top.data;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Return number of elements
    public int size() {
        return size;
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());
        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
