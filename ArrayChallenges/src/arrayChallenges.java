import java.util.Scanner;

public class arrayChallenges
	{

		public static void main(String[] args)
			{
				//fiveRandomNumbers();
				//sweet();
				eigthNumbers();
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
				System.out.println("Please enter one of eigth numbers");
				
				Scanner intInput = new Scanner(System.in);
				
				int userNumbers = intInput.nextInt();
				
				int [] eightNumbers = new int[8];
				
				for (int i = 0; i < 7; i++)
					{
						System.out.println("Enter your next number");
						
						eightNumbers[i] = intInput.nextInt();
					}
				
				int evenSum = 0;
				int oddSum = 0;
				
				if (userNumbers % 2 == 0)
					{
						evenSum += userNumbers;
					}
				else  
					{
						oddSum += userNumbers;
					}
				System.out.println("The sum of all your even numbers is: " + evenSum);
				System.out.println("The sum of all your even numbers is: " + oddSum);



			}
		

		private static void fiveRandomNumbers()
			{
				
			}


	}
