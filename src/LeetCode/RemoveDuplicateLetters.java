package LeetCode;

import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("REMOVE LETTERS WITH DUPLICATE VALUES: " + removeDuplicateValueLetters(str));
        System.out.println("REMOVE DUPLICATE LETTERS: " + removeDuplicateLetters(str));
        System.out.println("REMOVE DUPLICATE LETTERS IN SMALLEST LEXICOGRAPHICAL ORDER: " + removeDuplicateLettersLexicographicalOrder(str));
    }

    private static String removeDuplicateLettersLexicographicalOrder(String s) { // didn't understand
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        }

        boolean[] seen = new boolean[26]; // keep track seen
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) continue; // if seen continue as we need to pick one char only
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false; // pop out and mark unseen
            }
            st.push(curr); // add into stack
            seen[curr] = true; // mark seen
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
    }

    private static String removeDuplicateLetters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            System.out.println(c + " " + map.get(c) + " " + map);
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
