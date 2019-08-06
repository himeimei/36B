/**
 * @author Huimei Wu
 * CIS 36b
 * Assignment 2
 * Due Date: May 3
 * Date Submitted: May 3
 */
import java.util.Random;

public class Coin {
	private int value;
	private String sideup;
	
	public Coin (int value) {
		this.value = value;
		toss();
		print();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSideup() {
		return sideup;
	}	

	public void setSideup(String sideup) {
		this.sideup = sideup;
	}
	
	// determine sideup when coin is instantiated in random
	public void toss() {
		// https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
		Random rn = new Random();
		int number = rn.nextInt(2);
			
		if (number == 0) {
			setSideup("head");
		}
		else {
			setSideup("tail");
		} 
	}
	
	// print the coin's value and current sideup information
	public void print() {
		System.out.printf("This coin value is %d and current sideup is %s.\n", value, sideup);
	}
}



