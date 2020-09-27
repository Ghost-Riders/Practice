package callablefutureexecutorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class MyRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create the pool
		ExecutorService service = Executors.newCachedThreadPool();

		// submit the tasks for execution
		List<Future> allFutures = new ArrayList<Future>();

		for (int i = 0; i < 100; i++) {
			Future<Integer> future = service.submit(new Task());
			if (future.get() == 3) {
				future = service.submit(new Task());
			} else {
				allFutures.add(future);
			}
			
		}
		for (int i = 0; i < allFutures.size(); i++) {
			try {
				Future<Integer> future = allFutures.get(i);
				Integer result = future.get();
				Logger.getGlobal().info("Result of future #" + i + "=" + result);
			} catch (InterruptedException e) {

				e.printStackTrace();
			} catch (ExecutionException e) {

				e.printStackTrace();
			}

		}

		System.out.println("In MyRunner Thread Name: " + Thread.currentThread().getName());
	}
}
