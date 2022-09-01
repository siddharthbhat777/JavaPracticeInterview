import java.util.ArrayList;

public class NumberIntoList {
    public static void main(String[] args) {
        int n = 23456789;
        System.out.println(convertToList(n));;
    }

    private static ArrayList<Integer> convertToList(int tmp2) {
        int tmp = String.valueOf(tmp2).length();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<tmp; i++)
        {
            int num = tmp2%10;
            arr.add(num);
            tmp2 = tmp2/10;
        }
        for(int i=tmp-1; i>=0; i--)
        {
            arr2.add(arr.get(i));
        }
        return arr2;
    }
}
