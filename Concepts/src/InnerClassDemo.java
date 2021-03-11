
public class InnerClassDemo {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];

	}
}

class Account {
	//private Address address;	//single address
	private Address[] addresses;	//handle multiple address
	private int number;
	public Account() {
		this.addresses=new Address[3];	//delaying initialisation..lazy initialisation
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] address) {
		this.addresses = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	class Address {
		private String streetName;
	}
}