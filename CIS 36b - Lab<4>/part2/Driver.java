/*
 * Huimei Wu
 * CIS 36B
 * Lab 4_2
 * Due Date: May 30
 * Date Submitted: May 30
 */
public class Driver {
	public static void main(String[] args) {
		Ship[] ships = new Ship[3];
		
		ships[0] = new Ship(300000,2001, "Destroyer");
        ships[1] = new CruiseShip(10000, 2005, "Arethusa",50,18,0,1);
        ships[2] = new CargoShip("Mærsk Mc-Kinney Møller", 2010, 3000000, 19, 150000);
		
        System.out.printf("SHIPS LIST: \n");
		for (int i = 0; i < ships.length; i++) {
			System.out.println(ships[i]);
		} 
	}
}
