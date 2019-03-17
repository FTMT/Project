package FTMT;

import java.util.*;

public class UserController extends AccountController
{
  DBController dbController = new DBController();
  User user = new User();
  
  public UserController()
  {
	  
  }

  public ArrayList<University> searchSchools(String state, String numStudents)
  {
    ArrayList<University> results = this.dbController.searchSchools(null, state, null, null, numStudents, null,
    		null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
    		null, null, null, null);
    return results;
  }

  public String viewProfile(String username)
  {
    User user = (User)this.dbController.getProfile(username);
    
    return user.toString();
  }
  
  public void editProfile(String username, String password, String firstName, String lastName, char type, char status)
  {
    this.dbController.setProfileInfo(username, password, firstName, lastName, type, status);
  }
  
  public ArrayList<University> showRecSchools(String school)
  {
    return this.dbController.showRecSchools(school);
  }
}