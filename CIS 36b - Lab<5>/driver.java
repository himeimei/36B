/*
 * Huimei Wu
 * CIS 36B
 * Lab 5
 * Due Date: June 4
 * Date Submitted: June 4
 */

import model.Statistics;
import model.Student;
import util.FileIO;
import java.util.Scanner;

public class driver {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		System.out.printf("Welcome to the statistical analysis system!\n");
		System.out.printf("Please enter how many students in the class: ");
		int numStudent = input.nextInt();
		
		if(numStudent <= 0 || numStudent > 40) {
			System.out.printf("ERROR! Enter a number between 1 and 40!");
			return;
		}
		System.out.printf("\n");	
		
		Student[] lab2 = new Student[numStudent];
		for (int i = 0; i < numStudent; ++i) {
			lab2[i] = new Student();
		}

		//Populate the student array
		lab2 = FileIO.readFile("/Users/himeimei/eclipse-workspace/Assignment5/src/util/data.txt", lab2);
		Statistics statlab2 = new Statistics();
		
		// print student score
		for (int i = 0; i < numStudent; ++i) {
			lab2[i].printStudentScores();
		} 
		
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);
		
		//Print the data and statistics
		statlab2.printLow();
		statlab2.printHigh();
		statlab2.printAverage();

	}
}
