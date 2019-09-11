import java.util.Scanner;

public class arrayChallenges
	{

		public static void main(String[] args)
			{
				sweet();
				eigthNumbers();
				fiveRandomNumbers();

			}

		private static void sweet()
			{
				System.out.println("How many favorite sweets do you have?");
				Scanner userInput = new Scanner(System.in);
				int numberOfSweets = userInput.nextInt();
				System.out.println("COOL! " + numberOfSweets + " is a good number to have!");

				String[] favSweets = new String[numberOfSweets];
				Scanner sweetInput = new Scanner(System.in);

				for (int i = 0; i < numberOfSweets; i++)
					{
						System.out.println("Please enter a sweet.");

						String sweet = sweetInput.nextLine();

						favSweets[i] = sweet;

					}

				for (String s : favSweets)
					{
						System.out.println(s);
					}

			}

		private static void eigthNumbers()
			{
				
				Scanner intInput = new Scanner(System.in);
			
				
				int [] eightNumbers = new int[8];
				
				int evenSum = 0;
				int oddSum = 0;
				
				for (int i = 0; i < 8; i++)
					{
						System.out.println("Enter your number");

						int userNumbers = intInput.nextInt();
						
						eightNumbers[i] = userNumbers;
						
						
						if (userNumbers % 2 == 0)
							{
								evenSum += eightNumbers[i];
							}
						else  
							{
								oddSum += eightNumbers[i];
							}

						
					}

				System.out.println("The sum of all your even numbers is: " + evenSum);
				System.out.println("The sum of all your odd numbers is: " + oddSum);
			}
		

		private static void fiveRandomNumbers()
			{								
				int [] randomNumbers = new int[5];
				
				for (int i = 0; i < 5; i++)
					{
						int randomNumber = (int) (Math.random()* 90 + 10);
					
							randomNumbers[i] = randomNumber;
						
							System.out.println(randomNumber);
							
					}
				
				for (int i = 4; i >= 0; i--)
					{
						System.out.println(randomNumbers[i]);
					}


			}


	}
