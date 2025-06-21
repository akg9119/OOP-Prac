package Pract;

interface AccountOperations {

    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();

}

class SavingsAccount implements AccountOperations {

    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Savings Account.");
        }

    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("withdraw " + amount + " to Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

}
class CurrentAccount implements AccountOperations {
    private double balance;

    // Constructor
    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Encapsulated methods
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Current Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}


public class Bank_Application {

    public static void main(String[] args) {
           AccountOperations currentAccount = new CurrentAccount(25000);
           AccountOperations savingsAccount = new SavingsAccount(200);

           currentAccount.deposit(5000);
           currentAccount.withdraw(1000);   
              System.out.println("Current Account Balance: " + currentAccount.checkBalance());  
              savingsAccount.deposit(1000);
              savingsAccount.withdraw(500);
                System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());

    }

}
