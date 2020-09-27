package executorservicecached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunner {
	public static void main(String[] args) {
		// create the pool
		ExecutorService service = Executors.newCachedThreadPool();
		// submit task for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
		// after 60 seconds thread which is not in used will be killed
		System.out.println("In MyRunner Thread Name: " + Thread.currentThread().getName());
	}
}
