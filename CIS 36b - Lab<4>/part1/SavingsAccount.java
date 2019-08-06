/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_1
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class SavingsAccount {
	private double savingsBalance;
	private static double annualInterestRate;
	
	protected SavingsAccount() {
		savingsBalance = 0.0;
		annualInterestRate = 0.0;
	}
	
	SavingsAccount(double balance) {
		savingsBalance = balance;
		annualInterestRate = 0.04;
	}
	
	protected double calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance * annualInterestRate / 12;
		savingsBalance += monthlyInterest;
		return monthlyInterest;
	}
	
	protected void printBalance() {
		System.out.printf("Your current saving balance is %.2f;\nInterest rate is %.2f;\n\n", 
			savingsBalance, annualInterestRate);
	}
	
	protected static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	
	protected boolean deposit(double depositAmount) {
		double curBalance = savingsBalance;
		savingsBalance = curBalance + depositAmount;
		return true;
	}
	
	protected boolean withdrawal(double withdrawalAmount) {
		double curBalance = savingsBalance;
		if (withdrawalAmount > curBalance) {
			System.out.printf("Withdrawal amount is bigger than current balance");
			return false;
		}
		
		savingsBalance = curBalance - withdrawalAmount;
		return true;
	}	
	
	protected double getSavingsBalance() {
		return savingsBalance;
	}

	protected void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
