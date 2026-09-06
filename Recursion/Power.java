public class Power {

    static long power(long x, int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursively calculate x^(n/2)
        long half = power(x, n / 2);

        // If exponent is even
        if (n % 2 == 0) {
            return half * half;
        }

        // If exponent is odd
        return x * half * half;
    }

    public static void main(String[] args) {

        long x = 2;
        int n = 10;

        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}
