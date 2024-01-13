package concurrencymultithread;

public class SharedCounterDemo {
    static int counter = 0;
     static synchronized void increment() {

        System.out.println("Before " + counter);
        counter++;
        System.out.println("after "+ counter);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(SharedCounterDemo::increment).start();

        }
    }
}
