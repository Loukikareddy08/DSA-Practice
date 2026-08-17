public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
            frequency[s2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);
    }
}
