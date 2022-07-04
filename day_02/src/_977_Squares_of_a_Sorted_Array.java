import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        int i = nums.length - 1;

        while (left <= right){
            int lValue = nums[left] *nums[left];
            int rValue = nums[right] * nums[right];

            if(lValue > rValue){
                result[i] = lValue;
                left++;
            }else {
                result[i] = rValue;
                right--;
            }
            i--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] rs = sortedSquares(nums);
        System.out.println(Arrays.toString(rs));
    }
}
