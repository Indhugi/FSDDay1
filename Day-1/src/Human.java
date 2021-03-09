
public class Human {
	private String name;
	private byte age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null | name.trim().equals("")) {
			throw new IllegalArgumentException("Name is Mandatory");
		}
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	
}
