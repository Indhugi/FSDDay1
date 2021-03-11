
public class Customer {
	private String customerName;
	private int customerID;

	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if (customerName == null | customerName.trim().equals("")) {
			throw new IllegalArgumentException("Name is Mandatory");
		}
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
}
