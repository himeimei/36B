/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import adapter.CIS36b;
import adapter.Gradeable;

public class Driver {
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{	
		Gradeable gr = new CIS36b("/Users/himeimei/eclipse-workspace/Assignment6/src/util/data.txt");
		
		System.out.printf("Enter a student ID and I will give you the scores for that student: ");
		
		Scanner input = new Scanner(System.in);
		int studentID = input.nextInt();
		
		System.out.printf("\n");
		gr.printStats(studentID);
		gr.printScores(studentID); //test with a few function calls.
		
		input.close();
	}
}
