package Practice;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] a) {
        int n = a.length;
        int x = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != a[x]) {
                x++;
                a[x] = a[i];
            }
        }
    return x+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
