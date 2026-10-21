import java.util.Scanner;

public class Practice69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int index = 0; index < marks.length; index++) {
            marks[index] = scanner.nextInt();
        }

        // Calculate total.
        int total = 0;
        for (int index = 0; index < marks.length; index++) {
            total += marks[index];
        }

        // Calculate average.
        double average = (double) total / marks.length;

        // Print total and average.
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
}