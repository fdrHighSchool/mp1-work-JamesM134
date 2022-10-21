 
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

     
import java.util.Scanner;
impot java.util.Random

public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("what mode do you want to play?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        System.out.println(mode);
        
        
        
        if (mode.equals ("Easy")) {
            
            //int number = r.nextInt(10) + 1;
        }
        else if(mode.equals("medium")) {
            
           //int number = r.nextInt(50) + 1;
        }
        else{
            
            //int number = r.nextInt(100) + 1;
        }
        }
        int mysteryNumber = 5; // place-holder for now
        
        System.out.println(mysteryNumber);
        
        System.out.println("Enter your guess: ");
        int playerGuess = s.nextInt(); 
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class
