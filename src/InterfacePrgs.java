interface NewIntf {
    int a = 16;
    int sum(int i, int j);
    int diff(int i, int j);
}

interface NewIntf2 {
    int b = 20;
    String str(String j);
    void ety();
}
class ImpClass implements NewIntf2 {
    @Override
    public String str(String j) {
        return j+" hi";
    }

    @Override
    public void ety() {
        System.out.println("Ello");
    }
}

class ImplementingClass implements NewIntf, NewIntf2 {
    @Override
    public int sum(int i, int j) {
        return i+j;
    }

    @Override
    public int diff(int i, int j) {
        return i-j;
    }

    @Override
    public String str(String j) {
        return "This is str meth";
    }

    @Override
    public void ety() {
        System.out.println("ety method");
    }
}

public class InterfacePrgs {
    public static void main(String[] args) {
        ImplementingClass i = new ImplementingClass();
        System.out.println(i.sum(10, 34));
        System.out.println(i.diff(65, 23));
        int s = i.a + i.b;
        System.out.println(i.sum(1, 3));
        System.out.println(s);
        ImpClass ic = new ImpClass();
        System.out.println(ic.str("Mello"));
    }
}
