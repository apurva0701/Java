
import java.util.Scanner;

final class Product {
    private final String name;
    private final int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

class Practice170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int price = sc.nextInt();

        Product p = new Product(name, price);

        System.out.println(p);

        sc.close();
    }
}
