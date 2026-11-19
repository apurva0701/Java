
import java.util.Scanner;

abstract class Payment {
    private int amount;

    Payment(int amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount;
    }

    void showReceipt() {
        System.out.println("Receipt: " + amount);
    }

    abstract void process();
}

class FeePayment extends Payment {
    FeePayment(int amount) {
        super(amount);
    }

    @Override
    void process() {
        System.out.println("Fee paid: " + getAmount());
    }
}

public class Practice176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        Payment p = new FeePayment(amount);

        p.process();
        p.showReceipt();

        sc.close();
    }
}
