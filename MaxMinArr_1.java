package meta;

public class MaxMinArr_1 {
    public static int setmini(int[]A,int N){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<mini){
                mini=A[i];
            }
        }
        return mini;
    }
    public static int setmax(int[]A,int N){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={8,9,1,7};
        int N=arr.length;
        System.out.println("Minimum element"+setmini(arr,N));
        System.out.println("Maximum element"+setmax(arr,N));


    }
}
