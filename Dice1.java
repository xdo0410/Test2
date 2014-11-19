import java.util.Random;
import java.util.Scanner;
public class Dice 
{

	private static int numberOfGames = 10;

	public static void main(String[] args) {

		int computerWins = 0, computerRoll = 0;
		int userWins = 0, userRoll = 0;
		int tiedGames = 0;
		
		int rollCount = 0;
		Scanner inp = new Scanner( System.in );
        
        String answer = "";
        
        do{
		for (int round = 0; round < numberOfGames; round++) {

			computerRoll = rollDie();
			userRoll = rollDie();

			// determine who won the game
			if (computerRoll == userRoll) {
				tiedGames++;
			} else {
				if (computerRoll > userRoll) {
					computerWins++;
				} else {
					userWins++;
				}
			}
		}

		// Display the results.
		System.out.println("Computer...." + computerWins);
		System.out.println("User........" + userWins);
		System.out.println("Ties........" + tiedGames);

		// Determine the grand winner.
		if (computerWins > userWins) {
			System.out.println("You got beat by a computer!");
		} else {
			if (computerWins < userWins) {
				System.out.println("You beat the computer!");
			} else {
				System.out.println("The game has ended in a tie!");
			}
			
			rollCount++;
			
		}
		
		
		 System.out.println("Do you want to play again?");
         answer = inp.next();
         
        }while (answer.equals("y"));
        
        System.out.println("\nIt took " + rollCount + " roll until you decide to stop playing.");
	}

	/**
	 * Method should return a number that represents a
	 * side of a die in a random format.
	 * 
	 * @return number
	 */
	static int rollDie() {
		Random randValue = new Random();
		return randValue.nextInt(6) + 1;
	}
	
}
