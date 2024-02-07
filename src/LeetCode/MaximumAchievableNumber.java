package LeetCode;

public class MaximumAchievableNumber {
    public static void main(String[] args) {
        int num = 3, t = 2;
        System.out.println(maximumAchievableNumber(num, t));
    }

    private static int maximumAchievableNumber(int num, int t) {
        return num+2*t;
    }
}
