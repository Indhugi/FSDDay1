
public class Student extends Human {
	void study(){
		System.out.println(getName()+ "is Studying");
	}
	
	Student(){	//default constructor
		
	}
	
	Student(String name){	//custom constructor
		setName(name);
	}
}

