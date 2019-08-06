/*
 * Huimei Wu
 * CIS 36B
 * Lab 7
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import adapter.CIS36b;
import adapter.Gradeable;

public class Driver {
	public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{	
		//Gradeable gr = new CIS36b("/Users/himeimei/eclipse-workspace/Assignment6/src/util/data.txt");
		Gradeable gr = new CIS36b();
		gr = gr.MakeGradeBook("Computer Science", "/Users/himeimei/eclipse-workspace/Assignment7/src/util/data.txt");
		
		System.out.printf("Enter a student ID and I will give you the scores for that student: ");
		
		Scanner input = new Scanner(System.in);
		int studentID = input.nextInt();
		
		System.out.printf("\n");
		//test with a few function calls.
		gr.printstats(studentID);
		gr.printall(studentID); 
		gr.printgrades(studentID);
		
		input.close();
	}
}
