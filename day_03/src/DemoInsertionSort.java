import java.util.Arrays;

public class DemoInsertionSort {
    public static void main(String[] args) {
        int[] a = {4,2,1,7,5};

//        int[] sortArr = sort(a);
        int[] sortArr = sort_(a);
        System.out.println(Arrays.toString(sortArr));
    }

    private static int[] sort_(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i -1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }
}
