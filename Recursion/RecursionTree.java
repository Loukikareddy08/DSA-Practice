public class RecursionTree {

    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printTree(int n, String indent) {

        System.out.println(indent + "fib(" + n + ")");

        if (n <= 1) {
            return;
        }

        printTree(n - 1, indent + "├── ");
        printTree(n - 2, indent + "└── ");
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Recursion Tree for Fibonacci(" + n + "):");
        printTree(n, "");
        
        System.out.println("\nResult: " + fibonacci(n));
    }
}
