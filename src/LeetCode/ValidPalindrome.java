package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        StringBuilder alphanumeric = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphanumeric.append(String.valueOf(c).toLowerCase());
            }
        }
        return alphanumeric.toString().contentEquals(alphanumeric.reverse());
    }
}
