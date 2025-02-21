
public class ThreadBasics {
	
	public static void main(String args[]) {
		Thread thread = new Thread(new Runnable() {	
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+ i);
				}
			}
		});
		thread.setName("[PrintingNumbers]");
		thread.start();
		try {
			thread.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Exiting the main thread");
	}
}
