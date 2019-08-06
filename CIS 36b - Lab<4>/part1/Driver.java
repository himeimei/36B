/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_1
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class Driver {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver1.printBalance();

		saver2.calculateMonthlyInterest();
		saver2.printBalance();
		
		SavingsAccount.modifyInterestRate(0.05);

		saver1.calculateMonthlyInterest();
		saver1.printBalance();

		saver2.calculateMonthlyInterest();
		saver2.printBalance();
		
		//=============================================
		
		saver1 = new SpecialSavings(2000);
		saver2 = new SpecialSavings(3000);
		
		saver1.deposit(100);
		saver1.printBalance();
		
		saver2.withdrawal(500);
		saver2.printBalance();

		saver1.deposit(30000);
		saver1.calculateMonthlyInterest();
		
		saver1.withdrawal(31000);
		saver1.calculateMonthlyInterest();
	}
}
