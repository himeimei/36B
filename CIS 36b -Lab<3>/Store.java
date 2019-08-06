/*
 * Huimei Wu
 * CIS 36B
 * Lab 3
 * Due Date: May 16
 * Date Submitted: May 16
 */
public class Store {
	private float salesByWeek[][];
	
	public Store() {
		salesByWeek = new float[5][7];
	}
	
	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale){
		salesByWeek[week][day] = sale;
	}
	
	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesByWeek[i][j] + " ");
			}
			System.out.println("");
		}
	}


	// float [] getsalesforentireweek(int week)
	public float[] getSalesForEntireWeek(int week) {
		return salesByWeek[week];
	}
	
	// float getsaleforweekdayintersection(int week, int day)
	public float getSaleForWeekDayIntersection(int week, int day) {
		return salesByWeek[week][day];
	}
	
	// businessmethod
	// a. totalsalesforweek
	public float getTotalSalesForWeek(int week) {
		float totalSalesForWeek = 0;
		for (int day = 0; day < 7; day++) {
			totalSalesForWeek += salesByWeek[week][day];
		}
		return totalSalesForWeek;
	}

	// b. avgsalesforweek
	public float getAverageSalesForWeek(int week) {
		return getTotalSalesForWeek(week) / 7;
	}
	
	// c. totalsalesforallweeks
	public float getTotalSalesForAllWeeks() {
		float totalSalesForAllWeeks = 0;
		for (int week = 0; week < 5; week++) {
			totalSalesForAllWeeks += getTotalSalesForWeek(week);
		}
		return totalSalesForAllWeeks;
	}
	
	
 
	// d. averageweeklysales
	public float getAverageWeeklySales() {
		return getTotalSalesForAllWeeks() / 5;
	}
 
	// e. weekwithhighestsaleamt
	public int getWeekWithHighestSaleAmount() {
		int maxWeek = 0;
		float maxSale = -1;
		for (int week = 0; week < 5; week++) {
			float sale = getTotalSalesForWeek(week);
			if (sale > maxSale) {
				maxSale = sale;
				maxWeek = week;
			}
		}
		return maxWeek + 1;
	}
	
	// f. weekwithlowestsaleamt
	public int getWeekWithLowestSaleAmount() {
		int minWeek = 0;
		float minSale = Float.MAX_VALUE;
		for (int week = 0; week < 5; week++) {
			float sale = getTotalSalesForWeek(week);
			if (sale < minSale) {
				minSale = sale;
				minWeek = week;
			}
		}
		return minWeek + 1;
	}

	// analyzeresults
	public void analyzeResults() {
		for (int week = 0; week < 5; week++) {
			System.out.printf("---- Week %d ----\n", week);
			System.out.printf("Total sales: %.2f\n", getTotalSalesForWeek(week));
			System.out.printf("Average sales: %.2f\n", getAverageSalesForWeek(week));
			}
		
		System.out.printf("\n");
		System.out.printf("Total sales for all weeks: %.2f\n", getTotalSalesForAllWeeks());
		System.out.printf("Average weekly sales: %.2f\n", getAverageWeeklySales());
		System.out.printf("Week with highest sale: %d\n", getWeekWithHighestSaleAmount());
		System.out.printf("Week with lowest sale: %d\n", getWeekWithLowestSaleAmount());
	}	
}