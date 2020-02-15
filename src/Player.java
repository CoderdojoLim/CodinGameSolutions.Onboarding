import java.util.*;

/**
 @author Mark Crowe
 @see https://www.codingame.com/ide/puzzle/onboarding
 CodinGame planet is being attacked by slimy insectoid aliens.
 <---
 Hint:To protect the planet, you can implement the pseudo-code provided in the statement, below the player.

 */
class Player
{
	public static void main(String args[])
	{
		Scanner inputScanner = new Scanner(System.in);
		//
		//	game loop
		//
		while(true)
		{
			String enemyTarget1Name = inputScanner.next();
			int enemyTarget1Distance = inputScanner.nextInt();
			String enemyTarget2Name = inputScanner.next();
			int enemyTarget2Distance = inputScanner.nextInt();

			if(enemyTarget1Distance < enemyTarget2Distance)
			{
				System.out.println(enemyTarget1Name);
			}
			else 
			{
				System.out.println(enemyTarget2Name);
			}
		}
	}
}
