public class BankingApp
{
    public static void main(String [] args)
    {
        BankAccount account = new BankAccount(5000);
        System.out.println("Your current balance is: "+account.getBalance());
        account.deposit(5000);
        System.out.println("Your current balance is: "+ account.getBalance());

        account.withdraw(6000);
        System.out.println("your current balance is: "+account.getBalance());
    }
}
