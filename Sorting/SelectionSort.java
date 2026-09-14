import java.util.Arrays;

public class SelectionSort {

    /**
     * Sorts the given array in ascending order using Selection Sort.
     *
     * @param arr array to be sorted
     */
    public static void selectionSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first unsorted element
            if (minIndex != i) {

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
