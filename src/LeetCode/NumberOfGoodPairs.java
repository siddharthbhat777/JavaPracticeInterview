package LeetCode;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1};
        System.out.println(numberOfGoodPairs(arr));
    }

    private static int numberOfGoodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }
}
