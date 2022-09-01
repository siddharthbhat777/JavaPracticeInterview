class T1 {
    T1(int i) {
        System.out.println("Hello");
    }
    T1() {
        System.out.println("Pello");
    }
}

class T2 extends T1 {
    T2() {
        super(20);
        System.out.println("Mello");
    }
}

public class Testing {
    public static void main(String[] args) {
        T2 t = new T2();
    }
}
