import java.util.Scanner;
class Account 
{
    private int balance;
    public Account(int initialBalance) 
    {
        balance = initialBalance;
    }
    public int getBalance() 
    {
        return balance;
    }
    public void deposit(int amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(int amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else 
        {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
public class ATMInterface
{
        public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance: ");
        int initialBalance = scanner.nextInt();
        Account account = new Account(initialBalance);
        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");           
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawalAmount = scanner.nextInt();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

