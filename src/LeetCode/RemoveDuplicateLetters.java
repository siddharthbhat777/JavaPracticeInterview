package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("REMOVE LETTERS WITH DUPLICATE VALUES: " + removeDuplicateValueLetters(str));
        System.out.println("REMOVE DUPLICATE LETTERS: " + removeDuplicateLetters(str));
    }

    private static String removeDuplicateLetters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder build = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            build.append(entry.getKey());
        }
        return build.toString();
    }

    private static String removeDuplicateValueLetters(String str) {
        HashSet<Character> set = new HashSet<>();
        for (Character chr : str.toCharArray()) {
            if (set.contains(chr))
                set.remove(chr);
            else
                set.add(chr);
        }
        StringBuilder build = new StringBuilder();
        for (Character entry : set) {
            build.append(entry);
        }
        return build.toString();
    }
}
