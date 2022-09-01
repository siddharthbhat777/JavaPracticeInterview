class Train {
    void met1(int i) {
        System.out.println("Hello " + i);
    }
}

public class ObjClass {
    public static void main(String[] args) {
        Train t1 = new Train();
        t1.met1(56);
        Train t2 = new Train();
        t2.met1(34);
        Train t3 = new Train();
        t3.met1(98);
        Train [] t = new Train[3];
        t[0] = t1;
        t[1] = t2;
        t[2] = t3;
        for (int i=0; i< t.length; i++)
        {
            Train tnew = t[i];
            tnew.met1(i+23);
        }
    }
}
