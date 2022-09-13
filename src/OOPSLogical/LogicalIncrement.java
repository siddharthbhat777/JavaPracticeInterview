package OOPSLogical;

public class LogicalIncrement {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int x = ++i + ++j;
        int y = i++ + j++;
        int z = i + j;

        System.out.println(i + " " + j + " " + x + " " + y + " " + z);
    }
}
