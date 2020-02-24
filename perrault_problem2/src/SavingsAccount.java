//public class
public class SavingsAccount
{
	//private class variable
	private static double annualInterestRate;
	//private instance variable
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	
	//get function
	public double getSavingsBalance()
	{
		return this.savingsBalance;
	}
	
	// calculate monthly interest
	public double calculateMonthlyInterest()
	{
		double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
		
		this.savingsBalance = this.savingsBalance + monthlyInterest;
		
		return monthlyInterest;
	}
	
	//change/modify interest rate
	public static void modifyInterestRate(double interestRate)
	{
		annualInterestRate = interestRate / 100;
	}
	
}