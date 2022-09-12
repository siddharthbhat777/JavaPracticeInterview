package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(checkLongestCommon(strs));
        // Time Complexity : O(N^2)
        // Space Complexity : O(1)
    }

    private static String checkLongestCommon(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
