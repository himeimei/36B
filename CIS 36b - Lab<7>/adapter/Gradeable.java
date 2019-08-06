/*
 * Huimei Wu
 * CIS 36B
 * Lab 7
 */

package adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Gradeable {
	static public boolean DEBUG = false;
	
	public Gradeable MakeGradeBook(String coursename, String filename) throws FileNotFoundException, IOException;
	public void printstats(int studid) throws FileNotFoundException, IOException, ClassNotFoundException;
	public void printall(int studid) throws FileNotFoundException, IOException, ClassNotFoundException;
	public void printgrades(int studid) throws FileNotFoundException, IOException, ClassNotFoundException;
}