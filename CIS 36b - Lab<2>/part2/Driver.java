/**
 * @author Huimei Wu
 * CIS 36b
 * Assignment 2
 * Due Date: May 3
 * Date Submitted: May 3
 */
public class Driver {
	public static void main(String [] args) {
		Coin qtr = new Coin(25);
		
		Simulation s1 = new Simulation();

		s1.stimulate(qtr, 20); // pass by reference
	}
}
