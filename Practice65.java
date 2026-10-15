
import java.util.Scanner;

public class Practice65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        System.out.println(numbers[index]);

        scanner.close();
    }
}
