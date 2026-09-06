public class ReverseString {

    static String reverse(String str) {

        // Base case
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "HELLO";

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverse(str));
    }
}
