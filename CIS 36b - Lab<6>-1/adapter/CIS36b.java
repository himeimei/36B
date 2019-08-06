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

public class CIS36b extends GradeBook {

	//add a constructor to accept a text file to pass to constructor of parent.
	public CIS36b(String fname) throws FileNotFoundException, IOException {
		super(fname);
	}
}
