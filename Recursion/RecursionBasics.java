public class RecursionBasics {

    // Recursive method
    static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Work
        System.out.println(n);

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        printNumbers(n);
    }
}
