package FTMT;

public class Admin extends Account
{
  public String username;
  public String password;
  public boolean matched;
  public String firstName;
  public String lastName;
  public char type;
  public char status;
  private AdminController adminCtrl = new AdminController();

  public Admin()
  {
    this.username = "null";
    this.password = "password";
  }

  public Admin(String username, String password)
  {
    this.username = username;
    this.password = password;
  }
  
  public Admin(String firstName, String lastName, String username, String password, char type, char status)
  {
    this.username = username;
    this.password = password;
    
  }
  
  public Admin viewProfile(String username)
  {
    Admin admin = (Admin)this.adminCtrl.viewProfile(username);
    
	return admin;
  }

  public void viewotherProfile(String user)
  {
    adminCtrl.viewProfile(user);
  }
  
  public void editProfile(String firstName, String lastName, String username, String password, char type, char status)
  {
    adminCtrl.editProfile(username, password, firstName, lastName, type, status);
  }

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

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Admin [username: " + username + ", password: " + password + ", matched: " + matched + ", firstName: "
			+ firstName + ", lastName: " + lastName + ", type: "  + type + ", status: " + status + "]";
}
}