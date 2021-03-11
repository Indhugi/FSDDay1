
public class OMSApplication {
 
	public static void main(String[] args) {
		//Order[] order=new Order[10];
		Customer customer=new Customer("Indhu",1245);
		Order singleOrder=new Order(777,"Laptopi59");
		System.out.println("Customer Name : "+customer.getCustomerName());
		System.out.println("Customer ID : "+customer.getCustomerID());
		System.out.println("Item ID : "+singleOrder.getItemID());
		
		
			//get itemID and address too
			//System.out.println("Order "+i);
}
}
