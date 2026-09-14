import java.util.Arrays;

public class HeapSort {

    /**
     * Sorts the given array in ascending order using Heap Sort.
     *
     * @param arr array to be sorted
     */
    public static void heapSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int end = n - 1; end > 0; end--) {

            // Move current maximum to the end
            swap(arr, 0, end);

            // Restore Max Heap property
            heapify(arr, end, 0);
        }
    }

    /**
     * Maintains the Max Heap property for the subtree
     * rooted at the given index.
     */
    private static void heapify(int[] arr, int heapSize, int root) {

        int largest = root;

        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        // Check left child
        if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Check right child
        if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If root is not the largest, swap and continue heapifying
        if (largest != root) {

            swap(arr, root, largest);

            heapify(arr, heapSize, largest);
        }
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

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        heapSort(arr);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
