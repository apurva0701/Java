
import java.util.Scanner;

abstract class Payment {
    abstract void process(int amount);
}

class UpiPayment extends Payment {
    @Override
    void process(int amount) {
        System.out.println("UPI: " + amount);
    }
}

class CardPayment extends Payment {
    @Override
    void process(int amount) {
        System.out.println("Card: " + amount);
    }
}

class Practice172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        int amount = sc.nextInt();

        Payment payment;

        if (type.equals("UPI")) {
            payment = new UpiPayment();
        } else {
            payment = new CardPayment();
        }

        payment.process(amount);

        sc.close();
    }
}
