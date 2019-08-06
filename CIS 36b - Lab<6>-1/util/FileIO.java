/*
 * Huimei Wu
 * CIS 36B
 * Lab 6
 * Due Date: June 14
 * Date Submitted: June 14
 */
package util;
import java.io.*;
import java.util.*;
import model.Student;

public class FileIO {	
	// Static method to read data
	public static Student [] readFile(String filename, Student [] stu) {
		int counter = -1; //line counter, count which line is reading 
		try {
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			
			while (!eof) {
				String line = buff.readLine();
				if (line == null)
					eof = true;
				else	 {
					if (counter == -1) {
						counter++;
						continue;
					}
					
					if (counter == stu.length) {
						break;
					}
					
					//Tokenize each line using StringTokenizer Object
					StringTokenizer st = new StringTokenizer(line);
					int index = -1;
					
					while (st.hasMoreTokens()) {
						String token = st.nextToken();
						//System.out.println(token);
						int x = Integer.parseInt(token) ;

						if (index == -1) {
							stu[counter].setSID(x);
							
							index++;
							continue;
						}
						//Each token is converted from String to Integer using parseInt method
						stu[counter].getScores()[index] = x;
						index++;
					}
					counter++;
					//Value is then saved in the right property of Student Object.
				}
			}
		}
		catch (IOException e) {
			System.out.printf("Error -- " + e.toString());
		}
		return stu;
	}
}