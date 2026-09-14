import java.util.Arrays;

public class QuickSort {

    /**
     * Sorts the given array in ascending order using Quick Sort.
     *
     * @param arr array to be sorted
     */
    public static void quickSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursively partitions and sorts the array.
     */
    private static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    /**
     * Places the pivot in its correct position.
     */
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int smallerIndex = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                smallerIndex++;

                swap(arr, smallerIndex, j);
            }
        }

        // Place pivot in its correct position
        swap(arr, smallerIndex + 1, high);

        return smallerIndex + 1;
    }

    /**
     * Swaps two elements in the array.
     */
    private static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quickSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
