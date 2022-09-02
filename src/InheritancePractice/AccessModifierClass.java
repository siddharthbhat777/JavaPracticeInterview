package InheritancePractice;

class BaseClass {
    protected void met1() {
        System.out.println("This is met1 from base class");
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void met1() { // more restrictive class cannot override less restrictive
        System.out.println("This is met1 of derived class");
    }
}

public class AccessModifierClass {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.met1();
    }
}
