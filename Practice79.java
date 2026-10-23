import java.util.Scanner;

public class Practice79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        for (int index = size - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();

        scanner.close();
    }
}