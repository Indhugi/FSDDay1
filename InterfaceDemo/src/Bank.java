
public class Bank {
	public static void main(String[] args) {
		IAccount[] account=new IAccount[3];
//instead of creating FD array and savings array we use Interface obj
		account[0]=new SavingsAccount();
		account[1]=new FDAccount();
		account[2]=new RDAccount();
		

		for (IAccount iAccount : account) {
			iAccount.deposit();
		}
	}
}
