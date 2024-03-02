/*write a program in java to create a class account with memberes account number  and account  balance and methods to  deposit and withdraw money and  display balance . Derive two subclasses saving account  and  current account  where saving accout should maintaina minimum account balance of rupees 1000 & current account should have overdraft facilities . In addition to this the savings account should have a data members interest and a method to calculate  interest and add to the account balance and for current account there should be an overdraft limit, use partinent methods to display all these information.*/


import java.util.Scanner;

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in account " + accountNumber);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " has balance of " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Added interest of " + interest + " to account " + accountNumber);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount(1, 2000, 2.5);
        CurrentAccount currentAccount = new CurrentAccount(2, 5000, 1000);

        while (true) {
            System.out.println("Enter 1 to deposit");
            System.out.println("Enter 2 to withdraw");
            System.out.println("Enter 3 to display balance");
            System.out.println("Enter 4 to calculate interest");
            System.out.println("Enter 5 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    savingsAccount.displayBalance();
                    break;

                case 4:
                    savingsAccount.calculateInterest();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
