package meta;

public class prodArrExecept_self_12 {
    public static void findProd(int arr[],int prod[],int n){
        int prefix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        int suffix[]=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            prod[i]=prefix[i]*suffix[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n= arr.length;
        int prod[]=new int[n];
        findProd(arr,prod,n);
        System.out.println("The product of the array except is:");
        for(int i=0;i<n;i++){
            System.out.print(prod[i]+"\t");
        }
        System.out.println();
    }
}
