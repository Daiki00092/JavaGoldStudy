import java.io.PrintStream;

public class OuterAnonymous {

	public void printMessage(int type,String content) {
		new Object() {
			PrintStream getOutput() {
				return type == 0 ? System.out : System.err ;
			}
		}.getOutput().print(content);
	}
	
}
