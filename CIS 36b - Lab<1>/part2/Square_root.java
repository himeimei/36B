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
public class Square_root {
	/**
	 * Calculate the square root of a long number.
	 * @param n the number need be calculate the square root.
	 * @return the square root of the number n.
	 */
	public static double sqrt(long n) {
		double lastGuess;
		double nextGuess;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a number and begin your guess: ");
		lastGuess = input.nextDouble();
		
		nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while(Math.abs(nextGuess - lastGuess) > 0.0001){
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		input.close();
		return nextGuess;
	} 
	
	public static void main(String[] args) {
		long n;
		double squareRoot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a positive number: ");
		n = input.nextLong();
		while(n < 0)
		{
			System.out.printf("Invalid number! Please enter a positive number: "); 
			n = input.nextLong();
		}
		
		//Call the method sqrt to calculate the square root of a number.
		squareRoot = sqrt(n);
		System.out.printf("The square root of %d is %.3f.", n, squareRoot);
		
		input.close();
	}
}
