import java.util.Scanner;

class Bank_Acc  {

    private double balance;

    public Bank_Acc (double initial_Bal) {
        this.balance = initial_Bal;
    }

    public double get_Bal() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }
}

class ATM {

    private Bank_Acc  user_Acc;

    public ATM(Bank_Acc  account) {

        this.user_Acc = account;

    }

    public void display_Menu() {

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

    }

    public void perform_Transaction(int option) {

        Scanner scanner = new Scanner(System.in);

        switch (option) {

            case 1:
                System.out.println("Balance: $" + user_Acc.get_Bal());
                break;
            case 2:
                System.out.print("Enter deposit amount: $");
                double deposit_Amount = scanner.nextDouble();
                user_Acc.deposit(deposit_Amount);
                System.out.println("Deposit successful. New balance: $" + user_Acc.get_Bal());
                break;
            case 3:
                System.out.print("Enter withdrawal amount: $");
                double withdrawal_Amount = scanner.nextDouble();
                if (user_Acc.withdraw(withdrawal_Amount)) {
                    System.out.println("Withdrawal successful. New balance: $" + user_Acc.get_Bal());
                }
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");

        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ WELCOME ------------");
        Bank_Acc  user_Acc = new Bank_Acc (1000.0);
        ATM atm = new ATM(user_Acc);

        while (true) {
            
            atm.display_Menu();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            atm.perform_Transaction(option);
            
        }
    }
}
