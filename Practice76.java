import java.util.Scanner;

public class Practice76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read array
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        // Read target
        int target = scanner.nextInt();

        // Search
        boolean found = false;
        for (int index = 0; index < size; index++) {
            if (numbers[index] == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");

        scanner.close();
    }
}