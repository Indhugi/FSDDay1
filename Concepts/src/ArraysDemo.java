
public class ArraysDemo {
	public static void main(String[] args) {
		int[] scores=new int[10];
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		int[] numbers= {1,2,3,4};
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		boolean[] booleans= {true,false};
		for (boolean value : booleans) {// foreach
			System.out.println(value);
		}
		String[] names=new String[10];	//creation of an array object with capacity 10 and no string object is created
		for(String name:names) {
			//name=new String ("Ram");	//goes to heap,creates 10 objects
			name="Ram";	//goes to pool,create 1 object
			System.out.println(name);
		}
		Student[] students=new Student[10];
		for (int i = 0; i < students.length; i++) {
			Student student=new Student("Ravi"+i);
			students[i]=student;
//			if(i==5)
//				break;
		}
//		System.out.println("Length="+students.length);
//		for (int i = 0; i < students.length; i++) {			//Null Pointer Exception
//			System.out.println(students[i].getName());
//		}
		
	}
}
class Student{
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	private String name;
}