package FTMT;

import java.util.*;

public class UserInteraction
{ 
  
  UserController userCtrl = new UserController();
  AccountController acctCtrl = new AccountController();
  
  public ArrayList<University> searchSchools(String state, String numStudents)
  {
    ArrayList<University> results = this.userCtrl.searchSchools(state, numStudents);
    
    return results;
  }

  public void editProfile(String firstName, String lastName, String username, String password, char type, char status)
  {
    this.userCtrl.editProfile(username, password, firstName, lastName, type, status);
  }
  
  public String viewProfile(String username)
  {
    return this.userCtrl.viewProfile(username);
  }

  public void viewSchool(String school)
  {
  }

  public void removeSavedSchool()
  {
  }
  
  public ArrayList<University> showRecSchools(String school)
  {
    ArrayList<University> results = this.userCtrl.showRecSchools(school);
    
    return results;
  }

  public int login(String username, String password) 
  {
	return this.acctCtrl.login(username, password);

  }
}