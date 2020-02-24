import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 
{

		public static int readResponse()
		{
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			
			return val;
		}
		
		public static int askQuestion(int num1, int num2)
		{
			System.out.println("How much is " + num1 + " times " + num2);
			
			return num1 * num2;
		}
		
		public static boolean isAnswerCorrect(int val1, int val2)
		{
			if(val1 == val2)
			{
				return true;
			}
				return false;
		}
		public static void displayCorrectResponse()
		{
			//random number generator
			Random rand = new Random();
			//generate number from 1-4
			int ForRep = rand.nextInt(4)+1;
			
			switch(ForRep)
			{
			case 1:
				System.out.println("Very Good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			}
		}

		
		public static void displayIncorrectResponse()
		{
			Random rand = new Random();
			//generate number from 1-4
			int ForRep = rand.nextInt(4)+1;
			
			switch(ForRep)
			{
			case 1:
				System.out.println("No.Please try again.");
				break;
			case 2:
				System.out.println("Wrong. Try Once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No keep trying");
				break;
			}		}

		public static void quiz()
		{
			SecureRandom rand = new SecureRandom();
			
			int num1 = rand.nextInt(10);
			int num2 = rand.nextInt(10);
			
			while(true)
			{
				int val1 = askQuestion(num1, num2);
				int val2 = readResponse();
				if(val1 == val2)
				{
					displayCorrectResponse();
					break;
				}
				displayIncorrectResponse();
			}
		}
		
		public static void main(String[] args)
		{
			quiz();
		}
}
