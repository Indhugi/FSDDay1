
public class ProjectApplication  {
	//private static APPROVAL APPROVED;

	public static void main(String[] args) {
	//String pastbug;//in real case, we will use pastbug to loop and check if the bug is available already
	boolean pastBugExists=false;
	boolean clientApprovedRevoke=false;
	Manager manager=new Manager("Sudhir");
	//manager.setApproval(APPROVED);
	manager.setApproval(true);
	Bug bug=new Bug("Bug1");
	if(!pastBugExists & manager.isApproval()) {
		bug.newBug();
		bug.openBug();
	}else {
		if(clientApprovedRevoke & manager.isApproval())  {
			bug.reopenBug();			
		}else {
			bug.duplicateBug();			
		}
	}
	bug.assignBug();
	bug.fixedBug();
	
	}

}
