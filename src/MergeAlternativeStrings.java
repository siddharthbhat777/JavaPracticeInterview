public class MergeAlternativeStrings {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        System.out.println(mergeAltStr(a, b));
    }

    private static StringBuilder mergeAltStr(String a, String b) {
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<a.length() || i < b.length(); i++)
        {
            if (i<a.length())
            {
                ans.append(a.charAt(i));
            }
            if (i<b.length())
            {
                ans.append(b.charAt(i));
            }
        }
        return ans;
    }

}
