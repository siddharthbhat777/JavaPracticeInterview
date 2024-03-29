import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeImp {
    int swapNum1 = 12, swapNum2 = 45; //need to initialize as instance variable to use call by reference

    public static void main(String[] args) {
        /* Variables used */
        String s = "abcba";
        int num = 153;
        String vowelString = "Hello this is sid here.";
        int factorialNum = 5;
        int[] arr = {9, 2, 4, 1, 7, 23, 76, 5};
        int largestNum = 3;

        /* calling all functions */
        System.out.println(palindrome(s) ? "The string \"" + s + "\" is Palindrome" : "The string \"" + s + "\" is not Palindrome");
        System.out.println(noDuplicate(s));
        System.out.println(fibonacci(num));
        System.out.println(primeNumbers(num));
        System.out.println(checkPrime(num) ? "The number " + num + " is a prime number." : "The number " + num + " is not a prime number.");
        System.out.println(armstrongNum(num) ? "The number " + num + " is armstrong." : "The number " + num + " is not armstrong.");
        // using call by reference
        PracticeImp pi = new PracticeImp();
        System.out.println("Numbers before swap: " + pi.swapNum1 + " " + pi.swapNum2);
        swapWithoutTemp(pi);
        System.out.println("Numbers after swap: " + pi.swapNum1 + " " + pi.swapNum2);
        System.out.println(noVowelsString(vowelString));
        System.out.println(factorialOfNumber(factorialNum));
        System.out.println(NthLargestNumberInArray(arr, largestNum));
    }

    private static boolean checkPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int NthLargestNumberInArray(int[] arr, int largestNum) {
        int arrLen = arr.length;
        Arrays.sort(arr); // Ascending order
        // Now for the resultant element, we need to start from the last element as the largest element is at last.
        int result = 0;
        int temp = arrLen - largestNum;
        // If the last and element are equal then check the previous one else return the element.
        if (arr[temp] != arr[arrLen - 1]) {
            result = arr[temp];
        } else {
            result = arr[arrLen - 1];
        }
        return result;

        /*
        import java.util.*;
        public class SecondLargestInArrayExample2{
        public static int getSecondLargest(Integer[] a, int total){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(total-2);
        return element;
        }
        public static void main(String args[]){
        Integer a[]={1,2,5,6,3,2};
        Integer b[]={44,66,99,99,33,22,55};
        System.out.println("Second Largest:"+getSecondLargest(a,6));
        System.out.println("Second Largest:"+getSecondLargest(b,7));
        }}
        */
    }

    private static int factorialOfNumber(int factorialNum) {
        int ans = 1;
        if (factorialNum == ans) {
            return ans;
        }
        for (int i = 2; i <= factorialNum; i++) {
            ans = ans * i;
        }
        return ans;
    }

    private static String noVowelsString(String vowelString) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder();
        boolean isVowel = false;
        for (int i = 0; i < vowelString.length(); i++) {
            for (char vowel : vowels) {
                if (vowelString.charAt(i) == vowel) {
                    isVowel = true;
                    break;
                } else {
                    isVowel = false;
                }
            }
            if (!isVowel) {
                sb.append(vowelString.charAt(i));
            }
        }
        return sb.toString();
    }

    private static void swapWithoutTemp(PracticeImp pi) {
        pi.swapNum1 = pi.swapNum1 + pi.swapNum2;
        pi.swapNum2 = pi.swapNum1 - pi.swapNum2;
        pi.swapNum1 = pi.swapNum1 - pi.swapNum2;
    }

    private static boolean armstrongNum(int num) {
        int tmp = num;
        int power = String.valueOf(num).length();
        double ans = 0;
        for (int i = 0; i < power; i++) {
            ans = ans + Math.pow(tmp % 10, power);
            tmp = tmp / 10;
        }
        return num == (int) ans;
    }

    private static ArrayList<Integer> primeNumbers(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    ans.add(i);
                }
                break;
            }
        }
        return ans;
    }

    private static ArrayList<Integer> fibonacci(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        int a = 0;
        int b = 1;
        for (int i = 0; i < num; i++) {
            ans.add(b);
            int k = a + b;
            a = b;
            b = k;
        }
        return ans;
    }

    private static String noDuplicate(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> map : hm.entrySet()) {
            ans.append(map.getKey());
        }
        return ans.toString();
    }

    private static boolean palindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString().equals(s);
    }
}
