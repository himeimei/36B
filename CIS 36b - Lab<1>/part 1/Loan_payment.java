/**
 * 
 * @author Huimei Wu
 * CIS 36B
 * Assignment 1
 * Due Date: April 22
 * Date Submitted: April 22
 * 
 */
import java.util.Scanner;
public class Loan_payment {
	
	/**
	 * Calculate the monthly payment for a loan.
	 * @param monthlyInterestRate The monthly interest rate for a loan.
	 * @param numberOfYears The number of the year for a loan.
	 * @param loanAmount The amount of a loan.
	 * @return The monthly payment for the loan.
	 */
	public static double calMonthlyPayment(double monthlyInterestRate, int numberOfYears, double loanAmount) {
		double monthlyPayment;
		
		monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		return monthlyPayment;
	}
	
	/**
	 * Calculate the total payment for a loan.
	 * @param monthlyPayment The monthly payment for a loan.
	 * @param numberOfYears The number of the year for a loan.
	 * @return The total payment for the loan.
	 */
	public static double calTotalPayment(double monthlyPayment, int numberOfYears) {
		return monthlyPayment * numberOfYears * 12;
	}
	
	/**
	 * Display the amount of interest, principal, balance for a loan in each month. 
	 * @param monthlyInterestRate The monthly interest rate for a loan.
	 * @param numberOfYears The number of the year for a loan.
	 * @param monthlyPayment The monthly payment for a loan.
	 * @param loanAmount The amount of a loan.
	 */
	public static void displayTable(double monthlyInterestRate, int numberOfYears,
								   double monthlyPayment,double loanAmount) {
		int i;
		double balance = loanAmount;
		double interest;
		double principal;
		double lastPayment = monthlyPayment;
		
		System.out.printf("\n%s\t\t%s\t\t%s\t%s\n", "Payment#" , "Interest", "Principal", "Balance"); 
		
		for (i = 1; i <= numberOfYears * 12; i++) { 
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest; 
			balance = balance - principal;
			
			// 
			if (i == numberOfYears * 12 && Math.abs(balance) >= 0.0001) {
				lastPayment = monthlyPayment + balance;
				balance = 0;
			}
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f", i, interest, principal, balance);
			if (lastPayment != monthlyPayment) {
				System.out.printf(" (Last Payment %.2f)", lastPayment);
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double loanAmount;
		int numberOfYears;
		double annualInterestRate;
		double monthlyInterestRate;
	
		double monthlyPayment;
		double totalPayment;
		
		System.out.printf("Enter the loan amount(a POSITIVE number): ");
		loanAmount = input.nextDouble();
		while (loanAmount <= 0) {
			System.out.printf("ERROR! Enter the loan amount(a POSITIVE number): ");
			loanAmount = input.nextDouble();
		}
			
		System.out.printf("Enter number of years(a POSITIVE number): ");
		numberOfYears = input.nextInt();
		while (numberOfYears <= 0) {
			System.out.printf("ERROR! Enter number of years(a POSITIVE number): ");
			numberOfYears = input.nextInt();
		}
		
		System.out.printf("Enter annual interest rate(a POSITIVE number): ");
		annualInterestRate = input.nextDouble();
		while (annualInterestRate <= 0) {
			System.out.printf("ERROR! Enter annual interest rate(a POSITIVE number): ");
			annualInterestRate = input.nextDouble();
		}
		
		// Calculate the monthly interest rate.
		monthlyInterestRate = annualInterestRate / (12 * 100);
		
		// Call the method to calculate the monthly payment.
		monthlyPayment = calMonthlyPayment(monthlyInterestRate, numberOfYears, loanAmount);
		
		// Call the method to calculate the total payment.
		totalPayment = calTotalPayment(monthlyPayment, numberOfYears);
		
		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);
		
		//Display the amount of interest, principal, balance for each month. 
		displayTable(monthlyInterestRate, numberOfYears, monthlyPayment, loanAmount);
		
		input.close();
	}
}
