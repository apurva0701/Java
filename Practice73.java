import java.util.Scanner;

class Product {
    String name;
}

public class Practice73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[2];

        for (int index = 0; index < products.length; index++) {
            products[index] = new Product();
            products[index].name = scanner.nextLine();
        }

        for (int index = 0; index < products.length; index++) {
            System.out.println(products[index].name);
        }

        scanner.close();
    }
}