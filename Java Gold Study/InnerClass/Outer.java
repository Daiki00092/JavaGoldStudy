
public class Outer {

	private static String message = "Java SE 8";
	
	public static class Inner {
		public void print() {
			System.out.println(message);
		}
	}
	
	public static void print() {
		System.out.println(message);
		new Inner().print();
	}
	
	
	public static void main(String[] args) {
		Inner inner = new Outer.Inner();
		inner.print();
	}
}
