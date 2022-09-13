package OOPSLogical.inheritance_constructor;

class NewT1 {
    NewT1(int i) {
        System.out.println("hello t1 " + i);
    }

    protected void meth1() {
        System.out.println("This is meth 1");
    }

    protected int meth1(int n) {
        return n + 2;
    }

    protected static class NewT1Half {
        NewT1Half() {
            System.out.println("Nested class called");
        }

        NewT1Half(int i) {
            System.out.println("Nested class called with parameter " + i);
        }

        public void nested() {
            System.out.println("Nested class meth called");
        }
    }
}

class NewT2 extends NewT1 {
    NewT2(int i) {
        super(i);
    }

    @Override
    protected void meth1() {
        System.out.println("Hello meth 1 from NewT2");
    }
}

class NewT3 extends NewT1.NewT1Half {

    NewT3(int i) {
        super(i);
    }
    NewT3(){
        this(20); // or super();
    }
}


class NewTest {
    public static void main(String[] args) {
        NewT2 n = new NewT2(20);
        n.meth1();
        System.out.println(n.meth1(4));
        NewT1.NewT1Half n1 = new NewT1.NewT1Half();
        n1.nested();
        NewT3 n3 = new NewT3(30);
    }
}
