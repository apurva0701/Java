import java.util.Scanner;

class BankAccount {
    private int balance;

    // Subtask 1: Initialize balance using constructor
    BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    // Subtask 2: Perform safe withdrawal
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
}

class Practice139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starting = sc.nextInt();
        int amount = sc.nextInt();

        BankAccount account = new BankAccount(starting);

        // Subtask 1: Print starting balance
        System.out.println("Starting balance: " + account.getBalance());

        // Subtask 2: Withdraw amount
        account.withdraw(amount);

        // Subtask 3: Print final balance
        System.out.println("Final balance: " + account.getBalance());

        sc.close();
    }
}