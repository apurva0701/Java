import java.util.Scanner;

interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notifyStudent(String message) {
        sender.send(message);
    }
}

public class Practice180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String message = sc.nextLine();

        MessageSender sender = null;

        if (type.equals("EMAIL")) {
            sender = new EmailSender();
        } else {
            sender = new SmsSender();
        }

        NotificationService service = new NotificationService(sender);
        service.notifyStudent(message);

        sc.close();
    }
}