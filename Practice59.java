
import java.util.Scanner;

public class Practice59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        // Read and store values
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        // Print values
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        scanner.close();
    }
}
