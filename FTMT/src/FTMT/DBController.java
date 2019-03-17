/**
 * 
 */

package FTMT;

import dblibrary.project.csci230.*;
import java.util.*;

/**
 * DBController.java
 * 
 * @author wcooper001
 * @version 3/12/19
 */
public class DBController
{
  UniversityDBLibrary dbLibrary = new UniversityDBLibrary("fearthem", "csci230");
  String [][] usernames = dbLibrary.user_getUsers();
  String [][] schools = dbLibrary.university_getUniversities();
  String [] userInfo = new String[6];
  
  //  ArrayList <String[]> names = new ArrayList();
//  public ArrayList<String[]> setArray()
//  {
//    for (int i = 0; i < usernames.length; i++)
//    {
//      System.out.println(usernames[i]);
//      for (int j = 0; j < 6; j++)
//      {
//        System.out.println(usernames[i][j]);
//        userInfo[j] = usernames[i][j];
//      }
//      //names.add(
//    }
//    return null;
//  }
                                    
  /**
 *  DBController Constructor
 */
public DBController()
  {
    this.dbLibrary = new UniversityDBLibrary("fearthem", "csci230");
    this.usernames = dbLibrary.user_getUsers();
    this.schools = dbLibrary.university_getUniversities();
    this.userInfo = new String[6];
  }
  
  
  /**
   * getPassword()
   * 
 * @param username
 * @return String
 */
public String getPassword(String username)
  {
	String password = "";
	
	for (int i = 0; i < this.usernames.length; i++)
    {
      if(username.equals(usernames[i][2]))
      {
        password = usernames[i][3];
      }
    }
    return password;
  }
  
  /**
 * @param username
 * @return String[]
 */
public Account getProfile(String username)
  {
	String[] profileInfo = new String[6];
    for (int i = 0; i < this.usernames.length; i++)
    {
      if(username.equals(usernames[i][2]))
      {
        profileInfo = usernames[i];
        char type = profileInfo[4].charAt(0);
        
        if (type == 'U' || type == 'u')
        {
        	String name = profileInfo[0];
        	User profile = new User(name, profileInfo[1], profileInfo[2], 
        			profileInfo[3], profileInfo[4].charAt(0), profileInfo[5].charAt(0));
        	return profile;
        }
        
        if (type == 'A' || type == 'a')
        {
        	String name = profileInfo[0];
        	Admin profile = new Admin(name, profileInfo[1], profileInfo[2], 
        			profileInfo[3], profileInfo[4].charAt(0), profileInfo[5].charAt(0));
        	return profile;
        }
      }
    }

    return null;
  }
  
  public int setProfileInfo(String username, String password, String firstName, String lastName, char type, 
                                    char status)
  {
    return dbLibrary.user_editUser(username, firstName, lastName, password, type, status);
  }
  
  /**
   *  Checks if the given username and password match
   * 
 * @param username
 * @param password
 * @return boolean
 */
public boolean checkInfo(String username, String password)
  {
    for (int i = 0; i < this.usernames.length; i++)
    {
      if(username.equals(usernames[i][2]))
      {
        if(password.equals(usernames[i][3]))
        {
          return true;
        }
      }
    }
    return false;
  }
  
public char getStatus(String username)
  {
	for (int i = 0; i < this.usernames.length; i++)
    {
		if(username.equals(usernames[i][2]))
        {
	      return usernames[i][5].charAt(0);
	    }
	}
	return 'n';
  }
   
