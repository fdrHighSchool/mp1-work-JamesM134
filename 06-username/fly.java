import java.util.Scanner;

public class fly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that! , squash some more to help out . ");
        } // end if statement
        else {
            System.out.println("Thanks for doing your part");
        } // end else statement
        
        
    } // end main method

} // end class