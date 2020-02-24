import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 
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
		}		
	}
	
	public static void displayCompletionMessage(int c)
	{
		float p = (float) c/10*100;
		System.out.println("Your score is" +p+ " % ");
		if(p>=75)
		{
		System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
		System.out.println("Please ask your teacher for extra help.");

		}
	}

	public static void quiz()
	{
		SecureRandom rand = new SecureRandom();
		
		Scanner sc = new Scanner(System.in);
		int i=1, c=0, r=0;
				
		while(i<=10)
		{
			int num1 = rand.nextInt(10);
			int num2 = rand.nextInt(10);
			int val1 = askQuestion(num1, num2);
			int val2 = readResponse();
			if(val1 == val2)
			{
				displayCorrectResponse();
				// count # of correct answers
				c++;
			}
			else
			{
			displayIncorrectResponse();
			r++;
			}
			i++;
		}
		displayCompletionMessage(c);
		
		System.out.println("Do you want to solve another new problem(Y/N?)");
		char ch = sc.next().charAt(0);
		
		if(ch=='Y')
		{
			quiz();
		}
		else
		{
			// exit program
			System.exit(0);
		}
	}

	
	public static void main(String[] args)
	{
		quiz();
	}
}


