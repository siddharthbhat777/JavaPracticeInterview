class Base{
    int x=10;
    int y=20;
    public int add()
    {
        System.out.println("Base class func called");
        return x+y;
    }
}

class Derived extends Base{
    public int add() {
        System.out.println("Derived class func called");
        return x+y;
    }
}

public class LogicalInheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d.add());
    }
}
