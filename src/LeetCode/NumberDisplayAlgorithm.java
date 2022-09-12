package LeetCode;

public class NumberDisplayAlgorithm {
    public static void main(String[] args) {
        String s = "123-";//"  -3545 hello   ";
        System.out.println(checkNum(s));
    }

    private static int checkNum(String s) {
        if(s.equals("") || s == null)return 0;
        int sign = 0;
        int digit = 0;
        long ans =0;
        boolean neg = false;
        boolean clamp = false;
        int i = 0;

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-'){
                neg = true;
            }
            i++;

        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            digit++;
            ans = ans*10 + s.charAt(i)-'0';
            if(Integer.MAX_VALUE < ans ){
                clamp = true;
                break;
            }
            i++;
        }

        if(digit == 0)return 0;

        if(neg){

            if(clamp)return Integer.MIN_VALUE;

            return -(int)ans;
        }

        if(clamp){
            return Integer.MAX_VALUE;}

        return (int)ans;
        //almost had it
        /*try {
            char [] nums = {'-', ' ', '+', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            StringBuilder finalValue = new StringBuilder("");
            String mergeNums = " -+0123456789";

            if (!mergeNums.contains(String.valueOf(s.charAt(0))) || (s.contains("+-") || s.contains("-+"))) {
                return 0;
            }

            for (int i = 0; i<s.length(); i++) {
                if ((!mergeNums.contains(String.valueOf(s.charAt(i)))) ||
                        (!finalValue.toString().trim().equals("") && finalValue.charAt(finalValue.length()-1)==' ') ||
                        //(!finalValue.toString().trim().equals("") && !(finalValue.toString().contains("-") || finalValue.toString().contains("+")) && (s.charAt(i) == '-') || s.charAt(i) == '+') ||
                        (((finalValue.toString().trim().contains("+") && finalValue.toString().trim().charAt(0)=='+') && (s.charAt(i) == '+' || s.charAt(i) == '-'))) ||
                        (((finalValue.toString().contains("-") || finalValue.toString().contains("+")) && s.charAt(i) == '-') || ((finalValue.toString().contains("-") || finalValue.toString().contains("+")) && s.charAt(i) == '+') || (finalValue.toString().contains(".")) && s.charAt(i) == '.')) {
                    break;
                }
                for (char num : nums) {
                    if (s.charAt(i) == num) {
                        finalValue.append(num);
                    }
                }
            }

            //System.out.println("\n"+finalValue+"\n");

            String trimStr = String.valueOf(finalValue).trim();
            if (trimStr.contains(" ")) {
                return 0;
            }

            if (Double.parseDouble(finalValue.toString())>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (Double.parseDouble(finalValue.toString())<Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            double ans = Double.parseDouble(finalValue.toString());
            //System.out.println(ans);
            return (int) ans;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }*/
    }
}
