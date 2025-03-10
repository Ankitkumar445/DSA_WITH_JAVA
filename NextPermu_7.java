package meta;
import java.util.Arrays;
public class NextPermu_7 {
    public void nextPer(int[]nums){
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[]nums, int start){
        int end =nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        NextPermu_7 obj = new NextPermu_7();
        int[] nums = {3, 2, 1};

        System.out.println("Original Array: " + Arrays.toString(nums));
        obj.nextPer(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}


