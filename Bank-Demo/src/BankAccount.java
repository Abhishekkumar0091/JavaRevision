public class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Amount "+amount +" Credited into your account");
        }
        else
        {
            System.out.println("Amount is not positive");
        }
    }
    public  void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Amount "+ amount + " debited from your account");
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
}
