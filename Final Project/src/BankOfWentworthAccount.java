
public class BankOfWentworthAccount {
	
	
	public int getAccountNumber(){
		
		int accountNumber = 0;
		
		accountNumber = (int) (Math.random() * 8999) + 1000;
		return accountNumber;
	}
	

}
