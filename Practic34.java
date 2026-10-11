
import java.util.Scanner;

class Calculator {
    int add(int first, int second) {
        // Return sum
        return first + second;
    }
}

public class Practic34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        Calculator obj = new Calculator();

        // Call add()
        int sum = obj.add(first, second);

        // Print returned sum
        System.out.println(sum);

        scanner.close();
    }
}
