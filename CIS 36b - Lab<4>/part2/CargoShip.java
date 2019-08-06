/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_2
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class CargoShip extends Ship {
	int numContainer;
	int totalContainerWeight;
 
	CargoShip(String name, int yearBuilt, int size, int numContainer, int totalContainerWeight){
		super(size, yearBuilt, name);
		this.numContainer = numContainer;
		this.totalContainerWeight = totalContainerWeight;
		
	}
	
	 public String toString(){
	        return "\nCARGO SHIP\nShip Name: " + name +
	                "\nBuilt: " + yearBuilt +
	                "\nSize: " + size +
	                "\nNumber of container:" + numContainer +
	                "\nTotal container weight: " + totalContainerWeight;
	    }
}
