
import java.util.Scanner;

public class Practice67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] readings = new int[size];

        for (int i = 0; i < size; i++) {
            readings[i] = scanner.nextInt();
        }

        int[] snapshot = new int[readings.length];

        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        int updateIndex = scanner.nextInt();
        int newValue = scanner.nextInt();

        readings[updateIndex] = newValue;

        System.out.print("Snapshot:");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(" " + snapshot[i]);
        }
        System.out.println();

        System.out.print("Updated:");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(" " + readings[i]);
        }
        System.out.println();

        scanner.close();
    }
}
