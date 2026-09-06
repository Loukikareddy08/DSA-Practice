public class GCD {

    static int gcd(int a, int b) {

        // Base case
        if (b == 0) {
            return Math.abs(a);
        }

        // Recursive case
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
    }
}
