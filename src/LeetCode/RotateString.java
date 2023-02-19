package LeetCode;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 1; j < s.length(); j++) {
                temp.append(s.charAt(j));
            }
            temp.append(s.charAt(0));
            System.out.println(temp);
            if (temp.toString().equals(goal)) {
                return true;
            }
            s = temp.toString();
        }
        return false;
    }
}
