/**
 * @author Huimei Wu
 * CIS 36b
 * Assignment 2
 * Due Date: May 3
 * Date Submitted: May 3
 */
public class PersonalInformation {
	private String name;
	private String address;
	private String age;
	private String phoneNum;
	
	public PersonalInformation () {};
	public PersonalInformation(String name, String address, String age, String phoneNum) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	};
	public void print() {
		System.out.printf("Name = %s\nAddress = %s\nAge = %s\nPhone Number = %s\n",
						name, address, age, phoneNum);
	}
}
