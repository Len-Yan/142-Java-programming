
public class BankAccount
{
	private String name;
	private double balance;
	
	public BankAccount(String n, double b)
	{
		name = n;
		balance = b;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		if (balance - amount >= 0)
			balance -= amount;
		else
			System.out.println("insufficient funds");
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void transferTo(BankAccount other, double amount)
	{
		if (balance - (amount+5) >= 0)
		{
			balance -= (amount+5);
			other.balance += amount;
		}
		else
			System.out.println("insufficient funds");
	}
	
	public String toString()
	{
		return name + ": " + balance;
	}
}
