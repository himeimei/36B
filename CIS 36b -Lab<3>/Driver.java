/*
 * Huimei Wu
 * CIS 36B
 * Lab 3
 * Due Date: May 16
 * Date Submitted: May 16
 */
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int storeNum;
		String tastNum;
		
		FileIO a1 = new FileIO("/Users/himeimei/Documents/CIS/36B/assignment336b/src/Salesdat.txt");
		
		System.out.printf("Welcome to Franchise!\n");
		System.out.printf("We have data for 6 stores for last 5 weeks.\n");
		System.out.printf("\n");
		
		System.out.printf("This program can help you analyze each store's sales data.\n\n");
		System.out.printf("Enter 1 for total sales for each week.\n");
		System.out.printf("Enter 2 for average daily sales for each week.\n");
		System.out.printf("Enter 3 for total sales for all weeks.\n");
		System.out.printf("Enter 4 for average weekly sales.\n");
		System.out.printf("Enter 5 for week with the highest amount in sales.\n");
		System.out.printf("Enter 6 for week with the lowest amount in sales.\n");
		System.out.printf("Enter 7 for all analytical data.\n");
		System.out.printf("Enter q to quit.\n ");
		System.out.printf("\n");
		
		Franchise f = a1.readData();
			
		do{	
			System.out.printf("\nSelect a store number <1 through 6>: ");
			storeNum = input.nextInt();
			System.out.print("Please enter a number between 1-7 to select a tast or q to quit: ");
			tastNum = input.next();
					
			if(tastNum.equals("1")) {
				System.out.printf("\nHere is Store%d's total sales for each week: \n", storeNum);
				for (int week = 0; week < 5; week++) {
					System.out.printf("Week %d = %.2f\n", week + 1, f.getStores(storeNum - 1).getTotalSalesForWeek(week));
				}
			}
			else if(tastNum.equals("2")) {
				System.out.printf("\nHere is Store%d's average daily sales for each week: \n", storeNum);
				for (int week = 0; week < 5; week++) {
					System.out.printf("Week %d = %.2f\n", week + 1, f.getStores(storeNum - 1).getAverageSalesForWeek(week));
				}
			}
			else if(tastNum.equals("3")) {
				System.out.printf("\nStore%d's total sales for all weeks is %.2f. \n", 
								storeNum,f.getStores(storeNum - 1).getTotalSalesForAllWeeks());
			}
			else if(tastNum.equals("4")) {
				System.out.printf("\nStore%d's average weekly sales %.2f. \n", 
								storeNum,f.getStores(storeNum - 1).getAverageWeeklySales());
			}
			else if(tastNum.equals("5")) {
				System.out.printf("\nFor store%d, week%d has the highest amount in sales. \n", 
								storeNum,f.getStores(storeNum - 1).getWeekWithHighestSaleAmount());
			}
			else if(tastNum.equals("6")) {
				System.out.printf("\nFor store%d, week%d has the lowest amount in sales. \n",
								storeNum,f.getStores(storeNum - 1).getWeekWithLowestSaleAmount());
			}
			else if(tastNum.equals("7")) {
				f.getStores(storeNum - 1).analyzeResults();	
			}
				
		}while(!tastNum.equalsIgnoreCase("q"));
		System.out.println("Goodbye!");
		input.close();
	}
}
