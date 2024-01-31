package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1};
        int[] result = arrayConcatenation(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] arrayConcatenation(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j : arr) {
                arrayList.add(j);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
