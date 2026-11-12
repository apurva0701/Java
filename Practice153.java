import java.util.Scanner;

class Notification {
    void send(String message) {
        System.out.println("Notification: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class Practice153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String channel = sc.nextLine();

        if (channel.equals("EMAIL")) {
            EmailNotification email = new EmailNotification();
            email.send(message);
        } else {
            SmsNotification sms = new SmsNotification();
            sms.send(message);
        }

        sc.close();
    }
}