class B extends Thread
{
    B() {
        System.out.println("This is base class");
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class A extends B implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from runnable is running");
    }
}

public class ThreadsPractice {
    public static void main(String[] args) {
        B b1 = new B(); //while extending thread class
        b1.start();
        Thread t = new Thread(new A()); // while using runnable
        t.start();
    }
}
