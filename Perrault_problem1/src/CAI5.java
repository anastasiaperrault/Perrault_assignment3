	import java.util.Scanner;
	import java.security.SecureRandom;
	
	public class CAI5 
	{
		public static int readResponse(Scanner sc)
		{
			int val = sc.nextInt();
			
			return val;
		}
		
		public static void askQuestion(int num1, int num2, int i, int operation)
		{
			switch(operation)
			{
			case 1:
			System.out.println("Q." + i + " how much is " + num1 + " adding " + num2 + "?");
			break;
			case 2:
			System.out.println("Q." + i + " how much is " + num1 + " times " + num2 + "?");
			break;
			case 3:
			System.out.println("Q." + i + " how much is " + num1 + " substracting " + num2 + "?");
			break;
			case 4:
			System.out.println("Q." + i + " how much is " + num1 + " divides by " + num2 + "?");
			break;
			}

			
		}
		
		public static boolean isAnswerCorrect(int val1, int val2)
		{
			if(val1 == val2)
			{
				return true;
			}
				return false;
		}
		public static void displayCorrectResponse(SecureRandom rand)
		{
			//random number generator
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

		
		public static void displayIncorrectResponse(SecureRandom rand)
		{
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
			System.out.println("Your score is " +p+ "%");
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
			       System.out.print("Enter difficulty level(1-4):");
			       return sc.nextInt();
		}
		
		private static int readProblemType(SecureRandom rand, Scanner sc)
		{
				System.out.print("Please pick operation 1.Addition, 2.Multiplication, 3.Subtraction, 4. Division, 5.Mixed: ");
				int operation = sc.nextInt();

				if(operation == 5)
				operation = rand.nextInt(4) + 1;
				  
				return operation;
				
		}
		
		private static int readOperation(int operation, int num1, int num2)
		{
			switch(operation)
			{
			case 1:
			return num1 + num2;
			case 2:
			return num1 * num2;
			case 3:
			return num1 - num2;
			case 4:
			return num1 / num2;
			}
			return 0;
		}
		
		// hold program logic
		public static void quiz(Scanner sc)
		{
			SecureRandom rand = new SecureRandom();
					    
			int i=1, c=0;
			//read difficulty level from student 
			int difficulty = readDifficulty(sc);
			System.out.println();
			//reads difficulty level from student
		    int operation = readProblemType(rand,sc);
		    while(i<=10)
			{
		    	//difficulty level to generate a random number
		    	int num1 = generateQuestionArgument(rand, difficulty);
			    int num2 = generateQuestionArgument(rand, difficulty);
			    //generate answer based on operation user selected
			    int correctAns = readOperation(operation, num1,num2);

		        askQuestion(num1, num2, i,operation);
		       
				int response = readResponse(sc);
				
				if(isAnswerCorrect(correctAns, response))
				{
					// display when answer is right
					displayCorrectResponse(rand);
					// count # of correct answers
					c++;
				}
				else
				{
				// display when answer is wrong
				displayIncorrectResponse(rand);
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
		
			// call quiz
			quiz(sc);
			
		}
	}

