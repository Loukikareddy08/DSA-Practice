public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int left, int right, int target) {

        // Base case: target not found
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search right half
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        }

        // Search left half
        return binarySearch(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
