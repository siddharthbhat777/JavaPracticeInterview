package OOPSLogical;

abstract class Class1 {
    int met1()
    {
        return 8;
    }
    abstract void met2();
}

class Class2 extends Class1 {
    @Override
    void met2() {//compulsory to override
        System.out.println("Hola");
    }

    @Override
    int met1() {
        return 2;
    }
}

public class AbstractClassPractice {
    public static void main(String[] args) {
        Class1 c1 = new Class1() {
            @Override
            void met2() {
                System.out.println("Hello");
            }
        };
        c1.met2();
        System.out.println(c1.met1());

        Class2 c2 = new Class2();
        c2.met2();
        System.out.println(c2.met1());
    }

}
