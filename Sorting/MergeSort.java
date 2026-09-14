import java.util.Arrays;

public class MergeSort {

    /**
     * Sorts the given array in ascending order using Merge Sort.
     *
     * @param arr array to be sorted
     */
    public static void mergeSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursively divides the array into smaller subarrays.
     */
    private static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Divide
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // Merge sorted halves
        merge(arr, left, mid, right);
    }

    /**
     * Merges two sorted portions of the array.
     */
    private static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back into original array
        for (int index = 0; index < temp.length; index++) {
            arr[left + index] = temp[index];
        }
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
