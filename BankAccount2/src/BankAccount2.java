
public class BankAccount2 {


	private static double balance;
	private double interestPct;
		
	/**
	 * constructs a bank account with zero balance
	 * @param newBalance 
	 */

		public BankAccount2(double newBalance, double intPct) {
			balance = newBalance;
			
		}

		
		// opening balance for account
	public void OpeningBalance (double open)	{
		balance = balance + open;
		}
	
	
	public void threshold (double T)	{
		balance = balance + T;
		}
	
	//interest that is added onto balance
	public void calcInterest() {
		
		balance = balance + (interestPct*balance);
			
		}
	
	public double getBalance() 
	{
		return balance;
	}
	
	
	public static void main(String[] args) {
		
		BankAccount2 obj = new BankAccount2(balance, balance);
		
		obj.OpeningBalance(1000);
		obj.threshold(1500);
		
		
	}
}
