import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Product {

	public static void main(String[] args) {
		
		Stream<List<String>> s1 = Stream.of(Arrays.asList("1","Bill"),Arrays.asList("2",null));
		
		Stream<String> s2 = s1.flatMap((x)-> x.stream());
		s2.forEach(System.out::print);
		
	}
}
