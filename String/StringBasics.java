public class StringBasics {
    public static void main(String[] args) {

        String name = "Loukika";

    
        System.out.println(name);

       
        System.out.println(name.length());
      
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));

        System.out.println(name.substring(0, 4));

        System.out.println(name.toUpperCase());
      
        System.out.println(name.toLowerCase());

        String text = "   Hello World   ";
        System.out.println(text.trim());
    }
}
