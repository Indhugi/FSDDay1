import java.util.ArrayList;
import java.util.List;

public class Application {
public static void main(String[] args) {
	int a=1;
	Integer b=a; //autoboxing 
	Double d=23.4;//autoboxing
	//when a primitive type is assgined to a reference type (Wrapper class)
	System.out.println(d.compareTo(33.3));
	double primitiveDouble=d;	//auto unboxing
	//when a reference type is assigned to a primitive type ->Auto unboxing

	List<Integer> numbers=new ArrayList<Integer>();
	numbers.add(56); //56 will be autoboxed automatically
}
}





