
import java.util.Scanner;

abstract class Alert {
    abstract void send(String message);
}

class EmailAlert extends Alert {
    @Override
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class Practice173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();

        EmailAlert alert = new EmailAlert();
        alert.send(message);

        sc.close();
    }
}
