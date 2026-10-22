import java.util.Scanner;

public class Practice75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int index = 0; index < n; index++) {
            arr[index] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int index = 1; index < n; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
            if (arr[index] > max) {
                max = arr[index];
            }
        }

        System.out.println(min + " " + max);

        scanner.close();
    }
}