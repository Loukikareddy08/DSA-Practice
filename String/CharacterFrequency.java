public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "banana";

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " → " + frequency[i]);
            }
        }
    }
}
