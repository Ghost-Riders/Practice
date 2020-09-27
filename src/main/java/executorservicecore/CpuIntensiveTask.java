package executorservicecore;

public class CpuIntensiveTask implements Runnable {

	public void run() {
		System.out.println("In Task Thread Name: " + Thread.currentThread().getName());
	}

}
