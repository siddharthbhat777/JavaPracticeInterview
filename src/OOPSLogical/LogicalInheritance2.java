package OOPSLogical;

class Vehicle // OOPSLogical.Base
{
    Vehicle(int i)
    {
        System.out.println("Param OOPSLogical.Vehicle");
    }
}

class FourWheeler extends Vehicle
{
    FourWheeler()
    {
        super(10);
        System.out.println("Default Four Wheeler");
    }
    FourWheeler(int x)
    {
        super(10);
        System.out.println("Param Four Wheeler");
    }
}
class Bus extends FourWheeler
{
    Bus()
    {
        super(10);
        System.out.println("OOPSLogical.Bus");
    }
}

public class LogicalInheritance2 {
    public static void main(String[] args)
    {
        Bus b1=new Bus();
    }
}
