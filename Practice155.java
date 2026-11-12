import java.util.Scanner;

class Notification {
    void send(String message) {
        System.out.println("General: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class Practice155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        EmailNotification email = new EmailNotification();
        email.send(message);

        sc.close();
    }
}