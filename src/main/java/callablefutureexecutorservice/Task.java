package callablefutureexecutorservice;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

	public Integer call() throws Exception {
		System.out.println("In Task Thread Name: " + Thread.currentThread().getName());
		
		return (new Random().nextInt(10));
	}

}
