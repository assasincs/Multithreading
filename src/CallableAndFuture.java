import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableAndFuture {
	public static void main(String args[]) {
		
		Callable<Integer> p = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				return 10;
			}
		};
		FutureTask<Integer> futureTask = new FutureTask<Integer>(p);
		Thread thread = new Thread(futureTask);
		thread.start();
		try {
			System.out.println(futureTask.get());
		}catch (Exception e) {
			
		}
	}
}
