import java.io.IOException;

public class ReadfromConsole {
public static void main(String[] args) {
	byte[] input=new byte[15];
	try {
		System.out.println("Enter content");
		System.in.read(input);
		System.out.println(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
