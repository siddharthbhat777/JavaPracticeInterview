package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 7};
        System.out.println("HashSet: " + hashSetContainsDuplicate(arr));
        System.out.println("HashMap: " + hashMapContainsDuplicate(arr));
    }

    private static boolean hashSetContainsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }

    private static boolean hashMapContainsDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                return true;
            }
            map.put(i, 1);
        }
        return false;
    }
}
