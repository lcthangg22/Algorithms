import java.util.Arrays;

public class DemoBubbleSort {
    public static void main(String[] args) {
        int[] a = {4,2,1,7,5};

//        int[] sortArr = sort(a);
        int[] sortArr = sort_(a);
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] sort(int[] a){
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.println("Lần lặp thứ " + (i+1));
            System.out.println(Arrays.toString(a));
        }

        return a;
    }

    public static int[] sort_(int[] a){
        int n = a.length;

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        sorted =false;
                    }
                }
                System.out.println("Lần lặp thứ " + (i+1));
                System.out.println(Arrays.toString(a));
            }
        }


        return a;
    }
}
