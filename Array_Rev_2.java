package meta;

public class Array_Rev_2 {
    static void revArr(int[]arr){
        int n=arr.length;
        int []temp=new int[n];
        for(int i=0;i<n;i++) {
            temp[i] = arr[n - i - 1];
        }
            for(int i=0;i<n;i++) {
                arr[i] = temp[i];
            }
    }
    public static void main(String[] args) {
        int[]arr={2,8,5,6,7};
        revArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
