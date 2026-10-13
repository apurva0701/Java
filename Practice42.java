
import java.util.Scanner;

class Result {
    void show(int mark) {
        // Declare message in the correct place
        String message;

        if (mark >= 60) {
            // Store "Eligible"
            message = "Eligible";
        } else {
            // Store "Keep Practising"
            message = "Keep Practising";
        }

        // Print message
        System.out.println(message);
    }
}

public class Practice42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}
