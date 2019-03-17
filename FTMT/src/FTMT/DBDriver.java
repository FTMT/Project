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
		// Information
		String username = "juser";
		String password = "user";
		String firstName = "John";
		String lastName = "User";
		String type = "u";
		String status = "Y";
		
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
