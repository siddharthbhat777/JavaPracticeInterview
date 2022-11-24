package OOPSLogical;

class Task1 implements Runnable {

    int num1, num2;

    public Task1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 + num2);
    }
}

class Task2 implements Runnable {

    int num1, num2;

    public Task2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 - num2);
    }
}

class Task3 extends Thread {

    int num1, num2;

    public Task3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 * num2);
    }
}

class Task4 implements Runnable {

    int num1, num2;

    public Task4(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 / num2);
    }
}

public class MultiThreadingDiffTasks {
    public static void main(String[] args) {
        int x = 10, y = 4;
        Thread t1 = new Thread(new Task1(x, y));//by implementing runnable
        t1.start();
        Thread t2 = new Thread(new Task2(x, y));//by implementing runnable
        t2.start();
        Task3 t3 = new Task3(x, y);//by extending thread class
        t3.start();
        Thread t4 = new Thread(new Task4(x, y));//by implementing runnable
        t4.start();
    }
}
