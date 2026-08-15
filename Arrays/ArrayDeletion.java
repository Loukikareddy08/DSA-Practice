import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int position = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
