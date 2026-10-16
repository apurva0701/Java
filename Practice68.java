
import java.util.Scanner;

public class Practice68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int index = 0; index < n; index++) {
            values[index] = scanner.nextInt();
        }

        int bonus = scanner.nextInt();

        // Add bonus to every element.
        for (int index = 0; index < values.length; index++) {
            values[index] = values[index] + bonus;
        }

        // Print the updated array.
        System.out.print("Updated values:");
        for (int index = 0; index < values.length; index++) {
            System.out.print(" " + values[index]);
        }
        System.out.println();

        scanner.close();
    }
}
