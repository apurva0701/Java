import java.util.Scanner;

class Practice108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        String price = sc.nextLine();

        StringBuilder label = new StringBuilder();
        label.append("Item: ");
        label.append(item);
        label.append(" | Price: ");
        label.append(price);

        System.out.println(label);

        sc.close();
    }
}