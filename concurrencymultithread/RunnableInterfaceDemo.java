package concurrencymultithread;

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();
    }

    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }
    }
}
