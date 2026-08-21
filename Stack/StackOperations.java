import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Pop
        System.out.println("Removed: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Size
        System.out.println("Size: " + stack.size());

        // Check empty
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
