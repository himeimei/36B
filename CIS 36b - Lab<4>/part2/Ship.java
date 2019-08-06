/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_2
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class Ship {
	String name;
	int yearBuilt;
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ship(int size, int yearBuilt, String name) {
		this.size = size;
		this.yearBuilt = yearBuilt;
		this.name = name;
	}
	
	public String toString() {
		return "SHIP\nShip name: " + name + "\nBuilt in year: "+ yearBuilt +
			"\nShip size: " + size;
	}	
}
