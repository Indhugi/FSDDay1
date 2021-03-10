
public class Customer {
	private String name;
	private int custID;

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null | name.trim().equals("")) {
			throw new IllegalArgumentException("Name is Mandatory");
		}
		this.name = name;
	}
}
