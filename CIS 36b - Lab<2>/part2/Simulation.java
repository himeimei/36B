/**
 * @author Huimei Wu
 * CIS 36b
 * Assignment 2
 * Due Date: May 3
 * Date Submitted: May 3
 */
import java.util.Random;
public class Simulation {
	private int head;
	private int tail;

	// determine sideup each time Coin is tossed in random
	public int toss(){
		Random rn = new Random();
		// Generate random number in range [0, 1]
		return rn.nextInt(2);
	}
	
	//count indicates how many times a coin is tossed and the times of heads or tails
	public void stimulate(Coin c, int count){
		for (int i = 0; i < count; ++i) {
			int number = toss();

			// number == 0 means that the toss result is head
			if (number == 0) {
				head++;
				c.setSideup("head");
			}
			//number != 0 means that the toss result is tail
			else {
				tail++;
				c.setSideup("tail");
			}
		}
		System.out.printf("\nSimulate Report:\n");
		System.out.printf("Toss time = %d\nHeads = %d\nTails = %d\n", count, head, tail);
	}		
}
