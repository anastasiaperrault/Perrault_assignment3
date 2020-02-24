import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {


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
		System.out.println("Very Good!");
	}

	
	public static void displayIncorrectResponse()
	{
		System.out.println("No. Please try again.");
	}

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