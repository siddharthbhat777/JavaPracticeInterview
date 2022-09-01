public class FinalStaticKeyword {
    static int a = 12;

    public int met1()
    {
        a = 18;
        System.out.println("Met1 called");
        return a;
    }

    public static void main(String[] args) {
        FinalStaticKeyword f = new FinalStaticKeyword();
        System.out.println(a);
        System.out.println(f.met1());
    }
}
