/**
 * 
 */

package FTMT;

import java.util.*;

/**
 * @author wcooper001
 *
 */
public class DBDriver {

	/**
	 * DBDriver Constructor
	 */
	public DBDriver() 
	{
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// User/Admin testing Information
		String username = "juser";
		String password = "user";
		String firstName = "John";
		String lastName = "User";
		String type = "u";
		String status = "Y";
		
		// University Testing info
		String name = "Jesus University";
		String state = "Texas";
		String location = "Houston";
		String control =  "Private";
		int numStudents = 777;
		double percFemales = 00.01;
		double satVerbal = 800.00;
        double satMath = 800.00;
        double expenses = 1.00;
        double percAid = 100.00;
        double percAdmit = 1.00;
        double percEnrolled = 3.00;
        int acadScale = 3;
        int socialScale = 4;
        int qualLife = 5;
		
		UserInteraction userInteract = new UserInteraction();
		AdminInteraction adminInteract = new AdminInteraction();
		
		// Log In
		if (userInteract.login(username, password) == 2)
		{
			System.out.println("Logged in");
		}
		
		else if (userInteract.login(username, password) == 1)
		{
			System.out.println("Failed to log in; Account inactive");
		}
		
		else if (userInteract.login(username, password) == 0)
		{
			System.out.println("Failed to log in; Username or password incorrect");
		}
		
		// View and Edit Profile 
		System.out.println(userInteract.viewProfile(username));
		adminInteract.editProfile(firstName, lastName, username, password, type.charAt(0), status.charAt(0));
		System.out.println("Edited Profile");
		System.out.println(userInteract.viewProfile(username));
		
		
		// Add University
		int addedUniv = adminInteract.addUniversity(name, state, location,control, numStudents,  percFemales,satVerbal,
		          satMath, expenses, percAid,  percAdmit,percEnrolled, 
		           acadScale, socialScale, qualLife);
		{
		if (addedUniv == -1)
		{
		System.out.println("This school is NOT unique! \n Add failed!");
		}
		else 
		{
		System.out.println("School has been added!");
		}
		}
		// Search
		//System.out.println("Search schools based on New York: \n");
		//ArrayList<University> univArray = userInteract.searchSchools(null, "NEW YORK", null, null, "10000", "17000",
	   // 		null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
	   // 		null, null, null, null));
		
		
		
		//for (University univ : univArray)
		//{
		//	System.out.println(univ.toString() + "\n");
		//}
		
		// Recommended Schools
		System.out.println("Recommended Schools: \n");
		for (University univ : userInteract.showRecSchools("HARVARD"))
		{
			System.out.println(univ.toString() + "\n");
		}
		
		// View List of Schools
		System.out.println("List of all schools for admin: \n");
		for (University univ : adminInteract.viewUniversities())
		{
			//System.out.println(univ.toString() + "\n");
		}
	}

}
