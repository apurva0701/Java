import java.util.Scanner;

public class Practice74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int index = 0; index < size; index++) {
            arr[index] = scanner.nextInt();
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int index = 1; index < size; index++) {
            if (arr[index] < minimum) {
                minimum = arr[index];
            }
            if (arr[index] > maximum) {
                maximum = arr[index];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        scanner.close();
    }
}