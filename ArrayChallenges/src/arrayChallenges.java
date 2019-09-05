import java.util.Scanner;

public class arrayChallenges
	{

		public static void main(String[] args)
			{
				sweet();
				guessRandomNumber();
		
			}

		private static void sweet()
			{
				System.out.println("How many favorite sweets do you have?");
				Scanner userInput = new Scanner(System.in);
				int numberOfSweets = userInput.nextInt();
				System.out.println("COOL! " + numberOfSweets + " is a good number to have!");

				System.out.println("Please enter the name of your favorite sweets one at a time.");	
				
				String [] favSweets = new String[numberOfSweets];
				Scanner sweetInput = new Scanner(System.in);

				for (int i = 0; i < numberOfSweets; i++)
					{
						System.out.println("Please enter your next sweet.");

						String sweet = sweetInput.nextLine();
						
						favSweets[i] = sweet;
						
					}

				
				
					
					
				
			}
	
		private static void guessRandomNumber()
			{
				
							
			}

	}
