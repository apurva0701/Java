
import java.util.Scanner;

class NumberUtility {
    int getLarger(int first, int second) {
        // Return larger number
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}

public class Practice38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        NumberUtility obj = new NumberUtility();

        // Call method
        int result = obj.getLarger(first, second);

        // Print result
        System.out.println(result);

        scanner.close();
    }
}
