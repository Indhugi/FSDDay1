
public class Manager {
	private String Name;
	private int ID;
	private String email;
	//private APPROVAL approval;
	private boolean approval;
	
	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public Manager(String name) {
		this.Name=name;
	}
	/*
	 * public APPROVAL getApproval() { return approval; } public boolean
	 * setApproval(APPROVAL approval) { this.approval = approval; return false; }
	 */

}

//enum APPROVAL{
//	APPROVED,NOTAPPROVED
//}