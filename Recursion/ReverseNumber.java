public class ReverseNumber {

    static int reverse(int n, int reversed) {

        // Base case
        if (n == 0) {
            return reversed;
        }

        // Extract last digit and add it to reversed number
        int digit = n % 10;
        reversed = reversed * 10 + digit;

        // Recursive call
        return reverse(n / 10, reversed);
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reverse(n, 0));
    }
}
