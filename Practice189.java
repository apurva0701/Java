
import java.util.Scanner;

class OrderLine {
    private String product;

    OrderLine(String product) {
        this.product = product;
    }

    String getProduct() {
        return product;
    }
}

class Order {
    private final int orderId;
    private final OrderLine firstItem;
    private final OrderLine secondItem;

    Order(int orderId, String firstProduct, String secondProduct) {
        this.orderId = orderId;
        this.firstItem = new OrderLine(firstProduct);
        this.secondItem = new OrderLine(secondProduct);
    }

    void printReceipt() {
        System.out.println("Order: " + orderId);
        System.out.println("Item: " + firstItem.getProduct());
        System.out.println("Item: " + secondItem.getProduct());
    }
}

class Practice189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orderId = sc.nextInt();
        sc.nextLine();
        String firstProduct = sc.nextLine();
        String secondProduct = sc.nextLine();

        Order order = new Order(orderId, firstProduct, secondProduct);
        order.printReceipt();

        sc.close();
    }
}
