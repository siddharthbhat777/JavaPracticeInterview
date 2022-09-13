package OOPSLogical;

class Employee
{
    protected int eid;
    protected String ename;
    protected double salary; //derived attribute

    Employee (int eid, String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    void calSalary()
    {

    }
    double getSalary()
    {
        return salary;
    }
    int getEid()
    {
        return eid;
    }
    String getEname()
    {
        return ename;
    }
}
class TemporaryEmp extends Employee
{
    double numOfDays;
    double charges;
    TemporaryEmp(int eid, String ename, double numOfDays, double charges)
    {
        super(eid, ename);
        this.numOfDays=numOfDays;
        this.charges=charges;
    }
    void calSalary()
    {
        salary=numOfDays*charges;
    }
}
class PermanentEmp extends Employee
{
    double basicSal;
    static double HRA;// percent of basic salary
    static double DA;// percent of basic salary
    static double TA;// fixed amount
    static double PF;// percent of basic salary

    PermanentEmp(int eid, String ename, double basicSal)
    {
        super(eid, ename);
        this.basicSal=basicSal;
    }
    //override calSalary
    void calSalary()
    {
        salary=basicSal+(basicSal*HRA/100)+(basicSal*DA/100)+TA-(basicSal*PF/100);
    }
    static void setHRA(double HRA)
    {
        HRA=HRA;
    }
    static void setDA(double DA)
    {
        DA=DA;
    }
    static void setTA(double TA)
    {
        TA=TA;
    }
    static void setPF(double PF)
    {
        PF=PF;
    }
}
class EmployeeLogic
{
    public static void main(String [] args)
    {
        Employee e1 = new Employee(1, "sid");
        System.out.println("Eid: "+e1.getEid()+"\nEname: "+e1.getEname());
        System.out.println("**********************************");
        TemporaryEmp e2 = new TemporaryEmp(2, "om", 28, 350);
        e2.calSalary();
        System.out.println("Eid: "+e2.getEid()+"\nEname: "+e2.getEname()+"\nSalary: "+e2.getSalary());
        System.out.println("**********************************");
        PermanentEmp e3 = new PermanentEmp(3, "ajay", 32400);
        e3.setHRA(30);
        e3.setDA(110);
        e3.setTA(1600);
        e3.setPF(12.5);
        e3.calSalary();
        System.out.println("Eid: "+e3.getEid()+"\nEname: "+e3.getEname()+"\nSalary: "+e3.getSalary());
        System.out.println("**********************************");

        //Dynamic method dispatch
        Employee[] empArr=new Employee[3];
        empArr[0]=e1;
        empArr[1]=e2;
        empArr[2]=e3;
        for(int i=0; i<empArr.length;i++)
        {
            empArr[i].calSalary();
            System.out.println("Eid: "+empArr[i].getEid()+"\nEname: "+empArr[i].getEname()+"\nSalary: "+empArr[i].getSalary());
            System.out.println("**********************************");
        }

    }
}