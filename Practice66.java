
import java.util.Scanner;

public class Practice66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] original = new int[size];

        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

        int updateIndex = scanner.nextInt();
        int updatedValue = scanner.nextInt();
        int requestedIndex = scanner.nextInt();

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        // Update through liveView.
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // Display original, snapshot and the reference comparison.
        System.out.print("Original:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(" " + original[i]);
        }
        System.out.println();

        System.out.print("Snapshot:");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(" " + snapshot[i]);
        }
        System.out.println();

        System.out.println("Same object: " + (liveView == original));

        // Validate requestedIndex before accessing original.
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }

        scanner.close();
    }
}
