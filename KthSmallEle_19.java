package meta;
import java.util.Arrays;
public class KthSmallEle_19 {
        public static void main(String[] args) {
            int[] arr = {5, 8, 4, 6, 9, 3, 2, 1, 0};
            int k = 3;

            Arrays.sort(arr);

            int kthSmallest = arr[k - 1];
            System.out.println(k + "th smallest element is " + kthSmallest);

            int kthLargest = arr[arr.length - k];
            System.out.println(k + "th largest element is " + kthLargest);
        }
    }
