
import java.util.Scanner;

class NumberUtility {
    int getValue(int number) {
        // Return number
        return number;
    }
}

public class Practice33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility obj = new NumberUtility();

        // Pass number to the method
        int result = obj.getValue(number);

        // Print returned value
        System.out.println(result);

        scanner.close();
    }
}
