package meta;

public class ArrDuplicates_4 {
    static Boolean checkDup(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,5};
        System.out.println(checkDup(arr));
    }
}
