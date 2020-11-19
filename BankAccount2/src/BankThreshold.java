import javax.swing.JOptionPane;

public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// threshold to reach is 1500
		String AB=JOptionPane.showInputDialog("Enter the threshold for your account balance reach");
		
		//AccountBalance=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the threshold for your account balance reach"));
		
		
		// 1000
		String OB=JOptionPane.showInputDialog("Enter opening balance");
		
		//OpeningBalance=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter opening balance"));
		
		// interest rate 0.5
		String Interest=JOptionPane.showInputDialog("Enter interest rate");
		
		
		//Interest=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter interest rate"));
		
		// repeats until user enters END
	
		
		System.out.println("It will take x months to reach the threshold");
	}

}
