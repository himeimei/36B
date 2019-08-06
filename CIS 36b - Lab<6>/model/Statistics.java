/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */
package model;

import java.io.Serializable;

public class Statistics implements Serializable {
	private int [] lowscores = new int [5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];

	/* This method will find the lowest score and store it in an array names lowscores. */
	public void findlow(Student [] stu) {
		for (int q = 0; q < 5; q++) {
			int low = Integer.MAX_VALUE;
			
			for (int i = 0; i < stu.length; ++i) {
				low = Math.min(low, stu[i].getScores()[q]);
			}
			lowscores[q] = low;
		}
	}

	/* This method will find the highest score and store it in an array names highscores. */
	public void findhigh(Student [] stu) {
		for (int q = 0; q < 5; q++) {
			int high = Integer.MIN_VALUE;
			
			for (int i = 0; i < stu.length; ++i) {
				high = Math.max(high, stu[i].getScores()[q]);
			}
			highscores[q] = high;
		}
	}

	/* This method will find avg score for each quiz and store it in an array names avgscores. */
	public void findavg(Student [] stu) {
		for (int q = 0; q < 5; q++) {
			int sum = 0;
			
			for (int i = 0; i < stu.length; ++i) {
				sum += stu[i].getScores()[q];
			}
			avgscores[q] = (float)sum / stu.length;
		}
	}

	//add methods to print values of instance variables.
	public void printLow() {
		System.out.printf("The lowest score for each quiz: ");
		for (int q = 0; q < 5; q++) {
			System.out.print(lowscores[q] + " ");
		}
		System.out.printf("\n");		
	}
	
	public void printHigh() {
		System.out.printf("The highest score each quiz: ");
		for (int q = 0; q < 5; q++) {
			System.out.printf("%d ", highscores[q]);
		}
		System.out.printf("\n");
	}

	public void printAverage() {
		System.out.printf("Average score for each quiz: ");
		for (int q = 0; q < 5; q++) {
			System.out.printf("%.1f ", avgscores[q]);
		}
		System.out.printf("\n");		
	}
}