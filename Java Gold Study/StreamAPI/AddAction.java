import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class AddAction extends RecursiveAction {

	private static final int THRESHOLD_SIZE = 3;
	private int start;
	private int end;
	private int[] numbers;
	
	public AddAction(int[] numbers ,int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}
	
	protected void compute() {
		int total = 0;
		if(end - start <= THRESHOLD_SIZE) {
			for(int i = start; i < end; i++) {
				total += numbers[i];
			}
			System.out.print(total + " ");
		}else {
			new AddAction(numbers,start + THRESHOLD_SIZE,end).fork();
			new AddAction(numbers, start, Math.min(end, start + THRESHOLD_SIZE)).compute();
		}
	}
	
	public static void main(String[] args) {
		int data[] = {1,2,3,4,5};
		ForkJoinPool service = new ForkJoinPool();
		service.invoke(new AddAction(data, 0, data.length));
	}
}
