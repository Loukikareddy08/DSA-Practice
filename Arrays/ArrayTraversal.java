public class ArrayTraversal {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Using normal for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Using enhanced for loop:");
        for (int value : arr) {
            System.out.println(value);
        }

        System.out.println("Traversing in reverse:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
