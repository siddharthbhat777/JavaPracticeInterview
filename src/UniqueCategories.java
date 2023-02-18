import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCategories {
    public static void main(String[] args) {
        String [] categories = {"electronics", "games", "games", "footwear", "electronics", "clothing", "footwear", "footwear", "footwear"};
        System.out.println(Arrays.toString(showUniqueCategories(categories)));
    }

    private static String[] showUniqueCategories(String[] categories) {
        String [] result;
        ArrayList<String> arrList = new ArrayList<>();
        for (String item : categories) {
            if (!arrList.contains(item)) {
                arrList.add(item);
            }
        }
        result = arrList.toArray(new String[0]); // 'new String[0]' means we are initializing empty array and putting our elements in it.
        // Alternate way
        // result = arrList.toArray(new String[arrList.size()]);
        return result;
    }
}
