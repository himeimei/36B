/*
 * Huimei Wu
 * CIS 36B
 * Lab 7
 */

package adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CIS36b extends GradeBook {

	//add a constructor to accept a text file to pass to constructor of parent.
	public CIS36b(String fname) throws FileNotFoundException, IOException {
		super(fname);
	}
	
	public CIS36b() {
		super();
	}

	public Gradeable MakeGradeBook(String coursename, String filename) throws FileNotFoundException, IOException {
		CIS36b object = new CIS36b(filename);
		object.setCourseName(coursename);
		return object;
	}

}
