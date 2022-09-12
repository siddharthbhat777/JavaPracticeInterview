package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] num = {2, 7, 11, 15, 8, 5, 4};
        int target = 9;
        System.out.println(Arrays.toString(sumOfTwo(num, target)));
    }

    private static int[] sumOfTwo(int[] num, int target) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int n1=0; n1<num.length; n1++) {
            for (int i : num) {
                if (num[n1] + i == target) {
                    lst.add(n1);
                }
            }
        }
        return lst.stream().mapToInt(i -> i).toArray();
    }
}
