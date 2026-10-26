import java.util.Scanner;

class Practice89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String label = sc.nextLine();

        // Clean the label, check the keyword and print the prefix.
        label = label.trim().toLowerCase();

        System.out.println(label);
        System.out.println(label.contains("backend"));
        System.out.println(label.substring(0, 4));

        sc.close();
    }
}