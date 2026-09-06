public class SumOfNumbers {

    static int sum(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum(n));
    }
}
