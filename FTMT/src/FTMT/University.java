/**
 * 
 */

package FTMT;

import java.util.Arrays;

public class University
{
  /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "University [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", numStudents=" + numStudents + ", percFemales=" + percFemales + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", percAid=" + percAid + ", percAdmit="
				+ percAdmit + ", percEnrolled=" + percEnrolled + ", acadScale=" + acadScale + ", socialScale="
				+ socialScale + ", qualLife=" + qualLife + "]";
	}

String name;
  String state;
  String location;
  String control;
  int numStudents;
  double percFemales;
  double satVerbal;
  double satMath;
  double expenses;
  double percAid;
  double percAdmit;
  double percEnrolled;
  int acadScale;
  int socialScale;
  int qualLife;
  
  String [] info = new String[15];
  
  public University(String name, String state, String location, String control, int numStudents, double percFemales, double satVerbal,
                    double satMath, double expenses, double percAid, double percAdmit, double percEnrolled, 
                    int acadScale, int socialScale, int qualLife)
  {
    this.name = name;
    this.state = state;
    this.location = location;
    this.control = control;
    this.numStudents = numStudents;
    this.percFemales = percFemales;
    this.satVerbal = satVerbal;
    this.satMath = satMath;
    this.expenses = expenses;
    this.percAid = percAid;
    this.percAdmit = percAdmit;
    this.percEnrolled = percEnrolled;
    this.acadScale = acadScale;
    this.socialScale = socialScale;
    this.qualLife = qualLife;
  }
  
  public University() {
	
}

public String[] getUniversityInfo()
  {
    info[0] = this.name;
    info[1] = this.state;
    info[2] = this.location;
    info[3] = this.control;
    info[4] = Double.toString(this.numStudents);
    info[5] = Double.toString(this.percFemales);
    info[6] = Double.toString(this.satVerbal);
    info[7] = Double.toString(this.satMath);
    info[8] = Double.toString(this.expenses);
    info[9] = Double.toString(this.percAid);
    info[10] = Double.toString(this.percAdmit);
    info[11] = Double.toString(this.percEnrolled);
    info[12] = Integer.toString(this.acadScale);
    info[13] = Integer.toString(this.socialScale);
    info[14] = Integer.toString(this.qualLife);
    
    return info;
  }
}