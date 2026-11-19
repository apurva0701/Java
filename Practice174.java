
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

class UpiPayment extends Payment {
    UpiPayment(int amount) {
        super(amount);
    }

    @Override
    void process() {
        System.out.println("UPI processed: " + getAmount());
    }
}

class CardPayment extends Payment {
    CardPayment(int amount) {
        super(amount);
    }

    @Override
    void process() {
        System.out.println("Card processed: " + getAmount());
    }
}

public class Practice174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int amount = sc.nextInt();

        Payment payment;

        if (type.equals("UPI")) {
            payment = new UpiPayment(amount);
        } else {
            payment = new CardPayment(amount);
        }

        payment.process();
        payment.showReceipt();

        sc.close();
    }
}
