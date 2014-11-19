import javax.swing.JOptionPane;
 
public class mainDice3
{    
        public static void main(String[] args)
        {
        // Create the mainDice3 object.
        // Initialize a variable that will refer to the dice.
        DiceGame gameDice = new DiceGame();
        DiceGame throwMethod = new DiceGame();
        Dice3 throw3D = new Dice3();
        Dice3 tString = new Dice3();
        
        // Number of times the dice is rolled.
        int rollCount = 0;
        int currVal = 0;
        int newCurrVal = 0;
        int tVal = 0;
        boolean evenBoo = false;
        String fName = "Xuan";
        
        tString.setFirstName( fName );
        //The Java compiler writes here fName.toString() method.
        JOptionPane.showMessageDialog( null, "The programmer's first name is " + fName + "!");
           
        // Roll the dice until they come up snake eyes.
           do
           {
        	   gameDice.Roll();
               JOptionPane.showMessageDialog( null, "Your random dice roll is " + gameDice.getDie1Rand() + " and " +
            		   								gameDice.getDie2Rand() + ".\nSnake Eyes was not rolled." );
               rollCount++;
           }
           
           while (gameDice.getDiceSum() != 2);
           
           gameDice.Value( currVal );
           JOptionPane.showMessageDialog( null, "The value of dice #1 is " + gameDice.getDie1Rand() +
                                                ".\nThe value of dice #2 is " + gameDice.getDie2Rand() + 
                                                ".\nThe current value of both dice is " + gameDice.getValue() + ".");
           gameDice.Roll();
           gameDice.Value( newCurrVal );
           JOptionPane.showMessageDialog( null, "The next value of dice #1 is " + gameDice.getDie1Rand() +
                   								".\nThe next value of dice #2 is " + gameDice.getDie2Rand() + 
                   								".\nThe next current value of both dice is " + gameDice.getValue() + ".");
           
           // Call Throw(int dices, boolean even ) method.
           throwMethod.Throw( tVal, evenBoo );
           JOptionPane.showMessageDialog( null, "The total of two random calls is " + throwMethod.getThrow() + "!");
                      
           // Above created a new object by DiceGame gameDice = new DiceGame(); which is not a static call.
           // When using the new object name, such as gameDice, this can only call non-static methods from the DiceGame Class.

           // Access DiceGame Class's static method by using a static call.

           throw3D.Throw();
           JOptionPane.showMessageDialog( null, "The average of three dice thrown is " + throw3D.getThrow() + "!");
           
           // Report the number of rolls it took to get Snake Eyes.
           JOptionPane.showMessageDialog( null, "Congratulations! It took " + rollCount + " rolls to get Snake Eyes!" );
          
        } // end main    
}  // end class mainDice3
