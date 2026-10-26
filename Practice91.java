import java.util.Scanner;

class Practice91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // Clean the product name and print its first three characters.
        name = name.trim().toLowerCase();

        System.out.println(name);
        System.out.println(name.substring(0, 3));

        sc.close();
    }
}