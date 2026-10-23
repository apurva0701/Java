import java.util.Scanner;

public class Practice81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int count = 0;

        for (int index = 0; index < size; index++) {
            if (numbers[index] == target) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}