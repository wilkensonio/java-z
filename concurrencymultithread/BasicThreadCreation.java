package concurrencymultithread;

public class BasicThreadCreation {
    public static void main(String[] args) {
//        EXER 1
        Thread thread = new Thread(() -> System.out.println("hello from my thread"));
        thread.start();
//        EXER 2

    }

}
