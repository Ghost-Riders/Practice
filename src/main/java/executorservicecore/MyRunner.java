package executorservicecore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunner {
	public static void main(String[] args) {
		// get count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);

		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		// submit task for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new CpuIntensiveTask());
		}

		System.out.println("In MyRunner Thread Name: " + Thread.currentThread().getName());
	}
}
