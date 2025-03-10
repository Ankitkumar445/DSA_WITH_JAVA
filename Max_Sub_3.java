package meta;

public class Max_Sub_3 {
    public static int maxSub(int[]arr){
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0;
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum=maxSub(arr);
        System.out.println("Maximum subarray sum is "+maxSum);
    }
}
