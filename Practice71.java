import java.util.Scanner;

public class Practice71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stock = new int[n];

        for (int index = 0; index < n; index++) {
            stock[index] = scanner.nextInt();
        }

        int reorderLevel = scanner.nextInt();

        // Count values that are less than or equal to reorderLevel.
        int reorderCount = 0;
        for (int index = 0; index < n; index++) {
            if (stock[index] <= reorderLevel) {
                reorderCount++;
            }
        }

        // Print the result.
        System.out.println("Items to reorder: " + reorderCount);

        scanner.close();
    }
}