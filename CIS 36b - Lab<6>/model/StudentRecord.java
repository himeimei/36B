/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */
package model;

import java.io.Serializable;

//In this assignment create a separate serialized file using ObjectOutputStream for each student.
//File should contain student's score and statistics for entire class.

public class StudentRecord implements Serializable {
	//add "implements Serializable" to Student and Statistics.
	private Statistics stat;
	private Student st;
	
	public StudentRecord(Statistics stat, Student st)
	{
		this.stat = stat;
		this.st = st;
	}

	//add getter and setters
	public Statistics getStat() {
		return stat;
	}

	public void setStat(Statistics stat) {
		this.stat = stat;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}
	
	//print method
	public void printStat() {
		stat.printAverage();
		stat.printHigh();
		stat.printLow();
	}
	
	public void printSt() {
		st.printStudentScores();
	}

}
