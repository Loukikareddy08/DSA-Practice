public class ArrayUpdate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int newValue = 100;

        arr[index] = newValue;

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
