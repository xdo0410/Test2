import java.util.Scanner;
public class mainDice 
{
	 public static void main(String[] args) {
         
         Dice2 dice;          // A variable that will refer to the dice.
         int rollCount;    // Number of times the dice have been rolled.
   
         dice = new Dice2();  // Create the Dice2 object.
         rollCount = 0;
         Scanner inp = new Scanner( System.in );
         
         String answer = "";
         
         
         /* Roll the dice . */
         
         do {
             dice.roll();
             System.out.println("The dice come up " + dice.getDie1() 
                                              + " and " + dice.getDie2());
             rollCount++;
             
             System.out.println("Do you want to play again?");
             answer = inp.next();
             
         } while (answer.equals("y"));
         
         /* Report the number of rolls. */
         
         System.out.println("\nIt took " + rollCount + " roll until you decide to stop playing.");
         
      }
}
