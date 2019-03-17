package FTMT;

import java.util.*;

public class AdminInteraction
{
  AdminController adminCtrl = new AdminController();
  AccountController acctCtrl = new AccountController();
  
  public ArrayList<University> viewUniversities()
  {
    ArrayList<University> results = this.adminCtrl.viewUniversities();
    return results;
  }
  
  public void editProfile(String firstName, String lastName, String username, String password, char type, char status)
  {
	  adminCtrl.editProfile(username, password, firstName, lastName, type, status);
  }
  
  public int login(String username, String password) 
  {
	return this.acctCtrl.login(username, password);
  }
  
  public AdminInteraction()
  {
  
  }
}