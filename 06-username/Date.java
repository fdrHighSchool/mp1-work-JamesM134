
/**
 * Write a description of class Date here.
 *
 * @James Mirzayev
 * @ 09/28/2022
 */
import java.util.Scanner;// import scanner 
public class Date
{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week.");
        String day = s.nextLine();
        
        System.out.print("Enter the Month.");
        String month = s.nextLine();
        
        System.out.print("Enter the year.");
        String year = s.nextLine();
         
        System.out.print("Enter the day of the month.");
        String DOM = s.nextLine();
        
        System.out.println("American format: " + day + ", " + month + " " + DOM +", " + year);
        System.out.println("European format: " + DOM + " " + month + " " + year);
    }// end of main method    
}// end of Class