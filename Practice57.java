
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product() {
        this("Unknown", 0.0);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

public class Practice57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double price = scanner.nextDouble();

        Product defaultProduct = new Product();
        Product product = new Product(name, price);

        defaultProduct.display();
        product.display();

        scanner.close();
    }
}
