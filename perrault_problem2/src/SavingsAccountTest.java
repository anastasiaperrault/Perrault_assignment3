public class SavingsAccountTest
{
	public static void main(String[] args)
	{
		
	SavingsAccount savings1, savings2;
	
	savings1 = new SavingsAccount(2000);
	savings2 = new SavingsAccount(3000);
	
	// sets the annualInterestRate to 4%
	SavingsAccount.modifyInterestRate(4);
	
    // calculate and print monthly balances for both the accounts for each month
	System.out.println("Month\t\tsavings1\t\tsavings2");
	
	for(int i =1; i<=12; i++)
	{
		savings1.calculateMonthlyInterest();
		savings2.calculateMonthlyInterest();
		
		System.out.printf("%5d\t\t$%.2f\t\t$%.2f\n",i,savings1.getSavingsBalance(), savings2.getSavingsBalance());
	}
	
	//sets the annualInterestRate to 5%
	SavingsAccount.modifyInterestRate(5);
	//calculate interest rate for next month
	savings1.calculateMonthlyInterest();
	savings2.calculateMonthlyInterest();

	System.out.println("\nNew Balances:");
	System.out.printf("savings 1: $%.2f\n", savings1.getSavingsBalance());
	System.out.printf("savings 2: $%.2f\n", savings2.getSavingsBalance());
	}
}

