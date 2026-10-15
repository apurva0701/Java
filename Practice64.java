
import java.util.Scanner;

public class Practice64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(numbers[0] + " " + numbers[size - 1]);

        scanner.close();
    }
}
