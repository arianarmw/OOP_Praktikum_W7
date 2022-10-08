/* Author : Ariana Rahmawati
 * Date   : October 6th 2022
 * Lesson : Polymorphism
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package AnotherTypeOfEmployee;

public class Volunteer extends StaffMember{
	//-------------------------
	// Sets up a vlunteer using the specified information
	//-------------------------
	public Volunteer (String eName, String eAddress, String ePhone) 
	{
		super (eName, eAddress, ePhone);
	}
		
	//-------------------------
	// Returns a zero pay value for this volunteer
	//-------------------------
	public double pay() 
	{
			return 0.0;
	}
}
