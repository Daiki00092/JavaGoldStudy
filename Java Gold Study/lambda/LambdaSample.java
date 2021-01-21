import java.util.Arrays;                                                          

public class LambdaSample {

	public static void main(String[] args) {
		
		Arrays.asList(1,2,3).stream()
			.map(x -> x + 1)
			.peek(System.out::print)
			.count();

	}
}
