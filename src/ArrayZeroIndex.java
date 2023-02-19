import java.util.Arrays;

public class ArrayZeroIndex {
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayZeroIndex(nums)));
    }

    private static int[] arrayZeroIndex(int[] nums) {
        StringBuilder str = new StringBuilder();
        for (int value : nums) {
            str.append(value);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[0];
            nums[0] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
