import java.util.Scanner;

class Notification {
    void send(String message) {
        System.out.println("Notification: " + message);
    }
}

class Email extends Notification {
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class Sms extends Notification {
    @Override
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class Practice161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String channel = sc.nextLine();
        String message = sc.nextLine();

        Notification notification;

        if (channel.equals("EMAIL")) {
            notification = new Email();
        } else {
            notification = new Sms();
        }

        notification.send(message);

        sc.close();
    }
}