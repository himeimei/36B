/**
 * @author Huimei Wu
 * CIS 36b
 * Assignment 2
 * Due Date: May 3
 * Date Submitted: May 3
 */
import java.util.Scanner;
public class Driver {
	
	//read in personal information, include name, address, age and phone number 
	public void readInput(PersonalInformation p) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\n");
		System.out.printf("Please enter the person's name: ");
		String name = input.nextLine();
		p.setName(name);
		
		System.out.printf("Please enter the person's address: ");
		String address = input.nextLine();
		p.setAddress(address);
		
		System.out.printf("Please enter the person's age: ");
		String age = input.nextLine();
		p.setAge(age);
		
		System.out.printf("Please enter the person's phoneNum: ");
		String phoneNum = input.nextLine();
		p.setPhoneNum(phoneNum);
		System.out.printf("\n");
		
	}

	public static void main(String[] args) {
		PersonalInformation p = new PersonalInformation();
		Driver d = new Driver();
  
		p.print();
		
		PersonalInformation person1 = new PersonalInformation();
		d.readInput(person1);
		person1.print();
		
		PersonalInformation person2 = new PersonalInformation();
		d.readInput(person2);
		person2.print();
		
		PersonalInformation person3 = new PersonalInformation();
		d.readInput(person3);
		person3.print();	
	}
}
