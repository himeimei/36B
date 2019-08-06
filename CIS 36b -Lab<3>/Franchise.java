/*
 * Huimei Wu
 * CIS 36B
 * Lab 3
 * Due Date: May 16
 * Date Submitted: May 16
 */
public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
}
