
public class BankAccount2 {


	private double balance;
	private double interestPct;
		
	/**
	 * constructs a bank account with zero balance
	 * @param newBalance 
	 */

		public BankAccount2(double amt, double intPct) {
			balance = amt;
			interestPct = intPct;
		}
		
		// opening balance for account
	public void OpeningBalance (double open)	{
		balance = balance + open;
		}
	
	// makes a deposit
	public void deposit (double amt )	{
		balance = balance + amt;
		System.out.println("You deposited" + amt);
		System.out.println("Your new balance is" + balance);
		}
	
	//interest that is added onto balance
	public void calcInterest() {
		balance = balance + (interestPct*balance);
		}
	
	// makes a withdrawal
	public void withdraw(double amt) 
	{
		// if you try to take out more money than what is in the account you will get a message
		if (amt > balance) {
			System.out.println("Insufficient funds to support withdrawal");
		}
		else {
			balance = balance - amt;
			System.out.println("You took out $:" +amt);
			System.out.println("Your new balance is " +balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void originalBal(double original) {
		balance = original;
	}
		

}
