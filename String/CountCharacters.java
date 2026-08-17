public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello World 123";

        int letters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