   public ArrayList<University> searchSchools(String name, String state, String location, String control,
		   String numStudentsLow, String numStudentsHigh, String percFemLow, String percFemHigh,
		   String satVerbLow, String satVerbHigh, String satMathLow, String satMathHigh, String expenses,
		   String percFinAidLow, String percFinAidHigh, String numAppLow, String numAppHigh, String percAdmitLow,
		   String percAdmitHigh, String percEnrolledLow, String percEnrolledHigh, String acadScaleLow, String acadScaleHigh,
		   String socialScaleLow, String socialScaleHigh, String qualLifeLow, String qualLifeHigh, String[] emphases)
   { 
		 	   
	   
	   
     int i = 0;
     ArrayList<University> results = new ArrayList<University>();
     University univ = new University();
     
     while (i < this.schools.length)
     {
    	 //Name
       if (this.schools[i][0].contains(name))
       {
    	   if(!results.contains(univ))
    	   results.add(univ);
       }
       
       //
       if (state.equals(this.schools[i][1]))
       {
         if (numStudentsLow.equals(this.schools[i][4]))
         {
           univ = new University(this.schools[i][0], this.schools[i][1], this.schools[i][2], this.schools[i][3],
          		 Integer.parseInt(this.schools[i][4]), Double.parseDouble(this.schools[i][5]), Double.parseDouble(this.schools[i][6]), 
          		 Double.parseDouble(this.schools[i][7]), Double.parseDouble(this.schools[i][8]),
          		 Double.parseDouble(this.schools[i][9]), Double.parseDouble(this.schools[i][10]), Double.parseDouble(this.schools[i][11]), 
          		 Integer.parseInt(this.schools[i][12]), Integer.parseInt(this.schools[i][13]), Integer.parseInt(this.schools[i][14]));
           results.add(univ);
         }
       }
       i++;
     }
     return results;
   }
   
   public ArrayList<University> showRecSchools(String school)
   {
     int i = 0;
     ArrayList<University> results = new ArrayList<University>();
     String state = "Minnesota";
     University univ = new University();
     
     while (i < this.schools.length)
     {
       if (school.equals(this.schools[i][0]))
       {
         state = this.schools[i][1];
         break;
       }
       i++;
     }
     
     int j = 0;
     int k = 0;
     
     while (k < 5 && j < this.schools.length)
     {
       if (state.equals(this.schools[j][1]))
       {
         univ = new University(this.schools[j][0], this.schools[j][1], this.schools[j][2], this.schools[j][3],
        		 Integer.parseInt(this.schools[j][4]), Double.parseDouble(this.schools[j][5]), Double.parseDouble(this.schools[j][6]), 
        		 Double.parseDouble(this.schools[j][7]), Double.parseDouble(this.schools[j][8]),
        		 Double.parseDouble(this.schools[j][9]), Double.parseDouble(this.schools[j][10]), Double.parseDouble(this.schools[j][11]), 
        		 Integer.parseInt(this.schools[j][12]), Integer.parseInt(this.schools[j][13]), Integer.parseInt(this.schools[j][14]));
         results.add(univ);
         k++;
       }
       j++;
     }
     
     return results;
   }
   
   public ArrayList<University> viewUniversities()
   {
     ArrayList<University> list = new ArrayList<University>();
     University univ = new University();
     
     for (int j = 0; j < this.schools.length; j++)
     {
    	 univ = new University(this.schools[j][0], this.schools[j][1], this.schools[j][2], this.schools[j][3],
        		 Integer.parseInt(this.schools[j][4]), Double.parseDouble(this.schools[j][5]), Double.parseDouble(this.schools[j][6]), 
        		 Double.parseDouble(this.schools[j][7]), Double.parseDouble(this.schools[j][8]),
        		 Double.parseDouble(this.schools[j][9]), Double.parseDouble(this.schools[j][10]), Double.parseDouble(this.schools[j][11]), 
        		 Integer.parseInt(this.schools[j][12]), Integer.parseInt(this.schools[j][13]), Integer.parseInt(this.schools[j][14]));
    	 
       list.add(univ);
     }
     
     return list;
   }
   
   public int dist(University univ1, University univ2)
   {
	   int distance = 0;
	   String [] info1 = univ1.getUniversityInfo();
	   String [] info2 = univ2.getUniversityInfo();

	   // Compare info1 vs info2
	   
	   return distance;
   }
   
}