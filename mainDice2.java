public class mainDice2 
{
	 public static void main(String[] args) {
         
         Dice2 dice;          // A variable that will refer to the dice.
         int rollCount;    // Number of times the dice have been rolled.
   
         dice = new Dice2();  // Create the Dice2 object.
         rollCount = 0;
         
         /* Roll the dice until they come up snake eyes. */
         
         do {
             dice.roll();
             System.out.println("The dice come up " + dice.getDie1() 
                                              + " and " + dice.getDie2());
             rollCount++;
         } while (dice.getTotal() != 2);
         
         /* Report the number of rolls. */
         
         System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
         
      }
}
