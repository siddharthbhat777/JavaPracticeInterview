package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = new String[]{"leet","code"};
        char x = 'e';
        System.out.println(wordsContainingCharacter(words, x));
        System.out.println(optimisedWordsContainingCharacter(words, x));
    }

    private static List<Integer> wordsContainingCharacter(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) // contains function uses 1ms more time complexity
                list.add(i);
        }
        return list;
    }
    private static List<Integer> optimisedWordsContainingCharacter(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; // this optimises more, if you use words[i] multiple times it increases time by 1ms
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
