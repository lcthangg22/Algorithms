package Practice;

public class _27_Remove_Element {
    public static int removeElement(int[] a, int val) {
//        int n = a.length;
//
//        for (int i = 0; i < n;) {
//            if (nums[i] == val) {
//                // Xóa phần tử nums[i]
//                for (int j = i; j < (n-1); j++) {
//                    nums[j] = nums[j+1];
//                }
//                n--;
//            } else { // Không phải xóa
//                i++;
//            }
//        }
//    return n;
        int n = a.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != val) {
                a[x] = a[i];
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
