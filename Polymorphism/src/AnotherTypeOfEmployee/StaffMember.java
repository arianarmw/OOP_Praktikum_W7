/* Author : Ariana Rahmawati
 * Date   : October 6th 2022
 * Lesson : Polymorphism
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package AnotherTypeOfEmployee;

abstract public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	//-------------------------
	// Sets up a member using the specified information.
	//-------------------------
	public StaffMember(String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	//-------------------------
	// Returns a string including the basic employee imformation
	//-------------------------
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
	
	//-------------------------
	// Derived classes must define the pay method for each type of employee
	//-------------------------
	public abstract double pay();
}