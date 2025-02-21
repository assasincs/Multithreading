
class CalculateSum implements Runnable{
	public int arr[];
	public int start;
	public int end;
	public int sum;
	public CalculateSum(int arr[], int i, int j) {
		this.arr = arr;
		this.start = i;
		this.end = j;
	}
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			
			sum+=arr[i];
		}
	}
};

public class SumNumbersInArray {
	public static void main(String args[]) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		CalculateSum p1 = new CalculateSum(arr,0,3);
		CalculateSum p2 = new CalculateSum(arr,4,7);
		CalculateSum p3 = new CalculateSum(arr,8,9);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print(p1.sum + p2.sum + p3.sum);
		
	}
}
