package executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunner {
	public static void main(String[] args) {
		// create the pool
		ExecutorService service = Executors.newFixedThreadPool(10);
		// submit task for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}

		// for (int i = 0; i < 10; i++) {
		// Thread thread1 = new Thread(new Task());
		// thread1.start();
		// }
		System.out.println("In MyRunner Thread Name: " + Thread.currentThread().getName());
	}
}
