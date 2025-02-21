import java.util.concurrent.locks.ReentrantLock;

public class SharedCounter {
	private Integer counter;
	private ReentrantLock lock = new ReentrantLock();
	public SharedCounter() {
		counter = 0;
	}
	public void increment() {
		lock.lock();
		try {
			counter++;
		}finally {
			lock.unlock();
		}
	}
	
	public int getCounter() {
		lock.lock();
		try {
			return counter;
		}finally {
			lock.unlock();
		}
	}
	
	public int getAndIncrement() {
		lock.lock();
		try{
			counter++;
			return counter;
		}finally {
			lock.unlock();
		}
	}
	
}
