import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Application {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(20,"スズキ"));
		list.add(new Employee(30, "タナカ"));
		list.add(new Employee(40, "ヤマモト"));
		
		Collections.sort(list, new Comparator<Employee>() {
			
			public int compare(Employee e1,Employee e2) {
				return Integer.compare(e1.getAge(), e2.getAge());
			}
		});
		
		Consumer<List<Employee>> consumer = (List<Employee> l) -> {
			System.out.println(l);
		};
		
		//aa
		
		Stream.of(list).forEach(consumer);
	}
}
