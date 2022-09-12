public class ReverseNumWithSigns {
    public static void main(String[] args) {
        int num = -1534236469;
        System.out.println(reverseNumber(num));
    }

    private static int reverseNumber(int num) {
        char storeSign = '+';
        if (num<0) {
            storeSign = '-';
        }
        if (num > 999999999 || num < -999999999) {
            return 0;
        }
        int numValue = Math.abs(num);
        int ans = 0;
        int len = String.valueOf(numValue).length();
        for (int i=0; i<len; i++) {
            ans = ans*10 + (numValue%10);
            numValue = numValue/10;
        }
        String finalAns = String.valueOf(storeSign) + ans;
        return Integer.parseInt(finalAns);
    }
}
