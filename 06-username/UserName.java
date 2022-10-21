
/**
 * Write a description of class UserName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
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
    
    
    generatePassword(8);
    s.close();
    
    
    
    
    

}// end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

  
  public static String generatePassword(int lenght) {
    String password = "";
    for (int i = 0; 1 < lenght; i++) {
    int special = (int) (Math.random()*(33-47+1) + 47);        
    int lowercase = (int) (Math.random()*(97-122+1) + 122);    
    int random = (int)(Math.random()*(90-65+1) + 65);
    char c = (char)random;
   System.out.println(" your password is " + random + special + lowercase);
   
   return password;
  }
    }

}
    
    
    
    
    
    
    
    
  
  //generate a random number
    // 65 - 90 capital letter
    // 97 - 122 lower case
    // 33 - 47 special symbols
    
    // convert the int----> character c =(char)i;
    
    //add the char to the password String

//end generatepassword method
  // end class