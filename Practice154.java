import java.util.Scanner;

class Delivery {
    void showStatus(String status) {
        System.out.println("Delivery: " + status);
    }
}

class ExpressDelivery extends Delivery {
    @Override
    void showStatus(String status) {
        System.out.println("Express: " + status);
    }
}

class Practice154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();

        ExpressDelivery delivery = new ExpressDelivery();
        delivery.showStatus(status);

        sc.close();
    }
}