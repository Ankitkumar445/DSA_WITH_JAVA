package meta;

public class KthLarEle_10 {
    public static void main(String[] args) {
        int[] a = {5, 8, 4, 6, 9, 3, 2, 1, 0};
        int k = 4;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k+"th\t" + "largest element is\t" + a[i]);
            }
        }
        System.out.println("....");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
