package meta;

public class SumPairSortedArr_15 {
    public static int findPivot(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // Prevent out-of-bounds
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return n - 1; // If no pivot is found, return the last index
    }

    public static boolean findSum(int[] arr, int target) {
        int n = arr.length;
        int pivot = findPivot(arr, n);

        int low = (pivot + 1) % n; // Smallest element (right after pivot)
        int high = pivot; // Largest element (pivot itself)

        while (low != high) {
            int currSum = arr[low] + arr[high]; // Calculate sum in the loop

            if (currSum == target) {
                System.out.println("The target is the sum of " + arr[low] + " and " + arr[high]);
                return true;
            }

            if (currSum < target) {
                low = (low + 1) % n; // Move forward in sorted order
            } else {
                high = (high + n - 1) % n; // Move backward
            }
        }

        System.out.println("Target sum not found.");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10}; // Sorted and rotated array
        int target = 16;
        findSum(arr, target);
    }
}
