package LeetCode;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(FizzBuzzCheck(num));;
    }

    private static String FizzBuzzCheck(int num) {
        if (num%15==0)
        {
            return "Fizz Buzz";
        }
        else if(num%3==0)
        {
            return "Fizz";
        }
        else if (num%5==0)
        {
            return "Buzz";
        }
        else
        {
            return "No output";
        }
    }
}
