
/**
 * Write a description of class UserName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("what is your favorite number");
    String FavNumber = s.nextLine();
    System.out.print("Are you a teacher or a student?");
    String role = s.nextLine();
    if (role .equals ("student")) {   
        System.out.println((firstName) + getInitial(lastName) + (FavNumber) + "@nycstudents.net");
    }//end of if
    else {
        System.out.println((firstName) + getInitial(lastName) + (FavNumber) + "@schools.nyc.gov");
    }// end of else 
    // test output
    
    s.close();
  } // end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class