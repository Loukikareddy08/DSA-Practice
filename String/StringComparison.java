public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Loukika";
        String s2 = "loukika";
        String s3 = "Loukika";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
    }
}
