public class LastOccurrence {

    public static int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer = mid;
                left = mid + 1;       // Search right for later occurrence
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int result = findLast(nums, target);

        System.out.println("Last occurrence: " + result);
    }
}
