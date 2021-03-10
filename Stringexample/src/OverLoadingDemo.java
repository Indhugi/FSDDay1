
public class OverLoadingDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.study();
		s1.study(1);
		s1.study(2,"Math");
		
	}
}

class Student1{
	public void study(int duration,String  subject) {
		System.out.println("Study for "+duration+" hour "+subject);
	}
	public void study(int duration) {
		System.out.println("Study for "+duration+" hour ");
	}
	public void study() {
		System.out.println("Study");
	}
}