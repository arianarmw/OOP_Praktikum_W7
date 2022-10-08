/* Author : Ariana Rahmawati
 * Date   : October 6th 2022
 * Lesson : Polymorphism
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package AnotherTypeOfEmployee;

public class Staff {
	StaffMember[] staffList; //error here
    
    //---------------------------------------------------------
    //  Sets up the list of staff member.
    //---------------------------------------------------------

    public Staff () 
    {
        staffList = new StaffMember[8];
        
        staffList[0] = new Executive("Sam", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);
        
        staffList[1] = new Employee("Carla", "456 Off Line",
                "555-0101", "010-20-3040", 1169.23);
        
        staffList[2] = new Employee("Woody", "789 Off Rocker",
                "555-0000", "010-29-3040", 1169.23);
        
        staffList[3] = new Hourly("Diane", "678 Fifth Ave", 
                "555-0690", "958-47-3625", 10.55);
        
        staffList[4] = new Volunteer("Meisya", "987 Suds Blvd",
                "555-8374");
        
        staffList[5] = new Volunteer("Lolla", "321 Duds Lane", 
                "555-7282");
        
        staffList[6] = new Commission("Shofiyah", "371 Bludhaven",
                "555-9867", "456-11-2922", 6.25, 20);
        
        staffList[7] = new Commission("Devina", "666 Hells Kitchen",
                "555-2133", "545-66-1234", 9.75, 15);
        
        ((Executive)staffList[0]).awardBonus(500.00);
        
        ((Hourly)staffList[3]).addHours(40);
        
        ((Commission)staffList[6]).addHours(35); //new add commission
        ((Commission)staffList[6]).addSales(400);
        
        ((Commission)staffList[7]).addHours(40);
        ((Commission)staffList[7]).addSales(950);
       
     }

     //-----------------------------------------------------------------
     //  Pays all staff members.
     //-----------------------------------------------------------------
     public void payday ()
     {
        double amount;
     
        for (int count=0; count < staffList.length; count++)
        {
           System.out.println (staffList[count]);

           amount = staffList[count].pay();  // polymorphic

           if (amount == 0.0)
              System.out.println ("Thanks!");
           else
              System.out.println ("Paid: " + amount);

           System.out.println ("-----------------------------------");
        }
     }
}