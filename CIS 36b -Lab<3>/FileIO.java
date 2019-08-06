/*
 * Huimei Wu
 * CIS 36B
 * Lab 3
 * Due Date: May 16
 * Date Submitted: May 16
 */
import java.io.*;
import java.util.*;

public class FileIO {
	//two private properties
	private String fname = null;
	private boolean DEBUG = false; // flag, if DEBUG is true print out the line that is read in
	
	//constructor 
	public FileIO(String fname) {
		this.fname = fname;
	}
	
	//method to read data
	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0; //line counter, count which line is reading 
		try {
			FileReader file = new FileReader(fname); // create a file reader
			BufferedReader buff = new BufferedReader(file); // create a buffered reader for wrapping file
			String temp;
			boolean eof = false; // create a boolean variable to detect the end of the line
			while (!eof) {
				String line = buff.readLine(); //read files 
				counter++; // line counter increase while reading
				if (line == null)
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line);
					
					// read the first line 
					if (counter == 1) {
						temp = line; // store the first line information in the temp
						a1 = new Franchise(Integer.parseInt(temp)); // convert String in the temp to Integer
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					if (counter == 2) // skip line 2
						;
					
					// read the line 3 to line 8
					if (counter > 2) {
						  	int x = buildStore(a1, (counter-3), line); // call buildStore method, 
							if (DEBUG)
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								a1.getStores(counter-3).printdata();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f; // declare float variable sale and initialize it to 0
		int week = 0; // declare int variable week and initialize it to 0
		int day = 0; // declare int variable day and initialize it to 0
		StringTokenizer st = new StringTokenizer(temp); // create a StringTokenizer
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 	s1 = st.nextToken(); // get each value
		        sale = Float.parseFloat(s1); // convert String into numbers
	        	 	tstore.setsaleforweekdayintersection(week, day, sale); // call setsaleforweekdayintersection method 
	        	 														  // to set each element into the Two-dimensional array

	         }
	         week++;
	    }
		a1.setStores(tstore, counter); // call setStore method, set each store's with sales information
	    return week; 
	}
}
