
public class Teacher extends Human {
	private String subject;
	private float salary;
	
	public Teacher(String name) {
		setName(name);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
