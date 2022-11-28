package OOPSLogical;

public class RecursiveFunction {
    public static void main(String[] args) {
        int a=8, b=9;
        System.out.println(numFun(a, b));
    }

    private static int numFun(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return numFun(a-1, b+1);
            /*
            * 7,10
            * 6,11
            * 5,12
            * 4,13
            * 3,14
            * 2,15
            * 1,16
            * 0,17  <-- ANSWER
            */
        }
    }
}
