
public class ExceptionPropagation {
	public static void main(String[] args) {
		new A().m1();
	}
}

class A {
	void m1() {
		try{
			m2();
		}catch(RuntimeException runtimeException) {
			runtimeException.printStackTrace();//print the handled exception 
		}catch(Exception exception) {
			System.out.println("Handled");
			//exception.printStackTrace();
		}finally {
			System.out.println("Always Executed");
		}
		System.out.println("m1");
	}

	void m2() throws Exception {
		System.out.println("m2");
		throw new Exception();
		//throw new RuntimeException();
	}
//	void m3() {
//		throw new RuntimeException();
		//System.out.println("m3");//unreachable code-any code after throw exception 
//	}
}