import java.util.Scanner;

abstract class Alert {
    private String message;

    Alert(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }

    void showType() {
        System.out.println("Alert type: SMS");
    }

    abstract void send();
}

class SmsAlert extends Alert {
    SmsAlert(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("SMS: " + getMessage());
    }
}

public class Practice175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Alert alert = new SmsAlert(text);

        alert.send();
        alert.showType();

        sc.close();
    }
}