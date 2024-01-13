package concurrencymultithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executor.submit(() -> System.out.println("Executing task in "
                    + Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}
