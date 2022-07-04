import java.util.Arrays;

public class _1051_Height_Checker {

    public static void print(int[] a) {
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d, ", a[i]);
        }
        System.out.println();
    }

//    public static int heightChecker(int[] heights) {
//        int n = heights.length;
//        int[] copied = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            copied[i] = heights[i];
//        }
////        print(copied);
//
//        // selection sort
//        for (int i = 0; i < n; i++) {
//            int min = i;
//            for (int j = i + 1; j < n; j++) {
//                if (copied[j] < copied[min]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = copied[i];
//                copied[i] = copied[min];
//                copied[min] = temp;
//            }
//        }
//
////        print(copied);
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (heights[i] != copied[i]) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();
        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < n; i++){
            if (expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(arr));
    }
}
