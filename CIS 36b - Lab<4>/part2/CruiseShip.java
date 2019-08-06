/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_2
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class CruiseShip extends Ship {
	int numGuests;
	int numPools;
	int numRestaurants;
	int numCasino;
	 
	CruiseShip(int size, int yearBuilt, String name,int numGuests, int numPools, int numRestaurants, int numCasino){
		super(size, yearBuilt, name);
		this.numGuests = numGuests;
		this.numPools = numPools;
		this.numRestaurants = numRestaurants;
		this.numCasino = numCasino;
	}
	
	public String toString(){
        return "\nCRUISE SHIP\nShip name: " + name +
        			"\nBuilt: " + yearBuilt +
                "\nSize: " + size +
                "\nNumber of guess: " + numGuests +
                "\nNumber of swimming pools: " + numPools +
                "\nNumber of restaurants: " + numRestaurants+
                "\nNumber of casino: " + numCasino;
    }
}
