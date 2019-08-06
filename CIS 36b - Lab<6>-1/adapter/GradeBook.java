/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */

package adapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Statistics;
import model.Student;
import model.StudentRecord;
import util.FileIO;

public abstract class GradeBook implements Gradeable {
	private StudentRecord [] sturec;
	
	GradeBook(String fname) throws FileNotFoundException, IOException { 
		//call existing functions to:
		//a. read the file and build a student array.
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
		lab2 = FileIO.readFile(fname, lab2);

		//b. compute statistics
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);
		
		//c. build StudentRecord []
		sturec = new StudentRecord[numStudent];
		for (int i = 0; i < numStudent; ++i) {
			sturec[i] = new StudentRecord(statlab2, lab2[i]);
		}
		
		//d. serialize StudentRecord array (studentid.dat or studentid.ser
		// Where do studentid.dat or studentid.ser come from?
		for (int i = 0; i < numStudent; ++i) {
			String fileName = "/Users/himeimei/eclipse-workspace/Assignment6/src/adapter/student" + sturec[i].getSt().getSID() + ".dat";
			ObjectOutputStream objectOutputStream = 
				    new ObjectOutputStream(new FileOutputStream(fileName));

			if (DEBUG) {
				System.out.println("DEBUG MODE=======================");
				System.out.println("Write student data to file: " + fileName);

				sturec[i].printSt();
				sturec[i].printStat();
				System.out.println("=================================\n");
			}

			objectOutputStream.writeObject(sturec[i]);
			objectOutputStream.close();
		}	
	}
	
	public void printStats(int studid) throws IOException, ClassNotFoundException { 
		// deserialize any file and print stats. 
		String fileName = "/Users/himeimei/eclipse-workspace/Assignment6/src/adapter/student" + studid + ".dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        StudentRecord studentRecord =  (StudentRecord) objectInputStream.readObject();
		if (DEBUG) {
			System.out.println("DEBUG MODE=======================");
			System.out.println("Read student data from file: " + fileName);
			System.out.println("=================================");			
		}
        studentRecord.printStat();
        System.out.println();
        objectInputStream.close();
	}
	
	public void printScores(int studid) throws FileNotFoundException, IOException, ClassNotFoundException { 
		//deserialize studid.dat or studid.ser
		//call print method in student class.
		String fileName = "/Users/himeimei/eclipse-workspace/Assignment6/src/adapter/student" + studid + ".dat";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        StudentRecord studentRecord =  (StudentRecord) objectInputStream.readObject();
		if (DEBUG) {
			System.out.println("DEBUG MODE=======================");
			System.out.println("Read student data from file: " + fileName);
			System.out.println("=================================");			
		}
        studentRecord.printSt();
        System.out.println();
        objectInputStream.close();		
	}
}