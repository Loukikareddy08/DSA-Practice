public class BinarySearchRecursive {

    public static int search(int[] nums, int target, int left, int right) {

        // Base case: target not found
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Search right half
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, right);
        }

        // Search left half
        return search(nums, target, left, mid - 1);
    }

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;

        int result = search(nums, target, 0, nums.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
