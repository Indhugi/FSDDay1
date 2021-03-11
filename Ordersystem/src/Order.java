
public class Order{
	protected int orderID;
	private String itemID;
	private String Address;
	protected STATUS status;
	
	public Order(int orderID, String itemID) {
		orderID=this.orderID;
		itemID=this.itemID;
	}
	public int getOrderID() {
		return orderID;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
