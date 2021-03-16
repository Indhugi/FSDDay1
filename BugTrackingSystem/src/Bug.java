
public class Bug {
	private int ID;
	private String Name;
	private int type;

	public Bug(String name) {
		this.Name = name;
	}
	public void newBug() {
		System.out.println("New bug is created");
	}
	public void reopenBug() {
		System.out.println("Reopened an existing bug");
	}
	public void openBug() {
		System.out.println("Opened the new Bug");	
	}
	public void assignBug() {
		Developer developer=new Developer("Harry");
		System.out.println("Assigned Bug to "+developer.getName());
	}
	public void duplicateBug() {
		System.out.println("Duplicate bug");
	}
	public void fixedBug() {
		System.out.println("Fixed bug");
	}
}
