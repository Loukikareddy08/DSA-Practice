public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(5, "Full Stack ");
        sb.delete(5, 15);

        System.out.println(sb);
    }
}
