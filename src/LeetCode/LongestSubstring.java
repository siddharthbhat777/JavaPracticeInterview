package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";//wke // OP:3
        System.out.println(longestSubstring(s));
    }

    private static int longestSubstring(String str) {
        //With HashSet
        HashSet<Character> hashSet = new HashSet<>();
        int p_pointer = 0;
        int q_pointer = 0;
        int max = 0;
        while (p_pointer<str.length()) {
            if (!hashSet.contains(str.charAt(p_pointer))) {
                hashSet.add(str.charAt(p_pointer));
                p_pointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(str.charAt(q_pointer));
                q_pointer++;
            }
        }
        return max;
        //With HashMap
        /*HashMap<Character, Integer> map = new HashMap<>();
        int curr = 0*//*1 2*//*, max = 0*//*2*//*, start = 0*//*2*//*;
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) >= start){
                if(max < curr) {
                    max = curr;
                }
                start = map.get(str.charAt(i))+1;
                curr = i - map.get(str.charAt(i));
            }
            else{
                curr++;
            }
            map.put(str.charAt(i), i);
        }
        if(curr > max) max = curr;
        return max;*/
    }
}
