
public class Order extends Customer{
	protected int orderID;
	private int itemID;
	private String Address;
	protected STATUS status;
	
	public Order(int orderID) {
		orderID=this.orderID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
