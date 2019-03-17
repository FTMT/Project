/**
 * 
 */

package FTMT;

public class User extends Account
{
  public String username;
  public String password;
  public boolean matched;
  public String firstName;
  public String lastName;
  public char type;
  public char status;
  public UserInteraction userInter;
  
  public User(String firstName, String lastName, String username, String password, char type, char status)
  {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.type = 'u';
    this.status = 'y';
  }
  
  /* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [username: " + username + ", password: " + password + ", firstName: "
	+ firstName + ", lastName: " + lastName + ", type: "  + type + ", status: " + status + "]";
}

public User()
  {
	  this.username = "username";
	  this.password = "password";
	  this.firstName = "firstName";
	  this.lastName = "lastName";
	  this.type = 'u';
	  this.status = 'Y';
  }
  
  
//  public void viewProfile()
//  {
//    this.userInter.viewProfile(this.username);
//  }
  
//  public void editProfile()
//  {
//    this.userInter.editProfile(this.username, this.password, this.firstName, this.lastName, this.type, this.status);
//  }
  
  public String getFirstName()
  {
    return this.firstName;
  }
  
  public String getLastName()
  {
    return this.lastName;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public char getType()
  {
    return this.type;
  }
  
  public char getStatus()
  {
    return this.status;
  }
  
  
}