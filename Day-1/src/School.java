
public class School {
	public static void main(String[] args) {
		int a=1;
		//Teacher teacher= new Teacher("Smith");
		System.out.println(a==1 ? "K" : "L");
	}
	
	void loopDiscussion() {
		//do_while_start
		int i=0;
			do {
				//Teacher teacher=new Teacher("Mary"+i);
				i++;
			}while (i<10);
		//do_while_end
		for(i=0;i<10;i++) {
				//Teacher teacher= new Teacher("Smith"+i);
		}
	}
	
	void studentDiscussion() {
		System.out.println("Hello");
//		Student student=new Student();	//default constructor
		Student student=new Student("Jay");	//custom constructor
		student.setAge((byte)14);
//		student.setName("Harish");
//		student.name="Kate";
		System.out.println("Name="+student.getName());
		System.out.println("Age="+student.getAge());
		student.study();
	}
}
