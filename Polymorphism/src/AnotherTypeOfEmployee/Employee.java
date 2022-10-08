/* Author : Ariana Rahmawati
 * Date   : October 6th 2022
 * Lesson : Polymorphism
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package AnotherTypeOfEmployee;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	//-----------------------------------------------------------------
	//  Sets up an employee with the specified information.
	//-----------------------------------------------------------------
	public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		  super (eName, eAddress, ePhone);
		
		  socialSecurityNumber = socSecNumber;
		  payRate = rate;
	}
	
	//-----------------------------------------------------------------
	//  Returns information about an employee as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		  String result = super.toString();
		
		  result += "\nSocial Security Number: " + socialSecurityNumber;
		
		  return result;
	}
	
	//-----------------------------------------------------------------
	//  Returns the pay rate for this employee.
	//-----------------------------------------------------------------
	public double pay()
	{
		return payRate;
	}
}