import java.util.Arrays;

public class InsertionSort {

    /**
     * Sorts the given array in ascending order using Insertion Sort.
     *
     * @param arr array to be sorted
     */
    public static void insertionSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift larger elements one position to the right
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert current element into its correct position
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 6, 1, 3};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
