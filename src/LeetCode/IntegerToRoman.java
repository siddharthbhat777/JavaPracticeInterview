package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 56;
        System.out.println(integerToRoman(num));
    }

    private static String integerToRoman(int num) {
        /* Defining roman numerals */
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        /* Implementing logic */
        char[] arr = String.valueOf(num).toCharArray();
        List<Character> list = new ArrayList<>();
        switch (arr.length) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        return "------";
    }
}
