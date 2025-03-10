package meta;

public class SearchRotateArr_6 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left part is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right part is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        SearchRotateArr_6 searcher = new SearchRotateArr_6();
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array
        int target = 0;

        int result = searcher.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
