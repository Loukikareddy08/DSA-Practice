public class FirstOccurrence {

    public static int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer = mid;
                right = mid - 1;       // Search left for earlier occurrence
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

        int result = findFirst(nums, target);

        System.out.println("First occurrence: " + result);
    }
}
