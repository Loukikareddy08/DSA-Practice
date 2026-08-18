public class StackUsingArray {

    int[] stack;
    int top;

    // Constructor
    StackUsingArray(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push
    void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    // Pop
    int pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    // Peek
    int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    // Display
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack:");
        s.display();

        System.out.println("Top: " + s.peek());

        System.out.println("Popped: " + s.pop());

        System.out.println("Stack after pop:");
        s.display();
    }
}
