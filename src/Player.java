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
		//
		//	Two solutions
		//
		solution1Standard();
		//solution2ObjectOriented();
	}
	public static void solution1Standard()
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
	public static void solution2ObjectOriented()
	{
		Scanner inputScanner = new Scanner(System.in);
		//
		//	game loop
		//
		while(true)
		{
			Enemy enemy1 = new Enemy();
			enemy1.Name = inputScanner.next();
			enemy1.Distance = inputScanner.nextInt();

			Enemy enemy2 = new Enemy();
			enemy2.Name = inputScanner.next();
			enemy2.Distance = inputScanner.nextInt();

			if(enemy1.Distance < enemy2.Distance)
			{
				System.out.println(enemy1.Name);
			}
			else
			{
				System.out.println(enemy1.Name);
			}
		}
	}
}

class Enemy
{
	String Name;
	int Distance;
}
