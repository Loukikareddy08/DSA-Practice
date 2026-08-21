import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> queue = new LinkedList<>();

    // Push element onto stack
    public void push(int value) {

        queue.offer(value);

        int size = queue.size();

        // Move previous elements behind the new element
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    // Remove top element
    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        return queue.poll();
    }

    // Return top element
    public int peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return queue.peek();
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return stack size
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());
        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }
}
