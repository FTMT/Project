package FTMT;

import java.util.*;

public class AdminInteraction
{
  AdminController adminCtrl = new AdminController();
  AccountController acctCtrl = new AccountController();
  String [][] schools = DBController.university_getUniversities()
  
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
  
  public int addUniversity(String name, String state, String location, String control, int numStudents, double percFemales, double satVerbal,
          double satMath, double expenses, double percAid, double percAdmit, double percEnrolled, 
          int acadScale, int socialScale, int qualLife)
  {
	  University newUniv = new University(name, state,  location,  control,  numStudents,  percFemales,  satVerbal,
	           satMath,  expenses,  percAid,  percAdmit,  percEnrolled, 
	           acadScale,  socialScale,  qualLife); 
	  
	 
	  return DBController.addUniversity(newUniv);
	     
	
  }
  
  public int editUniversity(String name, String state, String location, String control, int numStudents, double percFemales, double satVerbal,
          double satMath, double expenses, double percAid, double percAdmit, double percEnrolled, 
          int acadScale, int socialScale, int qualLife)
  {
	  
  }
}