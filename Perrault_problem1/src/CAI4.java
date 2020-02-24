import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI4 {
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
		float p = ((float) c/10)*100;
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
	
	public static int generateQuestionArgument(SecureRandom rand, int difficulty)
	{
		 int argument = 0;
	      
	       if (difficulty == 1)
	           argument = rand.nextInt(10);
	       else if (difficulty == 2)
	           argument = rand.nextInt(100);
	       else if (difficulty == 3)
	           argument = rand.nextInt(1000);
	       else
	           argument = rand.nextInt(10000);
	      
	       return argument;
	}
	
	public static int readDifficulty(Scanner sc)
	{
		       System.out.print("Enter difficulty level(1-4): ");
		       return sc.nextInt();
	 }
	
	public static void quiz(Scanner sc)
	{
		SecureRandom rand = new SecureRandom();
		
		int countCorrect = 0;
	    
		int i=1, c=0, r=0;
				
		while(i<=10)
		{
			int difficulty = readDifficulty(sc);
		    System.out.println();
		    int num1 = generateQuestionArgument(rand, difficulty);
	        int num2 = generateQuestionArgument(rand, difficulty);
	        int correctAns = num1 * num2;
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
			quiz(sc);
		}
		else
		{
			// exit program
			System.exit(0);
		}
	}

	
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
	
		quiz(sc);
		
	}
	}

