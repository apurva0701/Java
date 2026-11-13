import java.util.Scanner;

class Payment {
    void process(int amount) {
        System.out.println("Payment: " + amount);
    }
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

class Practice160 {

    static void completePayment(Payment payment, int amount) {
        payment.process(amount);
    }

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

        completePayment(payment, amount);

        sc.close();
    }
}