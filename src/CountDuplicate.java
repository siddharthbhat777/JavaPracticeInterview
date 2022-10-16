import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {
    public static void main(String[] args) {
        String str = "AAABBDDBBCDB";
        countDuplicateCharacters(str);
    }

    public static void
    countDuplicateCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        // Alternative way

        // Converting given string into
        // a char array
        /*char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray

        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }*/

        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
