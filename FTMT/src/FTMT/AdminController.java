package FTMT;

import java.util.*;

public class AdminController extends AccountController
{
  DBController dbController = new DBController();

  public Account viewProfile(String username)
  {
    Account account = dbController.getProfile(username);
    return account;
  }

  public void editProfile(String username, String password, String firstName, String lastName, char type, char status)
  {
    dbController.setProfileInfo(username, password, firstName, lastName, type, status);
  }
  
  public AdminController()
  {
  }
  
  public ArrayList<University> viewUniversities()
  {
    return this.dbController.viewUniversities();
  }
}