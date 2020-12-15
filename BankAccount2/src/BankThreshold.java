
import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Alex = new Scanner(System.in);
		 
		// 1000
		System.out.println("Enter opening balance");
		double original = Alex.nextDouble();
		
		// interest rate 0.5
	System.out.println("Enter interest rate");
		double openInt = Alex.nextDouble();
		
		
		BankAccount2 acct = new BankAccount2(original,openInt);
				
		System.out.println("Enter a threshold or type Q to quit ") ;
	// outside while loop
		while (Alex.hasNextDouble()) {
			acct.originalBal(original);
			
			int months = 0;
			double number = Alex.nextDouble();
		
// inisde nested while loop
		while (acct.getBalance() < number) {
			acct.calcInterest();
			months++;
		}
		System.out.println("It will take " +months+ " months to reach the threshold");
		System.out.println("Enter a threshold:");
	
		}
		acct.originalBal(original);
		System.out.println("Original balance restored: " +acct.getBalance());
	}

}
