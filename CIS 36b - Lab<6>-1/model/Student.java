/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */

package model;

import java.io.Serializable;

public class Student implements Serializable {
    private int SID;       //Student ID
    private int [] scores= new int[5];
    
    public Student() {
    	
    }
    
    public int getSID() {
        return SID;
    }
    
    public void setSID(int SID) {
        this.SID = SID;
    }
    
    public int[] getScores() {
        return scores;
    }
    
    public void setScores(int [] scores) {
        this.scores = scores;
    }
    
    //add methods to print values of instance variables
    public void printStudentScores()
    {
    		System.out.printf("Student %s scores: ", SID);
    		for (int i = 0; i < 5; ++i) {
    			System.out.printf("%d ",scores[i] );
    		}
    		System.out.printf("\n");
    }
}
