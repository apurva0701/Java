import java.util.Scanner;

class Practice94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
        String message = sc.nextLine();

        if (role.equals("admin")) {
            System.out.println("ALLOWED");
        } else {
            System.out.println("DENIED");
        }

        message = message.toUpperCase();
        System.out.println(message);

        sc.close();
    }
}