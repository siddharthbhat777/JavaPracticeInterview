package OOPSLogical;

import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        do {
            System.out.println("hello" + i);
            if (i==5){
                i=8;
                continue;
            }
            i++;
        } while (i<10);

        int [] n={10, 30, 20, 50};
        ArrayList <String> arr = new ArrayList<>();
        for (int a=1; a<=10; a++) {
            arr.add("List " + a);
        }
        for (int a : n) {
            System.out.println("loop"+ a);
        }
        for (String li: arr) {
            System.out.println(li);
        }

        int a,b;
        for (a=0; a<5; a++)
        {
            for (b=0; b<=3; b++)
            {
                if (a==2&&b==2 || a==4&&b==1)
                {
                    System.out.print("Hello ");
                    break;
                }
                else
                {
                    System.out.print("Mello ");
                }
            }
            System.out.println(b);
        }
        System.out.println(a);
    }
}
