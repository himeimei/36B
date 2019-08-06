/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_1
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class SpecialSavings extends SavingsAccount {
	
	SpecialSavings(double balance) {
		super(balance);
		if (balance > 10000) {
			 super.modifyInterestRate(0.1);
		}
	}
	
	protected boolean deposit(double depositAmount) {
		System.out.printf("This is deposit from Special Savings\n");
		if (super.deposit(depositAmount)) {
			if (super.getSavingsBalance() > 10000) {
				super.modifyInterestRate(0.1);
			}
			return true;			
		}
		else {
			return false;
		}
	}
	
	protected boolean withdrawal(double withdrawalAmount) {
		System.out.printf("This is withdrawal from Special Savings\n");
		if (super.withdrawal(withdrawalAmount)) {
			if (super.getSavingsBalance() < 10000) {
				super.modifyInterestRate(0.04);
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	protected double calculateMonthlyInterest() {
		System.out.printf("This is calculateMonthlyInterest from Special Savings\n");

		if (super.getSavingsBalance() > 10000) {
			super.modifyInterestRate(0.1);
		}
		
		double monthlyInterest = super.calculateMonthlyInterest();
		super.printBalance();
		super.modifyInterestRate(0.04);
		
		return monthlyInterest;
	}
}