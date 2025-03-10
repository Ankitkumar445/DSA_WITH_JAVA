package meta;

public class MaxProdSubarr_13 {
    public static int maxSubArrProd(int []nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int maxProd = Integer.MIN_VALUE;
        int prefixProd = 1, suffixProd = 1;
        for (int i = 0; i < n; i++) {
            prefixProd *= nums[i];
            suffixProd *= nums[n - 1 - i];
            maxProd = Math.max(maxProd, Math.max(prefixProd, suffixProd));

            if (prefixProd == 0) {
                prefixProd = 1;
            }
            if (suffixProd == 0) {
                suffixProd = 1;
            }

        }
        return maxProd;
    }
        public static void main(String []args){
         int []nums={0,0,0,0,0};
            System.out.println("Maximum subarray product "+maxSubArrProd(nums));
    }

}
