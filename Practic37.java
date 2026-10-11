
import java.util.Scanner;

class NumberUtility {
    int getNextNumber(int number) {
        // Return next number
        return number + 1;
    }
}

public class Practic37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility obj = new NumberUtility();

        // Call method
        int result = obj.getNextNumber(number);

        // Print result
        System.out.println(result);

        scanner.close();
    }
}
