import java.util.Arrays;

public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        // 2 con trỏ trên 1 mảng
        int n = nums.length;
        int i = 0;
        int j = n -1;

        while (i<j) {
            if (nums[i] % 2 != 0) { // nums[i] là số lẻ
                if (nums[j] % 2 ==0) { // nums[j] số chẫn
                    if (i<j) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                } else { // Số lẻ
                    j--;
                }
            } else { // nums[i] là số chẵn
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));

    }
}
