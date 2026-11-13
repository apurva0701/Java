import java.util.Scanner;

class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

class Practice164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int price = sc.nextInt();

        Product product = new Product(name, price);
        System.out.println(product);

        sc.close();
    }
}