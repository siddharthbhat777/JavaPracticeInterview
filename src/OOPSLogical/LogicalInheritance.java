package OOPSLogical;

class Base{
    int x=21;
    int y=10;
    public int add()
    {
        System.out.println("OOPSLogical.Base class func called");
        return x+y;
    }
}

class Derived extends Base{
    public int add() {
        System.out.println("OOPSLogical.Derived class func called");
        return x-y;
    }
}

public class LogicalInheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        //or
        Base d1 = new Derived();
        //to call base class
        Base b = new Base();
        System.out.println(d.add() + " " + d1.add() + " " + b.add());
    }
}
