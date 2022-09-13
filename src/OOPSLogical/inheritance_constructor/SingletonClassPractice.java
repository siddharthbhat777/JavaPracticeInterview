package OOPSLogical.inheritance_constructor;

class Single {
    private Single() {
        System.out.println("Hello this is single constructor");
    }

    static Single i = null;
    public static Single getSingle() {
        if (i==null)
        {
            i =  new Single();
        }
        return i;
    }
}

public class SingletonClassPractice {
    public static void main(String[] args) {
        Single s = Single.getSingle();//showing O/P
        Single s1 = Single.getSingle();//not showing any O/P
        Single s2 = Single.getSingle();//not showing any O/P
    }
}
