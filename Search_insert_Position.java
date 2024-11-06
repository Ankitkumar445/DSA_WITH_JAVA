package Dsa;

public class Search_insert_Position {
    public static int searchInsert(int[]nums,int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums[]={2,3,5,6,5};
        int target=4;
        System.out.println(searchInsert(nums,target));
    }
}
