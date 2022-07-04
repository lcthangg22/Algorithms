import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] a) {
        int n = a.length;
        for (int i = n -1;i >=0; i--) {
            if (i != n-1) {
                a[i] = Math.max(a[i],a[i+1]);
            }
        }

        // Dịch toàn bộ mảng sang bên trái 1 đơn vị
        for (int i = 1; i < n; i++) {
            a[i-1] = a[i];
        }

        // Gán phần tử cuối cùng là -1
        if (n>0) {
            a[n-1] = -1;
        }
        System.out.println(Arrays.toString(a));
            return a;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);

    }
}
