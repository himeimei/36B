/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */

package adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Gradeable {
	static public boolean DEBUG = false;
	
	public void printStats(int studid) throws FileNotFoundException, IOException, ClassNotFoundException;
	public void printScores(int studid) throws FileNotFoundException, IOException, ClassNotFoundException;
}