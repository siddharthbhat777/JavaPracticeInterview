package InheritancePractice;
class Const{
    private Const()
    {
        System.out.println("Constructor is been called");
    }

    static int a;
    static{
        a=10;
        System.out.println("Const Static block called");
    }

    public static Const callConst() {
        return new Const();
    }
}

class ConstNew {
    int b;
    static{
        ConstNew c1 = new ConstNew();
        c1.b=10;
        System.out.println("Const new static block called");
    }
}
public class Inh {
    public static void main(String[] args) {
        Const c1 = Const.callConst();
        System.out.println(Const.a);
        ConstNew cn = new ConstNew();
        System.out.println(cn.b);
    }
}
