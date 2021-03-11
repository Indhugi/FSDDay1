//final variable,method or class
public class FinalKeyword {
	public static void main(String[] args) {
		Child child =new Child();
		child.m1();	
	}
}

class Parent{
	final String name="Ind";
	final void m1() {	
//final function in baseclass will not allow child class to override the function
		System.out.println("Parent");
	}
	void m2() {
		
	}
}
class Child extends Parent{
//	void m1() { //override.
//		System.out.println("Child");
//	}
	
	@Override	//bestpractice
	void m2() {
		
	}
}
