import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String str = "AAABBDDBBCCDB";
        System.out.println(countDuplicate(str));
    }

    private static ArrayList<String> countDuplicate(String str) {
        HashMap <Character, Integer> hm = new HashMap<>();
        char [] cArr = str.toCharArray();
        for (char c : cArr)
        {
            if (hm.containsKey(c))
            {
                hm.put(c, hm.get(c) + 1);
            }
            else
            {
                hm.put(c, 1);
            }
        }
        ArrayList<String> hmn = new ArrayList<>();
        for (Map.Entry<Character, Integer> h : hm.entrySet())
        {
             hmn.add(h.getKey() + " : " + h.getValue() + "\n");
        }
        return hmn;
    }
}
