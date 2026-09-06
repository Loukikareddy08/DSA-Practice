public class Factorial {

    static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
