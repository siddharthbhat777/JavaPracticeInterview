public class Logics {
    public static void main(String[] args) {
        int num = 153;
        String str = "aabaa";
        palindrome(str);
        armstrong(num);
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int i = 0;
        int j = 1;
        int add = 1;
        for (int k = 1; k < num; k++) {
            System.out.print(" " + add);
            add = i + j;
            i = j;
            j = k;
        }
    }

    private static void armstrong(int num) {
        int power = String.valueOf(num).length();
        int digit = num;
        double value;
        int result = 0;
        for (int i = 0; i < power; i++) {
            value = Math.pow(digit % 10, power);
            result = (int) (result + value);
            digit = digit / 10;
        }
        if (result == num) {
            System.out.println("Number " + num + " is a palindrome number.");
        } else {
            System.out.println("Number " + num + " is not a palindrome number.");
        }
    }

    private static void palindrome(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        if (str.equals(String.valueOf(result))) {
            System.out.println("String " + str + " is palindrome.");
        } else {
            System.out.println("String " + str + " is not palindrome.");
        }
    }
}
