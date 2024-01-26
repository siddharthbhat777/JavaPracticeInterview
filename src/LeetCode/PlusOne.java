package LeetCode;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = new int[]{9, 9};
        int [] result = optimisedPlusOne(digits);
        for (int a : result) {
            System.out.println(a);
        }
    }

    private static int[] optimisedPlusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // assigning last number as zero to make a bigger number than last 9
        }
        digits = new int[digits.length + 1]; // increasing length of array
        digits[0] = 1; // all the numbers should be 9 for this action
        return digits;
    }

    private static int[] plusOne(int[] digits) {
        StringBuilder numStr = new StringBuilder();
        for (int element : digits) {
            numStr.append(element);
        }
        long calculate = Long.parseLong(numStr.toString());
        numStr.replace(0, numStr.length(), String.valueOf(calculate + 1));
        int [] result = new int[numStr.toString().length()];
        for (int j = 0; j < result.length; j++) {
            result[j] = Integer.parseInt(String.valueOf(numStr.charAt(j)));
        }
        return result;
    }
}
