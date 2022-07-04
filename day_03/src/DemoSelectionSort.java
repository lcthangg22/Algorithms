import java.util.Arrays;

public class DemoSelectionSort {
    public static void main(String[] args) {
        int[] a = {4,2,1,7,5};

        //        int[] sortArr = sort(a);
        int[] sortArr = sort_(a);
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] sort_(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            // tìm phần tử nhỏ nhất
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[min]) {
                    min= j;
                }

            }
            System.out.println("Phần tử nhỏ nhất " + a[min]);
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));
        }
    return a;
    }
}
